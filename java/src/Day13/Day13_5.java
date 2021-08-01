package Day13;

import java.util.HashMap;
import java.util.Scanner;

public class Day13_5 {

	public static void main(String[] args) {
		
		HashMap<String, String > boardmap = new HashMap<String, String>();
		HashMap<String, String > membermap = new HashMap<String, String>();
		
		HashMap<String, HashMap<String , String > > map = new HashMap<String, HashMap<String,String>>();
		
			map.put("board", boardmap );
			map.put("member", membermap );
	
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println(" map 현황 ");
			System.out.println(" 회원 현황 : " + map.get("member") );
			System.out.println(" 게시물 현황 : " + map.get("board") );
			
			System.out.println("1.회원추가");
			System.out.println("2.게시물추가");
			int ch = scanner.nextInt();
			if( ch == 1 ) {
				System.out.println("아이디 : ");	String id = scanner.next();
				System.out.println("비밀번호 : ");String pw = scanner.next();
				map.get("member").put(id, pw);
				
			}
			if( ch == 2 ) {
				System.out.println("제목 : ");	String title = scanner.next();
				System.out.println("내용 : ");	String contents = scanner.next();
				map.get("board").put(title, contents);
			}
		}
	
		
	}
	
}
