package Day12;

import java.util.ArrayList;
import java.util.Vector;

public class Day12_4 {
	
	public static void main(String[] args) {
		
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
		
		// 2. Set 컬렉션 : 1.HashSet 2.TreeSet
		// 3. Map : 1. HashMap 2. HashTable 3.TreeMap
		
		// 1.Arraylist
		ArrayList<String> arrayList = new ArrayList<>();
			// * 여러개의 String 저장할수 있는 리스트 객체 선언 
			arrayList.add("java");
			arrayList.add("python");
			arrayList.add("database");
			arrayList.add("C++");
		System.out.println(" 리스트 호출 : " + arrayList );
		System.out.println(" 첫번째 객체 호출 : " + arrayList.get(0) );
		
		arrayList.remove(1); // 두번째 객체 삭제 
		System.out.println(" 리스트 호출 : " + arrayList );
		System.out.println(" 리스트내 객체수 : " + arrayList.size() );
		
		// 리스트의 반복문 활용 
		for( int i = 0 ; i<arrayList.size() ; i ++ ) {
			System.out.println( arrayList.get(i) );
		}
		//
		for( String string : arrayList ) { // 리스트내 모든 객체를 하나씩 임시객체에 저장하면서 반복
			// 제네릭 클래스의 임시객체 : 리스트명 
			System.out.println( string );
		}
		
		if( arrayList.contains("java") ) {
			System.out.println("리스트에 java가 있습니다 ");
		}else {
			System.out.println("리스트에 java가 없습니다 ");
		}
		System.out.println("database의 인덱스 : " +  arrayList.indexOf("database") );
		
		arrayList.clear();
		System.out.println(" 리스트 호출 : " + arrayList );
		
		System.out.println(" 현재 리스트가 비어 있는지 : " + arrayList.isEmpty() );
		
		
		// 2. Vector 클래스 
			// ArrayList : 동기화X [ 멀티스레드 아닐경우 ] : 더 빠른 속도 
			// Vector : 동기화O [멀티스레드 사용시 ] : 더 느린 속도 
				// 동기화 : 멀티스레드 사용시 하나의 메소드의 동시 접근 막기 
					// 동기화 안될경우 : 하나의 메소드에 동시 여러개 스레드가 접근하면 문제 발생
					// 동기화 했을경우 : 하나의 메소드에 동시 여러개 스레드가 접근할경우 순서매기기
						// 동기화는 하나의 쓰레드가 모두 처리후 => 다음쓰레드가 접근 
		Vector<String> vector = new Vector<>();
		vector.add("java");
		vector.add("python");
		vector.add("database");
		vector.add("c++");
		System.out.println(" 벡터리스트 출력 : " + vector );
		System.out.println(" 첫번째 객체 호출 : " + vector.get(0) );
		vector.remove(1);// 두번째 객체 삭제
		System.out.println(" 벡터리스트 출력 : " + vector );
		System.out.println(" 벡터리스트내 객체수 : " + vector.size() );
		
		for( String string : vector ) {
			System.out.println( string );
		}
		
		if( vector.contains("java") ) {
			System.out.println("java가 존재합니다");
		}else {
			System.out.println("java가 없습니다 ");
		}
		
		System.out.println( "database 인덱스위치 : " + vector.indexOf("database"));
		
		vector.clear();
		
		System.out.println(" 벡테리스트 비어 있는지 :  " + vector.isEmpty() );
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
