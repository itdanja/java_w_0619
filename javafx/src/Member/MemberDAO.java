package Member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
		String sql = "insert into member values(?,?,?,?)";
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
	// �α��� �޼ҵ� [ �μ� : ���̵� �� ��й�ȣ ] 
	public boolean login( String id , String password ) {
		
		String sql = "select * from member where id =? and password = ? ";
			// ���۾� : �˻� sql 
				// Ư�� �ʵ� �˻� : select �˻��ʵ�� from ���̺�� where ����( �ʵ�� = �� )
				// ��� �ʵ� �˻� : select * from ���̺�� where ����( �ʵ�� = �� ) 
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, id);
			preparedStatement.setString(2, password );
			
			ResultSet resultSet = preparedStatement.executeQuery();
				// ResultSet : ������ ����� �������ִ� �������̽� [ ���� = ����(�˻��� ���) ]
				// resultSet : null => �������1 => �������2 
			if( resultSet.next() ) {
				// resultSet.next() : ������ ���� ��� �������� [ �����ϸ� �� => true // ������ => false ]
				return true; // �α��� ���� 
			}
			return false;// �α��� ���� 
			
		}catch (Exception e) {}
		
		return false; // �α��ν��� 
	}
	
	// ���̵� ã�� �޼ҵ� 
	public String findid( String name , String email ) {
		
		String sql = "select * from member where name =? and email =?";
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, name);
			preparedStatement.setString(2, email);
			
			ResultSet resultSet =  preparedStatement.executeQuery();
			
			if( resultSet.next() ) {
				return resultSet.getString(1); // ���� ����� ���̵� ��ȯ // getString(�ʵ��ȣ) : ������ �ʵ��ȣ
			}
			return null; // �˻� ����� ������ 
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
