package Day07;

import java.util.Scanner;

public class Day07_2_Start {
	
	// 1. �ٸ� Ŭ������ �������� �޸� => static
		// 1. scanner 
	public static Scanner scanner = new Scanner(System.in);
		// 2. ����Ʈ�� �迭 
	
	public static void main(String[] args) {
		
		���α׷�����();
		
	} // main �� 
	
	// ���α׷� ���� �޼ҵ� 
	public static void ���α׷�����() {
		// static : �������� : ���α׷� ���۽� �޸��Ҵ�ǰ� ��� ���α׷� ����� �޸� �ʱ�ȭ 
			// ���� : �޸� ȿ�� ���� [ ��� Ŭ������ ���Ǵ� �޸� ���� ]
		while(true) { // ���ѷ��� [ 5�� �Է½� ���� ] 
			System.out.println("\n[[[[ ȸ���� Ŀ�´�Ƽ ]]]]");
			System.out.println("[[[ 1.�α��� 2.ȸ������ 3.���̵�ã�� 4.��й�ȣã�� 5.���α׷�����]]]");
			System.out.print("[[[ ���� : ");	int ���� = scanner.nextInt();
			if( ���� == 1 ) {}
			else if( ���� == 2 ) {}
			else if( ���� == 3 ) {}
			else if( ���� == 4 ) {}
			else if( ���� == 5 ) {
				System.err.println("\n[����] �̿����ּż� �����մϴ�");
				break;
			}
			else {
				System.err.println("\n[���] �˼����� �ൿ�Դϴ�");
			} 
		}
	}
	
} // class �� 
