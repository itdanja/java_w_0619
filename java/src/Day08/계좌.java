package Day08;

public class 계좌 {
	// 필드
	private String 계좌번호 ;
	private int 비밀번호 ;
	private String 계좌주;
	private int 금액;
	// 생성자 
	public 계좌() {}
	public 계좌(String 계좌번호, int 비밀번호, String 계좌주, int 금액) {
		this.계좌번호 = 계좌번호;
		this.비밀번호 = 비밀번호;
		this.계좌주 = 계좌주;
		this.금액 = 금액;
	}
	public 계좌(String 계좌번호, int 비밀번호, String 계좌주) {
		this.계좌번호 = 계좌번호;
		this.비밀번호 = 비밀번호;
		this.계좌주 = 계좌주;
		this.금액 = 0;
	}

	
	// 1. 계좌등록 메소드 
	public void 계좌등록( ) {
		System.out.println("[[[[ 계좌 등록 화면 ]]]]");
		System.out.print("[[[ 계좌번호 : "); 
			String 계좌번호 = Day08_7_ATM.scanner.next();
		System.out.print("[[[ 비밀번호 : "); 
			int 비밀번호 = Day08_7_ATM.scanner.nextInt();
		System.out.print("[[[ 계좌주 : "); 
			String 계좌주 = Day08_7_ATM.scanner.next();
		
		// 객체 생성 
		계좌 계좌 = new 계좌(계좌번호, 비밀번호, 계좌주);
		// 리스트 담기 
		Day08_7_ATM.계좌목록.add(계좌);
	}
	
	// 2. 입금 메소드 
	public void 입금() {
		System.out.println("[[[[ 입금 등록 화면 ]]]]");
		System.out.print("[[[ 계좌번호 : "); 
			String 계좌번호 = Day08_7_ATM.scanner.next();
		System.out.print("[[[ 비밀번호 : "); 
			int 비밀번호 = Day08_7_ATM.scanner.nextInt();
		System.out.print("[[[ 입금액 : "); 
			int 입금액 = Day08_7_ATM.scanner.nextInt();
		
		for( 계좌 temp : Day08_7_ATM.계좌목록 ) {
			if( temp.get계좌번호().equals(계좌번호) && temp.get비밀번호() == 비밀번호 ) {
				temp.입금처리(입금액);;
			}
		}
	}
	// 메소드 
	// 0. get , set 메소드 
	public String get계좌번호() {
		return this.계좌번호;
	}
	public int get비밀번호() {
		return this.비밀번호;
	}
	public void 입금처리( int 입금액 ) {
		this.금액 += 입금액;
		System.err.println("\n[[[ [완료] 입금처리가 되었습니다  ]]]");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
