package Day03;

import java.util.Scanner;

public class Day03_2 {
	
	// ��� : ��쿡 ���� �Ǵܷ� 
		// if[���˻�] , switch[ �� �˻� ]
	
	 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // �Է°�ü 
		// if ����
			// ���࿡ ~~ �̸� 
			// 1. if( T / F ) ���๮;
			// 2. if( T / F ) T���๮;
			// 	  else F���๮;
		
			// 3. if( T / F ) { ���๮; ���๮2; }
			//	  else { ���๮; ���๮2; } 
		
			// 4. if( T / F ) ���๮[T1] ;
			//	  else if( T / F ) ���๮[T2] ;
			//	  else if( T / F ) ���๮[T3] ;
			//	  else if( T / F ) ���๮[T4] ;
			//	  else 
	/*	
		// ��1 
		if( 5 > 3 )System.out.println("5�� ũ��");
		if( 5 > 10 ) System.out.println("5�� ũ��2");
		// ��2
		if( 5 > 3 ) System.out.println("5�� ũ��3");
		else System.out.println( "5�� �۴�3");
		// ��3
		if( 5 > 3 ) {
			System.out.println("true"); 
			System.out.println("5�� ũ��4");
		}
		else {
			System.out.println("false"); System.out.println("5�� �۴�4");
		}
		// ��4
		if( 5 > 10 ) System.out.println("5�� ũ��1 ");
		else if( 5 > 8 ) System.out.println("5�� ũ��2 ");
		else if( 5 > 6 ) System.out.println("5�� ũ��3 ");
		else if( 5 > 4 ) System.out.println("5�� ũ��4 ");
		else System.out.println( "5���� ���� �����Ͱ� ���� ");
	
		
		// ����1 : �ϳ��� ������ �Է¹޾� 80�� �̻��̸� �հ� �ƴϸ� ���հ� ���
		
		System.out.print(" ����1 �Է� : ");	int ����1 = scanner.nextInt();
		
		if( ����1 >=80 ) System.out.println("�հ�");
		else System.out.println("���հ�");
			
		// ����2 : �ϳ��� ������ �Է¹޾� 90�� �̻��̸� A 80���̻��̸� B �׿� Ż�� 
		
		System.out.print(" ����2 �Է� : "); 	int ����2 = scanner.nextInt();
		
		if( ����2 >= 90 ) System.out.println("A���");
		else if( ����2 >= 80 ) System.out.println("B���");
		else System.out.println("Ż��");
		
		// ����3 : �ϳ��� ������ ������ �Է¹޾� 
		System.out.print("����3 �Է� : ");			int ����3 = scanner.nextInt();
		System.out.print("���� �Է�[��,��] : ");	String ���� = scanner.next();
			// �����̸鼭 90�� �̻��̸� A-1 Ŭ���� ��� 
			// �����̸鼭 90�� �̻��̸� A-2 Ŭ���� ��� 
				// �����̸鼭 80�� �̻��̸� B-1 Ŭ���� ��� 
				// �����̸鼭 80�� �̻��̸� B-2 Ŭ���� ��� 
					// �׿� C Ŭ���� 
		if( ����.equals("��") ) {
			
			if( ����3 >= 90 ) System.out.println(" A-1 Ŭ���� ");
			else if( ����3 >= 80 ) System.out.println(" B-1 Ŭ����");
			else System.out.println(" C Ŭ���� "); 
			
		}
		else if( ����.equals("��") ){
			if( ����3 >= 90 ) System.out.println(" A-2 Ŭ���� ");
			else if( ����3 >= 80 ) System.out.println(" B-2 Ŭ����");
			else System.out.println(" C Ŭ���� "); 
		}
		else {
			System.out.println(" C Ŭ���� "); 
		}
	*/	
	/*	
		//����4 : 2�� ������ �Է¹޾� ���� ū�� ��� 
		System.out.print( "���� ����1 : ");	int ����1 = scanner.nextInt();
		System.out.println( "���� ����2 : ");	int ����2 = scanner.nextInt();
		if( ����1 > ����2 ) System.out.println( ����1 );
		else System.out.println( ����2 );
		
		//����5 : 3�� ������ �Է¹޾� ���� ū�� ��� 
		System.out.print( "���� ����1 : ");	int ����3 = scanner.nextInt();
		System.out.print( "���� ����2 : ");	int ����4 = scanner.nextInt();
		System.out.print( "���� ����3 : ");	int ����5 = scanner.nextInt();
		//////////////////////////////���1///////////////////////////////////////
		int max = ����3;
		if( max < ����4 ) max = ����4;
		if( max < ����5 ) max = ����5;
		System.out.print(" ���� ū���� : " + max );
		///////////////////////////////���2///////////////////////////////////
		if( ����3 > ����4 && ����3 > ����5 ) System.out.println( ����3 );
		else if( ����4 > ����3 && ����4 > ����5 ) System.out.println( ����4 );
		else if( ����5 > ����3 && ����5 > ����4 ) System.out.println( ����5 );
		else System.out.println(" ��� ���� ");

		//����6 : 4�� ������ �Է¹޾� ���� ū�� ��� 
		System.out.print( "���� ����1 : ");	int ����6 = scanner.nextInt();
		System.out.print( "���� ����2 : ");	int ����7 = scanner.nextInt();
		System.out.print( "���� ����3 : ");	int ����8 = scanner.nextInt();
		System.out.print( "���� ����4 : ");	int ����9 = scanner.nextInt();
		int max2 = ����6;  // ���Ƿ� ù��° ������ max�� ���� 
			if( max2 < ����7 ) max2 = ����7;		// if( max2 < ����7 ) max2 = ����7;	
			if( max2 < ����8 ) max2 = ����8;		// else if( max2 < ����8 ) max2 = ����8;
			if( max2 < ����9 ) max2 = ����9;		// else if ( max2 < ����9 ) max2 = ����9;	
				// if 	else if 	else if	: ù��° if�� T �̸� ���� else if �˻� ����x
				// if 	if 			if 		: ù��° if�� T �̴��� �ι�° IF �˻� ����
	*/		
		//����7 : 3�� ������ �Է¹޾� �������� ������ ��� [ ��ü ��� ] �������� : if( ����1 > ����2 )
		System.out.print( "����1 : ");	int ����1 = scanner.nextInt();
		System.out.print( "����2 : ");	int ����2 = scanner.nextInt();
		System.out.print( "����3 : ");	int ����3 = scanner.nextInt();
		int temp ; // ��ü�� �ӽ� ���� 
		System.out.printf( " ���� �� : %d %d %d " , ����1 , ����2 , ����3 );
			if( ����1 > ����2 ) { temp = ����1 ; ����1 = ����2 ; ����2 = temp; }
			if( ����1 > ����3 ) { temp = ����1 ; ����1 = ����3 ; ����3 = temp; }
			if( ����2 > ����3 ) { temp = ����2 ; ����2 = ����3 ; ����3 = temp; }
		System.out.printf( " ���� �� : %d %d %d " , ����1 , ����2 , ����3 );
		
		//����8 : 3�� ������ �Է¹޾� �������� ������ ���  
			// �������� : if( ����1 > ����2 ) �񱳴���� �� ������ ��ȯ [ swap ]
			// �������� : if( ����1 < ����2 ) �񱳴���� �� ũ�� ��ȯ [ swap ]
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
