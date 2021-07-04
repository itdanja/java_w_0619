package Day06;

import java.util.Scanner;

public class 게시물 {

	// 필드
		String 제목;
		String 내용;
		String 작성자;
		int 조회수;
		
	// 생성자 : 객체의 초기값 
		// 1. 빈생성자
		public 게시물() {}
		// 2. 풀생성자
		public 게시물( String 제목 , String 내용 , String 작성자 , int 조회수 ) {
			this.제목 = 제목;
			this.내용 = 내용;
			this.작성자 = 작성자;
			this.조회수 = 조회수;
		}
	// 메소드 [ 미리 작성된 코드 => 코드의 재활용  ] 
		// 1. 게시물 등록 
		public static void 게시물등록() {
			System.out.println("----> 게시물 등록 화면");
			System.out.print(" 제목 : "); 
				String 제목 = Day06_4_게시판.입력객체.next();
				
			System.out.print(" 내용 : "); 
				String 내용 = Day06_4_게시판.입력객체.next();
				
			System.out.print(" 작성자 : "); 
				String 작성자 = Day06_4_게시판.입력객체.next();
				
			// 입력받은 값으로 객체 생성 [ 생성자 ] 
			게시물 temp = new 게시물(제목, 내용, 작성자, 0);
			Day06_4_게시판.게시물목록.add(temp);
					// 리스트명.add( 객체명 ) : 리스트내 객체 추가 
		}
		// 2. 게시물 출력 
		public static void 게시물출력 () {
			System.out.println("번호\t제목\t\t\t작성자\t조회수");
			// 모든 게시물 출력 
			for( int i = 0 ; i<Day06_4_게시판.게시물목록.size() ; i++ ) {
				System.out.println(i+"\t"+Day06_4_게시판.게시물목록.get(i).제목 
						+"\t\t\t"+Day06_4_게시판.게시물목록.get(i).작성자
						+"\t"+Day06_4_게시판.게시물목록.get(i).조회수);
			}
		}
		// 3. 게시물 삭제 
		
		// 4. 조회수 증가 
		public void 조회수증가() {
			this.조회수++;
		}
		// 5. 해당 게시물 상세보기 
		public static void 게시물상세보기( int 번호 ) {
								// 보고자하는 게시물의 번호
			게시물 temp = Day06_4_게시판.게시물목록.get(번호);
				// 선택된 게시물은 조회수 증가 
				temp.조회수증가();
				
			System.out.println("[ 제목 ] : " + temp.제목);
			System.out.println("[ 작성자 ] : " + temp.작성자 + "    [ 조회수 ] : "+temp.조회수);
			System.out.println("[ 내용 ] : " + temp.제목);
		}
		


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
