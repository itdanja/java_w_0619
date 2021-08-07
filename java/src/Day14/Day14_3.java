package Day14;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Day14_3 {
	
	public static void main(String[] args) {

		// 날짜/시간 관련 클래스 
		
		// Date 클래스 
		Date date = new Date(); // 시스템 현재 날짜/시간 객체 선언 
		System.out.println(" 현재날짜/시간 : " + date );
		
		// SimpleDateFormat 클래스 : 날짜 형식 변환 
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yy년MM월dd일 hh:mm:ss");
			//날짜형식 : y:연도  M:월  d:일  h:시 m:분 s:초
		System.out.println(" 형식변경 : " + simpleDateFormat.format(date) );
		
		// Calender 클래스 : 달력클래스 [ 이미 객체가 존재 ] 
		Calendar calendar = Calendar.getInstance(); // 클래스내 이미 객체가 존재 
		System.out.println(" 캘린더 : " + calendar );
		
			int 연도 = calendar.get( calendar.YEAR );
			System.out.println(" 현재 캘린더의 연도 : " + 연도 );
			System.out.println(" 월 : " + (calendar.get( calendar.MONTH)+1) ); // 0:1월 ~~  11:12월
			System.out.println(" 일[월단위] : " + (calendar.get( calendar.DAY_OF_MONTH) ) );
			System.out.println(" 일[주단위] : " + (calendar.get( calendar.DAY_OF_WEEK) ) );
			System.out.println(" 일[연단위] : " + (calendar.get( calendar.DAY_OF_YEAR )));
			
			if( calendar.get(calendar.DAY_OF_WEEK) == 1  )System.out.println("일요일");
			if( calendar.get(calendar.DAY_OF_WEEK) == 2  )System.out.println("월요일");
			if( calendar.get(calendar.DAY_OF_WEEK) == 3  )System.out.println("화요일");
			if( calendar.get(calendar.DAY_OF_WEEK) == 4  )System.out.println("수요일");
			if( calendar.get(calendar.DAY_OF_WEEK) == 5  )System.out.println("목요일");
			if( calendar.get(calendar.DAY_OF_WEEK) == 6  )System.out.println("금요일");
			if( calendar.get(calendar.DAY_OF_WEEK) == 7  )System.out.println("토요일");
			
			// 시간 
			System.out.println(" 오전/오후 : " + calendar.get( calendar.AM_PM ));
				if( calendar.get(calendar.AM_PM) == 0 )System.out.println("오전");
				else System.out.println("오후");
			
			System.out.println(" 시 : "+calendar.get( calendar.HOUR_OF_DAY ) );
			System.out.println(" 분 : "+calendar.get( calendar.MINUTE ) );
			System.out.println(" 초 : "+calendar.get( calendar.SECOND ) );
			
			
			
	}
	
	
	
}
















