package Day08;

public class Day08_1 {
	
	// ���������� 
		// 1. ������ ��ȣ [ �ʵ� ��ȣ ] = private
		// 2. private �ʵ忡 �����Ұ�� => �޼ҵ� ��� 
			// get�޼ҵ�  , set�޼ҵ� 
	public int ���� = 10;
	protected int ����2 = 20;
	int ����3 = 30;
	private int ����4 = 40;
	
	public static void main(String[] args) {
		// public 		: ������Ʈ�� �������� ���� ���� 	
		// protected 	: ������ ��Ű���������� ���� ����
						// ����Ŭ������ �ٸ���Ű���� �θ�Ŭ������ ������� ���� 
		// default[����] : ������ ��Ű���������� ���� ���� 
		// private		: ���� Ŭ���������� ���� ���� 
	
		Day08_1 day08_1 = new Day08_1();
		System.out.println( day08_1.����);
		System.out.println( day08_1.����2 );
		System.out.println( day08_1.����3 );
		System.out.println( day08_1.����4 );

	}
}
