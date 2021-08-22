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
	
	
	// 1. Ŭ���̾�Ʈ ���� ���� 
	Socket socket;
	
	// 2. Ŭ���̾� ���� �޼ҵ� 
	public void clientstart( int port) { // �μ��κ��� port ��ȣ�� �޾� ������ ����
	
		// ��Ƽ������ [ ������Ǯ x ] 
		Thread thread = new Thread() {
			
			@Override
			public void run() {
				// �����ϱ� 
				try {
					socket = new Socket("127.0.0.1" , port );
					send( txtloginid.getText() +"�� �����߽��ϴ�\n");
					receive();
				}
				catch (Exception e) {
					Platform.runLater( () -> txtcontents.appendText("[������ �����ֽ��ϴ�]\n"));
					clientstop();
				}
			}
		}; // ������ end
		thread.start(); // run�޼ҵ� ����  [ ������Ǯ�� �ƴѰ�� ���� ���� ]
		
	}
	
	// 3. Ŭ���̾�Ʈ ���� �޼ҵ� 
	public void clientstop() {
		try {
			socket.close(); // ���� �ݱ� 
		}
		catch (Exception e) {}
		
	}
	
	// 4. �޽��� ������ �޼ҵ� 
	public void send(String msg) {
		// ��Ƽ������ 
		Thread thread = new Thread() {
			@Override
			public void run() {
				
				try {
					OutputStream outputStream = socket.getOutputStream();
					byte[] bytes = msg.getBytes();
					outputStream.write( bytes );
					outputStream.flush(); // ��Ʈ�� �ʱ�ȭ 
				}
				catch (Exception e) { clientstop();}
			}
		};//������ end
		thread.start(); // ������ ����
	}
	// 5. �޽��� �޴� �޼ҵ� 
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
		// 1. Ŭ���̾�Ʈ ���� 
		clientstart( 1234 );
		// 2. �α��� ���̵� �������� 
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
	    	// 1. Ŭ���̾�Ʈ ���� 
			clientstop();
			Platform.exit(); // ��� �÷��� ����
    }

    @FXML
    void msgsend(ActionEvent event) { // ���͸� �������� 
    	
    	// �޽��� ������ 
    	send( txtloginid.getText() + " : " + txtmsg.getText()+"\n");
    	
    	// ������ �� 
    	txtmsg.setText(""); // �Է�â ��������
    	txtmsg.requestFocus();
    		
    }

    @FXML
    void send(ActionEvent event) { // ���� ��ư�� �������� 
    	
    	// �޽��� ������ 
    	send( txtloginid.getText() + " : " + txtmsg.getText()+"\n");
    	
    	// ������ �� 
    	txtmsg.setText(""); // �Է�â ��������
    	txtmsg.requestFocus();
    }

	
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

}
