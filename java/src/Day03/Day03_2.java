package Day03;

public class Day03_2 {
	
	// 제어문 : 경우에 따른 판단력 
		// if[논리검사] , switch[ 값 검사 ]
	
	 
	public static void main(String[] args) {
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
		
		// 문제2 : 하나의 점수를 입력받아 90점 이상이면 A 80점이상이면 B 그외 탈락 
		
		// 문제3 : 하나의 점수와 성별을 입력받아 
			// 남자이면서 90점 이상이면 A-1 클래스 출력 
			// 여자이면서 90점 이상이면 A-2 클래스 출력 
				// 남자이면서 80점 이상이면 B-1 클래스 출력 
				// 여자이면서 80점 이상이면 B-2 클래스 출력 
					// 그외 C 클래스 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
