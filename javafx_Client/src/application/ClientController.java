package application;

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
	
	// 2. Ŭ���̾� ���� �޼ҵ� 
	public void clientstart() {
		
	}
	// 3. Ŭ���̾�Ʈ ���� �޼ҵ� 
	public void clientstop() {
		
	}
	// 4. �޽��� ������ �޼ҵ� 
	public void send(String msg) {
		
	}
	// 5. �޽��� �޴� �޼ҵ� 
	public void receive() {
		
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
    void send(ActionEvent event) {

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
    			// �̱��� 
    		// 2. ���� �� 
    		Platform.runLater( () -> txtcontents.appendText("-----------[ä�ù� ����]-----------\n") );
    		
    		btnconnect.setText("������"); // ��ư�̸� ���� 
    		txtmsg.setDisable(false); // ��밡�� 
    		btnsend.setDisable(false); // ��밡�� 
    		txtmsg.requestFocus(); // ��Ŀ�� => Ŀ�� 
    		
    	}else { // ���� ���̸� 
    		
    		// 1. Ŭ���̾�Ʈ ���� 
    		
    		// 2. Ŭ���̾�Ʈ ������
    		Platform.runLater( () -> txtcontents.appendText("-----------[ä�ù� ����]-----------\n") );
    		
    		btnconnect.setText("����");
    		txtmsg.setPromptText("���� �� ��ȭ�Է� ����");
    		txtmsg.setDisable(true); // ��ȭ�Է�â ������
    		btnsend.setDisable(true); // ���� ��ư ������
    		
    	}

    }
	
	
	
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

}
