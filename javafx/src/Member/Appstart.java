package Member;

import java.io.File;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
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
		//5.�������� ����
			stage.setTitle("Adidas Login"); // ������â �̸�
			stage.setResizable(false); // ������â ũ�� ���� �Ұ�
			// �������� ������ ����
			Image image = new Image("file:C:/Users/User/git/java_w_0619/javafx/src/Member/logo.jpg");
			stage.getIcons().add(  image );
			
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
	
	������ �ڵ� ���� �ȵǴ� �κ� Ȯ��~~
		* �� ä������ ����~
		
		1.ȸ������ ������ fxml [������]
			txtid : ���̵� �Է�â
			txtpassword : �н����� �Է�â
			txtpasswordconfirm : �н����� Ȯ�� �Է�â
			txtname : �̸� �Է�â
			txtemail : �̸��� �Է�â
			btnsignup : ȸ������ ��ư
				On Mouse clicked : signup
			lblconfirm : ȸ������ Ȯ�� �޽��� 
		
		2.ȸ������ ��Ʈ�ѷ�
			1. Initializable �������̽� 
			2. fx:id �������� 
			
		fxml <-------> ��Ʈ�ѷ� ���� 
		fxml���Ͽ��� fx:controller="Member.Signupcontroller"
		
		3.DAO DTO
		
		---------------------------------
		�����ͺ��̽� �ٿ�ε� [ mysql ] 
			1. https://dev.mysql.com/downloads/
			2. MySQL Installer for Windows => 450.7M �ٿ�ε� 
			2. Connector/J => Platform Independent => 4.7M	�ٿ�ε� 
			3. ���� ��ġ�� port��ȣ�� ��й�ȣ �� ����ϱ� 
		
		
		SQL : �����ͺ��̽� ���Ǿ� [ DB ���� ] 
			
			1. create database DB�� : DB[�����] ���� 
				create database javafx
		
			2. create table DB��.���̺��(
		
				create table javafx.member(
					id varchar(10) not null primary key ,
		   			password varchar(4) not null , 
		   			name varchar(10) not null ,
		    			email varchar(20) not null 
				)
		-------------------------------------------------
		1.���̵� ã��.fxml [ ������ ] 
			����� �̸����� ������ ��� ���̺� ã�� ���̵� ��� 
			txtname
			txtemail
			lblconfirm 
			btnfindid
				On Mouse clicked : findid
		2. ��Ʈ�ѷ�
			
		
		��й�ȣ ã��.fxml [������ ]
			���̵�� �̸����� ������ ��� ���̺� ã�� ��й�ȣ ��� 
		
		
		

	
	
	
 * 
 */
