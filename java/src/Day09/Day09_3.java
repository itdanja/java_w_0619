package Day09;

import java.util.ArrayList;
import java.util.Scanner;

public class Day09_3 {
	
	public static ArrayList<����> banklist = new ArrayList<>();
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		ATM atm = new ����();
		
		while(true) {
			
			System.out.println("1.���� 2.���� 3.����");
			System.out.println("���� : "); int ���� = scanner.nextInt();
			if( ���� == 1 ) {
				System.out.println("�������� ���� ");
				atm.�޴�();
			}
		}
	}
}
