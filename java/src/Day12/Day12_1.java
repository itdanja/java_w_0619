package Day12;



public class Day12_1 {
	
	// 제네릭
		// 배열 = [ ] 인덱스 사용 : 배열에 저장되는 순서번호 
		// 리스트 = < > 제네릭 사용 
		// 목적 : 매개클래스 : 클래스가 자주 변경되는 경우
			// 클래스내에서 자료형 자주 변경되는 객체 만들경우 
		// 형태 : 
			// 클래스명<제네릭1>
			// 클래스명<제네릭1,제네릭2>
			
			// 클래스< 제네릭에들어가는 클래스명 > 객체명 = new 클래스명<생략가능>();
		
	public static void main(String[] args) {
		
		// 1. 제네릭 없는 경우 
		box 상자1 = new box(); // box객체 생성 
		상자1.setobject("사과박스");
		String name = (String)상자1.getobject();
		System.out.println(name);
		
		상자1.setobject( new 사과() );
		사과 사과 = (사과)상자1.getobject();
		System.out.println(사과);
		
		// 2. 제네릭 사용하는 경우 
		box2<String> 상자2 = new box2<>();
		상자2.set객체("사과박스");
		String name2 = 상자2.get객체();
		System.out.println(name2 );
		
		box2<Integer> 상자3 = new box2<Integer>();
		상자3.set객체(10);
		int num = 상자3.get객체();
		System.out.println(num);
		
		box2<사과> 상자4 = new box2<>();
		상자4.set객체( new 사과() );
		System.out.println( 상자4.get객체() );
		
		////////////////////////////////////////////////
		// 3. 멀티 제네릭 
		제품<텔레비전, String> 제품1 = new 제품<>();
		제품1.setKind( new 텔레비전() );
		제품1.setModel("스마트텔레비전");
		
		System.out.println(" 제품1 : " + 제품1.getKind() + 제품1.getModel() );
		
		제품<자동차 , String> 제품2 = new 제품<>();
		제품2.setKind( new 자동차() );
		제품2.setModel("디젤자동차");
		
		System.out.println(" 제품2 : " + 제품2.getKind() + 제품2.getModel() );
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
