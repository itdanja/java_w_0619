package Day05;

public class Day05_1 {
	
	
	public static void main(String[] args) {
		
		// ��� : if[ ��(t/f) ����˻� ] , switch[ ������ �˻� ] 
			// if : ����Ǽ��� ���������� �ʴ°�� 
				// true �̸� ���๮ó���� ��� if ����
			// switch : ����Ǽ��� �������ִ� ��� [ �ӵ� ���� ]
				// case �˻��� �Ʒ� ��� case ó�� => break;[ �ݺ��� Ȥ�� switch Ż�� ] 
		
		if( 5>3 ) System.out.println("5��ũ��");
		else System.out.println("5���۴�");
		
		switch(5) {
			case 5 : System.out.println("5�Դϴ�");
			case 3 : System.out.println("3�Դϴ�");
		}
	//////////////////////////////////////////////////////////////
		int ��ȣ = 3 ;
		if( ��ȣ == 1 ) System.out.println("1�Դϴ�");
		else if( ��ȣ==2) System.out.println("2�Դϴ�");
		else if( ��ȣ == 3 )System.out.println("3�Դϴ�");
		
		switch(��ȣ) {
			case 1 : System.out.println("1�Դϴ�");
			case 2 : System.out.println("2�Դϴ�");
			case 3 : System.out.println("3�Դϴ�");
		}
		
//////////////////////////////////////////////////////////////
		int ���� = 80;
		switch( ���� ) {
			case 90 : System.out.println("A���"); break;
			case 80 : System.out.println("B���"); break;
			case 70 : System.out.println("C���"); break;
			default : System.out.println("Ż��");
		}
//////////////////////////////////////////////////////////////		
		int ����1 = 80;	int ����2 = 90; 	int ����3 = 100;
			// �� ������ ����� ����� : 
				// ��� 90���̻��̸� A���  80���̻��̸� B��� 70���̻��̸� C��� �׿� Ż��
		int ��� = (����1+����2+����3) / 3 ;
		switch( ���/10 ) {
			case 10 :	
			case 9 : System.out.println("A���"); break;
			case 8 : System.out.println("B���"); break;
			case 7 : System.out.println("C���"); break;
			default : System.out.println("Ż��");
		}
//////////////////////////////////////////////////////////////
		// �ݺ��� : for , while	
			// for : �ڵ� ���Ἲ
			// while : ���ѷ��� => while(true) { }
		
		for( int i = 0 ; i<10 ; i++ ) { System.out.print( i +"\t" ); };
			// �ʱⰪ ; ���ǹ� ; ������ 
		
		System.out.println();
		
		int i = 0 ;	// �ʱⰪ 
		
		while( i<10 ) { // ���ǹ� 
			System.out.print( i + "\t" );
			i++; // ������ 
		}
		System.out.println();
////////////////////////////////////////////////////////////// 
		
		int j = 0;
		while( true ) {	// while( ���ǹ� )
			System.out.println("���ѹݺ�" + j);
			if( j == 10 ) break;
			j++;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}	
}

