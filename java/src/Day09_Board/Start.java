package Day09_Board;

import java.util.Scanner;

public class Start {
	
	public static void main(String[] args) {
		
		FileUtil.fileload(1); // 회원 불러오기 
		FileUtil.fileload(2); // 게시판 불러오기
		
		start();
		
	}
	
	public static void start() {
	// public 접근제한자 : 프로젝트 내 모든 곳에서 호출 가능 
	// static 정적변수 : 프로그램 시작시 메모리 할당 , 프로그램 종료시 메모리 초기화
		// void : retrun 했을때 반환 데이터가 없다 
		
		Scanner scanner = new Scanner(System.in);
		
		Member member = new Member();
		
		while( true ) {
			System.out.println("1.회원가입");
			System.out.println("2.로그인");
			System.out.println("3.아이디찾기");
			System.out.println("4.비밀번호찾기");
			int 선택 = scanner.nextInt();
			if( 선택 == 1 ) { member.signup(); }
			if( 선택 == 2 ) { 
			
				Member logmember = member.login();
				
				if( logmember == null ) { return;}
				while(true) {
					System.out.println("1.회원정보");
					System.out.println("2.커뮤니티[게시판]");
					System.out.println("3.로그아웃");
					int 선택2 = scanner.nextInt();
					if( 선택2 == 1 ) { 
						int result = logmember.infomember();
						if( result == 2 ) break;
					}
					if( 선택2 == 2 ) { 	
						Board board = new Board();
						board.boardmenu(logmember);
					}
					if( 선택2 == 3 ) { break; }
				}
			}
			if( 선택 == 3 ) { member.findid(); }
			if( 선택 == 4 ) { member.findpassword(); }
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
