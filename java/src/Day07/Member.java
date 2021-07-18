package Day07;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

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
	public Member(String 아이디, String 비밀번호, String 이름, int 성별, String 이메일, int 휴대전화, int 포인트, String 등급) {
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
	public Member(String 아이디, String 비밀번호, String 이름,int 성별, int 휴대전화) {
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
	public void 회원가입() {
		// 입력받기
		System.out.println("\n[[[ 회원가입 화면 ]]]");
		System.out.print("아이디 : ");	String 아이디 = Day07_2_Start.scanner.next();
			// 아이디 중복체크
			for( int i = 0 ; i<Day07_2_Start.members.size() ; i++ ) {
				Member temp = Day07_2_Start.members.get(i);
					// i번째 회원을 temp에 임시 대입
				if( temp.아이디.equals(아이디) ) {
					System.err.println("[경고] 동일한 아이디가 존재합니다[뒤로가기]");
					return; //메소드종료 : 메소드 반환 : 반환 데이터 없음
				}
			}
		
		System.out.print("비밀번호 : ");	String 비밀번호 = Day07_2_Start.scanner.next();
		System.out.print("이름 : ");		String 이름 = Day07_2_Start.scanner.next();
		System.out.print("성별 남자:1 여자:2 미설정:0 중 선택:"); int 성별 = Day07_2_Start.scanner.nextInt();
		System.out.print("휴대전화 [ - 제외 ] : ");		int 휴대전화 = Day07_2_Start.scanner.nextInt();
		
		// 객체 만들기 
		Member member = new Member(아이디, 비밀번호, 이름, 성별, 휴대전화);
		// 리스트 혹은 배열 저장 
		Day07_2_Start.members.add(member);
		// 회원가입 성공 
		System.err.println("[회원가입성공] : 가입해주셔서 감사합니다 ");
		// 파일처리 
		try {
			FileOutputStream fileOutputStream 
					= new FileOutputStream("c:/java/memberlist.txt");
			// 리스트내 모든 회원을 파일에 저장 
			// 리스트의 for문 활용 
			for( Member temp : Day07_2_Start.members ) {
				// for( 임시 객체명 : 리스트명 ) : 리스트내 모든 객체를 임시객체에 하나씩 대입 
				// 회원정보를 하나의 문자열 변환 [ 필드 구분 ,  // 회원[객체] 구분 \n ]
				String 회원정보 = temp.아이디+","+temp.비밀번호+","+temp.이름+
						","+temp.성별+","+temp.이메일+","+temp.포인트+","+
						temp.휴대전화+","+temp.등급+"\n";
				
				fileOutputStream.write( 회원정보.getBytes() );
			}
		} catch ( Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// 2. 로그인 메소드 
	public void 로그인() {}
	
	// 3. 아이디찾기 메소드 
	public void 아이디찾기() { // 이름이랑 메일이 동일한겨우 아이디출 console 
		
	
	} 
	
	// 4. 비밀번호 찾기 메소드 
	public void 비밀번호찾기() {} // 아이디랑 메일이 동일한경우 메일로 비밀번호 전송
	
	// 5. 포인트 증가 메소드 
	public void 포인트증가() {}
	
	// 6. 등급 증가 메소드 
	public void 등급증가() {}
	
	// 7. 회원 탈퇴 메소드 
	public void 회원탈퇴() {}
	
	// 8. 회원 수정 메소드 
	public void 회원수정() {}
	
	


}
