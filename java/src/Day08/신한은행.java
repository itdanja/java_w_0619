package Day08;

public class �������� extends ���� {
	
	private final int �����ڵ� = 10;
		// final => ���

	public ��������() {
		super();
	}

	public ��������(String ���¹�ȣ, int ��й�ȣ, String ������, int �ݾ�) {
		super(���¹�ȣ, ��й�ȣ, ������, �ݾ�);
	}

	public ��������(String ���¹�ȣ, int ��й�ȣ, String ������ ) {
		super(���¹�ȣ, ��й�ȣ, ������);
		
	}
	@Override
	public void ���µ��( ) {
		System.out.println("[[[[ �������� ���� ��� ȭ�� ]]]]");
		System.out.print("[[[ ���¹�ȣ : "); // ���� : �ߺ����� 
			String ���¹�ȣ = Day08_7_ATM.scanner.next();
		System.out.print("[[[ ��й�ȣ : "); // ���� : 4���� �� 
			int ��й�ȣ = Day08_7_ATM.scanner.nextInt();
		System.out.print("[[[ ������ : "); 	
			String ������ = Day08_7_ATM.scanner.next();
		
		�������� temp = new ��������(���¹�ȣ, ��й�ȣ, ������);
		Day08_7_ATM.���¸��.add(temp);
		System.err.println("\n[[[ [�Ϸ�] �������� ���°� �����Ǿ����ϴ� ]]]");
	}
	
	
	
	
	

}
