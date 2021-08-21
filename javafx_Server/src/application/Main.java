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
			Image image = new Image("file:C:/Users/User/Desktop/java/주말/javafx_Server/src/application/kakao.png");
			stage.getIcons().add( image );
			
		stage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

	/*
	 *  FX:ID
	 *  
	 *  서버실행버튼		btnstart		start
	 *  서버상태레이블		lblserverstatus	
	 *  서버현황긴글텍스트	txtserverstatus
	 *  접속자명단길글텍스트	txtaccessorlist

	 */
	
}
