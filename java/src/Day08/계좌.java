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

	
	// 1. ���µ�� �޼ҵ� 
	public void ���µ��( ) {
		System.out.println("[[[[ ���� ��� ȭ�� ]]]]");
		System.out.print("[[[ ���¹�ȣ : "); 
			String ���¹�ȣ = Day08_7_ATM.scanner.next();
		System.out.print("[[[ ��й�ȣ : "); 
			int ��й�ȣ = Day08_7_ATM.scanner.nextInt();
		System.out.print("[[[ ������ : "); 
			String ������ = Day08_7_ATM.scanner.next();
		
		// ��ü ���� 
		���� ���� = new ����(���¹�ȣ, ��й�ȣ, ������);
		// ����Ʈ ��� 
		Day08_7_ATM.���¸��.add(����);
	}
	
	// 2. �Ա� �޼ҵ� 
	public void �Ա�() {
		System.out.println("[[[[ �Ա� ��� ȭ�� ]]]]");
		System.out.print("[[[ ���¹�ȣ : "); 
			String ���¹�ȣ = Day08_7_ATM.scanner.next();
		System.out.print("[[[ ��й�ȣ : "); 
			int ��й�ȣ = Day08_7_ATM.scanner.nextInt();
		System.out.print("[[[ �Աݾ� : "); 
			int �Աݾ� = Day08_7_ATM.scanner.nextInt();
		
		for( ���� temp : Day08_7_ATM.���¸�� ) {
			if( temp.get���¹�ȣ().equals(���¹�ȣ) && temp.get��й�ȣ() == ��й�ȣ ) {
				temp.�Ա�ó��(�Աݾ�);;
			}
		}
	}
	// �޼ҵ� 
	// 0. get , set �޼ҵ� 
	public String get���¹�ȣ() {
		return this.���¹�ȣ;
	}
	public int get��й�ȣ() {
		return this.��й�ȣ;
	}
	public void �Ա�ó��( int �Աݾ� ) {
		this.�ݾ� += �Աݾ�;
		System.err.println("\n[[[ [�Ϸ�] �Ա�ó���� �Ǿ����ϴ�  ]]]");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
