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
							// 인터페이스 : javafx 초기값 
	
	// 현재 클래스를 객체 만들기 
	public static Logincontroller instance;
	
	// 현재 클래스의 메모리 넣기 
	public Logincontroller() {
		instance = this;
	}
	
	// 객체 반환메소드 
	public static Logincontroller getinstance() {
		return instance;
	}
	
	// 로그인시 입력된 아이디 호출 메소드 
	public String gettxtid() {
		return txtid.getText();
	}
	
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
    		String id = txtid.getText();
    		String password = txtpassword.getText();
    		// 로그인처리 
    		MemberDAO memberDAO = MemberDAO.getinstance();
    		boolean result = memberDAO.login(id, password);
    		if( result ) {
    			// 로그인 성공후 메인 페이지로 이동 
    			lblconfirm.setText("[[ 로그인 성공 ]]");
    				//
	    			try {
	    				
	    				Stage stage = new Stage();
	    				Parent parent = FXMLLoader.load( getClass().getResource("/chatting/client.fxml"));
	    				Scene scene = new Scene(parent);
	    				stage.setScene(scene);
	    				// 3. 스테이지에 씬넣기 
	    				stage.setScene( scene );
	    					// 스테이지 설정 
	    					stage.setTitle("Kakaotalk");
	    					stage.setResizable(false);
	    						//Image image = new Image("file:이미지의경로");
	    					Image image = new Image("file:C:/Users/User/git/java_w_0619/javafx/src/chatting/kakao.png");
	    					stage.getIcons().add( image );
	    				stage.show();
	    				
	    				// 현재 스테이지 종료 
	    				btnlogin.getScene().getWindow().hide();
	    				
	    			}
	    			catch (Exception e) {
	    				// TODO: handle exception
	    			}
	    			
    				//
	    			
    		}else {
    			lblconfirm.setText("아이디 혹은 비밀번호가 다릅니다");
    		}
    		} // 람다식 실행코드 끝
    	
    	); // setOnFinished 끝
    	
    	pauseTransition.play(); // 정지 클래스 시작 
    
    }

    @FXML
    void signup(MouseEvent event) {
    	// fxml 구성 : 스테이지[윈도우창] -> 씬[여러개 화면중 하나] => 컨트롤러
    	// 1. 스페이지 생성 
    	Stage stage = new Stage();
    	// 2. FXML 파일을 객체화
    	try {
    		Parent parent = FXMLLoader.load( getClass().getResource("signup.fxml"));
    		// 3. 씬 만들어서 fxml객체 넣기 
    		Scene scene = new Scene(parent);
    		// 4. 스테이지에 씬 넣기 
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
