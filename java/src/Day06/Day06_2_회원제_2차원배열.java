package Day06;

import java.util.Scanner;

public class Day06_2_회원제_2차원배열 {

	/*
	1. 회원제 프로그램 
		1. 최대 100명의 회원을 저장하는 배열 생성 [ 2차원배열 ]
			1. 아이디 , 비밀번호 
		2. 무한루프 [ 초기 메뉴 ] 
			1. 회원가입 [ 중복아이디 x ] 
			2. 로그인 
			3. 종료
		3. 무한루프 [ 로그인시 ]   
			1.회원탈퇴 , 패스워드변경 , 로그아웃[초기메뉴로]
	*/
	public static void main(String[] args) {
		// 입력객체 
		Scanner scanner = new Scanner(System.in);
		
		// 회원100명의 아이디 와 비밀번호 
		String[][] 회원목록 = new String[100][2];
									// [행=회원수][열=아이디,비밀번호]
		// 초기메뉴 => 무한루프 
		while( true ) {
			System.out.println(" ----- 회원제 프로그램 ----- ");
			System.out.println("1.회원가입 2.로그인 3.종료");
			int 선택 = scanner.nextInt();
			
			if( 선택 == 1) { // 회원가입 : 아이디 , 비밀번호 입력받아 배열에 저장 
				System.out.println("----> 회원가입 화면 ---->");
				System.out.print("-> 아이디 : "); 	String 아이디 = scanner.next();
					// 중복체크
					int 중복체크 = 0; // 중복 기본값 0
					for( int i = 0 ; i<회원목록.length; i ++ ) {
						
						if( 회원목록[i][0] !=null && 회원목록[i][0].equals(아이디) ) { // 회원이 아무도 없을때 오류
							System.err.println("\n[실패] 중복된 아이디가 있습니다 ");
							중복체크 = 1;  // 중복이 있는경우 1
							break;
						}
					}

				if( 중복체크 == 0 ) { // 중복이 없는경우 0 => 회원가입 성공 
					System.out.print("-> 비밀번호 : ");	String 비밀번호 = scanner.next();
					// 입력받은 값을 배열에 저장 
					for( int i = 0 ; i<회원목록.length ; i++ ) {
						// i는 0부터 최대회원수만큼 1씩 증가 반복 
						if(회원목록[i][0] ==null ) { // i번째 행의 아이디가 null 이면
							회원목록[i][0] = 아이디;	// 아이디 저장 
							회원목록[i][1] = 비밀번호;	// 비밀번호 저장 
							System.err.println("\n[완료] 회원가입이 되었습니다 ");
							break; //  저장후 반복문 끝내기 
						}
					}
				}
			}
			else if( 선택 == 2 ) {}
			else if( 선택 == 3 ) { 
				System.err.println("\n[종료] 이용해주셔서 감사합니다"); 
				break; // 가장가까운 반복문 탈출 
			}
		}
		
		
	}

}
