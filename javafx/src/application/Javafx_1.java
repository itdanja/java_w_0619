package application;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Javafx_1 extends Application {
	// 1. Javafx Ŭ������ ���� ��ӹޱ� 
		// javafx ���� 
			// 1. Stage : ������ â [ �������� Scene ���� ]
			// 2. Scene : ȭ�� ���� [ �������� ���̾ƿ� ���� ] 
			// 3. Graph : ���̾ƿ� , ��Ʈ��
	// 2. javafx ���� 
			// 1. main �����忡�� launch(args); ȣ�� 
			// 2. start �޼ҵ� �������̵�[������]
	// 3. start �޼ҵ� ������ ���� 
	
	@Override
	public void start(Stage ��������) throws Exception {
						// 1. stage �̸� ���ϱ� 
		//2. ���̾ƿ� ���� 
		VBox ���̾ƿ� = new VBox();
		
			// 2-0 ���̾ƿ� ���� 
			���̾ƿ�.setAlignment(Pos.CENTER);
		
			// 2-1. ��Ʈ�� ���� 
			Button ��ư = new Button();
			��ư.setText("����");
			��ư.setOnAction( a -> Platform.exit() );
							// ���ٽ�[ �͸�޼ҵ�( �޼ҵ���� ���� �޼ҵ�(�μ��͹�ȯ) ]
							// �μ� -> �����ڵ�
			// 2-1 . ��Ʈ�� ���� 
			Label ���̺� = new Label();
			���̺�.setText("�ȳ��ϼ��� fx �Դϴ�");
			���̺�.setFont( new Font(20) );
			
			// 2-2 ���̾ƿ��� ��Ʈ�� �ֱ� 
			���̾ƿ�.getChildren().add(��ư);
			���̾ƿ�.getChildren().add(���̺�);
			
		//3. �� ����� => ���̾ƿ� �ֱ� 
		Scene �� = new Scene(���̾ƿ� , 500 , 500 );
		//4. �������� => �� �ֱ� 
		��������.setScene(��);
		//5. �������� ���� 
		��������.show();
	}
	public static void main(String[] args) {	
		launch(args);
	}
}










