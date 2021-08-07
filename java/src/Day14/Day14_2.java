package Day14;

import java.util.ArrayList;
import java.util.Scanner;

public class Day14_2 {
	
		// 문제1 : 도서 검색 프로그램 
			// [조건1] ArrayList : 도서목록 
			// [리스트 초기값 ] 
					//		1. 된다! 네이버 블로그&포스트
					//		2. 스프링 부트 실전 활용 마스터
					//		3. Tucker의 Go 언어 프로그래밍
					//		4. 혼자 공부하는 C 언어
			// [조건2] 무한루프 메뉴 
				// 1. 검색 => 입력된 키워드가 포함된 도서를 모두 출력하기 
				// 2. 수정 => 수정할 도서를 검색하여 -> 수정할 문자와 새로운문자를 입력받아 수정
	
		public static void main(String[] args) {
			
			ArrayList< String > booklist = new ArrayList<String>();
			booklist.add("된다! 네이버 블로그&포스트");
			booklist.add("스프링 부트 실전 활용 마스터");
			booklist.add("Tucker의 Go 언어 프로그래밍");
			booklist.add("혼자 공부하는 C 언어");
			
			Scanner scanner = new Scanner(System.in);
			
			while(true) {
				System.out.print("1.검색 2.수정  ");
				int ch = scanner.nextInt();
				if( ch == 1 ) {
					System.out.print(" 키워드 : " );	String 키워드 = scanner.next();
					int count = 0 ; // 찾은 개수 저장하는 변수 ㄴ
					for( String string : booklist ) {
						// for( 임시객체 : 리스트/배열 )  리스트내 모든 객체를 하나씩 임시객체 대입 반복 
						if( string.contains(키워드) ) { // 문자열에 키워드가 포함되어 있으면ㄴ
							System.out.println("도서명 : " + string );
							count++; // 찾은 개수
						}
					}
					if( count == 0 ) {
						System.out.println(" 해당하는 도서가 없습니다 ");
					}else {
						System.out.println(" 총 검색 도서 : " + count );
				}	}
				if( ch == 2 ) {
					int i = 1 ;
					for( String string : booklist ) {
						System.out.println( i + "번째 도서명 : " + string);
						i++;
					}
					System.out.println(" 수정할 도서명 선택 : "); int ch2 = scanner.nextInt();
						if( ch2 >= 1 && ch2 < i ) { 
							System.out.println(" 수정할 단어 : ");	String oldstring = scanner.next();
							if( booklist.get(ch-1).contains(oldstring) ) {
								System.out.println(" 새로운 단어 : ");	String newstring = scanner.next();
								booklist.set( ch2 - 1 , booklist.get( ch2-1 ).replace(oldstring, newstring) );
									// set ( 수정할 객체 인덱스 , 새로운 객체  )
								System.out.println(" 수정이 완료 되었습니다 : " + booklist.get(ch-1) );
							}else {
								System.out.println(" 수정할 단어가 도서명에 존재하지 않습니다 ");
							}
						}
						else {
							System.out.println(" 없는 도서번호 입니다 ");
						}
					 
					
				}
			}
			
			
			
			
			
			
			
			
			
			
			
		}
	
				

}
