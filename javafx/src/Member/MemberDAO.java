package Member;

import java.sql.Connection;
import java.sql.DriverManager;

public class MemberDAO {
	// Dao : Data Access Object : DB에 접근용 객체 
		// DB[데이터베이스] <-- DAO---> JAVA
	// DTO : Data Transfer Object : 전송 객체 
	
	Connection connection; //DB 와 연결 해주는인터페이스 
		// 현재 클래스의 본인 객체 [ DB 객체 ] 
	private static MemberDAO instance = new MemberDAO();
		// 객체 반환
	public static MemberDAO getinstance() {
		return instance;
	}
	// 1. DB 라이브러리 추가 
	// 2. DB연동 
	public MemberDAO() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // mysql 제공해주는 드라이브 클래스명 
			connection = DriverManager.
					getConnection("jdbc:mysql://localhost:3306/javafx?serverTime=UTC" , "root" , "1234");
													// jdbc:mysql:// ip주소:port번호/ DB명? 시간설정			, "계정명" , "비밀번호" 
			System.out.println(" DB 연동 성공 ");
		}catch (Exception e) { System.out.println(" DB 연동 실패 ");}
	}
	
}
