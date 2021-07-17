package Day09;

import java.util.Scanner;

public class 은행 implements ATM {
	
	Scanner scanner = new Scanner(System.in);
	// 필드 
	String 계좌번호;
	int 예금액;
	
	// 생성자 [ 1.빈생성자 2.모든필드갖는생성자 ]
	public 은행() {}
	public 은행(String 계좌번호, int 예금액) {
		this.계좌번호 = 계좌번호;
		this.예금액 = 예금액;
	}
	
	// 메소드 
	
	// 계좌찾기 메소드 
	public int 계좌검색( String 계좌번호 ) {
		for( int i = 0 ; i<Day09_3.banklist.size() ; i++ ) {
			if( Day09_3.banklist.get(i).계좌번호.equals(계좌번호) ) {
				return i; // 찾은 계좌의 순번 
			}
		}
		return -1; // -1 찾은 계좌가의 순번이 없을경우 
	}
	
	@Override
	public void 메뉴() {
		while(true) {
			System.out.println("[[[[ 은행 메뉴 ]]]]");
			System.out.println("1.계좌등록 2.예금 3.출금 4.이체 5.잔고 6.종료");
			System.out.print("선택 : ");
			int 선택 = scanner.nextInt();
			if( 선택 == 1 ) 계좌등록();
			if( 선택 == 2 ) 예금();
			if( 선택 == 3 ) 출금();
			if( 선택 == 4 ) 이체();
			if( 선택 == 5 ) 잔고();
			if( 선택 == 6 ) return;
		}
		
	}
	@Override
	public void 계좌등록() {
		System.out.println("==> 계좌번호 : ");
		String 계좌번호 = scanner.next();
		
		// 계좌찾기 
		int result =  계좌검색(계좌번호);
		if( result == -1 ) {
			System.out.println("[계좌등록] ");
			Day09_3.banklist.add( new 은행(계좌번호, 0) );
			return;
		}else {
			System.out.println("[동일한 계좌가 있습니다]");
			return;
		}	
	}
	@Override
	public void 예금() {
		System.out.println("==> 계좌번호 : ");
		String 계좌번호 = scanner.next();
		System.out.println("==> 예금액 : ");
		int 예금액 = scanner.nextInt();
		// 계좌찾기 
		int result =  계좌검색(계좌번호);
		if( result == -1 ) {
			System.out.println("[동일한 계좌가 없습니다]");
			return;
		}else {
			System.out.println("[예금] ");
			Day09_3.banklist.get(result).예금액 += 예금액;
		}
		
	}
	@Override
	public void 출금() {
		System.out.println("==> 계좌번호 : ");
		String 계좌번호 = scanner.next();
		System.out.println("==> 출금액 : ");
		int 출금액 = scanner.nextInt();
		// 계좌찾기 
		int result =  계좌검색(계좌번호);
		if( result == -1 ) {
			System.out.println("[동일한 계좌가 없습니다]");
			return;
		}else {
			System.out.println("[출금] ");
			Day09_3.banklist.get(result).예금액 -= 출금액;
		}
	}
	@Override
	public void 이체() {
		System.out.println("==> 계좌번호 : ");
		String 계좌번호 = scanner.next();
		System.out.println("==> 이체액 : ");
		int 이체액 = scanner.nextInt();
		System.out.println("==> 받는사람 계좌번호 : ");
		String 받는계좌번호 = scanner.next();
		
		// 계좌찾기 
		int result =  계좌검색(계좌번호);
		if( result == -1 ) {
			System.out.println("[동일한 계좌가 없습니다]");
			return;
		}else {
			System.out.println("[이체] ");
			int result2 =  계좌검색(받는계좌번호);
			if( result == -1 ) {
				System.out.println("[동일한 계좌가 없습니다]");
				return;
			}else {
				Day09_3.banklist.get(result2).예금액 += 이체액;
				Day09_3.banklist.get(result).예금액 -= 이체액;
			}
		}
	}
	@Override
	public void 잔고() {
		System.out.println("==> 계좌번호 : ");
		String 계좌번호 = scanner.next();
		int result =  계좌검색(계좌번호);
		if( result == -1 ) {
			System.out.println("[동일한 계좌가 없습니다]");
			return;
		}else {
			System.out.println("[잔고] ");
			System.out.println( Day09_3.banklist.get(result).예금액 );
		}
	}
	
	
	
	

}
