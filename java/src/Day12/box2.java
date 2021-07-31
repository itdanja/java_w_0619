package Day12;

public class box2<매개클래스> {
			// 클래스명<제네릭>
	private 매개클래스 객체; // 매개클래스로 객체 선언 
		// 매개클래스 : < > 제네릭에 들어간 클래스
	public void set객체( 매개클래스 객체 ) {
		this.객체 = 객체;
	}
	public 매개클래스 get객체() {
		return 객체;
	}
}
