package Day14;

import java.util.ArrayList;
import java.util.Scanner;

public class Day14_2 {
	
		// ����1 : ���� �˻� ���α׷� 
			// [����1] ArrayList : ������� 
			// [����Ʈ �ʱⰪ ] 
					//		1. �ȴ�! ���̹� ��α�&����Ʈ
					//		2. ������ ��Ʈ ���� Ȱ�� ������
					//		3. Tucker�� Go ��� ���α׷���
					//		4. ȥ�� �����ϴ� C ���
			// [����2] ���ѷ��� �޴� 
				// 1. �˻� => �Էµ� Ű���尡 ���Ե� ������ ��� ����ϱ� 
				// 2. ���� => ������ ������ �˻��Ͽ� -> ������ ���ڿ� ���ο�ڸ� �Է¹޾� ����
	
		public static void main(String[] args) {
			
			ArrayList< String > booklist = new ArrayList<String>();
			booklist.add("�ȴ�! ���̹� ��α�&����Ʈ");
			booklist.add("������ ��Ʈ ���� Ȱ�� ������");
			booklist.add("Tucker�� Go ��� ���α׷���");
			booklist.add("ȥ�� �����ϴ� C ���");
			
			Scanner scanner = new Scanner(System.in);
			
			while(true) {
				System.out.print("1.�˻� 2.����  ");
				int ch = scanner.nextInt();
				if( ch == 1 ) {
					System.out.print(" Ű���� : " );	String Ű���� = scanner.next();
					int count = 0 ; // ã�� ���� �����ϴ� ���� ��
					for( String string : booklist ) {
						// for( �ӽð�ü : ����Ʈ/�迭 )  ����Ʈ�� ��� ��ü�� �ϳ��� �ӽð�ü ���� �ݺ� 
						if( string.contains(Ű����) ) { // ���ڿ��� Ű���尡 ���ԵǾ� �����餤
							System.out.println("������ : " + string );
							count++; // ã�� ����
						}
					}
					if( count == 0 ) {
						System.out.println(" �ش��ϴ� ������ �����ϴ� ");
					}else {
						System.out.println(" �� �˻� ���� : " + count );
				}	}
				if( ch == 2 ) {
					int i = 1 ;
					for( String string : booklist ) {
						System.out.println( i + "��° ������ : " + string);
						i++;
					}
					System.out.println(" ������ ������ ���� : "); int ch2 = scanner.nextInt();
						if( ch2 >= 1 && ch2 < i ) { 
							System.out.println(" ������ �ܾ� : ");	String oldstring = scanner.next();
							if( booklist.get(ch-1).contains(oldstring) ) {
								System.out.println(" ���ο� �ܾ� : ");	String newstring = scanner.next();
								booklist.set( ch2 - 1 , booklist.get( ch2-1 ).replace(oldstring, newstring) );
									// set ( ������ ��ü �ε��� , ���ο� ��ü  )
								System.out.println(" ������ �Ϸ� �Ǿ����ϴ� : " + booklist.get(ch-1) );
							}else {
								System.out.println(" ������ �ܾ ������ �������� �ʽ��ϴ� ");
							}
						}
						else {
							System.out.println(" ���� ������ȣ �Դϴ� ");
						}
					 
					
				}
			}
			
			
			
			
			
			
			
			
			
			
			
		}
	
				

}
