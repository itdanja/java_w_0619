package Day09_Board;

public class Board {
	
	// �ʵ� 
		private int bno; 		// 1. ��ȣ
		private String btitle; // 2. Ÿ��Ʋ
		private String bcontents;		// 3. ����
		private String bwriter; 		// 4. �ۼ��� [ �α��ε� ���� ] 
		private String bdate; 			// 5. �ۼ��� 
		private String bcount;			// 6. ��ȸ�� 	
	// ������ 
		public Board() {}
		public Board(int bno, String btitle, String bcontents, String bwriter, String bdate, String bcount) {
			this.bno = bno;
			this.btitle = btitle;
			this.bcontents = bcontents;
			this.bwriter = bwriter;
			this.bdate = bdate;
			this.bcount = bcount;
		}
		
	// �޼ҵ�
		// 1. �޴� [ �۸�� ]  
		public void boardmenu( Member logmember ) { // �α��ε� ������ �μ��� �ޱ�
			System.out.println("1.�۾���");
			System.out.println("2.�ۻ󼼺���");
			
		}
		// 2. �۾��� 
		// 3. �ۻ󼼺���[ �Խù���ȣ�� �Է¹޾� �ۻ� ]
		// 4. �ۼ��� 
		// 5. �ۻ��� 
		
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
