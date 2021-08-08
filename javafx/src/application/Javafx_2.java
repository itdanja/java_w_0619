package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Javafx_2 extends Application {

	@Override
	public void start(Stage stage) throws Exception {
							// 0.�������� �� ���ϱ� 
		//1. ���������� �۾��� FXML���� �������� 
			Parent parent = FXMLLoader.load( getClass().getResource("test1.fxml"));
							// module-info ���Ͽ��� ���̺귯�� �߰� [ requires javafx.fxml; ]
			// Parent Ŭ���� : fxml ������ ��üȭ 
		//2. �� ����� => ���̾ƿ� ��� 
			Scene scene = new Scene(parent);
		//3. �������� => �� �ֱ� 
			stage.setScene(scene);
		//4. �������� ���� 
			stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
