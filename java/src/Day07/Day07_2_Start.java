package Day07;

import java.util.Scanner;

public class Day07_2_Start {
	
	// 1. 다른 클래스서 공통적인 메모리 => static
		// 1. scanner 
	public static Scanner scanner = new Scanner(System.in);
		// 2. 리스트나 배열 
	
	public static void main(String[] args) {
		
		프로그램시작();
		
	} // main 끝 
	
	// 프로그램 동작 메소드 
	public static void 프로그램시작() {
		// static : 정적변수 : 프로그램 시작시 메모리할당되고 모든 프로그램 종료시 메모리 초기화 
			// 단점 : 메모리 효율 감소 [ 모든 클래스에 사용되는 메모리 선언 ]
		while(true) { // 무한루프 [ 5번 입력시 종료 ] 
			System.out.println("\n[[[[ 회원제 커뮤니티 ]]]]");
			System.out.println("[[[ 1.로그인 2.회원가입 3.아이디찾기 4.비밀번호찾기 5.프로그램종료]]]");
			System.out.print("[[[ 선택 : ");	int 선택 = scanner.nextInt();
			if( 선택 == 1 ) {}
			else if( 선택 == 2 ) {}
			else if( 선택 == 3 ) {}
			else if( 선택 == 4 ) {}
			else if( 선택 == 5 ) {
				System.err.println("\n[종료] 이용해주셔서 감사합니다");
				break;
			}
			else {
				System.err.println("\n[경고] 알수없는 행동입니다");
			} 
		}
	}
	
} // class 끝 
