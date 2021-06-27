package Day04;

import java.util.Scanner;

public class Day04_2 {

	// 반복문을 이용한 별 출력 
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); // 입력객체 
		
		// 문제1 : 입력한 개수 만큼 별[*] 출력 
		System.out.print("문제1 정수 입력 : ");	int 문제1 = scanner.nextInt(); //  입력객체에서 데이터 가져오기 
		for( int i = 1 ; i<=문제1 ; i++ ) { System.out.print("*"); }
			// i는 1부터 입력받은 수까지 i는 1씩증가하면서 반복 
System.out.println("\n-------------------------------------------");	

		// 문제2 : 입력한 개수 만큼 별[*] 출력 / 단 5개마다 줄바꿈 
		System.out.print("문제2 정수 입력 : ");	int 문제2 = scanner.nextInt();
		for( int i = 1 ; i<=문제2 ; i++ ) { 
			System.out.print("*");
			if( i % 5 == 0 ) System.out.println(); // 5의 배수마다 줄바꿈 
		}
		
		// 문제3 : 입력한 줄 만큼 별삼각형 출력 
			/*  예 ) 6 		i = 줄		S = 별
			  	*		i = 1			S = 1
			  	**		i = 2			S = 1 2 
			  	***		i = 3 			S = 1 2 3 
			  	****	i = 4 			S = 1 2 3 4
			  	*****	i = 5 			S = 1 2 3 4 5
			  	******	i = 6			S = 1 2 3 4 5 6 
			  			i <= 입력값		S <= i[현재줄]
			 */
		System.out.print("문제3 정수 입력 : ");	int 문제3 = scanner.nextInt();
		for( int i = 1 ; i<=문제3 ; i++ ) {
			// 별찍기
			for( int s = 1 ; s<= i ; s++ ) {System.out.print("*");}
			System.out.println();
		}
		// 문제4 : 입력한 줄 만큼 별삼각형 출력 
			/*  예 ) 5		i		s
			  	*****	i = 1		s = 1 2 3 4 5 		5-1	4
			  	****	i = 2 		s = 1 2 3 4 		5-2	3
			  	***		i = 3 		s = 1 2 3 			5-3	2
			  	**		i = 4 		s = 1 2 			5-4	1
			  	*		i = 5		s = 1				5-5	0
			  			i<=입력값		최대줄[입력값]-현재줄[i]+1
			 */
		System.out.print("문제4 정수 입력 : ");	int 문제4 = scanner.nextInt();
		for( int i = 1 ; i<=문제4 ; i++ ) {
			// 별찍기 
			for( int s = 1 ; s<= 문제4-i +1 ; s++ ) {System.out.print("*");}
			// 줄바꿈
			System.out.println();
		}
		// 문제5 : 입력한 줄 만큼 별삼각형 출력 
			/*  예 ) 5 
			  		 *
			  	    **
			  	   ***
			  	  ****
			  	 *****
			 */
		
		// 문제6 : 입력한 줄 만큼 별삼각형 출력 
			/*  예 ) 5 
			 	 *****
			 	  ****
			 	   ***
			 	    **
			 	     *
			 */
		// 문제7 : 입력한 줄 만큼 별삼각형 출력 
			/*  예 ) 5 
			 		*
			 	   ***
			 	  *****
			 	 *******
			 	*********
			 */
		// 문제8 : 입력한 줄 만큼 별삼각형 출력 
			/*  예 ) 5 
			 		1
			 	   222
			 	  33333
			 	 4444444
			 	555555555
			 */
		
		// 문제9 : 입력한 줄 만큼 별삼각형 출력 
			/*  예 ) 5 
			 	*********
			 	 *******
			 	  *****
			 	   ***
			 	    *
			 */
		
		// 문제10 : X 모양 출력 
			/*  예 ) 5 
			 	 *     *
			 	  *   *
			       * *
			        *
			 	   * *
			 	  *   *
			 	 *     *
			 */
			
		
		

		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
