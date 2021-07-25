package Day11;

public class Day11_1 {
	
	public static void main(String[] args){
		
		
		// 예외처리 : 에러[예외]가 발생했을때 해당 에러 처리[에러수정x] 해주는 역할
			// 목적 : 안전한 프로그램 
				// [ 코드상 오류가 아닌 사용자가 예상치못한 오류를 발생시켰을경우 프로그램 정상화 ]
			// 형태 : 
				//try{ 예외가 발생할것 같은 코드 } 
				//catch(예외클래스 객체명){ 예외가 발생했을경우의 코드 }
				//finally{ 예외 유무 상관없이 무조건 실행되는 코드 }
		
				// if : 개발자가 이미 알고 있는 예외가 있을경우 
				// try : 예상치 못한 예외가 있을경우 
		
			// 예외클래스 : Exception 예외 슈퍼클래스 
					// ArrayIndexOutOfBoundsException
					// NumberFormatException
					// NullPointerException
			// 예외던지기 
				// 해당 코드에서 예외를 처리하지 않고 다른코드로 예외 떠넘기기 
				// 목적 : try가 다수 발생했을경우 한곳에 모아서 처리 
				
		
		//예1) 배열의 크기가 부족했을경우
		try { // 예외가 발생할것 같은 코드 
				// 1. 예외발생 하지 않으면 그대로 실행  // 2.예외발생 했을경우 예외발생지점에서 catch 이동
			String[] 문자열배열 = new String[3]; // 3개의 String 객체를 저장하는 배열 선언 
			
			문자열배열[0] = "유재석";	// [ ] : 인덱스    0번부터 순차적으로 저장하는 순서번호 
			문자열배열[1] = "신동엽";	
			문자열배열[2] = "강호동";
			System.out.println(문자열배열);
			문자열배열[3] = "서장훈";  // 코드상 문제가 없음 // 인덱스부족으로 예외발생 => catch 로 이동 
		
		} catch( ArrayIndexOutOfBoundsException 예외객체 ) {
			System.out.println("예외발생 이유 : " + 예외객체 ); // 예외발생했을때의 대체 코드 
		}
		
		//예2) 형변환 [ 숫자 -> 문자 ] [ 문자 -> 숫자 ] 
		try {
			String 문자1 = "10"; // "10" -> 10 
			String 문자2 = "a10";
			
			// 형변환 
			System.out.println("형변환1 : " + Integer.parseInt(문자1)  );
							// Integer.parseInt(문자) -> 숫자열 변환 메소드 
			System.out.println("형변환2 : " + Integer.parseInt(문자2) );
			
		}catch(NumberFormatException 예외객체2) {
			System.out.println("예외발생 이유 : "+ 예외객체2);
		}
		
		// 예3 ) null 일경우에 정보출력했을때 예외 
		try {
			String 문자3 = null;
			System.out.println(" 문자열[객체] 출력 : " + 문자3 );
			System.out.println(" 문자열[객체] 정보 : " + 문자3.toString() );
								// 객체명.toString() 
		}catch (NullPointerException 예외객체3 ) {
			System.out.println("예외발생 이유 : " + 예외객체3 );
		}
		
		// 예4 ) 여러개의 예외가 발생했을때 
		try {
			String[] 문자열배열 = new String[3]; // 3개의 String 객체를 저장하는 배열 선언 
			System.out.println(문자열배열);
			문자열배열[3] = "서장훈";  // 코드상 문제가 없음 // 인덱스부족으로 예외발생 => catch 로 이동 
			
			String 문자2 = "a10";
			System.out.println("형변환2 : " + Integer.parseInt(문자2) );
			
			String 문자3 = null;
			System.out.println(" 문자열[객체] 정보 : " + 문자3.toString() );
		
		}catch( Exception e ) {
				//  Exception : 모든 예외처리 가능 
			System.out.println("예외발생 이유 : " + e );
		}finally {
			System.out.println("예외발생 유무 상관없이 실행되는 코드 ");
		}
		
		// 예5 ) 예외 던지기 
		
		try {
			Day11_2.예외던지기();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}



}
