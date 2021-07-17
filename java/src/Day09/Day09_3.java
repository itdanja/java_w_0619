package Day09;

import java.util.ArrayList;
import java.util.Scanner;

public class Day09_3 {
	
	public static ArrayList<은행> banklist = new ArrayList<>();
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		ATM atm = new 은행();
		
		while(true) {
			
			System.out.println("1.신한 2.국민 3.종료");
			System.out.println("선택 : "); int 선택 = scanner.nextInt();
			if( 선택 == 1 ) {
				System.out.println("신한은행 연결 ");
				atm.메뉴();
			}
		}
	}
}
