package Day08;

import java.util.ArrayList;
import java.util.Scanner;

public class Day08_7_ATM {
	
	// main �ۿ� �ۼ��� ���� : main �ܿ����� ���[ȣ��] �ϱ� ���� 
	public static Scanner scanner = new Scanner(System.in);
		// static : main �޸� �켱�Ҵ� : ��������
	public static ArrayList<����> ���¸�� = new ArrayList<>();
	
	public static void main(String[] args) {   start();  }
	public static void start() {
		while(true) {
			System.out.println("[[[[ ATM ]]]]");
			System.out.println("[[[1.���»��� 2.�Ա� 3.��� 4.��ü 5.����ã�� 6.����");
			int ���� = scanner.nextInt();
			if( ���� == 1 ) {
				System.out.println("[[ 1. �������� 2.�������� ]] :  ");
				int ����2 = scanner.nextInt();
				if( ����2 == 1 ) {
					�������� �������� = new ��������();
					��������.���µ��();
				}
			}
			else if( ���� == 2 ) {
				System.out.println("[[ 1. �������� 2.�������� ]] :  ");
				int ����2 = scanner.nextInt();
				if( ����2 == 1 ) {
					�������� �������� = new ��������();
					��������.�Ա�();
				}
			}
			else if( ���� == 3 ) {
				System.out.println("[[ 1. �������� 2.�������� ]] :  ");
				int ����2 = scanner.nextInt();
				if( ����2 == 1 ) {
					�������� �������� = new ��������();
					��������.���();
				}
			}
			else if( ���� == 4 ) {}
			else if( ���� == 5 ) {}
			else if( ���� == 6 ) {
				System.err.println("\n[[[ [����] �̿����ּż� �����մϴ� ]]]");
				break;
			}
			else { System.err.println("\n[[[ [���] �˼� ���� ��ȣ �Դϴ�  ]]]"); }
		}
	}
	
} // Ŭ���� end 
