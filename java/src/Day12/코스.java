package Day12;

public class �ڽ�<�Ű�Ŭ����> {

	// �ʵ� 
	private String ������;
	private �Ű�Ŭ����[] ȸ�����;
	// ������ 
	public �ڽ�( String ������ , int �ο��� ) {
		this.������ = ������;
		ȸ����� = (�Ű�Ŭ����[])new Object[�ο���];
				// object�� �޸��Ҵ�޾� �Ű�Ŭ�����迭�� ����ȯ
	}
	// �޼ҵ� 
	public void �߰�( �Ű�Ŭ���� �Ű���ü ) {
		for( int i = 0 ; i<ȸ�����.length ; i++ ) {
			if( ȸ�����[i] == null ) {
				ȸ�����[i]  = �Ű���ü; 
				break;
			}
		}
	}
	// get. set => ������ : private �ʵ带 �ٸ� Ŭ������ ���ٸ޼ҵ� 
	public String get������() {
		return ������;
	}
	public void set������(String ������) {
		this.������ = ������;
	}
	public �Ű�Ŭ����[] getȸ�����() {
		return ȸ�����;
	}
	public void setȸ�����(�Ű�Ŭ����[] ȸ�����) {
		this.ȸ����� = ȸ�����;
	}
	
	
	
	
	
}
