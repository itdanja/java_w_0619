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
	
	지난주 코드 실행 안되는 부분 확인~~
		* 줌 채팅으로 원격~
		
		1.회원가입 페이지 fxml [씬빌더]
			txtid : 아이디 입력창
			txtpassword : 패스워드 입력창
			txtpasswordconfirm : 패스워드 확인 입력창
			txtname : 이름 입력창
			txtemail : 이메일 입력창
			btnsignup : 회원가입 버튼
				On Mouse clicked : signup
			lblconfirm : 회원가입 확인 메시지 
		
		2.회원가입 컨트롤러
			1. Initializable 인터페이스 
			2. fx:id 가져오기 
			
		fxml <-------> 컨트롤러 연결 
		fxml파일에서 fx:controller="Member.Signupcontroller"
		
		3.DAO DTO
		
		---------------------------------
		데이터베이스 다운로드 [ mysql ] 
			1. https://dev.mysql.com/downloads/
			2. MySQL Installer for Windows => 450.7M 다운로드 
			2. Connector/J => Platform Independent => 4.7M	다운로드 
			3. 서버 설치시 port번호와 비밀번호 만 기억하기 
		
		
		SQL : 데이터베이스 질의어 [ DB 문법 ] 
			
			1. create database DB명 : DB[저장소] 생성 
				create database javafx
		
			2. create table DB명.테이블명(
		
				create table javafx.member(
					id varchar(10) not null primary key ,
		   			password varchar(4) not null , 
		   			name varchar(10) not null ,
		    			email varchar(20) not null 
				)
		-------------------------------------------------
		1.아이디 찾기.fxml [ 씬빌더 ] 
			성명과 이메일이 동일한 경우 레이블에 찾은 아이디 출력 
			txtname
			txtemail
			lblconfirm 
			btnfindid
				On Mouse clicked : findid
		2. 컨트롤러
			
		
		비밀번호 찾기.fxml [씬빌더 ]
			아이디와 이메일이 동일한 경우 레이블에 찾은 비밀번호 출력 
		
		
		

	
	
	
 * 
 */
