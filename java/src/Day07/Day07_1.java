package Day07;

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
	
	// 클래스 [ java 100% 객체지향 ] 
		// 1. 최상위 클래스에 object 클래스가 존재 
			// 모든 클래스는 object 상속을 받는다 
		// 사용자 클래스 만들기 
			// 멤버 : 1.필드 2.생성자 3.메소드 
	
	
	public static void main(String[] args) {
		
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
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
