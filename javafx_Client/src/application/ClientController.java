package application;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
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
					send( txtname.getText() +"님 입장했습니다\n");
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
	
		txtmsg.setPromptText("접속 후 대화입력 가능");
		txtmsg.setDisable(true); // 대화입력창 사용금지
		btnsend.setDisable(true); // 전송 버튼 사용금지
		
	}
	
    @FXML
    private TextArea txtcontents;

    @FXML
    private TextField txtmsg;

    @FXML
    private Button btnsend;

    @FXML
    private TextField txtname;

    @FXML
    private TextField txtport;

    @FXML
    private Button btnconnect;

    @FXML
    void msgsend(ActionEvent event) {
    		
    }

    @FXML
    void send(ActionEvent event) { // 전송 버튼을 눌렀을때 
    	
    	// 메시지 보내기 
    	send( txtname.getText() + " : " + txtmsg.getText()+"\n");
    	
    	// 보내기 후 
    	txtmsg.setText(""); // 입력창 공백으로
    	txtmsg.requestFocus();
    }
    
    
    @FXML
    void connect(ActionEvent event) { // 접속버튼을 눌렀을때 
    	if( btnconnect.getText().equals("접속")) { // 접속 전이면 
    		if( txtname.getText().equals("") ) {
    			Alert alert = new Alert( AlertType.INFORMATION );
    			alert.setContentText(" 닉네임 입력해주세요 ");
    			alert.setTitle("접속불가");
    			alert.showAndWait();
    			return;
    		}
    		if( txtport.getText().equals("") ) {
    			Alert alert = new Alert( AlertType.INFORMATION );
    			alert.setContentText(" port 입력해주세요 ");
    			alert.setTitle("접속불가");
    			alert.showAndWait();
    			return;
    		}
    		
    		// 1. 클라이언트 실행 
    			clientstart( Integer.parseInt( txtport.getText() ) );
    		// 2. 접속 후 
    		Platform.runLater( () -> txtcontents.appendText("-----------[채팅방 접속]-----------\n") );
    		
    		btnconnect.setText("나가기"); // 버튼이름 변경 
    		txtmsg.setDisable(false); // 사용가능 
    		btnsend.setDisable(false); // 사용가능 
    		txtmsg.requestFocus(); // 포커스 => 커서 
    		
    	}else { // 접속 중이면 
    		// 1. 클라이언트 종료 
    			clientstop();
    		// 2. 클라이언트 종료후
    		Platform.runLater( () -> txtcontents.appendText("-----------[채팅방 퇴장]-----------\n") );
    		
    		btnconnect.setText("접속");
    		txtmsg.setPromptText("접속 후 대화입력 가능");
    		txtmsg.setDisable(true); // 대화입력창 사용금지
    		btnsend.setDisable(true); // 전송 버튼 사용금지	
    	}
    }
	
	
	
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

}
