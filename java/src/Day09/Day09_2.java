package Day09;

import java.util.Scanner;

public class Day09_2 {
	
	
	public static void main(String[] args) {
		
		// �������̽� ��ü ���� 
		Ű����ũ Ű����ũ = null;
		
		// 2. ���� ���
		Scanner scanner = new Scanner(System.in);
		
		System.err.println("1.�Ե����� 2.ī��");
		int ������ = scanner.nextInt();
		if( ������ == 1 ) Ű����ũ = new �Ե�����();
		if( ������ == 2 ) Ű����ũ = new ī��();
		
		
		while(true) {
			System.out.println("---Ű����ũ---");
			System.out.println("1.�޴� 2.��ٱ��� 3.���� 4.����");
			System.out.println("���� : "); int ���� = scanner.nextInt();
			if( ���� == 1 ) Ű����ũ.�޴�();
			if( ���� == 2 ) Ű����ũ.��ٱ���();
			if( ���� == 3 ) Ű����ũ.����();
			if( ���� == 4 ) Ű����ũ.����();
			
			
		}
		
		
		
		
		
	}
	
	
	

}
