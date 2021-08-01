package Day13;

import java.util.HashMap;
import java.util.Hashtable;

public class Day13_3 {
	
	public static void main(String[] args) {
		
		// Map : < 키 , 값 > 으로 이루어진 한쌍 = 엔트리 
			// 인덱스 없음 
			// 1.HashMap : 동기화x [ 단일스레드 사용시 ] 
			// 2.HashTable : 동기화o [ 멀티스레드 사용시 ] 
			// 메소드 
				// 1. .put( 키 , 값 ) : 엔트리 추가 	
				// 2. .get( 키 ) : 키에 해당 하는 값 호출 
				// 3. .remove( 키 ) : 키에 해당하는 키/값[엔트리] 삭제 
				// 4. .keySet() : 모든키를 리스트로 반환 
				// 5. .values() : 모든 값을 리스트로 반환
				// 6. .size() : 엔트리 수 
				// 7. .clear() : 모든 엔트리 삭제 
		// 1. HashMap 선언 
		HashMap< String , Integer > hashMap = new HashMap<>();
			// 멀티제네릭 : String , Integet 클래스를 제네릭으로 HashMap 객체 선언 
		
		// 메소드 
		hashMap.put("유재석", 80);
		hashMap.put("강호동", 70);
		hashMap.put("신동엽", 60);
		
		System.out.println("hashMap 출력 : " + hashMap );
		System.out.println("hashmap 객체[엔트리] 수 : " + hashMap.size() );
		System.out.println("hashmap 호출 : " + hashMap.get("강호동") );
		System.out.println("hashmap 삭제 ");
		hashMap.remove("강호동"); 
		System.out.println("hashMap 출력 : " + hashMap );
		
		System.out.println("hashmap의 모든키 : " + hashMap.keySet() );
		System.out.println("hashmap의 모든값 : " + hashMap.values() );
		
		for( String key : hashMap.keySet() ) {
			System.out.println( hashMap.get(key) );
		}
		
		hashMap.clear(); 
		System.out.println("hashMap 출력 : " + hashMap );
		
		
		// 1. HashTable 선언 
		
		Hashtable<String, Integer > hashtable = new Hashtable<>();
		hashtable.put("유재석",80);
		hashtable.put("유재석", 80); // 동일한 키는 중복 불가능 [ key = 중복불가능 ] 
		hashtable.put("강호동", 70);
		hashtable.put("신동엽", 60);
		hashtable.put("서장훈", 80 ); // 동일한 값은 중복 가능 [ value = 불복가능 ] 
		
		System.out.println(" hashtable 출력 : " + hashtable );
		
		
		
		
		
		
		
		
		
	}

}
