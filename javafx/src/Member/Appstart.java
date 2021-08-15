package Member;

import java.io.File;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Appstart extends Application {
						// 1. javafx 클래스로부터 상속받기 
	// 2. main에서 start 메소드 불러오기 
	public static void main(String[] args) {
		launch(args);
	}
	// 3. start 메소드를 오버라이딩[재정의]
	@Override
	public void start(Stage stage) throws Exception {
		//1.스테이지 이름 정하기 
		//2.fxml 파일 불러오기 => 객체화
			Parent parent = FXMLLoader.load(getClass().getResource("login.fxml"));
		//3.씬만들기 => 레이아웃 fxml 넣기
			Scene scene = new Scene(parent);
		//4.스테이지에 씬 넣기 
			stage.setScene(scene);
		//5.스테이지 설정
			stage.setTitle("Adidas Login"); // 윈도우창 이름
			stage.setResizable(false); // 윈도우창 크기 변경 불가
			// 스테이지 아이콘 설정
			Image image = new Image("file:C:/Users/User/git/java_w_0619/javafx/src/Member/logo.jpg");
			stage.getIcons().add(  image );
			
		//6. 스테이지 열기 
			stage.show();
	}
	
}
/*
 * 로그인 씬빌더 작업 
 * 미리보기 : ctrl+p
	fx:id :java 사용되는 객체명 
		1.AnchorPane
			1. imageView : 배경이미지
			2. TextField : 아이디입력창
				fx:id				txtid
			3. PasswordField : 비밀번호 입력창
				fx:id				txtpassword
			4. Label : 로그인 버튼
				fx:id				btnlogin
				On Mouse Clicked 	login
			5. Label : 비밀번호 찾기 버튼
				fx:id 				btnfindpassword
				On Mouse Clicked  	findpassowd
			6. Label : 아이디 찾기 버튼 
				fx:id 				btnfindid
				On Mouse Clicked  	findid
			7. Label : 회원가입 버튼 
				fx:id 				btnsignup
				On Mouse Clicked  	signup
			8. Label : 알림 메시지 레이블 
				fx:id 				lblconfirm
			9. imageview : 로딩 이미지
				fx:id				imgloding
			------------
			10. imageview : 아이콘
			11. imageview : 아이콘
			12. imageview : 로고 

 * 
 */
