package Day06;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Day06_1 {
	
	// ���� : �޸� �Ҵ�
	// �迭 : ������ �ڷ����� ���� ������ ����/����
		// �ڷ��� �迭�� = new �ڷ���[����]
				// new : �޸� �Ҵ� ������ 
		// [�ε���] : �迭�� ����Ǵ� ���� ��ȣ 
		// �پ��� �޼ҵ�[�̸��ۼ����ڵ�] => Arrays Ŭ���� ���
	
	public static void main(String[] args) {
		
		// �л����� �Է¹޾� �л�����ŭ �迭�� �޸��Ҵ�
		Scanner scanner = new Scanner(System.in);
		// �迭 ���� 
		Integer[] �л����� = null;	// ���� �޸𸮰� null �� �迭 ���� 
			// int 		:	���� �ڷ���	[ new x ] => ����
			// Integer 	:	���� Ŭ���� 	[ new ] => ��ü
		
		while( true ) { // ���ѷ��� 
			
			System.out.println("--- �л����� ���α׷� --- ");
			System.out.println("1.�л��� 2.�����Է� 3.��� 4.����");
			int ���� = scanner.nextInt();
			
			if( ���� == 1 ) {
				System.out.print(" ---> �л��� : "); 
				int �ο��� = scanner.nextInt();
				�л����� = new Integer[�ο���]; 
				System.out.println(�ο��� + "��ŭ �л������� �����Ҽ� �ֽ��ϴ�");
			}
			else if( ���� == 2 ) {
					for( int i = 0 ; i<�л�����.length ; i++  ) {
						System.out.print((i+1)+"��°�� �л����� �Է� : ");
						�л�����[i] = scanner.nextInt();
					}
			}
			else if( ���� == 3 ) {
				// ���� = sort()
				Arrays.sort( �л����� ); // �������� 
				// ��� 
					System.out.println("-------- �������� ---------");
				for( int i = 0 ; i<�л�����.length ; i++ ) {
					System.out.println((i+1)+"��° �л��� ���� " + �л�����[i] );
				}
				
				// �������� : �������� �ݴ�� [ �⺻�ڷ��� x ]
				Arrays.sort( �л����� , Collections.reverseOrder() );
						// �÷��� : �迭 , ����Ʈ
				// ��� 
				System.out.println("-------- �������� ---------");
				for( int i = 0 ; i<�л�����.length ; i++ ) {
					System.out.println((i+1)+"��° �л��� ���� " + �л�����[i] );
				}
				
				// ���� ���� ���� ��� 
				// ��� ��� 
			}
			else if( ���� == 4 ) { }
			else { } 
			
		} // while end
	} // main end
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
