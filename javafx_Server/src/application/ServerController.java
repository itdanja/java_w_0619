package application;

import java.net.ServerSocket;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Vector;
import java.util.concurrent.ExecutorService;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class ServerController implements Initializable {
								// Initializable : �ʱ�ȭ �������̽� 
	
	// ���� Ŭ������ ���簴ü ���� 
	public static ServerController instance;
	
	public ServerController() {
		instance = this;
	}
	
	public static ServerController getinstance() {
		return instance;
	}
	// 1. ������Ǯ ���
		// * �������� ������ ��û�� ��û�� �������� �۾��� ���� �ű�� => ���� ó�� 
			// * ���ÿ� ��û�ϴ� Ŭ���̾�Ʈ�� �ټ��̱� ������ ������ ������ �����߻�
	public static ExecutorService threadpool;
		// ExecutorService : ������Ǯ ���� �������̽�
	
	// 2. ���ӵ� Ŭ���̾�Ʈ �����ϱ� ���� ����Ʈ 
	public static Vector< Client> clients = new Vector<Client>();
		// vector ����ϴ� ���� : ��Ƽ������[ ����ȭo : ������ ó������ ]
			// arraylist : ���Ͻ����� [����ȸx]
		
	// 3. �������� 
	ServerSocket serversocket;
	// 4. ���� ���� �޼ҵ� 
	public void serverstart() {
		
	}
	// 5. ���� ���� �޼ҵ� 
	public void serverstop() {
		
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// fxml ó�� �������� �޼ҵ� 
		lblserverstatus.setText("���� ����");
	}	
	// fxid �������� 
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
    	if( btnstart.getText().equals("���� ����" ) ) { // ���� ���� �� �̸� 
    		// 1. ���� ���� �޼ҵ� 
    				// �� ���� 
    		// 2. �޽���â�� ���� ���� ���̺� ���� 
    			//Platform.runLater( () -> { }); // ��Ƽ�����带 �̿��� �ǽð� �÷��� ���� ���� 
    		Platform.runLater( () -> { 
    			String msg = "[---- ���� ���� �մϴ� ----]\n";
    			txtserverstatus.appendText(msg); // ����ؽ�Ʈ�� ���� �߰� 
    			lblserverstatus.setText("���� ������");
    			btnstart.setText("���� ����"); // ��ư ���� �ٲٱ� 
    		});
    		
    	}else { // �ǹ� ���� �� �̸� 
    		Platform.runLater( () -> {
    			// 1. ���� ���� �޼ҵ� 
    				// �� ���� 
    			String msg = "[---- ���� ���� �մϴ� ----]\n";
    			txtserverstatus.appendText(msg);
    			lblserverstatus.setText("���� ����");
    			btnstart.setText("���� ����");
   
    		});
    	}
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
