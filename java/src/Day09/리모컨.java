package Day09;

public interface ������ {
	
	// �ʵ� 
	int �ִ���� = 10;
	int �ּҼ��� = 0;
	
	// �߻�޼ҵ� : ����o ����x
	public void ����();
	public void ����();
	public void ��������( int ���� );
	
	// ����Ʈ�޼ҵ� : ����o ����o 
	public default void ä�κ���() {
		System.out.println("ä�κ���");
	}

}
