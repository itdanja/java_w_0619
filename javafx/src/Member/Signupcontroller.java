package Member;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Signupcontroller implements Initializable {
									// 씬빌더가 열렸을때 초기값 설정
	
	
	// 빌더가 처음 열렸을때 초기값 메소드 
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		lblconfirm.setText("");
	}
	
	// 씬빌더에서 컨트롤들의 fx:id
    @FXML
    private TextField txtid;

    @FXML
    private PasswordField txtpasswordconfirm;

    @FXML
    private Label btnsignup;

    @FXML
    private Label lblconfirm;

    @FXML
    private TextField txtname;

    @FXML
    private TextField txtemail;

    @FXML
    private PasswordField txtpassword;

    @FXML
    void signup(MouseEvent event) {

    	// 1. 상자에 입력된 데이터 가져오기  
    	String id =  txtid.getText(); // 텍스트의 입력된 데이터 가져오기 
    	String password = txtpassword.getText();
    	String passwordconfirm =  txtpasswordconfirm.getText();
    	String name = txtname.getText();
    	String email = txtemail.getText();	
    	// 2.유효성검사    	
    		// 0. 아이디는 3~10글자 이내 
    		if( id.length() <= 3 || id.length() > 10) {
    			lblconfirm.setText("[경고] 아이디는 3~10글자 이내 " );
    			return;
    		}
    		// 1. 패스워드 확인 체크
    		if( !password.equals(passwordconfirm) ) {
    			lblconfirm.setText("[경고] 패스워드 확인이 다릅니다");
    			return;
    		}
    		// 2. 패스워드 4글자만 가능 
    		if( password.length() != 4  ) {
    			lblconfirm.setText("[경고] 패스워드는 4글자만 가능" );
    			return;
    		}
    		// 3. 이름은 10글자 이내 
    		if( name.length() >10 ) {
    			lblconfirm.setText("[경고] 이름은 10글자 이내 ");
    			return;
    		}
    		// 4. 이메일 @ 포함 
    		if( !email.contains("@") ) {
    			lblconfirm.setText("[경고] 이메일 형식으로 입력해주세요");
    			return;
    		}
    	// 3. 객체화 
    		lblconfirm.setText("[성공] 회원가입 성공 ");
    		Member member = new Member(id, password, name, email);
    	// 4. 데이터베이스 저장 
    		// 1. db 객체 호출
    		MemberDAO memberDAO = MemberDAO.getinstance();
    		//MemberDAO memberDAO = new MemberDAO()
    }
	
    
    
    
    
    
    
    
    
    
    
	
    
    
    
    
    
    
    
    
    
    
    
}
