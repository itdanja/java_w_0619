package Day08;

public class 신한은행 extends 계좌 {
	
	private final int 은행코드 = 10;
		// final => 상수

	public 신한은행() {
		super();
	}

	public 신한은행(String 계좌번호, int 비밀번호, String 계좌주, int 금액) {
		super(계좌번호, 비밀번호, 계좌주, 금액);
	}

	public 신한은행(String 계좌번호, int 비밀번호, String 계좌주 ) {
		super(계좌번호, 비밀번호, 계좌주);
		
	}
	@Override
	public void 계좌등록( ) {
		System.out.println("[[[[ 신한은행 계좌 등록 화면 ]]]]");
		System.out.print("[[[ 계좌번호 : "); // 제어 : 중복제거 
			String 계좌번호 = Day08_7_ATM.scanner.next();
		System.out.print("[[[ 비밀번호 : "); // 제어 : 4개의 수 
			int 비밀번호 = Day08_7_ATM.scanner.nextInt();
		System.out.print("[[[ 계좌주 : "); 	
			String 계좌주 = Day08_7_ATM.scanner.next();
		
		신한은행 temp = new 신한은행(계좌번호, 비밀번호, 계좌주);
		Day08_7_ATM.계좌목록.add(temp);
		System.err.println("\n[[[ [완료] 신한은행 계좌가 생성되었습니다 ]]]");
	}
	
	
	
	
	

}
