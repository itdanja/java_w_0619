package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage stage ) throws Exception {
		// 1. fxml 파일 가져오기 
		Parent parent = FXMLLoader.load(getClass().getResource("server.fxml"));
		// 2. 씬 만들기 => fxml 연결 
		Scene scene = new Scene(parent);
		// 3. 스테이지에 씬넣기 
		stage.setScene( scene );
			// 스테이지 설정 
			stage.setTitle("Kakaotalk Server");
			stage.setResizable(false);
				//Image image = new Image("file:이미지의경로");
			Image image = new Image("file:C:/Users/User/git/java_w_0619/javafx_Server/src/application/kakao.png");
			stage.getIcons().add( image );
			
		stage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	/*
	 * 		서버 프로젝트														클라이언트 프로젝트
	 * 
	 * 
	 * 			서버컨트롤러 
	 * 				* 스레드풀 [ 멀티스레드 관리 ] 
	 * 				* 접속된 클라이언트의 리스트[ Vector ] 
	 *				* 서버소켓 
	 *				* 서버 실행 
	 *				* 서버 종료 
	 * 		
	 * 			클라이언트클래스
	 * 				*소켓
	 * 				*생성자[ 메시지 수신 실행]
	 * 				* 수신 [ 무한루프 , 멀티스레드 , 송신호출 ]
	 * 				* 송신 [ 멀티스레드 ]
	 * 
	 *
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	/*
	 *  FX:ID
	 *  
	 *  서버실행버튼		btnstart		start
	 *  서버상태레이블		lblserverstatus	
	 *  서버현황긴글텍스트	txtserverstatus
	 *  접속자명단길글텍스트	txtaccessorlist

	 */
	
}
