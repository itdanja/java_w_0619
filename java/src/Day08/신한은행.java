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
		System.out.print("[[[ ���¹�ȣ : "); 
			String ���¹�ȣ = Day08_7_ATM.scanner.next();
			// ���� : �ߺ����� 
			for( ���� temp : Day08_7_ATM.���¸��  ) {
				// for( �ӽð�ü : ����Ʈ�� ) ����Ʈ�� ��� ��ü�� �ϳ��� �ӽð�ü�� ���� 
				if( temp.get���¹�ȣ().equals(���¹�ȣ) ) {
					System.err.println("\n[[[ [����] ������ ���¹�ȣ�� �ֽ��ϴ� ]]]");
					return; // �޼ҵ� ���� 
				}
			}
		System.out.print("[[[ ��й�ȣ : "); 
			int ��й�ȣ = Day08_7_ATM.scanner.nextInt();
			// ���� : 4�ڸ��� ��
				String s��й�ȣ = Integer.toString(��й�ȣ);
								// Integer.toString( ���� ) ;  ���ڿ� => ���ڿ� 
				if( s��й�ȣ.length() != 4 ) {
						// ���ڿ�.length : ���ڿ� ���� [ ���ڼ� ] 
					System.err.println("\n[[[ [����] ��й�ȣ�� ���� 4 �ڸ� �� ���� �մϴ� ]]]");
					return;
				}
		System.out.print("[[[ ������ : "); 	
			String ������ = Day08_7_ATM.scanner.next();
		
		�������� temp = new ��������(���¹�ȣ, ��й�ȣ, ������);
		Day08_7_ATM.���¸��.add(temp);
		System.err.println("\n[[[ [�Ϸ�] �������� ���°� �����Ǿ����ϴ� ]]]");
	}
	
	@Override
	public void �Ա�() {
		System.out.println("[[[[ �������� �Ա� ȭ�� ]]]]");
		super.�Ա�();
	}
	@Override
	public void ���() {
		System.out.println("[[[[ �������� ��� ȭ�� ]]]]");
		super.���();
	}
	@Override
	public void ��ü() {
		System.out.println("[[[[ �������� ��ü ȭ�� ]]]]");
		super.��ü();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
