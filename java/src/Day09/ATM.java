package Day09;

public interface ATM {
	// �ʵ�
	
	// �߻�޼ҵ� 
	public void �޴�();
	public void ���µ��();
	public void ����();
	public void ���();
	public void ��ü();
	public void �ܰ�();
	// ������޼ҵ� 
	public default void ����() {
		System.out.println(" [����] ATM ���� �մϴ� ");
	}
}
