package Day08;

public class Day08_1 {
	
	// 접근제한자 
		// 1. 데이터 보호 [ 필드 보호 ] = private
		// 2. private 필드에 접근할경우 => 메소드 사용 
			// get메소드  , set메소드 
	public int 정수 = 10;
	protected int 정수2 = 20;
	int 정수3 = 30;
	private int 정수4 = 40;
	
	public static void main(String[] args) {
		
		// public 		: 프로젝트내 모든곳에서 접근 가능 	
		// protected 	: 동일한 패키지내에서만 접근 가능
						// 서브클래스가 다른패키지의 부모클래스가 있을경우 가능 
		// default[생략] : 동일한 패키지내에서만 접근 가능 
		// private		: 현재 클래스에서만 접근 가능 
	
		Day08_1 day08_1 = new Day08_1();
		System.out.println( day08_1.정수);
		System.out.println( day08_1.정수2 );
		System.out.println( day08_1.정수3 );
		System.out.println( day08_1.정수4 );

	}
}
