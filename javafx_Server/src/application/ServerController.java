package application;

import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Vector;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class ServerController implements Initializable {
								// Initializable : �ʱ�ȭ �������̽� 
	
	// ���� Ŭ������ ���簴ü ���� 
	public static ServerController instance;
	
	public ServerController() {
		instance = this;
	}
	
	public static ServerController getinstance() {
		return instance;
	}
	
	// 1. ������Ǯ ���
		// * �������� ������ ��û�� ��û�� �������� �۾��� ���� �ű�� => ���� ó�� 
			// * ���ÿ� ��û�ϴ� Ŭ���̾�Ʈ�� �ټ��̱� ������ ������ ������ �����߻�
	public static ExecutorService threadpool;
		// ExecutorService : ������Ǯ ���� �������̽�
	
	// 2. ���ӵ� Ŭ���̾�Ʈ �����ϱ� ���� ����Ʈ 
	public static Vector< Client> clients = new Vector<Client>();
		// vector ����ϴ� ���� : ��Ƽ������[ ����ȭo : ������ ó������ ]
			// arraylist : ���Ͻ����� [����ȸx]
		
	// 3. �������� 
	ServerSocket serversocket;
	
	// 4. ���� ���� �޼ҵ� 
	public void serverstart() {
		try {
			// 1. �������� �޸� �Ҵ�  
			serversocket = new ServerSocket();
			// 2. ���� ���ε� [ �������� ip �ּ� , port �Ҵ� ] 
			serversocket.bind( new InetSocketAddress("127.0.0.1" , 1234 ) );
		}
		catch (Exception e) {}
		// ��û��� ��Ƽ������ 
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				try {
					while(true) {
						// 1. Ŭ���̾�Ʈ�� ���� ��û �㰡 
						Socket socket = serversocket.accept();
						// 2. �㰡�� Ŭ���̾�Ʈ ����Ʈ�� ��� 
						clients.add( new Client(socket) );
						// * 
						//Platform.runLater( �μ� -> {�����ڵ�} );
									// * ���ٽ� : �͸�޼ҵ�
						Platform.runLater( () -> txtserverstatus.appendText(socket.getLocalAddress()+"\n") );			
					}
				}catch (Exception e) {
					Platform.runLater(()->{ 
						String msg = " * ���� �߻� : ������ ���� �޼ҵ� " +  e+"\n";
						txtserverstatus.appendText(msg);
					});
					serverstop();
				}
			}
		};
		threadpool = Executors.newCachedThreadPool(); // ������Ǯ �������̽��� �޸� �Ҵ� 
		threadpool.submit(runnable); // ������Ǯ�� ��� 		
	}
	// 5. ���� ���� �޼ҵ� 
	public void serverstop() {
		try {
		// 1. ���� ���ӵ� Ŭ���̾�Ʈ ���� ��� ���� 
			for( Client client : clients ) {
				client.socket.close();
			}
			// 2. �������� ���� 
			serversocket.close();
			// 3. ������Ǯ ���� 
			threadpool.shutdown();
		}
		catch (Exception e) {}
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// fxml ó�� �������� �޼ҵ� 
		lblserverstatus.setText("���� ����");
	}	
	// fxid �������� 
    @FXML
    public TextArea txtserverstatus;

    @FXML
    private Button btnstart;

    @FXML
    private TextArea txtaccessorlist;

    @FXML
    private Label lblserverstatus;

    @FXML
    void start(ActionEvent event) {
    	if( btnstart.getText().equals("���� ����" ) ) { // ���� ���� �� �̸� 
    		// 1. ���� ���� �޼ҵ� 
    				serverstart();
    		// 2. �޽���â�� ���� ���� ���̺� ���� 
    			//Platform.runLater( () -> { }); // ��Ƽ�����带 �̿��� �ǽð� �÷��� ���� ���� 
    		Platform.runLater( () -> { 
    			String msg = "[---- ���� ���� �մϴ� ----]\n";
    			txtserverstatus.appendText(msg); // ����ؽ�Ʈ�� ���� �߰� 
    			lblserverstatus.setText("���� ������");
    			btnstart.setText("���� ����"); // ��ư ���� �ٲٱ� 
    		});
    		
    	}else { // �ǹ� ���� �� �̸� 
    		Platform.runLater( () -> {
    			// 1. ���� ���� �޼ҵ� 
    				serverstop();
    			String msg = "[---- ���� ���� �մϴ� ----]\n";
    			txtserverstatus.appendText(msg);
    			lblserverstatus.setText("���� ����");
    			btnstart.setText("���� ����");
   
    		});
    	}
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
