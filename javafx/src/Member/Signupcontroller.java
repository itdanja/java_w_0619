package Member;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Signupcontroller implements Initializable {
									// �������� �������� �ʱⰪ ����
	
	
	// ������ ó�� �������� �ʱⰪ �޼ҵ� 
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		lblconfirm.setText("");
	}
	
	// ���������� ��Ʈ�ѵ��� fx:id
    @FXML
    private TextField txtid;

    @FXML
    private PasswordField txtpasswordconfirm;

    @FXML
    private Label btnsignup;

    @FXML
    private Label lblconfirm;

    @FXML
    private TextField txtname;

    @FXML
    private TextField txtemail;

    @FXML
    private PasswordField txtpassword;

    @FXML
    void signup(MouseEvent event) {

    	// 1. ���ڿ� �Էµ� ������ ��������  
    	String id =  txtid.getText(); // �ؽ�Ʈ�� �Էµ� ������ �������� 
    	String password = txtpassword.getText();
    	String passwordconfirm =  txtpasswordconfirm.getText();
    	String name = txtname.getText();
    	String email = txtemail.getText();	
    	// 2.��ȿ���˻�    	
    		// 0. ���̵�� 3~10���� �̳� 
    		if( id.length() <= 3 || id.length() > 10) {
    			lblconfirm.setText("[���] ���̵�� 3~10���� �̳� " );
    			return;
    		}
    		// 1. �н����� Ȯ�� üũ
    		if( !password.equals(passwordconfirm) ) {
    			lblconfirm.setText("[���] �н����� Ȯ���� �ٸ��ϴ�");
    			return;
    		}
    		// 2. �н����� 4���ڸ� ���� 
    		if( password.length() != 4  ) {
    			lblconfirm.setText("[���] �н������ 4���ڸ� ����" );
    			return;
    		}
    		// 3. �̸��� 10���� �̳� 
    		if( name.length() >10 ) {
    			lblconfirm.setText("[���] �̸��� 10���� �̳� ");
    			return;
    		}
    		// 4. �̸��� @ ���� 
    		if( !email.contains("@") ) {
    			lblconfirm.setText("[���] �̸��� �������� �Է����ּ���");
    			return;
    		}
    	// 3. ��üȭ 
    		lblconfirm.setText("[����] ȸ������ ���� ");
    		Member member = new Member(id, password, name, email);
    	// 4. �����ͺ��̽� ���� 
    		// 1. db ��ü ȣ��
    		MemberDAO memberDAO = MemberDAO.getinstance();
    		//MemberDAO memberDAO = new MemberDAO()
    }
	
    
    
    
    
    
    
    
    
    
    
	
    
    
    
    
    
    
    
    
    
    
    
}
