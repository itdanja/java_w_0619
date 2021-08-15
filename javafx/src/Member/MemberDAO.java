package Member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MemberDAO {
	// Dao : Data Access Object : DB�� ���ٿ� ��ü 
		// DB[�����ͺ��̽�] <-- DAO---> JAVA
	// DTO : Data Transfer Object : ���� ��ü 
	
	Connection connection; //DB �� ���� ���ִ��������̽� 
		// ���� Ŭ������ ���� ��ü [ DB ��ü ] 
	private static MemberDAO instance = new MemberDAO();
		// ��ü ��ȯ
	public static MemberDAO getinstance() {
		return instance;
	}
	// 1. DB ���̺귯�� �߰� 
	// 2. DB���� 
	public MemberDAO() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // mysql �������ִ� ����̺� Ŭ������ 
			connection = DriverManager.
					getConnection("jdbc:mysql://localhost:3306/javafx?serverTime=UTC" , "root" , "1234");
													// jdbc:mysql:// ip�ּ�:port��ȣ/ DB��? �ð�����			, "������" , "��й�ȣ" 
			System.out.println(" DB ���� ���� ");
		}catch (Exception e) { System.out.println(" DB ���� ���� ");}
	}
	
	// ȸ������ �޼ҵ�  [ �μ� : ������ ��ü ]
	public boolean signup( Member member ) {
		//1. SQL �ۼ� 
		String sql = "insert into member value(?,?,?,?)";
				// ���۾� : �߰� SQL 
					// ��� �ʵ忡 ������ : insert into ���̺�� values( ��1, ��2 , ��3 ~~~ ) ;
					// Ư�� �ʵ忡 ������ : insert info ���̺��( �ʵ��1 , �ʵ��2 , �ʵ��3 ~~) values( ��1 , ��2 , ��3 ~~)
		try {
			//2. DB�� SQL ���� 
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			//3. SQL ���� [ sql�� �ִ� ? ���԰� �ֱ� ] 
			preparedStatement.setString( 1 , member.getId() ); // ù���� ? �� �ֱ� 
			preparedStatement.setString( 2 , member.getPassword() ); // �ι��� ? �� �ֱ� 
			preparedStatement.setString( 3 , member.getName() ); // ������ ? �� �ֱ� 
			preparedStatement.setString( 4 , member.getEmail() ); // �׹��� ? �� �ֱ� 
			//4. SQL ���� 
			preparedStatement.executeUpdate();
			//5. SQL ���
			return true; // ������ true
		}
		catch (Exception e) {
		}
		return false; // ���н� false 
	
	}
	
	
	
	
	
	
	
}
