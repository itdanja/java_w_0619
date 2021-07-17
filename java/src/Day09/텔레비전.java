package Day09;

public class 텔레비전 implements 리모컨 {
	// 필드 
	int 소음 = 0;
	// 생성자
	
	// 메소드
	
	// 추상메소드 정의 : ctrl+스페이바
	@Override // 상속,인테페이스 연결했을때 동일한 메소드를 재정의 
	public void 실행() {
		System.out.println("텔레비전 실행");
	}
	@Override
	public void 종료() {
		System.out.println("텔레비전 종료");
	}
	@Override
	public void 소음설정(int 소음) {
		if( 소음 > 리모컨.최대소음 ) {
			소음 = 리모컨.최대소음;
		}else if( 소음 < 리모컨.최소소음 ) {
			소음 = 리모컨.최소소음;
		}else {
			this.소음 = 소음;
		}
		System.out.println("현재 소음 : " + 소음);
	}
}
