package Day13;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Day13_1 {
	
	// 컬렉션 프레임워크 : 여러개의 메모리르 관리해주는 클래스들의 집합  
	// 컬렉션 : 수집[메모리수집]  // 프레임워크 : 미리 만들어진 하나의 틀 
	// 메모리 방법 
		// 1. 변수 : 자료형기반으로 메모리할당받은 1개 저장소
		// 2. 객체 : 클래스기반으로 메모리할당받은 1개 저장소 
		// 3. 배열 : 동일한 자료형/클래스 의 여러개 메모리 할당 
		// 4. 리스트 : <제네릭>에 넣은 클래스 기반으로 여러개 메모리 할당 
	// 종류 : 1.List 2.SET 3.MAP
	// 제네릭 이용한 메모리 관리 하는 객체 
	// 1. List 컬렉션 : 1.ArrayList 2.Vector 3.LinkedList
		// 1. 선언 
	
		// 2. 메소드 
				// 1. 리스트명.add( 객체 ) : 리스트내 객체 추가 
				// 2. 리스트명.get( 인덱스번호 ) : 해당 인덱스번호 위치의 객체 호출 
				// 3. 리스트명.remove( 인덱스번호 ) : 해당 인덱스번호 위치의 객체 삭제 
				// 4. 리스트명.size() : 리스트내 객체수 반환
				// 5. 리스트명.clear() : 리스트내 모든 객체 삭제 
				// 6. 리스트명.contains(객체명) : 리스트내 해당 객체명 존재 여부 [ true / false ] 
				// 7. 리스트명.indexOf(객체명) : 리스트내 객체의 순서번호[인덱스번호]
				// 8. 리스트명.isEmpty() : 리스트내 객체가 비어 있는경우 true 아니면 false
	
		// Arraylist vs Vector  :  동기화 x vs 동기화o
		// Arraylist vs LinkedList : 검색용이 vs 삽입,삭제용이
	
	// 2. Set 컬렉션 : 1.HashSet 2.TreeSet
	// 3. Map : 1. HashMap 2. HashTable 3.TreeMap

	
	public static void main(String[] args) {
		
		
		// 1. LinkedList
		ArrayList<String> arrayList = new ArrayList<>();
			// arraylist클래스에 String클래스를 제네릭으로 선언하여 리스트 객체 선언 
		LinkedList<String> linkedList = new LinkedList<>();
		
		Long start;
		Long end;
		
		start = System.nanoTime(); // 현재 시간[나노] 메소드
		for( int i = 0 ; i<10000 ; i++ ) {
			arrayList.add( 0 , String.valueOf(i) );
		}
		end = System.nanoTime();
		System.out.println("arraylist 만개를 add 하는데 걸리는시간 : "+(end-start));
		
		start = System.nanoTime();
		for( int i = 0 ; i<10000 ; i++ ) {
			linkedList.add( 0 , String.valueOf(i) );
		}
		end = System.nanoTime();
		System.out.println("linkedList 만개를 add 하는데 걸리는시간 :"+(end-start));

		
		
		// 문제1  : 대기줄 프로그램 [ Linkedlist 클래스 사용 ] 
			// 메뉴[ 무한루프 ]
				// 대기 명단 출력 
				// 1. 대기 추가 [ 인원수 입력받아 => 대기번호[리스트의순서] 부여
				// 2. 대기 입장 [ 가장 앞에 있는 대기번호 삭제 ]
				// 3. 대기 취소 [ 대기번호를 입력받아 취소 ]
		
		
		// 1. 대기명단 인원수를 저장하기 위한 리스트 선언 
		LinkedList<Integer> list = new LinkedList<Integer>();
		Scanner scanner = new Scanner(System.in);
		while(true) {
			
			System.out.println("[[[ 대기 명단 ]]] ");
			System.out.println("대기인원수 : " + list.size() +" 예상시간 : " + list.size()*10+"분");
			System.out.println("번호 \t 인원수 ");
			for( int i = 0 ; i<list.size() ; i++ ) {
				System.out.println((i+1)+"\t"+list.get(i) );
			}
			System.out.println("1.대기추가 2.대기취소 3.대기입장 ");
			int ch = scanner.nextInt();
			if( ch==1 ) { 
				System.out.println("인원수 : "); 
				int count = scanner.nextInt(); 
				list.add(count);
				System.out.println("대기번호 : "+ list.size() );
			}
			if( ch==2 ) {
				System.out.println("취소번호 : "); 
				int count = scanner.nextInt();
				list.remove(count-1);  // 인덱스는 0부터 // 대기번호 1부터 
			}
			if( ch==3 ) {
				System.out.println("대기 입장 ");
				list.remove(0);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
