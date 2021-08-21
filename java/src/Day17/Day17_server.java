package Day17;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Day17_server {

	public static void main(String[] args){
		
		try {
			// 1. �������� �����  [ ServerSocket ]
			ServerSocket serverSocket  = new ServerSocket(); // ����ó�� �߻�
			
			// 2. �������� ���ε�[���� => ip , port ] : ���� ��� ����� 
			serverSocket.bind( new InetSocketAddress("127.168.102.50" , 5000) );
				// bind( �����ּ�( ip�ּ� , port��ȣ ) )
					// port : �ĺ� �� ���� [ ip�� ��ų� ��� ��ȣ ]
			
			while( true ) { // 3. Ŭ���̾��� ���� ��û��� 
				// 4. ��û ����
				System.out.println(" [[ �������� ���� ����� ]] ");
				Socket socket = serverSocket.accept();
					// .accept() : �ش� ip�� port ���� ��û�� ����
				// 5. ������ Ŭ���̾�Ʈ ���� �������� 
				InetSocketAddress socketAddress = (InetSocketAddress)socket.getRemoteSocketAddress();
				System.out.println(" [[ Ŭ���̾�Ʈ�� ������ �Ǿ����ϴ� Ŭ���̾�Ʈ���� : " + socketAddress.getHostName() );
				// 6. ������ ���[ �۽� , ���� ] 
				
					// ������ ����
				InputStream inputStream = socket.getInputStream();
					// InputStream : �Է� ��Ʈ��
						// socket.getInputStream(); : ������ �Է½�Ʈ�� �������� 
				byte[] bytes = new byte[100];
				inputStream.read( bytes  );
				System.out.println(" [[ Ŭ���Ʈ�� �޽��� : " + new String(bytes) ) ;
				
				// ������ �۽�
				Scanner scanner = new Scanner(System.in);
				System.out.print(" Ŭ���̾�Ʈ���� ���� �޽��� : ");
				String msg = scanner.nextLine();
				
				OutputStream outputStream = socket.getOutputStream();
				outputStream.write( msg.getBytes() );
		
				// ��Ʈ�� �ݱ�
				inputStream.close();
				outputStream.close();
				
			}
		}catch (Exception e) {
			System.out.println(" [[ ��� ���� : ���ӺҰ� ]] "+e);
		}
	}
}












