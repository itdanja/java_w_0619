package Day03;

import java.util.Scanner;

public class Day03_2 {
	
	// 제어문 : 경우에 따른 판단력 
		// if[논리검사] , switch[ 값 검사 ]
	
	 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // 입력객체 
		// if 형태
			// 만약에 ~~ 이면 
			// 1. if( T / F ) 실행문;
			// 2. if( T / F ) T실행문;
			// 	  else F실행문;
		
			// 3. if( T / F ) { 실행문; 실행문2; }
			//	  else { 실행문; 실행문2; } 
		
			// 4. if( T / F ) 실행문[T1] ;
			//	  else if( T / F ) 실행문[T2] ;
			//	  else if( T / F ) 실행문[T3] ;
			//	  else if( T / F ) 실행문[T4] ;
			//	  else 
	/*	
		// 예1 
		if( 5 > 3 )System.out.println("5가 크다");
		if( 5 > 10 ) System.out.println("5가 크다2");
		// 예2
		if( 5 > 3 ) System.out.println("5가 크다3");
		else System.out.println( "5가 작다3");
		// 예3
		if( 5 > 3 ) {
			System.out.println("true"); 
			System.out.println("5가 크다4");
		}
		else {
			System.out.println("false"); System.out.println("5가 작다4");
		}
		// 예4
		if( 5 > 10 ) System.out.println("5가 크다1 ");
		else if( 5 > 8 ) System.out.println("5가 크다2 ");
		else if( 5 > 6 ) System.out.println("5가 크다3 ");
		else if( 5 > 4 ) System.out.println("5가 크다4 ");
		else System.out.println( "5보다 작은 데이터가 없다 ");
	
		
		// 문제1 : 하나의 점수를 입력받아 80점 이상이면 합격 아니면 불합격 출력
		
		System.out.print(" 점수1 입력 : ");	int 점수1 = scanner.nextInt();
		
		if( 점수1 >=80 ) System.out.println("합격");
		else System.out.println("불합격");
			
		// 문제2 : 하나의 점수를 입력받아 90점 이상이면 A 80점이상이면 B 그외 탈락 
		
		System.out.print(" 점수2 입력 : "); 	int 점수2 = scanner.nextInt();
		
		if( 점수2 >= 90 ) System.out.println("A등급");
		else if( 점수2 >= 80 ) System.out.println("B등급");
		else System.out.println("탈락");
		
		// 문제3 : 하나의 점수와 성별을 입력받아 
		System.out.print("점수3 입력 : ");			int 점수3 = scanner.nextInt();
		System.out.print("성별 입력[남,여] : ");	String 성별 = scanner.next();
			// 남자이면서 90점 이상이면 A-1 클래스 출력 
			// 여자이면서 90점 이상이면 A-2 클래스 출력 
				// 남자이면서 80점 이상이면 B-1 클래스 출력 
				// 여자이면서 80점 이상이면 B-2 클래스 출력 
					// 그외 C 클래스 
		if( 성별.equals("남") ) {
			
			if( 점수3 >= 90 ) System.out.println(" A-1 클래스 ");
			else if( 점수3 >= 80 ) System.out.println(" B-1 클래스");
			else System.out.println(" C 클래스 "); 
			
		}
		else if( 성별.equals("여") ){
			if( 점수3 >= 90 ) System.out.println(" A-2 클래스 ");
			else if( 점수3 >= 80 ) System.out.println(" B-2 클래스");
			else System.out.println(" C 클래스 "); 
		}
		else {
			System.out.println(" C 클래스 "); 
		}
	*/	
	/*	
		//문제4 : 2개 정수를 입력받아 가장 큰수 출력 
		System.out.print( "비교할 정수1 : ");	int 정수1 = scanner.nextInt();
		System.out.println( "비교할 정수2 : ");	int 정수2 = scanner.nextInt();
		if( 정수1 > 정수2 ) System.out.println( 정수1 );
		else System.out.println( 정수2 );
		
		//문제5 : 3개 정수를 입력받아 가장 큰수 출력 
		System.out.print( "비교할 정수1 : ");	int 정수3 = scanner.nextInt();
		System.out.print( "비교할 정수2 : ");	int 정수4 = scanner.nextInt();
		System.out.print( "비교할 정수3 : ");	int 정수5 = scanner.nextInt();
		//////////////////////////////방법1///////////////////////////////////////
		int max = 정수3;
		if( max < 정수4 ) max = 정수4;
		if( max < 정수5 ) max = 정수5;
		System.out.print(" 가장 큰수는 : " + max );
		///////////////////////////////방법2///////////////////////////////////
		if( 정수3 > 정수4 && 정수3 > 정수5 ) System.out.println( 정수3 );
		else if( 정수4 > 정수3 && 정수4 > 정수5 ) System.out.println( 정수4 );
		else if( 정수5 > 정수3 && 정수5 > 정수4 ) System.out.println( 정수5 );
		else System.out.println(" 모두 같다 ");

		//문제6 : 4개 정수를 입력받아 가장 큰수 출력 
		System.out.print( "비교할 정수1 : ");	int 정수6 = scanner.nextInt();
		System.out.print( "비교할 정수2 : ");	int 정수7 = scanner.nextInt();
		System.out.print( "비교할 정수3 : ");	int 정수8 = scanner.nextInt();
		System.out.print( "비교할 정수4 : ");	int 정수9 = scanner.nextInt();
		int max2 = 정수6;  // 임의로 첫번째 변수를 max에 대입 
			if( max2 < 정수7 ) max2 = 정수7;		// if( max2 < 정수7 ) max2 = 정수7;	
			if( max2 < 정수8 ) max2 = 정수8;		// else if( max2 < 정수8 ) max2 = 정수8;
			if( max2 < 정수9 ) max2 = 정수9;		// else if ( max2 < 정수9 ) max2 = 정수9;	
				// if 	else if 	else if	: 첫번째 if에 T 이면 다음 else if 검사 실행x
				// if 	if 			if 		: 첫번째 if에 T 이더라도 두번째 IF 검사 실행
	*/		
		//문제7 : 3개 정수를 입력받아 오름차순 정렬후 출력 [ 교체 방법 ] 오름차순 : if( 정수1 > 정수2 )
		System.out.print( "정수1 : ");	int 정수1 = scanner.nextInt();
		System.out.print( "정수2 : ");	int 정수2 = scanner.nextInt();
		System.out.print( "정수3 : ");	int 정수3 = scanner.nextInt();
		int temp ; // 교체용 임시 변수 
		System.out.printf( " 정렬 전 : %d %d %d " , 정수1 , 정수2 , 정수3 );
			if( 정수1 > 정수2 ) { temp = 정수1 ; 정수1 = 정수2 ; 정수2 = temp; }
			if( 정수1 > 정수3 ) { temp = 정수1 ; 정수1 = 정수3 ; 정수3 = temp; }
			if( 정수2 > 정수3 ) { temp = 정수2 ; 정수2 = 정수3 ; 정수3 = temp; }
		System.out.printf( " 정렬 후 : %d %d %d " , 정수1 , 정수2 , 정수3 );
		
		//문제8 : 3개 정수를 입력받아 내림차순 정렬후 출력  
			// 오름차순 : if( 정수1 > 정수2 ) 비교대상이 더 작으면 교환 [ swap ]
			// 내림차순 : if( 정수1 < 정수2 ) 비교대상이 더 크면 교환 [ swap ]
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
