package Day09_Board;

public class Board {
	
	// 필드 
		private int bno; 		// 1. 번호
		private String btitle; // 2. 타이틀
		private String bcontents;		// 3. 내용
		private String bwriter; 		// 4. 작성자 [ 로그인된 정보 ] 
		private String bdate; 			// 5. 작성일 
		private String bcount;			// 6. 조회수 	
	// 생성자 
		public Board() {}
		public Board(int bno, String btitle, String bcontents, String bwriter, String bdate, String bcount) {
			this.bno = bno;
			this.btitle = btitle;
			this.bcontents = bcontents;
			this.bwriter = bwriter;
			this.bdate = bdate;
			this.bcount = bcount;
		}
		
	// 메소드
		// 1. 메뉴 [ 글목록 ]  
		public void boardmenu( Member logmember ) { // 로그인된 정보를 인수로 받기
			System.out.println("1.글쓰기");
			System.out.println("2.글상세보기");
			
		}
		// 2. 글쓰기 
		// 3. 글상세보기[ 게시물번호를 입력받아 글상세 ]
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
		public String getBcount() {
			return bcount;
		}
		public void setBcount(String bcount) {
			this.bcount = bcount;
		}

		

}
