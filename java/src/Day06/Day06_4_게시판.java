package Day06;

import java.util.ArrayList;
import java.util.Scanner;

public class Day06_4_게시판 {
	
	// main 밖에 선언하는 이유 : 다른 클래스에서 해당 메모리[변수/객체] 접근하기 위해 
		// 단점 : main 실행되기때문에 main메소드가 해당 메모리 인식X
			// static : main 메소드 보다 메모리 우선할당
				// 프로그램 종료시까지 메모리 할당
				// 전반적인 모든 코드에 사용되는 메모리 할당시 
	static Scanner 입력객체 = new Scanner(System.in);
	// 리스트 
	static ArrayList<게시물> 게시물목록 = new ArrayList<>();
		// ArrayList<리스트에담을클래스> 객체명 = new ArrayList<>();
			// < > : 제네릭
			// 리스트명.add(객체명) : 리스트에 객체 추가 
			// 리스트명.get(인덱스번호) : 해당 인덱스번호 위치에 객체 호출 
	
	// 게시판 프로그램
	public static void main(String[] args) {

		while( true) {
			System.out.println("---- 커뮤니티 게시판 ----");
				게시물.게시물출력(); // 메소드 호출 
				
			System.out.println("1.글쓰기 2.게시물보기 3.게시물삭제");
			int 선택 = 입력객체.nextInt();
			if( 선택 == 1 ) {
				게시물.게시물등록(); // 메소드 호출 
			}
			if( 선택 == 2 ) {
				System.out.println("----> 게시물 번호 선택 : ");
				int 번호 = 입력객체.nextInt();
				게시물.게시물상세보기(번호);
			}
			if( 선택 == 3 ) {}
			
		}
		
	}
	
	
}
