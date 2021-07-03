package Day05;

import java.util.Random;
import java.util.Scanner;

public class Day05_3_틱택토 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		// 판 생성 = 문자 9개를 저장할수 있는 1차원배열 
		String[] 게임판 = { "[ ]" , "[ ]" , "[ ]" , 
							"[ ]" , "[ ]" , "[ ]" , 
							"[ ]" , "[ ]" , "[ ]"  };
		
		String 승리자 =" "; // 승리 알 을 저장하기 위한 변수 
		
		
		while(true ) { // 게임 전체의 무한루프 [ 모든 알을 두었을때 , 승리자가 나올경우 종료 ] 
			
			// 게임판 출력 
			for( int i = 0 ; i<게임판.length ; i++ ) {
				System.out.print( 게임판[i] );
				// 3개씩 출력후에 줄바꿈
				if( i % 3 == 2 ) System.out.println();
			}
			
			// 종료 
				if( 승리자.equals("[O]")) {
					System.out.println("[게임종료] : 플레이어 승리");
					break; // while 게임무한루프 종료
				}
				if( 승리자.equals("[X]")) {
					System.out.println("[게임종료] : 컴퓨터 승리");
					break; // while 게임무한루프 종료
				}
	
			while(true) { // 플레이어 입력 무한루프 [ 정상적인 입력을 할때 종료 ] 
				// 플레이어에 입력받아 해당 위치에 알 두기
				System.out.print("[선택] 두고자하는 위치 : ");
				int 플레이어 = scanner.nextInt(); // 인덱스
					// 0~8 사이만 입력받기 
					if( 플레이어 < 0 || 플레이어 > 8 ) System.out.println("[경고] 알수없는 번호입니다 ");
					else if( !게임판[플레이어].equals("[ ]") ) {
							// ! : 부정[반대]
						System.out.println("[경고] 이미 알 이 존재하는 위치 입니다 ");
					}else {
						게임판[플레이어] = "[O]"; // 입력받은 인덱스에 알 바꾸기
						break; // 가장 가까운 반복문 탈출 
					}
					
			} // while 2 end
			
						// 모든 알 두었을때  => 알이 9개 이면 
						int 현재알수 = 0;
						for( int i = 0 ; i<9 ; i++ ) {
							if(!게임판[i].equals("[ ]") ) 현재알수++;
						}
						if( 현재알수 == 9 ) {
							// 게임판 출력 
							for( int i = 0 ; i<게임판.length ; i++ ) {
								System.out.print( 게임판[i] );
								// 3개씩 출력후에 줄바꿈
								if( i % 3 == 2 ) System.out.println();
							}
							System.out.println("[게임종료] : 무승부");
							break; // while 게임무한루프 종료
						}
						
			// 컴퓨터 [ 난수 생성해서 알 두기 ] 
				// 난수 생성 클래스 = Random
			while( true ) {
				Random random = new Random(); // 랜덤 객체 생성 
				int 컴퓨터 = random.nextInt(9); // 객체에서 정수 난수 가져오기 
					// random.nextInt(); : 0~20억정도 까지의 난수 생성
					// random.nextInt(10); : 0~9까지의 난수생성 
					// random.nextInt( 마지막번호 )+시작번호;
					// random.nextInt(10)+10;	10 ~ 19까지 난수생성
				if( 게임판[컴퓨터].equals("[ ]") ) { 게임판[컴퓨터] = "[X]"; break; }
			}
			
			// 승패 
				// 가로로 이기는 수  [ 0 1 2 , 3 4 5 , 6 7 8 ] 
	//				if( 게임판[0].equals(게임판[1]) && 게임판[1].equals(게임판[2]) )
	//				if( 게임판[3].equals(게임판[4]) && 게임판[4].equals(게임판[5]) )
	//				if( 게임판[6].equals(게임판[7]) && 게임판[7].equals(게임판[8]) )
				for( int i = 0 ; i<=6 ; i+=3 ) {
					// i는 0부터 6까지 3씩 증가하면서 반복 => 0 3 6
					if( 게임판[i].equals(게임판[i+1] )&& 게임판[i+1].equals(게임판[i+2])) {
						if( !게임판[i].equals("[ ]") ) 승리자 = 게임판[i];
					}
				}
				// 세로로 이기는 수  [ 0 3 6 , 1 4 7 , 2 5 8 ]
				for( int i = 0 ; i<=2 ; i++ ) {
					if( 게임판[i].equals(게임판[i+3]) && 게임판[i+3].equals(게임판[i+6]) ) {
						if( !게임판[i].equals("[ ]") ) 승리자 = 게임판[i];
					}
				}
				// 대각선으로 이기는수 [ 0 4 8 , 2 4 6 ]
				if( 게임판[0].equals(게임판[4]) && 게임판[4].equals(게임판[8])) {
					if( !게임판[0].equals("[ ]") ) 승리자 = 게임판[0];
				}
				if( 게임판[2].equals(게임판[4]) && 게임판[4].equals(게임판[6])) {
					if( !게임판[2].equals("[ ]") ) 승리자 = 게임판[2];
				}

		} // while 1 end 
	} // main end 
} // class end 
