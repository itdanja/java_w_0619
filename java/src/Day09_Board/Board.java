package Day09_Board;

import java.util.Date;
import java.util.Scanner;

public class Board {
	Scanner scanner = new Scanner(System.in);
	// �ʵ� 
		private int bno; 				// 1. ��ȣ
		private String btitle; 			// 2. Ÿ��Ʋ
		private String bcontents;		// 3. ����
		private String bwriter; 		// 4. �ۼ��� [ �α��ε� ���� ] 
		private String bdate; 			// 5. �ۼ��� 
		private int bcount;			// 6. ��ȸ�� 	
	// ������ 
		public Board() {}
		public Board(int bno, String btitle, String bcontents, String bwriter, String bdate, int bcount) {
			this.bno = bno;
			this.btitle = btitle;
			this.bcontents = bcontents;
			this.bwriter = bwriter;
			this.bdate = bdate;
			this.bcount = bcount;
		}
		
	// �޼ҵ�
		// 1. �޴� [ �۸�� ]  
		public void boardmenu( Member logmember ) { // �α��ε� ȸ���� �μ��� �ޱ�
			System.out.println("1.�۾���");
			System.out.println("2.�ۻ󼼺���");
			writeboard( logmember.getId() ) ;
		}
		// 2. �۾��� 
		public void writeboard( String bwriter ) {
			// �Է¹ޱ� 
			System.out.println("[����] : ");	String btitle = scanner.nextLine();
			System.out.println("[����] : ");	String bcontents =  scanner.nextLine();
					// scanner.next(); : ���ڿ� ����[x]
					// scanner.nextLine(); : ���ڿ� ����[o] => ������ : �ٸ� next ���� ������ 
						// ��ĭ�� �߰� : scanner.nextLine(); // ���� ����
			int bno = 0;
			
			if( List.boards.size() == 0) {
				// �Խù��� �������� ������ [ ù�Խù� ] 
				bno = 1;
			}else {
				// �Խù� ��������ȣ�� +1
				bno = List.boards.get( List.boards.size()-1  ).getBno()+1 ; 
			}
					
			Date date = new Date(); // ���ó�¥/�ð�
			String bdate = date.toString();
			
			// ��ü 
			Board board = new Board(bno, btitle, bcontents, bwriter , bdate , 0);	
			
			List.boards.add(board);

			FileUtil.filesave(2);
			
			
		}
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
		public int getBcount() {
			return bcount;
		}
		public void setBcount(int bcount) {
			this.bcount = bcount;
		}

		

}
