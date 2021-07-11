package Day08;

public class 학생 extends 사람 {
	
	// 필드
	int 학년;
	// 생성자 

	public 학생() {
		super();
	}
	public 학생(String 이름, int 나이 , int 학년) {
		super(이름, 나이);
		this.학년 = 학년;
	}
	// 오버라이딩 : 미리 작성된 메소드를 다시 구현
	@Override
	public void 정보() {
		super.정보();
		System.out.println("학생의 이름 : " + this.이름);
	}
	


	
	
	
	
	

}
