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
					send( txtname.getText() +"�� �����߽��ϴ�\n");
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
	
		txtmsg.setPromptText("���� �� ��ȭ�Է� ����");
		txtmsg.setDisable(true); // ��ȭ�Է�â ������
		btnsend.setDisable(true); // ���� ��ư ������
		
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
    void send(ActionEvent event) { // ���� ��ư�� �������� 
    	
    	// �޽��� ������ 
    	send( txtname.getText() + " : " + txtmsg.getText()+"\n");
    	
    	// ������ �� 
    	txtmsg.setText(""); // �Է�â ��������
    	txtmsg.requestFocus();
    }
    
    
    @FXML
    void connect(ActionEvent event) { // ���ӹ�ư�� �������� 
    	if( btnconnect.getText().equals("����")) { // ���� ���̸� 
    		if( txtname.getText().equals("") ) {
    			Alert alert = new Alert( AlertType.INFORMATION );
    			alert.setContentText(" �г��� �Է����ּ��� ");
    			alert.setTitle("���ӺҰ�");
    			alert.showAndWait();
    			return;
    		}
    		if( txtport.getText().equals("") ) {
    			Alert alert = new Alert( AlertType.INFORMATION );
    			alert.setContentText(" port �Է����ּ��� ");
    			alert.setTitle("���ӺҰ�");
    			alert.showAndWait();
    			return;
    		}
    		
    		// 1. Ŭ���̾�Ʈ ���� 
    			clientstart( Integer.parseInt( txtport.getText() ) );
    		// 2. ���� �� 
    		Platform.runLater( () -> txtcontents.appendText("-----------[ä�ù� ����]-----------\n") );
    		
    		btnconnect.setText("������"); // ��ư�̸� ���� 
    		txtmsg.setDisable(false); // ��밡�� 
    		btnsend.setDisable(false); // ��밡�� 
    		txtmsg.requestFocus(); // ��Ŀ�� => Ŀ�� 
    		
    	}else { // ���� ���̸� 
    		// 1. Ŭ���̾�Ʈ ���� 
    			clientstop();
    		// 2. Ŭ���̾�Ʈ ������
    		Platform.runLater( () -> txtcontents.appendText("-----------[ä�ù� ����]-----------\n") );
    		
    		btnconnect.setText("����");
    		txtmsg.setPromptText("���� �� ��ȭ�Է� ����");
    		txtmsg.setDisable(true); // ��ȭ�Է�â ������
    		btnsend.setDisable(true); // ���� ��ư ������	
    	}
    }
	
	
	
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

}
