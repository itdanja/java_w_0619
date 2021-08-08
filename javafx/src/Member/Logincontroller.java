package Member;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class Logincontroller implements Initializable {
							// 인터페이스 : javafx 초기값 
	
	// 씬빌더 fx:id 불러오기 
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

    }

    @FXML
    void findpassowd(MouseEvent event) {

    }

    @FXML
    void login(MouseEvent event) {

    }

    @FXML
    void signup(MouseEvent event) {

    }
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// 초기 설정 
	}
	
	
}
