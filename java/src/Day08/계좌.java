package Day08;

public class ���� {
	// �ʵ�
	private String ���¹�ȣ ;
	private int ��й�ȣ ;
	private String ������;
	private int �ݾ�;
	// ������ 
	public ����() {}
	public ����(String ���¹�ȣ, int ��й�ȣ, String ������, int �ݾ�) {
		this.���¹�ȣ = ���¹�ȣ;
		this.��й�ȣ = ��й�ȣ;
		this.������ = ������;
		this.�ݾ� = �ݾ�;
	}
	public ����(String ���¹�ȣ, int ��й�ȣ, String ������) {
		this.���¹�ȣ = ���¹�ȣ;
		this.��й�ȣ = ��й�ȣ;
		this.������ = ������;
		this.�ݾ� = 0;
	}
	// �޼ҵ� 
	// 1. ���µ�� �޼ҵ� 
	public void ���µ��( ) {
		System.out.println("[[[[ ���� ��� ȭ�� ]]]]");
		System.out.println("[[[ ���¹�ȣ : "); 
			String ���¹�ȣ = Day08_7_ATM.scanner.next();
		System.out.println("[[[ ��й�ȣ : "); 
			int ��й�ȣ = Day08_7_ATM.scanner.nextInt();
		System.out.println("[[[ ������ : "); 
			String ������ = Day08_7_ATM.scanner.next();
		
		// ��ü ���� 
		���� ���� = new ����(���¹�ȣ, ��й�ȣ, ������);
		// ����Ʈ ��� 
		Day08_7_ATM.���¸��.add(����);
		
	}
	
	

}
