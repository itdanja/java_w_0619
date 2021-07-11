package Day08;

public class 관리자클래스 extends 회원 {
	
	String 관리자직급;
	public 관리자클래스() { super(); }
	public 관리자클래스(String 아이디, String 비밀번호 , String 관리자직급) {
		super(아이디, 비밀번호);
		this.관리자직급 = 관리자직급;
	}
	@Override
	public void 회원정보() {
		super.회원정보();
		System.out.println("[[[ 관리자회원님의 직급 : " + this.관리자직급);
		
	}
	
	

}
