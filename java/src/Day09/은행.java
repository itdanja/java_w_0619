package Day09;

import java.util.Scanner;

public class ���� implements ATM {
	
	Scanner scanner = new Scanner(System.in);
	// �ʵ� 
	String ���¹�ȣ;
	int ���ݾ�;
	
	// ������ [ 1.������� 2.����ʵ尮�»����� ]
	public ����() {}
	public ����(String ���¹�ȣ, int ���ݾ�) {
		this.���¹�ȣ = ���¹�ȣ;
		this.���ݾ� = ���ݾ�;
	}
	
	// �޼ҵ� 
	
	// ����ã�� �޼ҵ� 
	public int ���°˻�( String ���¹�ȣ ) {
		for( int i = 0 ; i<Day09_3.banklist.size() ; i++ ) {
			if( Day09_3.banklist.get(i).���¹�ȣ.equals(���¹�ȣ) ) {
				return i; // ã�� ������ ���� 
			}
		}
		return -1; // -1 ã�� ���°��� ������ ������� 
	}
	
	@Override
	public void �޴�() {
		while(true) {
			System.out.println("[[[[ ���� �޴� ]]]]");
			System.out.println("1.���µ�� 2.���� 3.��� 4.��ü 5.�ܰ� 6.����");
			System.out.print("���� : ");
			int ���� = scanner.nextInt();
			if( ���� == 1 ) ���µ��();
			if( ���� == 2 ) ����();
			if( ���� == 3 ) ���();
			if( ���� == 4 ) ��ü();
			if( ���� == 5 ) �ܰ�();
			if( ���� == 6 ) return;
		}
		
	}
	@Override
	public void ���µ��() {
		System.out.println("==> ���¹�ȣ : ");
		String ���¹�ȣ = scanner.next();
		
		// ����ã�� 
		int result =  ���°˻�(���¹�ȣ);
		if( result == -1 ) {
			System.out.println("[���µ��] ");
			Day09_3.banklist.add( new ����(���¹�ȣ, 0) );
			return;
		}else {
			System.out.println("[������ ���°� �ֽ��ϴ�]");
			return;
		}	
	}
	@Override
	public void ����() {
		System.out.println("==> ���¹�ȣ : ");
		String ���¹�ȣ = scanner.next();
		System.out.println("==> ���ݾ� : ");
		int ���ݾ� = scanner.nextInt();
		// ����ã�� 
		int result =  ���°˻�(���¹�ȣ);
		if( result == -1 ) {
			System.out.println("[������ ���°� �����ϴ�]");
			return;
		}else {
			System.out.println("[����] ");
			Day09_3.banklist.get(result).���ݾ� += ���ݾ�;
		}
		
	}
	@Override
	public void ���() {
		System.out.println("==> ���¹�ȣ : ");
		String ���¹�ȣ = scanner.next();
		System.out.println("==> ��ݾ� : ");
		int ��ݾ� = scanner.nextInt();
		// ����ã�� 
		int result =  ���°˻�(���¹�ȣ);
		if( result == -1 ) {
			System.out.println("[������ ���°� �����ϴ�]");
			return;
		}else {
			System.out.println("[���] ");
			Day09_3.banklist.get(result).���ݾ� -= ��ݾ�;
		}
	}
	@Override
	public void ��ü() {
		System.out.println("==> ���¹�ȣ : ");
		String ���¹�ȣ = scanner.next();
		System.out.println("==> ��ü�� : ");
		int ��ü�� = scanner.nextInt();
		System.out.println("==> �޴»�� ���¹�ȣ : ");
		String �޴°��¹�ȣ = scanner.next();
		
		// ����ã�� 
		int result =  ���°˻�(���¹�ȣ);
		if( result == -1 ) {
			System.out.println("[������ ���°� �����ϴ�]");
			return;
		}else {
			System.out.println("[��ü] ");
			int result2 =  ���°˻�(�޴°��¹�ȣ);
			if( result == -1 ) {
				System.out.println("[������ ���°� �����ϴ�]");
				return;
			}else {
				Day09_3.banklist.get(result2).���ݾ� += ��ü��;
				Day09_3.banklist.get(result).���ݾ� -= ��ü��;
			}
		}
	}
	@Override
	public void �ܰ�() {
		System.out.println("==> ���¹�ȣ : ");
		String ���¹�ȣ = scanner.next();
		int result =  ���°˻�(���¹�ȣ);
		if( result == -1 ) {
			System.out.println("[������ ���°� �����ϴ�]");
			return;
		}else {
			System.out.println("[�ܰ�] ");
			System.out.println( Day09_3.banklist.get(result).���ݾ� );
		}
	}
	
	
	
	

}
