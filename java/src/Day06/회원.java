package Day06;

public class 회원 { // 클래스 s
		// 멤버 : 필드 , 생성자 , 메소드
	// 필드 [ 변수 , 객체 등 ]
	String 아이디;
	String 비밀번호;
	String 성명;
	String 이메일;
	int 전화번호;
	
	// 생성자[ 객체 생성시 초기값 ]
		// 생성자명 == 클래스명 
		// 접근제한자 클래스명(){ }
		// this 현재 클래스의 멤버 
	
	// 1. 빈 생성자 [ 필드을 받지 않는 생성자 ]
	public 회원() {
	}
	// 2. 모든 필드를 받는 생성자 
	public 회원(String 아이디 , String 비밀번호 , String 성명 , String 이메일 , int 전화번호) {
		this.아이디 = 아이디;
		this.비밀번호 = 비밀번호;
		this.성명 = 성명;
		this.이메일 = 이메일;
		this.전화번호 = 전화번호;
	}
	// 3. 특정 필드만 받는 생성자 
	public 회원( String 아이디 , String 비밀번호 ) {
		this.아이디 = 아이디;
		this.비밀번호 = 비밀번호;
	}
	
} // 클래스 e
