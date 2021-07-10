package Day07;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Day07_1 {
	
	
	// 메모리 저장 방법
		// 1. 변수 : 자료형[메모리크기가 정해진]을 이용한 메모리 할당 
			// 메모리 정해져 있기 때문에 new 연산자 x
			// int 변수명 = 30;

		// 2. 객체 : 클래스[설계도]을 이용한 메모리 할당
			// 메모리의 크기가 정해져 있지 않기 때문에 new 연산자 o
			// Scanner 객체 = new Scanner();
	
	// 메모리 관리 방법 
		// 1. 배열 : 동일한 자료형/클래스의 여러개 메모리 선언/관리
			// int[] 배열 = new int[30];
		// 2. 리스트 : 동일한  클래스의 여러개 메모리를 저장할수 있는 객체 
			// ArrayList<Integer> 리스트 = new ArrayList<>();
	
	// 메모리 영구 저장 방법 => 메모리(주기억장치) => 보조기억장치
		// 1. 파일처리 
		// 2. 데이터베이스 
		// 3. 클라우드 
	
	// 클래스 [ java 100% 객체지향 ] 
		// 1. 최상위 클래스에 object 클래스가 존재 
			// 모든 클래스는 object 상속을 받는다 
		// 사용자 클래스 만들기 
			// 멤버 : 1.필드 2.생성자 3.메소드 
	
	
	public static void main( String[] args) {
		
		// 배열 [ 인덱스 ]
		String[] 배열 = new String[3]; // String 3개를 저장할수 있는 배열 
		배열[0] = "유재석";	System.out.println( 배열[0] );
		배열[1] = "강호동";	System.out.println( 배열[1] );
		배열[2] = "신동엽";	System.out.println( 배열[2] );

		// 리스트  
		ArrayList<String> 리스트 = new ArrayList<>();
		리스트.add("유재석");	System.out.println( 리스트.get(0) );
		리스트.add("강호동");	System.out.println( 리스트.get(1) );
		리스트.add("신동엽");	System.out.println( 리스트.get(2) );
		
		// 객체 만들기 [ 생성자 이용 ] 
			// 1. 클래스명 [ 객체의 설계도 ] 
			// 2. 객체명 [ 임의의값 ] 
			// 3. new [ 객체 메모리 할당 ] 필수 
			// 4. 생성자
			// 객체가 클래스의 멤버[필드,메소드]에 접근하는 방법 [  . 연산자 ] 
		// 1. 빈 생성자를 이용한 객체 
		학생 temp1 = new 학생(); // 내용물 없다 
			temp1.이름 ="강호동";
			temp1.나이 = 30;
		// 2. 모든 필드를 갖는 생성자를 이용한 객체
		학생 temp2 = new 학생( "유재석" , 20 ); // 내용물 존재
		
		// 메소드 호출 
		System.out.println( temp1.이름출력() ) ;
		System.out.println( temp1.나이출력() ) ;
		
		temp1.회원정보();
		System.out.println( temp1.학생점수(20) );
		
		temp1.나이업데이트(40);
		System.out.println( temp1.나이);

		// 파일처리 
			// 스트림 : 외부장치와 데이터 통신 
				// !!! : 데이터 통신 단위 : 바이트 
					// bit[0,1] => 8bit => 1바이트
			// 1. 내보내기 [ FileOutputStream 클래스 ] 
	
		// 예외처리 : 오류 발생시 => 오류 처리 경우의수 
		try { // try 안에서 예외[오류] 발생시 => catch 이동 
				// try 안에서 예외가 없을경우는 그대로 실행 
			FileOutputStream fileOutputStream = new FileOutputStream("c:/java/test.txt");
			String 문자열 = "java입니다"; // 문자열 
			fileOutputStream.write( 문자열.getBytes() );
				// write( 바이트 ) : 출력[내보내기] : 
					// 문자열.getBytes() : 문자열 => 바이트 
			
		} catch (Exception e) {  // Exception : 모든 예외 처리 클래스 
			System.out.println("파일경로가 존재하지 않습니다");
		} 
			
		// 2. 읽어오기 
		try {
			FileInputStream fileInputStream = new FileInputStream("c:/java/test.txt");
			// 스트림의 이동단위 바이트 
			byte[] 바이트 = new byte[1024];	// 1024개 바이트를 저장할수있는 배열 :  1024바이트 => 1kbtye
			fileInputStream.read( 바이트 ); // 
				// read : 파일 스트림 읽어오기 => 바이트 배열에 저장 
			System.out.println( new String( 바이트 ) );
					// new String( 바이트 ) :   바이트 => 문자열
			
		} catch ( Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
