package Day06;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Day06_1 {
	
	// 변수 : 메모리 할당
	// 배열 : 동일한 자료형의 변수 여러개 선언/관리
		// 자료형 배열명 = new 자료형[개수]
				// new : 메모리 할당 연산자 
		// [인덱스] : 배열에 저장되는 순서 번호 
		// 다양한 메소드[미리작성된코드] => Arrays 클래스 사용
	
	public static void main(String[] args) {
		
		// 학생수를 입력받아 학생수만큼 배열의 메모리할당
		Scanner scanner = new Scanner(System.in);
		// 배열 선언 
		Integer[] 학생점수 = null;	// 현재 메모리가 null 인 배열 선언 
			// int 		:	정수 자료형	[ new x ] => 변수
			// Integer 	:	정수 클래스 	[ new ] => 객체
		
		while( true ) { // 무한루프 
			
			System.out.println("--- 학생관리 프로그램 --- ");
			System.out.println("1.학생수 2.점수입력 3.통계 4.종료");
			int 선택 = scanner.nextInt();
			
			if( 선택 == 1 ) {
				System.out.print(" ---> 학생수 : "); 
				int 인원수 = scanner.nextInt();
				학생점수 = new Integer[인원수]; 
				System.out.println(인원수 + "만큼 학생점수를 저장할수 있습니다");
			}
			else if( 선택 == 2 ) {
					for( int i = 0 ; i<학생점수.length ; i++  ) {
						System.out.print((i+1)+"번째의 학생점수 입력 : ");
						학생점수[i] = scanner.nextInt();
					}
			}
			else if( 선택 == 3 ) {
				// 정렬 = sort()
				Arrays.sort( 학생점수 ); // 오름차순 
				// 출력 
					System.out.println("-------- 오름차순 ---------");
				for( int i = 0 ; i<학생점수.length ; i++ ) {
					System.out.println((i+1)+"번째 학생의 점수 " + 학생점수[i] );
				}
				
				// 내림차순 : 오름차순 반대로 [ 기본자료형 x ]
				Arrays.sort( 학생점수 , Collections.reverseOrder() );
						// 컬렉션 : 배열 , 리스트
				// 출력 
				System.out.println("-------- 내림차순 ---------");
				for( int i = 0 ; i<학생점수.length ; i++ ) {
					System.out.println((i+1)+"번째 학생의 점수 " + 학생점수[i] );
				}
				
				// 가장 높은 점수 출력 
				// 평균 출력 
			}
			else if( 선택 == 4 ) { }
			else { } 
			
		} // while end
	} // main end
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
