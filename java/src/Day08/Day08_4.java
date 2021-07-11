package Day08;

public class Day08_4 {
	
	// final : 변수를 상수 만들기 [ 고정값 ]
	// static : 정적변수[ 프로그램 전반적으로 사용되는 메모리 ]
	public final int 정수1 = 10;
	public static int 정수2 = 20;
	
	public static void main(String[] args) {
		정수1 = 20; // final 수정 불가
		정수2 = 30; // 
	}
	
}
