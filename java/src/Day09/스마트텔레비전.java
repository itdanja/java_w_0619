package Day09;

public class ����Ʈ�ڷ����� implements ������  {
	
	int ���� = 0;
	
	@Override
	public void ����() {
		System.out.println("����Ʈ�ڷ����� ����");
		
	}

	@Override
	public void ����() {
		System.out.println("����Ʈ�ڷ����� ����");
		
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
