package Day04;

import java.util.Scanner;

public class Day04_2 {

	// �ݺ����� �̿��� �� ��� 
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); // �Է°�ü 
		
		// ����1 : �Է��� ���� ��ŭ ��[*] ��� 
		System.out.print("����1 ���� �Է� : ");	int ����1 = scanner.nextInt(); //  �Է°�ü���� ������ �������� 
		for( int i = 1 ; i<=����1 ; i++ ) { System.out.print("*"); }
			// i�� 1���� �Է¹��� ������ i�� 1�������ϸ鼭 �ݺ� 
System.out.println("\n-------------------------------------------");	

		// ����2 : �Է��� ���� ��ŭ ��[*] ��� / �� 5������ �ٹٲ� 
		System.out.print("����2 ���� �Է� : ");	int ����2 = scanner.nextInt();
		for( int i = 1 ; i<=����2 ; i++ ) { 
			System.out.print("*");
			if( i % 5 == 0 ) System.out.println(); // 5�� ������� �ٹٲ� 
		}
		
		// ����3 : �Է��� �� ��ŭ ���ﰢ�� ��� 
			/*  �� ) 6 		i = ��		S = ��
			  	*		i = 1			S = 1
			  	**		i = 2			S = 1 2 
			  	***		i = 3 			S = 1 2 3 
			  	****	i = 4 			S = 1 2 3 4
			  	*****	i = 5 			S = 1 2 3 4 5
			  	******	i = 6			S = 1 2 3 4 5 6 
			  			i <= �Է°�		S <= i[������]
			 */
		System.out.print("����3 ���� �Է� : ");	int ����3 = scanner.nextInt();
		for( int i = 1 ; i<=����3 ; i++ ) {
			// �����
			for( int s = 1 ; s<= i ; s++ ) {System.out.print("*");}
			System.out.println();
		}
		// ����4 : �Է��� �� ��ŭ ���ﰢ�� ��� 
			/*  �� ) 5		i		s
			  	*****	i = 1		s = 1 2 3 4 5 		5-1	4
			  	****	i = 2 		s = 1 2 3 4 		5-2	3
			  	***		i = 3 		s = 1 2 3 			5-3	2
			  	**		i = 4 		s = 1 2 			5-4	1
			  	*		i = 5		s = 1				5-5	0
			  			i<=�Է°�		�ִ���[�Է°�]-������[i]+1
			 */
		System.out.print("����4 ���� �Է� : ");	int ����4 = scanner.nextInt();
		for( int i = 1 ; i<=����4 ; i++ ) {
			// ����� 
			for( int s = 1 ; s<= ����4-i +1 ; s++ ) {System.out.print("*");}
			// �ٹٲ�
			System.out.println();
		}
		// ����5 : �Է��� �� ��ŭ ���ﰢ�� ��� 
			/*  �� ) 5 		i = ��		b = ����			s = ��
			  		 *		i = 1		b = 1 2 3 4 	s = 1
			  	    **		i = 2		b = 1 2 3 		s = 1 2 
			  	   ***		i = 3 		b = 1 2			s = 1 2 3 
			  	  ****		i = 4		b = 1 			s = 1 2 3 4 
			  	 *****		i = 5		b =				s = 1 2 3 4 5
			  	 			i<=�Է°�		�ִ���-i			s<=i		
			 */
		System.out.print("����5 ���� �Է� : ");	int ����5 = scanner.nextInt();
		for( int i = 1 ; i<=����5 ; i++ ) {
			// �������
			for( int b = 1 ; b<=����5-i ; b++ ) {System.out.print(" ");}
			// ����� 
			for( int s = 1 ; s<=i ; s++ ) {System.out.print("*");}
			// �ٹٲ�
			System.out.println();
		}
		// ����6 : �Է��� �� ��ŭ ���ﰢ�� ��� 
			/*  �� ) 5 		i		b				s
			 	 *****		i = 1 	b = 			s = 1 2 3 4 5 
			 	  ****		i = 2 	b = 1			s = 1 2 3 4
			 	   ***		i = 3	b = 1 2			s = 1 2 3
			 	    **		i = 4	b = 1 2 3		s = 1 2
			 	     *		i = 5	b = 1 2 3 4		s = 1
			 	     				b<=i-1			s<=�ִ��ټ�-i+1
			 */
		System.out.print("����6 ���� �Է� : ");	int ����6 = scanner.nextInt();
		for( int i = 1 ; i<=����6 ; i++ ) {
			// �������
			for( int b = 1 ; b<=i-1 ; b++ ) {System.out.print(" ");}
			// ����� 
			for( int s = 1 ; s<=����6-i+1 ; s++ ) {System.out.print("*");}
			//�ٹٲ�
			System.out.println();
			
		}
		// ����7 : �Է��� �� ��ŭ ���ﰢ�� ��� 
			/*  �� ) 5 					b				s	
			 		*		i = 1		b = 1 2 3 4		s = 1					1*2 = 2 -1
			 	   ***		i = 2		b = 1 2 3		s = 1 2 3 				2*2 = 4 -1
			 	  *****		i = 3 		b = 1 2			s = 1 2 3 4 5 			3*2	= 6 -1
			 	 *******	i = 4		b = 1			s = 1 2 3 4 5 6 7		4*2 = 8 -1
			 	*********	i = 5		b				s = 1 2 3 4 5 6 7 8 9 	5*2 = 10 -1
			 							�ִ��ټ�-�����ټ�		�����ټ� * 2 - 1
			 */
		System.out.print("����7 ���� �Է� : ");	int ����7 = scanner.nextInt();
		for( int i = 1 ; i<=����7 ; i++ ) {
			// �������
			for( int b = 1 ; b<=����7-i ; b++ ) {System.out.print(" ");}
			// ����� 
			for( int s = 1 ; s<= i*2-1 ; s++ ) {System.out.print("*");}
			// �ٹٲ�
			System.out.println();
		}
		// ����8 : �Է��� �� ��ŭ ���ﰢ�� ��� 
			/*  �� ) 5 
			 		1
			 	   222
			 	  33333
			 	 4444444
			 	555555555
			 */
		
		System.out.print("����8 ���� �Է� : ");	int ����8 = scanner.nextInt();
		for( int i = 1 ; i<=����8 ; i++ ) {
			// �������
			for( int b = 1 ; b<=����8-i ; b++ ) {System.out.print(" ");}
			// ����� 
			for( int s = 1 ; s<= i*2-1 ; s++ ) {System.out.print(i);}
			// �ٹٲ�
			System.out.println();
		}
		
		// ����9 : �Է��� �� ��ŭ ���ﰢ�� ��� 
			/*  �� ) 5 			b				S
			 	*********		b = 			s = 1 2 3 4 5 6 7 8 9		5*2	10
			 	 *******		b = 1			s = 1 2 3 4 5 6 7			5*2	10
			 	  *****			b = 1 2			s = 1 2 3 4 5				5*2	10
			 	   ***			b = 1 2 3 		s = 1 2 3					5*2	10
			 	    *			b = 1 2 3 4		s = 1						5*2	10
			 	    			b<=i-1			s = �ִ��ټ�*2 - ( �����ټ�*2-1 )
			 */
		System.out.print("����9 ���� �Է� : ");	int ����9 = scanner.nextInt();
		for( int i = 1 ; i<=����9 ; i++ ) {
			// �������
			for( int b = 1 ; b<=i-1 ; b++ ) {System.out.print(" ");}
			//�����
			for( int s = 1 ; s<= ����9*2 - (i*2-1) ; s++ ) {System.out.print("*");}
			//�ٹٲ�
			System.out.println();
		}
		
		// ����10 : X ��� ���  // Ȧ�� ������ �Է¹ޱ� 
			/*  �� ) 5 

			 	  *   *
			       * *
			        *
			 	   * *
			 	  *   *
			 */
		System.out.print("����10 ���� �Է� : ");	int ����10 = scanner.nextInt();
		
		for( int i = 1 ; i<=����10 ; i++ ) { // i = �� = ���� 
			for( int j = 1 ; j<=����10 ; j++ ) { // j = �� = ���� 
				if( i == j ) System.out.print("*"); // �� = �� ������ ��� ����� 
				else if( (i+j) == (����10+1) ) System.out.print("*"); // �� �� ���� ���Ѱ��� �ִ��ټ�+1 �� ������ ��� �����
				else System.out.print(" ");
			}
			// �ٹٲ� 
			System.out.println();
		}
		
			
		
		

		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
