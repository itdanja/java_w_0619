package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Javafx_2 extends Application {

	@Override
	public void start(Stage stage) throws Exception {
							// 0.스테이지 명 정하기 
		//1. 씬빌더에서 작업한 FXML파일 가져오기 
			Parent parent = FXMLLoader.load( getClass().getResource("test1.fxml"));
							// module-info 파일에서 라이브러리 추가 [ requires javafx.fxml; ]
			// Parent 클래스 : fxml 파일을 객체화 
		//2. 씬 만들기 => 레이아웃 담기 
			Scene scene = new Scene(parent);
		//3. 스테이지 => 씬 넣기 
			stage.setScene(scene);
		//4. 스테이지 실행 
			stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
