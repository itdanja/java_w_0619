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
	public void start(Stage stage) {

		try {
			Parent parent = FXMLLoader.load( getClass().getResource("client.fxml"));
			Scene scene = new Scene(parent);
			stage.setScene(scene);
			// 3. 스테이지에 씬넣기 
			stage.setScene( scene );
				// 스테이지 설정 
				stage.setTitle("Kakaotalk");
				stage.setResizable(false);
					//Image image = new Image("file:이미지의경로");
				Image image = new Image("file:C:/Users/User/git/java_w_0619/javafx_Client/src/application/kakao.png");
				stage.getIcons().add( image );
				
			stage.show();
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	/*
	 * 
	 *  fx: id
	 *  	txtname
	 *  	txtport
	 * 		btnconnect
	 * 		txtcontents
	 * 		txtmsg
	 * 			msgsend
	 * 		btnsend
	 * 			send
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
}
