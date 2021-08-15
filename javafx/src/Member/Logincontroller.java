package Member;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.PauseTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Logincontroller implements Initializable {
							// �������̽� : javafx �ʱⰪ 
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// ���� ������ �ʱ� ���� 
		lblconfirm.setText(""); // �˸� �޽��� ���� [ setText() : ��Ʈ�ѿ� ���� ���� ] 
		imgloding.setVisible(false); // �ε� �̹��� ����� [ setVisible() : ȭ�� ǥ�ÿ��� ] 
	}
	
	// ������ fx:id �ҷ����� [ ������ �޴� => view => show sample controller skeleton => �ʵ�͸޼ҵ庹�� ]
    @FXML
    private TextField txtid;

    @FXML
    private PasswordField txtpassword;

    @FXML
    private Label btnlogin;

    @FXML
    private Label btnfindpassword;

    @FXML
    private Label btnfindid;

    @FXML
    private Label btnsignup;

    @FXML
    private ImageView imgloding;

    @FXML
    private Label lblconfirm;

    @FXML
    void findid(MouseEvent event) {
    	
    	Stage stage = new Stage();
    	try {
    		Parent parent = FXMLLoader.load(getClass().getResource("findid.fxml"));
    		Scene scene = new Scene(parent);
    		stage.setScene(scene);
    		stage.setResizable(false);
    		stage.setTitle("Adidas findID");
    		Image image = new Image("file:C:/Users/User/git/java_w_0619/javafx/src/Member/logo.jpg");
			stage.getIcons().add(  image );
    		stage.show();
    	}
    	catch (Exception e) {
			// TODO: handle exception
		}
    	
    }

    @FXML
    void findpassowd(MouseEvent event) {
    	System.out.println("[[ ��й�ȣã�� �������� �̵� ]] ");
    }

    @FXML
    void login(MouseEvent event) {
    	System.out.println("[[ �α��� ó�� ]] ");
    	imgloding.setVisible(true); // �ε� �̹��� ���̱� 
    	
    	PauseTransition pauseTransition = new PauseTransition(); // ���� Ŭ���� 
    	pauseTransition.setDuration( Duration.seconds(2) ); // 3�ʰ� ���� 
    	pauseTransition.setOnFinished( a ->  {
    					// 3�� ������ �����ڵ� 
    								// ���ٽ� ǥ�� [ �͸� �޼ҵ� ] : �޼ҵ����� ������ �ƴ� �μ��� �����ڵ� 
    								// �μ� ->  { �����ڵ� } 
    		String id = txtid.getText();
    		String password = txtpassword.getText();
    		// �α���ó�� 
    		MemberDAO memberDAO = MemberDAO.getinstance();
    		boolean result = memberDAO.login(id, password);
    		if( result ) {
    			// �α��� ������ ���� �������� �̵� 
    			lblconfirm.setText("[[ �α��� ���� ]]");
    		}else {
    			lblconfirm.setText("���̵� Ȥ�� ��й�ȣ�� �ٸ��ϴ�");
    		}
    		} // ���ٽ� �����ڵ� ��
    	
    	); // setOnFinished ��
    	
    	pauseTransition.play(); // ���� Ŭ���� ���� 
    
    }

    @FXML
    void signup(MouseEvent event) {
    	// fxml ���� : ��������[������â] -> ��[������ ȭ���� �ϳ�] => ��Ʈ�ѷ�
    	// 1. �������� ���� 
    	Stage stage = new Stage();
    	// 2. FXML ������ ��üȭ
    	try {
    		Parent parent = FXMLLoader.load( getClass().getResource("signup.fxml"));
    		// 3. �� ���� fxml��ü �ֱ� 
    		Scene scene = new Scene(parent);
    		// 4. ���������� �� �ֱ� 
    		stage.setScene(scene);
    		stage.setResizable(false);
    		stage.setTitle("Adidas Signup");
    		Image image = new Image("file:C:/Users/User/git/java_w_0619/javafx/src/Member/logo.jpg");
			stage.getIcons().add(  image );
    		stage.show();
    	}
    	catch (Exception e) {
			// TODO: handle exception
		}
    	
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
