package Day09;

public class �ڷ����� implements ������ {
	// �ʵ� 
	int ���� = 0;
	// ������
	
	// �޼ҵ�
	
	// �߻�޼ҵ� ���� : ctrl+�����̹�
	@Override // ���,�������̽� ���������� ������ �޼ҵ带 ������ 
	public void ����() {
		System.out.println("�ڷ����� ����");
	}
	@Override
	public void ����() {
		System.out.println("�ڷ����� ����");
	}
	@Override
	public void ��������(int ����) {
		if( ���� > ������.�ִ���� ) {
			���� = ������.�ִ����;
		}else if( ���� < ������.�ּҼ��� ) {
			���� = ������.�ּҼ���;
		}else {
			this.���� = ����;
		}
		System.out.println("���� ���� : " + ����);
	}
}
