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
		// 1. fxml ���� �������� 
		Parent parent = FXMLLoader.load(getClass().getResource("server.fxml"));
		// 2. �� ����� => fxml ���� 
		Scene scene = new Scene(parent);
		// 3. ���������� ���ֱ� 
		stage.setScene( scene );
			// �������� ���� 
			stage.setTitle("Kakaotalk Server");
			stage.setResizable(false);
				//Image image = new Image("file:�̹����ǰ��");
			Image image = new Image("file:C:/Users/User/git/java_w_0619/javafx_Server/src/application/kakao.png");
			stage.getIcons().add( image );
			
		stage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	/*
	 * 		���� ������Ʈ														Ŭ���̾�Ʈ ������Ʈ
	 * 
	 * 
	 * 			������Ʈ�ѷ� 
	 * 				* ������Ǯ [ ��Ƽ������ ���� ] 
	 * 				* ���ӵ� Ŭ���̾�Ʈ�� ����Ʈ[ Vector ] 
	 *				* �������� 
	 *				* ���� ���� 
	 *				* ���� ���� 
	 * 		
	 * 			Ŭ���̾�ƮŬ����
	 * 				*����
	 * 				*������[ �޽��� ���� ����]
	 * 				* ���� [ ���ѷ��� , ��Ƽ������ , �۽�ȣ�� ]
	 * 				* �۽� [ ��Ƽ������ ]
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
	 *  ���������ư		btnstart		start
	 *  �������·��̺�		lblserverstatus	
	 *  ������Ȳ����ؽ�Ʈ	txtserverstatus
	 *  �����ڸ�ܱ���ؽ�Ʈ	txtaccessorlist

	 */
	
}
