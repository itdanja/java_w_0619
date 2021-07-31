package Day12;

public class 코스<매개클래스> {

	// 필드 
	private String 과정명;
	private 매개클래스[] 회원목록;
	// 생성자 
	public 코스( String 과정명 , int 인원수 ) {
		this.과정명 = 과정명;
		회원목록 = (매개클래스[])new Object[인원수];
				// object로 메모리할당받아 매개클래스배열로 형변환
	}
	// 메소드 
	public void 추가( 매개클래스 매개객체 ) {
		for( int i = 0 ; i<회원목록.length ; i++ ) {
			if( 회원목록[i] == null ) {
				회원목록[i]  = 매개객체; 
				break;
			}
		}
	}
	// get. set => 사용목적 : private 필드를 다른 클래스에 접근메소드 
	public String get과정명() {
		return 과정명;
	}
	public void set과정명(String 과정명) {
		this.과정명 = 과정명;
	}
	public 매개클래스[] get회원목록() {
		return 회원목록;
	}
	public void set회원목록(매개클래스[] 회원목록) {
		this.회원목록 = 회원목록;
	}
	
	
	
	
	
}
