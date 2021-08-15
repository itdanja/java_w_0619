package Member;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Findidcontroller implements Initializable {
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

	}

    @FXML
    private Label btnfindid;

    @FXML
    private Label lblconfirm;

    @FXML
    private TextField txtname;

    @FXML
    private TextField txtemail;

    @FXML
    void findid(MouseEvent event) {
    	String name = txtname.getText();
    	String email = txtemail.getText();
    	
    	MemberDAO memberDAO = MemberDAO.getinstance();
    	String result = memberDAO.findid(name, email);
    	System.out.println( result );
    	if( result != null ) {
    		lblconfirm.setText(" 회원님의 아이디 : " + result );
    	}else {
    		lblconfirm.setText(" 동일한 회원정보가 없습니다 ");
    	}
    }


    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
