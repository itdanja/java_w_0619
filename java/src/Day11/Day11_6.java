package Day11;

import java.util.Scanner;

public class Day11_6 {
	
	public static void main(String[] args) {
		
		
		// 무한루프 메뉴 1. 음악재생  // 2.영화재생
		//  	조건1 : 1초간 간격으로 음악재생 출력하기 
		//		조건2 : 1초간 간격으로 영화재생 출력하기 
		//		조건3 : 동일한 번호를 선택했을경우 재생 중지 
		
		Scanner scanner = new Scanner( System.in);
		
		boolean msw = true; // 음악 재생여부 여부 변수 
		
		
		while(true) {
			
			System.out.println("---->");
			System.out.println("1.음악재생 2.영화재생"); int ch = scanner.nextInt();
			if( ch == 1 ) {
				
				Thread thread = new 음악재생();
				
				if(msw) {
					음악재생.음악stop(msw);
					
					thread.start(  ); // 음악실행 run 실행 
					msw = false; // 재생여부 변경
					
				}else {
					음악재생.음악stop( msw);
					msw = true;
					
				}
				
			}
			if( ch == 2 ) {
				
			}
			
			
		}
		
	}

}
