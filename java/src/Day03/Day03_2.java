package Day03;

public class Day03_2 {
	
	// ��� : ��쿡 ���� �Ǵܷ� 
		// if[���˻�] , switch[ �� �˻� ]
	
	 
	public static void main(String[] args) {
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
		
		// ����2 : �ϳ��� ������ �Է¹޾� 90�� �̻��̸� A 80���̻��̸� B �׿� Ż�� 
		
		// ����3 : �ϳ��� ������ ������ �Է¹޾� 
			// �����̸鼭 90�� �̻��̸� A-1 Ŭ���� ��� 
			// �����̸鼭 90�� �̻��̸� A-2 Ŭ���� ��� 
				// �����̸鼭 80�� �̻��̸� B-1 Ŭ���� ��� 
				// �����̸鼭 80�� �̻��̸� B-2 Ŭ���� ��� 
					// �׿� C Ŭ���� 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
