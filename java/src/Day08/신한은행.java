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
		System.out.print("[[[ 계좌번호 : "); 
			String 계좌번호 = Day08_7_ATM.scanner.next();
			// 제어 : 중복제거 
			for( 계좌 temp : Day08_7_ATM.계좌목록  ) {
				// for( 임시객체 : 리스트명 ) 리스트내 모든 객체를 하나씩 임시객체에 대입 
				if( temp.get계좌번호().equals(계좌번호) ) {
					System.err.println("\n[[[ [실패] 동일한 계좌번호가 있습니다 ]]]");
					return; // 메소드 종료 
				}
			}
		System.out.print("[[[ 비밀번호 : "); 
			int 비밀번호 = Day08_7_ATM.scanner.nextInt();
			// 제어 : 4자리의 수
				String s비밀번호 = Integer.toString(비밀번호);
								// Integer.toString( 숫자 ) ;  숫자열 => 문자열 
				if( s비밀번호.length() != 4 ) {
						// 문자열.length : 문자열 길이 [ 글자수 ] 
					System.err.println("\n[[[ [실패] 비밀번호는 숫자 4 자리 만 가능 합니다 ]]]");
					return;
				}
		System.out.print("[[[ 계좌주 : "); 	
			String 계좌주 = Day08_7_ATM.scanner.next();
		
		신한은행 temp = new 신한은행(계좌번호, 비밀번호, 계좌주);
		Day08_7_ATM.계좌목록.add(temp);
		System.err.println("\n[[[ [완료] 신한은행 계좌가 생성되었습니다 ]]]");
	}
	
	@Override
	public void 입금() {
		System.out.println("[[[[ 신한은행 입금 화면 ]]]]");
		super.입금();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
