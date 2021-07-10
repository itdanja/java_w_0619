package Day07;

public class Member {

	// 필드 [ 상태 ] 
	String 아이디 ; 
	String 비밀번호;
	String 이름;
	int 성별;
	String 이메일;
	int 휴대전화;
	int 포인트;
	String 등급;
	// 생성자
	// 1. 빈생성자 
	public Member() {}
	// 2. 전체 필드를 갖는 생성자 
		// 마우스 오른쪽클릭 => source => 생성자 혹은 메소드 등 자동완성
	public Member(String 아이디, String 비밀번호, String 이름, 
			int 성별, String 이메일, int 휴대전화, int 포인트, String 등급) {
		this.아이디 = 아이디;
		this.비밀번호 = 비밀번호;
		this.이름 = 이름;
		this.성별 = 성별;
		this.이메일 = 이메일;
		this.휴대전화 = 휴대전화;
		this.포인트 = 포인트;
		this.등급 = 등급;
	}
	// 3. 회원가입 필수로 들어가는 생성자 
	public Member(String 아이디, String 비밀번호, String 이름,
								int 성별, int 휴대전화) {
		this.아이디 = 아이디;
		this.비밀번호 = 비밀번호;
		this.이름 = 이름;
		this.성별 = 성별;
		this.휴대전화 = 휴대전화;
		this.포인트 = 0;
		this.등급 = "일반";
	}
	
	// 메소드 [ 행동 ] 
	// 1. 회원가입 메소드 
	
	// 2. 로그인 메소드 
	
	// 3. 아이디찾기 메소드 
	
	// 4. 비밀번호 찾기 메소드 
	
	// 5. 포인트 증가 메소드 
	
	// 6. 등급 증가 메소드 
	
	// 7. 회원 탈퇴 메소드 
	
	// 8. 회원 수정 메소드 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
