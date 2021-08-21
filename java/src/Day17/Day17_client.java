package Day17;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class Day17_client {
	
	public static void main(String[] args) {
		// 1.Ŭ���̾� ���� ����� 
		Socket socket = new Socket();
		
		// 2.�������� ���� ��û 
		try {
			while(true) {
				socket.connect( new InetSocketAddress("127.168.102.50", 5000));
					// .connect( ��������( ip�ּ� , port��ȣ ) ) 
				System.out.println(" [[ ������ ���� ���� ]] ");
				
			// 3. ������ �۽��ϱ� [ ������ ]  : ��Ʈ���̿��� �ܺ� ��Ʈ��ũ ��� 
				Scanner scanner = new Scanner(System.in);
				System.out.print(" �������� ���� �޽��� : ");
				String msg = scanner.nextLine(); 
				
				OutputStream outputStream = socket.getOutputStream();
					// OutputStream : ��� ��Ʈ��
						// socket.getOutputStream() :  ������ ��½�Ʈ�� ��������
				outputStream.write( msg.getBytes() ); // ��Ʈ���� ���۴��� : ����Ʈ�� 
				System.out.println(" [[ �������� �޽��� ���� ���� ]]");
			
			// 4. ������ �����ϱ� 
				InputStream inputStream = socket.getInputStream();
				byte[] bytes = new byte[100];
				inputStream.read( bytes );
				System.out.println(" [[ ������ �޽��� : "+ new String(bytes) );
			
			// ��Ʈ�� �ݱ�
				outputStream.close();
				inputStream.close();
			}
		}
		catch (Exception e) {
			System.out.println(" [[ ��� ���� : ���ӺҰ� ]] " + e );
		}
		
	}

}
