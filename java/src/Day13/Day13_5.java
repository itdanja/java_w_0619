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
			System.out.println(" map ��Ȳ ");
			System.out.println(" ȸ�� ��Ȳ : " + map.get("member") );
			System.out.println(" �Խù� ��Ȳ : " + map.get("board") );
			
			System.out.println("1.ȸ���߰�");
			System.out.println("2.�Խù��߰�");
			int ch = scanner.nextInt();
			if( ch == 1 ) {
				System.out.println("���̵� : ");	String id = scanner.next();
				System.out.println("��й�ȣ : ");String pw = scanner.next();
				map.get("member").put(id, pw);
				
			}
			if( ch == 2 ) {
				System.out.println("���� : ");	String title = scanner.next();
				System.out.println("���� : ");	String contents = scanner.next();
				map.get("board").put(title, contents);
			}
		}
	
		
	}
	
}
