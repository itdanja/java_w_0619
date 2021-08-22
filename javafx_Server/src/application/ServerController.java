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
								// Initializable : 초기화 인터페이스 
	
	// 현재 클래스에 현재객체 선언 
	public static ServerController instance;
	
	public ServerController() {
		instance = this;
	}
	
	public static ServerController getinstance() {
		return instance;
	}
	
	// 1. 스레드풀 사용
		// * 여러개의 스레드 요청시 요청된 스레드의 작업을 순서 매기기 => 순서 처리 
			// * 동시에 요청하는 클라이언트가 다수이기 때문에 서버의 과부하 문제발생
	public static ExecutorService threadpool;
		// ExecutorService : 스레드풀 관련 인터페이스
	
	// 2. 접속된 클라이언트 저장하기 위한 리스트 
	public static Vector< Client> clients = new Vector<Client>();
		// vector 사용하는 이유 : 멀티스레드[ 동기화o : 스레드 처리순서 ]
			// arraylist : 단일스레드 [동기회x]
		
	// 3. 서버소켓 
	ServerSocket serversocket;
	
	// 4. 서버 실행 메소드 
	public void serverstart() {
		try {
			// 1. 서버소켓 메모리 할당  
			serversocket = new ServerSocket();
			// 2. 서버 바인딩 [ 서버소켓 ip 주소 , port 할당 ] 
			serversocket.bind( new InetSocketAddress("127.0.0.1" , 1234 ) );
		}
		catch (Exception e) {}
		// 요청대기 멀티스레드 
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				try {
					while(true) {
						// 1. 클라이언트의 접속 요청 허가 
						Socket socket = serversocket.accept();
						// 2. 허가된 클라이언트 리스트에 담기 
						clients.add( new Client(socket) );
						// * 
						//Platform.runLater( 인수 -> {실행코드} );
									// * 람다식 : 익명메소드
						Platform.runLater( () -> txtserverstatus.appendText(socket.getLocalAddress()+"\n") );			
					}
				}catch (Exception e) {
					Platform.runLater(()->{ 
						String msg = " * 오류 발생 : 서버내 실행 메소드 " +  e+"\n";
						txtserverstatus.appendText(msg);
					});
					serverstop();
				}
			}
		};
		threadpool = Executors.newCachedThreadPool(); // 스레드풀 인터페이스에 메모리 할당 
		threadpool.submit(runnable); // 스레드풀에 담기 		
	}
	// 5. 서버 종료 메소드 
	public void serverstop() {
		try {
		// 1. 현재 접속된 클라이언트 소켓 모두 종료 
			for( Client client : clients ) {
				client.socket.close();
			}
			// 2. 서버소켓 종료 
			serversocket.close();
			// 3. 스레드풀 종료 
			threadpool.shutdown();
		}
		catch (Exception e) {}
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// fxml 처음 열렸을때 메소드 
		lblserverstatus.setText("서버 중지");
	}	
	// fxid 가져오기 
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
    	if( btnstart.getText().equals("서버 실행" ) ) { // 서버 실행 전 이면 
    		// 1. 서버 실행 메소드 
    				serverstart();
    		// 2. 메시지창에 내용 띄우고 레이블 변경 
    			//Platform.runLater( () -> { }); // 멀티스레드를 이용한 실시간 플랫폼 내용 변경 
    		Platform.runLater( () -> { 
    			String msg = "[---- 서버 시작 합니다 ----]\n";
    			txtserverstatus.appendText(msg); // 긴글텍스트에 내용 추가 
    			lblserverstatus.setText("서버 구동중");
    			btnstart.setText("서버 중지"); // 버튼 내용 바꾸기 
    		});
    		
    	}else { // 실버 실행 후 이면 
    		Platform.runLater( () -> {
    			// 1. 서버 중지 메소드 
    				serverstop();
    			String msg = "[---- 서버 종료 합니다 ----]\n";
    			txtserverstatus.appendText(msg);
    			lblserverstatus.setText("서버 중지");
    			btnstart.setText("서버 실행");
   
    		});
    	}
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
