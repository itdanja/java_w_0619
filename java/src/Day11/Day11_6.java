package Day11;

import java.util.Scanner;

public class Day11_6 {
	
	public static void main(String[] args) {
		
		
		// ���ѷ��� �޴� 1. �������  // 2.��ȭ���
		//  	����1 : 1�ʰ� �������� ������� ����ϱ� 
		//		����2 : 1�ʰ� �������� ��ȭ��� ����ϱ� 
		//		����3 : ������ ��ȣ�� ����������� ��� ���� 
		
		Scanner scanner = new Scanner( System.in);
		
		boolean msw = true; // ���� ������� ���� ���� 
		
		
		while(true) {
			
			System.out.println("---->");
			System.out.println("1.������� 2.��ȭ���"); int ch = scanner.nextInt();
			if( ch == 1 ) {
				
				Thread thread = new �������();
				
				if(msw) {
					�������.����stop(msw); 
					
					thread.start(  ); // ���ǽ��� run ���� 
					msw = false; // ������� ����
					
				}else {
					�������.����stop( msw);
					msw = true;
					
				}
				
			}
			if( ch == 2 ) {
				
			}
			
			
		}
		
	}

}
