package Member;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.PauseTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.util.Duration;

public class Logincontroller implements Initializable {
							// 인터페이스 : javafx 초기값 
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// 실행 했을때 초기 설정 
		lblconfirm.setText(""); // 알림 메시지 공백 [ setText() : 컨트롤에 내용 설정 ] 
		imgloding.setVisible(false); // 로딩 이미지 숨기기 [ setVisible() : 화면 표시여부 ] 
	}
	
	// 씬빌더 fx:id 불러오기 [ 씬빌더 메뉴 => view => show sample controller skeleton => 필드와메소드복사 ]
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
    	System.out.println("[[ 아이디찾기 페이지로 이동 ]] ");
    }

    @FXML
    void findpassowd(MouseEvent event) {
    	System.out.println("[[ 비밀번호찾기 페이지로 이동 ]] ");
    }

    @FXML
    void login(MouseEvent event) {
    	System.out.println("[[ 로그인 처리 ]] ");
    	imgloding.setVisible(true); // 로딩 이미지 보이기 
    	
    	PauseTransition pauseTransition = new PauseTransition(); // 정지 클래스 
    	pauseTransition.setDuration( Duration.seconds(2) ); // 3초간 정지 
    	pauseTransition.setOnFinished( a ->  {
    					// 3초 정지후 실행코드 
    								// 람다식 표현 [ 익명 메소드 ] : 메소드정의 형식이 아닌 인수와 실행코드 
    								// 인수 ->  { 실행코드 } 

    			// 임시 : 아이디 admin  비밀번호:1234
    			if( txtid.getText().equals("admin") ) {
    				if( txtpassword.getText().equals("1234") ) {
    					lblconfirm.setText(" 로그인 성공 ");
    					return;
    				}
    			}
    			lblconfirm.setText("[실패] 동일한 회원정보가 없습니다 ");
    		} // 람다식 실행코드 끝
    	
    	); // setOnFinished 끝
    	
    	pauseTransition.play(); // 정지 클래스 시작 
    
    }

    @FXML
    void signup(MouseEvent event) {
    	System.out.println("[[ 회원가입 페이지로 이동]] ");
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
