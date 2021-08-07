package Day14;

import java.util.Calendar;
import java.util.Scanner;

public class Day14_4_달력 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print(" 검색 연도 :"); int year = scanner.nextInt();
		System.out.print(" 검색 월 :"); int month = scanner.nextInt();
		
		달력( year , month );
		// 과제1 : 시작 연도/월  ~ 끝 연도/월 입력받아 범위 달력 
		
	}
	
	// 달력을 메소드화 => main 안에 있으면 다른 클래스에서 호출 불리 
	public static void 달력( int year , int month ) { // 인수에 연도와 월을 입력받아 달력 출력 

		// 1.현재 캘린더 가져오기 
		Calendar calendar = Calendar.getInstance();
		
		// 2.캘린더에서 연도 , 월 , 일 
//			int year = calendar.get( calendar.YEAR );
//			int month = calendar.get( calendar.MONTH)+1;
//			int day = calendar.get( calendar.DAY_OF_MONTH );
		
		// ****4. 해당 월의 1일 요일찾기 
		calendar.set( year , month-1 , 1 ); // calendar.set( 연 , 월 , 일 ) 사용자지정 날짜 
		int sday = calendar.get( calendar.DAY_OF_WEEK ); // 시작 요일 [ 1:일요일 ~ 7:토요일 ]
		int eday = calendar.getActualMaximum( calendar.DAY_OF_MONTH ); // 해당 월의 마지막 날  
	
		// 3. 달력 console 출력 
		System.out.println("======================"+year+"년 " +month+"월 ====================");
		System.out.println(" 일\t월\t화\t수\t목\t금\t토");
		
		// 6. 1일의 요일 전까지 공백 처리 
		for( int i = 1 ; i<sday ; i++ ) {
			System.out.print(" \t");
		}
		
		// 5. 각 요일에 날짜 표시 
		for( int i = 1 ; i<=eday ; i++ ) {
			System.out.printf("%2d\t" , i);
			// 토요일마다 줄바꿈 [ 요일의 7의 배수 ]
			if( sday % 7 == 0 )System.out.println( );
			sday++;
		}
	}
	

}
