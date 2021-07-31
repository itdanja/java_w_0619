package Day12;

import java.util.Arrays;
import java.util.Scanner;

public class Day12_3 {
	
	// 문제1  
	//  무한루프 이름,나이 입력받아 명단 배치 
	// 명단 클래스 < 제네릭 > 명단목록
	
			// 사람[super]	유아클래스[sub] : 유치원명단 [ 나이가 8 미만 ] 
			//				학생클래스[sub] : 학생명단 [ 나이가 20 미만 ] 
			//				성인클래스[sub] : 성인명단 [ 나이가 20세 이상 ] 
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// 1. 유아명단
		Member<Child> childlist = new Member<>("유아명단");
		Member<Student> studentlist  = new Member<Student>("학생명단");
		Member<Adult> adultlist = new Member<>("성인명단");
		
		while(true) {
			System.out.println(" 명단 관리 프로그램 ");
			// 명단 출력 
				memberprint(childlist);
				memberprint(studentlist);
				memberprint(adultlist);
			System.out.print(" 1. 이름 : "); String name = scanner.next();
			System.out.print(" 2. 나이 : "); int age = scanner.nextInt();
			
			if( age < 8 ) {
				childlist.add( new Child(name, age) );
			}
			else if( age < 20 ) {
				studentlist.add( new Student(name, age) );
			} 
			else {
				adultlist.add( new Adult(name, age) );
			}
		}
	} // main 끝 
	
	public static void memberprint( Member<?> list ) {
		System.out.println( list.getMembername()+ " 명단 : "+ Arrays.toString( list.getMemberlist() ));
																// toString(): 객체 정보 반환 [ object 클래스 ] 
																	// 기본 반환 : 객체 주소값[메모리 주소 ]
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
