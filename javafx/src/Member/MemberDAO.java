package Member;

import java.sql.Connection;
import java.sql.DriverManager;

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
	
}
