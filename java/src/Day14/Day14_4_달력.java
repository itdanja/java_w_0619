package Day14;

import java.util.Calendar;
import java.util.Scanner;

public class Day14_4_�޷� {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print(" �˻� ���� :"); int year = scanner.nextInt();
		System.out.print(" �˻� �� :"); int month = scanner.nextInt();
		
		�޷�( year , month );
		// ����1 : ���� ����/��  ~ �� ����/�� �Է¹޾� ���� �޷� 
		
	}
	
	// �޷��� �޼ҵ�ȭ => main �ȿ� ������ �ٸ� Ŭ�������� ȣ�� �Ҹ� 
	public static void �޷�( int year , int month ) { // �μ��� ������ ���� �Է¹޾� �޷� ��� 

		// 1.���� Ķ���� �������� 
		Calendar calendar = Calendar.getInstance();
		
		// 2.Ķ�������� ���� , �� , �� 
//			int year = calendar.get( calendar.YEAR );
//			int month = calendar.get( calendar.MONTH)+1;
//			int day = calendar.get( calendar.DAY_OF_MONTH );
		
		// ****4. �ش� ���� 1�� ����ã�� 
		calendar.set( year , month-1 , 1 ); // calendar.set( �� , �� , �� ) ��������� ��¥ 
		int sday = calendar.get( calendar.DAY_OF_WEEK ); // ���� ���� [ 1:�Ͽ��� ~ 7:����� ]
		int eday = calendar.getActualMaximum( calendar.DAY_OF_MONTH ); // �ش� ���� ������ ��  
	
		// 3. �޷� console ��� 
		System.out.println("======================"+year+"�� " +month+"�� ====================");
		System.out.println(" ��\t��\tȭ\t��\t��\t��\t��");
		
		// 6. 1���� ���� ������ ���� ó�� 
		for( int i = 1 ; i<sday ; i++ ) {
			System.out.print(" \t");
		}
		
		// 5. �� ���Ͽ� ��¥ ǥ�� 
		for( int i = 1 ; i<=eday ; i++ ) {
			System.out.printf("%2d\t" , i);
			// ����ϸ��� �ٹٲ� [ ������ 7�� ��� ]
			if( sday % 7 == 0 )System.out.println( );
			sday++;
		}
	}
	

}
