package Day09;

public interface ATM {
	// 필드
	
	// 추상메소드 
	public void 메뉴();
	public void 계좌등록();
	public void 예금();
	public void 출금();
	public void 이체();
	public void 잔고();
	// 디폴드메소드 
	public default void 종료() {
		System.out.println(" [종료] ATM 종료 합니다 ");
	}
}
