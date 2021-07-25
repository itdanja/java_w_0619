package Day11;

import java.util.Scanner;

public class Day11_3 {
	
	public static void main(String[] args) {
		
		// 문제1 : 무한루프에서 번호를 계속 입력받기 
			// 예외발생 : 문자입력시 예외처리 발생
				// 예외처리 : 다시 입력받기 
		
		while(true) {
			try {
				Scanner scanner = new Scanner(System.in);
				System.out.print("정수 입력 : "); int 정수 = scanner.nextInt();
			}
			catch (Exception e) {
				System.out.println("[오류]정수만 입력가능합니다 ");
			}
		}
	}
}
