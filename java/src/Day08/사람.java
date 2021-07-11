package Day08;

public class 사람 {

	// 필드 
	String 이름;
	int 나이;
	
	// 빈생성자 
	public 사람() {
		// TODO Auto-generated constructor stub
	}
	// 모든필드 생성자 : 
	public 사람(String 이름, int 나이) {
		super();
		this.이름 = 이름;
		this.나이 = 나이;
	}
	// 메소드 
	public void 정보() {
		System.out.println(this.이름);
	}

}
