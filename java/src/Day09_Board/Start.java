package Day09_Board;

public class Start {
	
	public static void main(String[] args) {
		
		start();
		
	}
	
	public static void start() {
	// public 접근제한자 : 프로젝트 내 모든 곳에서 호출 가능 
	// static 정적변수 : 프로그램 시작시 메모리 할당 , 프로그램 종료시 메모리 초기화
		// void : retrun 했을때 반환 데이터가 없다 
		
		Member member = new Member();
		
		member.signup();
	
	}
	
}
