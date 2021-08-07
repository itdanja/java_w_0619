package Day14;

import java.util.Scanner;

public class Day14_1 {

	// API 클래스
	
	public static void main(String[] args) {
		
		// String 클래스 : 바이트 => 문자열 변환 클래스 
			// 스트림 : 데이터 통신 흐름 
				// 단위 : 바이트 
			// 바이트 => 문자 변환 
				// 아스키코드 // 유니코드 등 
		
		// 1. 문자열 처리하는 방법 
			// 1. 바이트배열에 여러개 바이트 선언 
		byte[] 바이트배열 = { 72, 101 , 108 , 108 , 111 , 32 , 74 , 97 , 118 , 97 };
							// H e  l      l       o   공백   J   a      v   a
			// 2. 바이트열 => String 변환 [ 생성자 ]
		String 문자열1 = new String( 바이트배열 );
		//클래스명 객체명 = new 생성자()
		System.out.println("문자열1 : " + 문자열1 );
		
		String 문자열2 = new String( 바이트배열 , 6 , 4  );
											//시작 , 끝 
		System.out.println(" 일부 변환 : " + 문자열2 );
	
		// 2. 키보드가 문자열 처리하는 방법
			byte[] 바이트배열2 = new byte[100];
			// 1. 입력장치 [ System.in ] 
			try {
				int count = System.in.read( 바이트배열2 ); // 키보드로 읽어온 바이트를 바이트배열에 저장 
				// 키보드 통신단위는 바이트 // 예외처리 무조건 발생 
				// count변수 역활 : 읽어온 바이트 개수 // 문자열 구분용으로 사용되는 \r\n 자동 추가
				// String 문자열3 = new String( 바이트배열2 ); // 입력된 바이트 외 남은 바이트열까지 공백으로 변환
				String 문자열3 = new String( 바이트배열2 , 0 , count-2 ); // 입력된 바이트만 변환 
															// count-2 :  \r\n 제외
				System.out.println(" 키보드 읽어온 문자열 : " + 문자열3 );
				
			}
			catch (Exception e) { }
		// [ Scanner 클래스 : 읽어온 바이트를 객체에 저장하는 메소드[next,nextint,nextboolean등]를 통해 형변환후 데이터 제공 ] 
			
		// 메소드 
			// 1. 문자 추출 [ charAt() ] 인수 : 인덱스  반환 : 문자 
			String 문자열4 ="자바 프로그래밍";
			System.out.println(" 문자 추출 : " + 문자열4.charAt(3) );
		
				// 활용 : 특정문자열에서 특정문자만 추출 
				String 주민등록번호 = "880420-2541225";
				char 성별 = 주민등록번호.charAt(7);
				switch( 성별 ) {
					case '1' : 
					case '3' :
						System.out.println("남자 입니다 ");
						break; // switch 탈출 
					case '2' :
					case '4' :
						System.out.println("여자 입니다 ");
						break;
				}
				
			// 2. 문자열 비교 [ equals() ]  인수 : 비교대상 / 반환 : true , false
			String 문자열5 = new String("유재석");
			String 문자열6 = "유재석";
				// 객체 선언시 메모리 할당 연산자 : new 
					// 예외 : 기본자료형 , String 
			
				// 문자열간 비교연산자 불가 
				if( 문자열5 == 문자열6 ) {System.out.println(" 두 문자는 == 같다 ");}
				if( 문자열5.equals(문자열6) ) {System.out.println(" 두 문자는 equals() ");}
				if( !문자열5.equals(문자열6) ) {System.out.println(" 두 문자는 !equals() ");}
				
			// 3. 바이트배열 변환 [ getBytes ] 인수 : [선택]인코딩타입 / 반환 : 바이트배열
			String 문자열7 = "안녕하세요abc";
							// 한글 : 2바이트	 // 영문,특수문자 : 1바이트 
				// 문자열 => 바이트배열 
			byte[] 바이트배열3 =문자열7.getBytes();
			System.out.println(" 길이 : " + 바이트배열3.length );
			String 문자열8 = new String( 바이트배열3 );
			System.out.println(" 변환 : " + 문자열8 );
				
				// 한글 인코딩 타입 : EUC-KR , UTF-8 [ 바이트 => 한글 변환하는 과정의 방법중 ] 
			
				try {
					
					byte[] 바이트배열4 = 문자열8.getBytes("EUC-KR"); // 예외처리 무조건 발생		
					System.out.println(" EUC-KR 길이 : " + 바이트배열4.length ); // 한글 : 2바이트 
					
					byte[] 바이트배열5 = 문자열8.getBytes("UTF-8");
					System.out.println(" UTF-8 길이 : " + 바이트배열5.length );	// 한글 : 3바이트 
					
				}catch (Exception e) {}
		
			// 4. 문자열 찾기 [ indexOf ] 인수 : 검색대상  / 반환 : 검색대상의 인덱스위치번호
			String 문자열9 = "자바 프로그래밍";
			System.out.println(" 대상 위치 : " + 문자열9.indexOf("프로그래밍")) ;
			System.out.println(" 대상 위치 : " + 문자열9.indexOf("c언어") );
				
				// 활용 
				String 교재 ="재미있는 파이썬 입문기초";
				
				Scanner scanner = new Scanner(System.in);	
				System.out.print(" 키워드 : "); String 키워드 = scanner.next();
				
				if( 교재.indexOf(키워드) == -1 ) {
					System.out.println(" 키워드의 해당하는 책이 아닙니다 ");
				}else {
					System.out.println(" 키워드의 해당하는 책 입니다 ");
				}
			
			// 5. 문자열 길이 [ length() ] : 반환 : 문자열내 문자수 [ 공백포함 ]
			System.out.println("교재 글자수 : " + 교재.length() );
			
				// 활용 : 유효성검사 
				System.out.print("패스워드[4글자] 입력:"); 
				String 패스워드 = scanner.next();
				
				if( 패스워드.length() == 4 ) {
					System.out.println(" 잘 입력했습니다 ");
				}else {
					System.out.println(" 4글자 입력해주세요 ");
				}
			
			// 6. 문자열 잘라내기 [ substring() ] 인수 : 자르는위치 / 반환 : 위치 이후의 문자열  
			System.out.println( 주민등록번호.substring(7));
			System.out.println( 주민등록번호.substring(0,6) );
			
			// 7. 문자열 분해 [ split() ] 인수 : 기준 문자 / 반환 : 문자열배열 
			String[] 문자분해 = 주민등록번호.split("-"); // - 기준으로 분해시 2개의 문자열 
			System.out.println(" 분해후 첫번째 문자열 :" + 문자분해[0] );
			System.out.println(" 분해후 두번째 문자열 :" + 문자분해[1] );
			
			// 8. 문자열 치환 [ replace() ] 인수 : 교체할문자,새로운문자 / 반환 : 교체후 문자열 
			String 문자열10 ="자바 프로그래밍";
			String 교체문자 = 문자열10.replace("자바", "java");
									// 자바를 찾아서 java로 변환 
			System.out.println(" 교체 전 : " + 문자열10 );
			System.out.println(" 교체 후 : " + 교체문자 );
			
			// 9. 대/소문자 변환 [ toLowerCase() , toUpperCase() ] 
			String 문자열11 = "Java Programming";
			System.out.println(" 소문자 : " + 문자열11.toLowerCase() );
			System.out.println(" 대문자 : " + 문자열11.toUpperCase() );
			
			// 10. 공백 제거 [ trim() ] : 앞뒤 공백 제거 
			String 문자열12 = "           자바          프로그래밍       ";
			System.out.println(" 공백 제거 : " +문자열12.trim() );
			
			// 11. 문자열 변환 [ valueOf() ] : 문자열로 변환  
			String 문자열13 = String.valueOf(10); // int형 ---> String 
			System.out.println(" int -> String : " + 문자열13 );
			
			String 문자열14 = String.valueOf(10.5); // double ---> String 
			System.out.println(" double -> String : " + 문자열14 );
			
			String 문자열15 = String.valueOf(true); // boolean ---> String 
			System.out.println(" boolean -> String : " + 문자열15 );
			
			// 12. 문자열 포함여부[ contains( ) ] : 인수 : 검색대상 / 반환 : 포함여부 [true/false ]
			System.out.println("문자 포함여부 : " + 교재.contains("파이썬") );
			
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
		
		
		
		
	}
	
}
