package Day09_Board;

import java.util.Date;
import java.util.Scanner;

public class Board {
	Scanner scanner = new Scanner(System.in);
	// 필드 
		private int bno; 				// 1. 번호
		private String btitle; 			// 2. 타이틀
		private String bcontents;		// 3. 내용
		private String bwriter; 		// 4. 작성자 [ 로그인된 정보 ] 
		private String bdate; 			// 5. 작성일 
		private int bcount;			// 6. 조회수 	
	// 생성자 
		public Board() {}
		public Board(int bno, String btitle, String bcontents, String bwriter, String bdate, int bcount) {
			this.bno = bno;
			this.btitle = btitle;
			this.bcontents = bcontents;
			this.bwriter = bwriter;
			this.bdate = bdate;
			this.bcount = bcount;
		}
		
	// 메소드
		// 1. 메뉴 [ 글목록 ]  
		public void boardmenu( Member logmember ) { // 로그인된 회원을 인수로 받기
			 
			System.out.println("[[[[[[[[[[[ 커뮤니티 ]]]]]]]]]]]");
			System.out.println("번호\t제목\t\t\t\t작성자\t\t조회수\t작성일");
				for( Board board : List.boards) {
					System.out.println(board.bno+"\t"+board.btitle+"\t"+board.bwriter+"\t"
								+"\t"+board.getBcount()+"\t"+board.bdate );
				}
				
			System.out.println("1.글쓰기");
			System.out.println("2.글상세보기");
			int 선택 = scanner.nextInt();
			if( 선택 == 1 ) { writeboard( logmember.getId()); }
			if( 선택 == 2 ) { viewboard( ) ; }
		}
		// 2. 글쓰기 
		public void writeboard( String bwriter ) {
			// 입력받기 
			scanner.nextLine(); // 문제 보완
			System.out.println("[제목] : ");	String btitle = scanner.nextLine();
			System.out.println("[내용] : ");	String bcontents =  scanner.nextLine();
					// scanner.next(); : 문자열 공백[x]
					// scanner.nextLine(); : 문자열 공백[o] => 문제점 : 다른 next 사용시 문제점 
						// 빈칸에 추가 : scanner.nextLine(); // 문제 보완
			int bno = 0;
			
			if( List.boards.size() == 0) {
				// 게시물이 존재하지 않을때 [ 첫게시물 ] 
				bno = 1;
			}else {
				// 게시물 마지막번호의 +1
				bno = List.boards.get( List.boards.size()-1  ).getBno()+1 ; 
			}
					
			Date date = new Date(); // 오늘날짜/시간
			String bdate = date.toString();
			
			// 객체 
			Board board = new Board(bno, btitle, bcontents, bwriter , bdate , 0);	
			
			List.boards.add(board);

			FileUtil.filesave(2);
		
		}
		// 3. 글상세보기[ 게시물번호를 입력받아 글상세 ]
		public void viewboard( ) {
			System.out.println("[[[ 게시물번호 ]]]  : " ); int bno = scanner.nextInt();
			for( Board board : List.boards) {
				if( board.getBno() == bno ) {
					board.bcount++; // 조회수 증가 
					System.out.println("제목 " + board.getBtitle() );
					System.out.println("내용 " + board.getBcontents() );
					System.out.println("작성자 " + board.getBwriter() );
					return;
				}
			}
		}
		// 4. 글수정 
		// 5. 글삭제 
		
		public int getBno() {
			return bno;
		}
		public void setBno(int bno) {
			this.bno = bno;
		}
		public String getBtitle() {
			return btitle;
		}
		public void setBtitle(String btitle) {
			this.btitle = btitle;
		}
		public String getBcontents() {
			return bcontents;
		}
		public void setBcontents(String bcontents) {
			this.bcontents = bcontents;
		}
		public String getBwriter() {
			return bwriter;
		}
		public void setBwriter(String bwriter) {
			this.bwriter = bwriter;
		}
		public String getBdate() {
			return bdate;
		}
		public void setBdate(String bdate) {
			this.bdate = bdate;
		}
		public int getBcount() {
			return bcount;
		}
		public void setBcount(int bcount) {
			this.bcount = bcount;
		}

		

}
