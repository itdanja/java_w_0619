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
			// 1. 서버소켓 만들기  [ ServerSocket ]
			ServerSocket serverSocket  = new ServerSocket(); // 예외처리 발생
			
			// 2. 서버소켓 바인딩[설정 => ip , port ] : 접속 경로 만들기 
			serverSocket.bind( new InetSocketAddress("127.168.102.50" , 5000) );
				// bind( 소켓주소( ip주소 , port번호 ) )
					// port : 식별 논리 단위 [ ip내 통신내 경로 번호 ]
			
			while( true ) { // 3. 클라이언의 접속 요청대기 
				// 4. 요청 수락
				System.out.println(" [[ 서버에서 연결 대기중 ]] ");
				Socket socket = serverSocket.accept();
					// .accept() : 해당 ip와 port 접속 요청시 수락
				// 5. 수락된 클라이언트 소켓 가져오기 
				InetSocketAddress socketAddress = (InetSocketAddress)socket.getRemoteSocketAddress();
				System.out.println(" [[ 클라이언트와 연결이 되었습니다 클라이언트정보 : " + socketAddress.getHostName() );
				// 6. 데이터 통신[ 송신 , 수신 ] 
				
					// 데이터 수신
				InputStream inputStream = socket.getInputStream();
					// InputStream : 입력 스트림
						// socket.getInputStream(); : 소켓의 입력스트림 가져오기 
				byte[] bytes = new byte[100];
				inputStream.read( bytes  );
				System.out.println(" [[ 클라언트의 메시지 : " + new String(bytes) ) ;
				
				// 데이터 송신
				Scanner scanner = new Scanner(System.in);
				System.out.print(" 클라이언트에게 보낼 메시지 : ");
				String msg = scanner.nextLine();
				
				OutputStream outputStream = socket.getOutputStream();
				outputStream.write( msg.getBytes() );
		
				// 스트림 닫기
				inputStream.close();
				outputStream.close();
				
			}
		}catch (Exception e) {
			System.out.println(" [[ 통신 오류 : 접속불가 ]] "+e);
		}
	}
}












