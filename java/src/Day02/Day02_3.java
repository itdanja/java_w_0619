package Day02;

import java.util.Scanner; // Scanner ����ϱ����� import

public class Day02_3 {
	
	public static void main(String[] args) {
	
		// �Է¹ޱ� 
			// 1. �Է¹ޱ� => ������ ���� => ��� 
		
		Scanner �Է°�ü = new Scanner(System.in);
			// Scanner : �Է� ���� Ŭ���� 
				// scan : ��ü�� vs ������
					// new : ��ü�� �޸� �Ҵ� ������ 
						// Scanner(System.in) : Ŭ���� ������
		
		System.out.print(" ���� �Է� : ");
		int �Է����� = �Է°�ü.nextInt();
					// nextInt() : �Է°�ü�� �Էµ� ���� �������� 
		System.out.print(" ���� �Է��� ������ : " + �Է����� );
		
		System.out.print(" ���ڿ� �Է� : ");
		String �Է¹��ڿ� = �Է°�ü.next();
					// next() : �Է°�ü�� �Էµ� ���ڿ� �������� 
		System.out.print("���� �Է��� ���ڿ��� : " + �Է¹��ڿ�);

		
		
		
		
		
	}
}
