package Member;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Appstart extends Application {
						// 1. javafx Ŭ�����κ��� ��ӹޱ� 
	// 2. main���� start �޼ҵ� �ҷ����� 
	public static void main(String[] args) {
		launch(args);
	}
	// 3. start �޼ҵ带 �������̵�[������]
	@Override
	public void start(Stage stage) throws Exception {
		//1.�������� �̸� ���ϱ� 
		//2.fxml ���� �ҷ����� => ��üȭ
			Parent parent = FXMLLoader.load(getClass().getResource("login.fxml"));
		//3.������� => ���̾ƿ� fxml �ֱ�
			Scene scene = new Scene(parent);
		//4.���������� �� �ֱ� 
			stage.setScene(scene);
		//5.�������� ���� s
			stage.setTitle("Adidas Login"); // ������â �̸�
			stage.setResizable(false); // ������â ũ�� ���� �Ұ�
		//6. �������� ���� 
			stage.show();
	}
	
}
/*
 * �α��� ������ �۾� 
 * �̸����� : ctrl+p
	fx:id :java ���Ǵ� ��ü�� 
		1.AnchorPane
			1. imageView : ����̹���
			2. TextField : ���̵��Է�â
				fx:id				txtid
			3. PasswordField : ��й�ȣ �Է�â
				fx:id				txtpassword
			4. Label : �α��� ��ư
				fx:id				btnlogin
				On Mouse Clicked 	login
			5. Label : ��й�ȣ ã�� ��ư
				fx:id 				btnfindpassword
				On Mouse Clicked  	findpassowd
			6. Label : ���̵� ã�� ��ư 
				fx:id 				btnfindid
				On Mouse Clicked  	findid
			7. Label : ȸ������ ��ư 
				fx:id 				btnsignup
				On Mouse Clicked  	signup
			8. Label : �˸� �޽��� ���̺� 
				fx:id 				lblconfirm
			9. imageview : �ε� �̹���
				fx:id				imgloding
			------------
			10. imageview : ������
			11. imageview : ������
			12. imageview : �ΰ� 

 * 
 */
