package chatting;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.URL;
import java.util.ResourceBundle;

import Member.Logincontroller;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class ClientController implements Initializable {
	
	
	// 1. 클라이언트 소켓 선언 
	Socket socket;
	
	// 2. 클라이언 시작 메소드 
	public void clientstart( int port) { // 인수로부터 port 번호를 받아 서버와 연결
	
		// 멀티스레드 [ 스레드풀 x ] 
		Thread thread = new Thread() {
			
			@Override
			public void run() {
				// 접속하기 
				try {
					socket = new Socket("127.0.0.1" , port );
					send( txtloginid.getText() +"님 입장했습니다\n");
					receive();
				}
				catch (Exception e) {
					Platform.runLater( () -> txtcontents.appendText("[서버가 닫혀있습니다]\n"));
					clientstop();
				}
			}
		}; // 스레드 end
		thread.start(); // run메소드 실행  [ 스레드풀이 아닌경우 직접 실행 ]
		
	}
	
	// 3. 클라이언트 종료 메소드 
	public void clientstop() {
		try {
			socket.close(); // 소켓 닫기 
		}
		catch (Exception e) {}
		
	}
	
	// 4. 메시지 보내는 메소드 
	public void send(String msg) {
		// 멀티스레드 
		Thread thread = new Thread() {
			@Override
			public void run() {
				
				try {
					OutputStream outputStream = socket.getOutputStream();
					byte[] bytes = msg.getBytes();
					outputStream.write( bytes );
					outputStream.flush(); // 스트림 초기화 
				}
				catch (Exception e) { clientstop();}
			}
		};//스레드 end
		thread.start(); // 스레드 시작
	}
	// 5. 메시지 받는 메소드 
	public void receive() {
		while(true) {
			try {
				InputStream inputStream = socket.getInputStream();
				byte[] bytes = new byte[1000];
				inputStream.read(bytes);
				String msg = new String(bytes);
				
				Platform.runLater( () -> txtcontents.appendText(msg) );
			}
			catch (Exception e) { clientstop();	}
		}
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// 1. 클라이언트 실행 
		clientstart( 1234 );
		// 2. 로그인 아이디 가져오기 
		txtloginid.setText( Logincontroller.getinstance().gettxtid() );
	}
	
    @FXML
    private Button btnlogout;

    @FXML
    private Label txtloginid;

	
    @FXML
    private TextArea txtcontents;

    @FXML
    private TextField txtmsg;

    @FXML
    private Button btnsend;


    @FXML
    void logout(ActionEvent event) {
	    	// 1. 클라이언트 종료 
			clientstop();
			Platform.exit(); // 모든 플랫폼 종료
    }

    @FXML
    void msgsend(ActionEvent event) { // 엔터를 눌렀을때 
    	
    	// 메시지 보내기 
    	send( txtloginid.getText() + " : " + txtmsg.getText()+"\n");
    	
    	// 보내기 후 
    	txtmsg.setText(""); // 입력창 공백으로
    	txtmsg.requestFocus();
    		
    }

    @FXML
    void send(ActionEvent event) { // 전송 버튼을 눌렀을때 
    	
    	// 메시지 보내기 
    	send( txtloginid.getText() + " : " + txtmsg.getText()+"\n");
    	
    	// 보내기 후 
    	txtmsg.setText(""); // 입력창 공백으로
    	txtmsg.requestFocus();
    }

	
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

}
