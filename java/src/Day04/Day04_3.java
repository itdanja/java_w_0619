package Day04;

import java.util.Random;
import java.util.Scanner;

public class Day04_3 {

	// ���������� ���� 
		// 1. ���� ���� �� �� �ϳ��� �Է¹޾� ���� ���� 
		// 2. ��ǻ�ʹ� ���� ��� 
		// 3. ���� ������ �����ؼ� ���� �¸��� 
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int ����Ƚ�� = 0 ; 
		int �÷��̾��̱�� = 0;
		int ��ǻ�Ͱ��̱�� = 0;
		
		while( true ) { // ���ѷ��� 

			// �÷��̾�
			System.out.print("����[0]����[1]��[2] ��������[4] �� ���� : "); int �÷��̾� = scanner.nextInt();
			if( �÷��̾� == 0 )		System.out.println("--->�÷��̾�� ���� �� �����߽��ϴ�");
			else if( �÷��̾� == 1 )	System.out.println("--->�÷��̾�� ���� �� �����߽��ϴ� ");
			else if( �÷��̾� == 2 )	System.out.println("--->�÷��̾�� �� �� �����߽��ϴ�");
			else if( �÷��̾� == 4 ) 	break;
			else System.out.println("[���] �˼� ���� ��ȣ �Դϴ� ");
			
			// ����Ƚ�� ����
				����Ƚ��++;
			
			// ��ǻ��  => ���� �̿��� �������� [ Random : ���� ���õ� �޼ҵ� ����  ]
			Random random = new Random(); // ���� ��ü ����� 
			int ��ǻ�� = random.nextInt(3); // ���� ��ü���� ���� �������� [ .nextInt(����)   0~���������� �������� ]
			
			if( ��ǻ�� == 0 )			System.err.println("--->��ǻ�ʹ� ���� �� �����߽��ϴ�");
			else if( ��ǻ�� == 1 )	System.err.println("--->��ǻ�ʹ� ���� �� �����߽��ϴ� ");
			else if( ��ǻ�� == 2 )	System.err.println("--->��ǻ�ʹ� �� �� �����߽��ϴ�");
			
			// �̱�� ���� 
					// �÷��̾� �̱�� �� [ 0 , 2 ] [ 1 , 0 ] [ 2 , 1 ]
					// ���� ����Ǽ� [ 0 , 0 ] [ 1 , 1 ] [ 2  , 2 ]
					// ��ǻ�Ͱ� �̱�� �� [ �׿� ]		
			if( (�÷��̾�==0 && ��ǻ��==2) || (�÷��̾�==1 && ��ǻ��==0) || (�÷��̾�==2 && ��ǻ��==1)  ) {
				System.out.println("--->�÷��̾� �¸�");
				// �÷��̾� �̱�� ���� 
				�÷��̾��̱��++;
			}else if( (�÷��̾�==0 && ��ǻ��==0) || (�÷��̾�==1 && ��ǻ��==1) || (�÷��̾�==2 && ��ǻ��==2)  ) {
				System.out.println("--->���º�");
			}
			else {
				System.out.println("--->��ǻ�� �¸�");
				// ��ǻ�� �̱�� ���� 
				��ǻ�Ͱ��̱��++;
			}
			
		} // w end 
		
		System.out.println("----->[��������]");
		System.out.println("-----> �÷��� ����Ƚ�� : " + ����Ƚ��);
		System.out.println("-----> �÷��̾� �̱�� : " + �÷��̾��̱��);
		System.out.println("-----> ��ǻ�� �̱�� : " + ��ǻ�Ͱ��̱��);
		
		if( �÷��̾��̱�� > ��ǻ�Ͱ��̱�� ) 
			System.out.println("-------> ���� �¸��� : �÷��̾� ");
		else if( �÷��̾��̱�� < ��ǻ�Ͱ��̱�� )
			System.out.println("-------> ���� �¸��� : ��ǻ�� ");
		else
			System.out.println("-------> ���� �¸��� : ���º� ");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
