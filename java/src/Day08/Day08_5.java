package Day08;

public class Day08_5 {
	
	
	// ��� : Ŭ������ �ٸ�Ŭ�������� �޸� �ֱ�
		// 1. Ŭ����[����]�� �ٸ�Ŭ���� �̾�� [ extends ]
		// 2. extends : ���� [ ���� �̾�� ] 
			// ���� : ����Ŭ������ �������� ����Ŭ������ �̸� �����ϸ� ���� ���� ���� 
		// 3. ����� ���� Ŭ������ ���� extends 
			// ����Ŭ���� extends ����Ŭ���� 
		// 4. ��ӹ��� ����Ŭ�������� ����Ŭ������ ��� �̸��� �����ϰ� ��� ����x
			// @Override : �̹� ������ �޼ҵ��� ������
		// 5. ��ӹ��� ����Ŭ�������� ����Ŭ���� ȣ��� 
			// super() :  ����Ŭ���� ������ 
			// super.��� : ����Ŭ������ �ʵ�,�޼ҵ� 
	
	public static void main(String[] args) {
		
		// ���Ŭ������ �̿��� ���1 ��ü ���� [ ����ʵ������ ] 
		��� ���1 = new ���("���缮", 30);
		
		// ����Ŭ���� �̿��� ���2 ��ü ���� 
		�л� ���2 = new �л�("��ȣ��",20 , 3 );
		
		//�޼ҵ� ȣ�� 
		���1.����();
		���2.����(); // �������̵� => ������ 
		
		
		
	}
	
		

}