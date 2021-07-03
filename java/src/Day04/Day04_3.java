package Day04;

import java.util.Random;
import java.util.Scanner;

public class Day04_3 {

	// 가위바위보 게임 
		// 1. 가위 바위 보 중 하나를 입력받아 승패 결정 
		// 2. 컴퓨터는 랜덤 사용 
		// 3. 게임 여러번 진행해서 최종 승리자 
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int 게임횟수 = 0 ; 
		int 플레이어이긴수 = 0;
		int 컴퓨터가이긴수 = 0;
		
		while( true ) { // 무한루프 

			// 플레이어
			System.out.print("가위[0]바위[1]보[2] 게임종료[4] 중 선택 : "); int 플레이어 = scanner.nextInt();
			if( 플레이어 == 0 )		System.out.println("--->플레이어는 가위 을 선택했습니다");
			else if( 플레이어 == 1 )	System.out.println("--->플레이어는 바위 을 선택했습니다 ");
			else if( 플레이어 == 2 )	System.out.println("--->플레이어는 보 을 선택했습니다");
			else if( 플레이어 == 4 ) 	break;
			else System.out.println("[경고] 알수 없는 번호 입니다 ");
			
			// 게임횟수 증가
				게임횟수++;
			
			// 컴퓨터  => 랜덤 이용한 난수생성 [ Random : 랜덤 관련된 메소드 제공  ]
			Random random = new Random(); // 랜덤 객체 만들기 
			int 컴퓨터 = random.nextInt(3); // 랜덤 객체에서 난수 가져오기 [ .nextInt(숫자)   0~숫자전까지 난수생성 ]
			
			if( 컴퓨터 == 0 )			System.err.println("--->컴퓨터는 가위 을 선택했습니다");
			else if( 컴퓨터 == 1 )	System.err.println("--->컴퓨터는 바위 을 선택했습니다 ");
			else if( 컴퓨터 == 2 )	System.err.println("--->컴퓨터는 보 을 선택했습니다");
			
			// 이기는 경우수 
					// 플레이어 이기는 수 [ 0 , 2 ] [ 1 , 0 ] [ 2 , 1 ]
					// 비기는 경우의수 [ 0 , 0 ] [ 1 , 1 ] [ 2  , 2 ]
					// 컴퓨터가 이기는 수 [ 그외 ]		
			if( (플레이어==0 && 컴퓨터==2) || (플레이어==1 && 컴퓨터==0) || (플레이어==2 && 컴퓨터==1)  ) {
				System.out.println("--->플레이어 승리");
				// 플레이어 이긴수 증가 
				플레이어이긴수++;
			}else if( (플레이어==0 && 컴퓨터==0) || (플레이어==1 && 컴퓨터==1) || (플레이어==2 && 컴퓨터==2)  ) {
				System.out.println("--->무승부");
			}
			else {
				System.out.println("--->컴퓨터 승리");
				// 컴퓨터 이긴수 증가 
				컴퓨터가이긴수++;
			}
			
		} // w end 
		
		System.out.println("----->[게임종료]");
		System.out.println("-----> 플레이 게임횟수 : " + 게임횟수);
		System.out.println("-----> 플레이어 이긴수 : " + 플레이어이긴수);
		System.out.println("-----> 컴퓨터 이긴수 : " + 컴퓨터가이긴수);
		
		if( 플레이어이긴수 > 컴퓨터가이긴수 ) 
			System.out.println("-------> 최종 승리자 : 플레이어 ");
		else if( 플레이어이긴수 < 컴퓨터가이긴수 )
			System.out.println("-------> 최종 승리자 : 컴퓨터 ");
		else
			System.out.println("-------> 최종 승리자 : 무승부 ");
		
		
	}
	
	
}
