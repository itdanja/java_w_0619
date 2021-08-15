package Member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
	
	// 회원가입 메소드  [ 인수 : 가입할 객체 ]
	public boolean signup( Member member ) {
		//1. SQL 작성 
		String sql = "insert into member values(?,?,?,?)";
				// 조작어 : 추가 SQL 
					// 모든 필드에 넣을떄 : insert into 테이블명 values( 값1, 값2 , 값3 ~~~ ) ;
					// 특정 필드에 넣을때 : insert info 테이블명( 필드명1 , 필드명2 , 필드명3 ~~) values( 값1 , 값2 , 값3 ~~)
		try {
			//2. DB에 SQL 연결 
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			//3. SQL 조작 [ sql에 있는 ? 대입값 넣기 ] 
			preparedStatement.setString( 1 , member.getId() ); // 첫번쨰 ? 값 넣기 
			preparedStatement.setString( 2 , member.getPassword() ); // 두번쨰 ? 값 넣기 
			preparedStatement.setString( 3 , member.getName() ); // 세번쨰 ? 값 넣기 
			preparedStatement.setString( 4 , member.getEmail() ); // 네번쨰 ? 값 넣기 
			//4. SQL 실행 
			preparedStatement.executeUpdate();
			//5. SQL 결과
			return true; // 성공시 true
		}
		catch (Exception e) {
		}
		return false; // 실패시 false 
	}
	// 로그인 메소드 [ 인수 : 아이디 와 비밀번호 ] 
	public boolean login( String id , String password ) {
		
		String sql = "select * from member where id =? and password = ? ";
			// 조작어 : 검색 sql 
				// 특정 필드 검색 : select 검색필드명 from 테이블명 where 조건( 필드명 = 값 )
				// 모든 필드 검색 : select * from 테이블명 where 조건( 필드명 = 값 ) 
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, id);
			preparedStatement.setString(2, password );
			
			ResultSet resultSet = preparedStatement.executeQuery();
				// ResultSet : 쿼리의 결과를 연결해주는 인터페이스 [ 쿼리 = 가공(검색된 결과) ]
				// resultSet : null => 쿼리결과1 => 쿼리결과2 
			if( resultSet.next() ) {
				// resultSet.next() : 쿼리의 다음 결과 가져오기 [ 존재하면 값 => true // 없으면 => false ]
				return true; // 로그인 성공 
			}
			return false;// 로그인 실패 
			
		}catch (Exception e) {}
		
		return false; // 로그인실패 
	}
	
	// 아이디 찾기 메소드 
	public String findid( String name , String email ) {
		
		String sql = "select * from member where name =? and email =?";
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, name);
			preparedStatement.setString(2, email);
			
			ResultSet resultSet =  preparedStatement.executeQuery();
			
			if( resultSet.next() ) {
				return resultSet.getString(1); // 쿼리 결과의 아이디 반환 // getString(필드번호) : 가져올 필드번호
			}
			return null; // 검색 결과가 없으면 
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
