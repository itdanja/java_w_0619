package application;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

import javafx.application.Platform;

public class Client {
	// 서버내에서 접속된 클라이언트 객체 
	
	// 1. 소켓 
	Socket socket;
	// 2. 생성자 [ 객체 생성시 초기값 ] 
	public Client( Socket socket ) {
		this.socket = socket;
		receive(); // 접속과 동시에 메시지 받기 메소드 실행[ 무한루프 ] 
	}
	// 3.서버로 메시지 받는 메소드 
	public void receive() {
		// 멀티스레드 
		// Runnable runnable = new Runnable( ){ run(){} };
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				// 메시지 받는 실행코드 
				try {
					while(true) {
						InputStream inputStream = socket.getInputStream(); // 입력스트림 
						byte[] bytes = new byte[1000];	// 바이트열 배열 
						inputStream.read( bytes );		// 스트림에서 바이트열 읽어오기 
						String msg = new String( bytes ); // 문자열 변환 
						
						// 받은 메시지를 모든 접속된 리스트로 전달 
						for(Client client : ServerController.clients ) {
							client.send( msg ); // 받은 메시지 전달 
										
						}
					}
				}catch (Exception e) { // 오류 발생했을경우 
					
					  Platform.runLater(()->{ String msg = " * 오류 발생 : 서버내 클라이언트가 메시지 받는 메소드 " +
					  e+"\n"; ServerController.getinstance().txtserverstatus.appendText(msg); });
					 
				}
			} // run end 
		}; // runnable end
		// *** 스레드풀에 해당 쓰레드 담기 [ 스레드풀 안에서 자동관리( 자동시작 ) ]
		ServerController.threadpool.submit( runnable );
	}
	// 4.서버가 메시지 보내는 메소드 
	public void send( String msg ) {
		// 멀티스레드 
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				try {
					OutputStream outputStream = socket.getOutputStream(); // 출력 스트림 
					byte[] bytes = msg.getBytes();
					outputStream.write( bytes );	// 바이트열 -> 문자열 변환 출력 
					outputStream.flush(); // 스트림 닫기 
				}catch (Exception e) { // 오류 발생했을경우 
					
					  Platform.runLater(()->{ String msg = " * 오류 발생 : 서버내 클라이언트가 메시지 보내는 메소드 " +
					  e+"\n"; ServerController.getinstance().txtserverstatus.appendText(msg); });
					
				}
			}
		}; // runnable end
		// 스레드풀 추가 
		ServerController.threadpool.submit(runnable);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
