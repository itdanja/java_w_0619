package application;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

import javafx.application.Platform;

public class Client {
	// ���������� ���ӵ� Ŭ���̾�Ʈ ��ü 
	
	// 1. ���� 
	Socket socket;
	// 2. ������ [ ��ü ������ �ʱⰪ ] 
	public Client( Socket socket ) {
		this.socket = socket;
		receive(); // ���Ӱ� ���ÿ� �޽��� �ޱ� �޼ҵ� ����[ ���ѷ��� ] 
	}
	// 3.������ �޽��� �޴� �޼ҵ� 
	public void receive() {
		// ��Ƽ������ 
		// Runnable runnable = new Runnable( ){ run(){} };
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				// �޽��� �޴� �����ڵ� 
				try {
					while(true) {
						InputStream inputStream = socket.getInputStream(); // �Է½�Ʈ�� 
						byte[] bytes = new byte[1000];	// ����Ʈ�� �迭 
						inputStream.read( bytes );		// ��Ʈ������ ����Ʈ�� �о���� 
						String msg = new String( bytes ); // ���ڿ� ��ȯ 
						
						// ���� �޽����� ��� ���ӵ� ����Ʈ�� ���� 
						for(Client client : ServerController.clients ) {
							client.send( msg ); // ���� �޽��� ���� 
						}
						inputStream.close(); // �Է½�Ʈ�� �ݱ� 
					}
				}
				catch (Exception e) { // ���� �߻�������� 
					Platform.runLater(()->{ 
						String msg = " * ���� �߻� : ������ Ŭ���̾�Ʈ�� �޽��� �޴� �޼ҵ� " +  e+"\n";
						ServerController.getinstance().txtserverstatus.appendText(msg);
					});
				}
			} // run end 
		}; // runnable end
		// *** ������Ǯ�� �ش� ������ ��� [ ������Ǯ �ȿ��� �ڵ�����( �ڵ����� ) ]
		ServerController.threadpool.submit( runnable );
	}
	// 4.������ �޽��� ������ �޼ҵ� 
	public void send( String msg ) {
		// ��Ƽ������ 
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				try {
					OutputStream outputStream = socket.getOutputStream(); // ��� ��Ʈ�� 
					outputStream.write( msg.getBytes() );	// ����Ʈ�� -> ���ڿ� ��ȯ ��� 
					outputStream.close(); // ��Ʈ�� �ݱ� 
				}catch (Exception e) { // ���� �߻�������� 
					Platform.runLater(()->{ 
						String msg = " * ���� �߻� : ������ Ŭ���̾�Ʈ�� �޽��� ������ �޼ҵ� " +  e+"\n";
						ServerController.getinstance().txtserverstatus.appendText(msg);
					});
				}
			}
		}; // runnable end
		// ������Ǯ �߰� 
		ServerController.threadpool.submit(runnable);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
