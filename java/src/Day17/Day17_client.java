package Day17;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class Day17_client {
	
	public static void main(String[] args) {
		// 1.클라이언 소켓 만들기 
		Socket socket = new Socket();
		
		// 2.서버소켓 연결 요청 
		try {
			while(true) {
				socket.connect( new InetSocketAddress("127.168.102.50", 5000));
					// .connect( 서버소켓( ip주소 , port번호 ) ) 
				System.out.println(" [[ 서버와 연결 성공 ]] ");
				
			// 3. 데이터 송신하기 [ 보내기 ]  : 스트림이용한 외부 네트워크 통신 
				Scanner scanner = new Scanner(System.in);
				System.out.print(" 서버에게 보낼 메시지 : ");
				String msg = scanner.nextLine(); 
				
				OutputStream outputStream = socket.getOutputStream();
					// OutputStream : 출력 스트림
						// socket.getOutputStream() :  소켓의 출력스트림 가져오기
				outputStream.write( msg.getBytes() ); // 스트림은 전송단위 : 바이트열 
				System.out.println(" [[ 서버에게 메시지 전송 성공 ]]");
			
			// 4. 데이터 수신하기 
				InputStream inputStream = socket.getInputStream();
				byte[] bytes = new byte[100];
				inputStream.read( bytes );
				System.out.println(" [[ 서버의 메시지 : "+ new String(bytes) );
			
			// 스트림 닫기
				outputStream.close();
				inputStream.close();
			}
		}
		catch (Exception e) {
			System.out.println(" [[ 통신 오류 : 접속불가 ]] " + e );
		}
		
	}

}
