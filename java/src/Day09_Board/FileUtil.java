package Day09_Board;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class FileUtil {
	
	private static final String memberpath = "C:/Users/User/git/java_w_0619/java/src/Day09_Board/member.txt";
	private static final String boardpath = "C:/Users/User/git/java_w_0619/java/src/Day09_Board/board.txt";
	
	public static int filesave( int type) { // ����Ʈ => ��ü�ϳ��� => �ʵ庰 �з� => ȸ���ϳ��� ��������
		try {
					// ���� :FileNotFoundException
					FileOutputStream fileOutputStream = null;
						
						if( type == 1 ) {		
							fileOutputStream = new FileOutputStream(memberpath);
																				// �� pc ��η� �����ϱ� 
						for( Member member : List.members ) {
							// ����Ʈ for�� Ȱ�� : ����Ʈ�� ��Ҽ���ŭ �ϳ��� ���� 
							String outstring = member.getId()+","+member.getPassword()+","+member.getName()+","+
												member.getEmail()+","+member.getPoint()+"\n";
							
							//���� :  IOException
							fileOutputStream.write( outstring.getBytes() );
						}
							return 1; // ���� 
						}
						
						if( type == 2 ) {		
							fileOutputStream = new FileOutputStream(boardpath);
																				// �� pc ��η� �����ϱ� 
						for( Board board : List.boards) {
							// ����Ʈ for�� Ȱ�� : ����Ʈ�� ��Ҽ���ŭ �ϳ��� ���� 
							String outstring = board.getBno()+","+board.getBtitle()+","+board.getBcontents()+","+
									board.getBwriter()+","+board.getBdate()+","+board.getBcount()+"\n";
							
							//���� :  IOException
							fileOutputStream.write( outstring.getBytes() );
						}
							return 1; // ���� 
						}


		} catch ( Exception e) {
			System.out.println("[����ó�� ���� ]"); 
		}
		return -1; // ���� 
	}
	
	public static int fileload( int type ) {
		try {
			FileInputStream  fileInputStream = null;
			
			if( type == 1 ) {
				fileInputStream = new FileInputStream(memberpath);
				// 1. �Է½�Ʈ������ ����Ʈ �� �о����
				byte[] bytes = new byte[10000]; // 10kb �迭 
				fileInputStream.read( bytes );
				
				// 2. ���ڿ� ��ȯ 
				String instring = new String( bytes );
				// 3. ȸ�� �и��ϱ� 
				String[] temp = instring.split("\n");
				
				// 4. ȸ������ ���� �и�
				for( int i = 0 ; i<temp.length ; i++ ) {
					String[] temp2 = temp[i].split(",");
					Member member = new Member( temp2[0] ,temp2[1] ,temp2[2] 
							, temp2[3] , Integer.parseInt( temp2[4] ) );
					// 5. ����Ʈ�� �ٽ� ���	
					List.members.add(member);
				}		
				return 1;
			}
		} catch ( Exception e) {
			System.out.println("[����ó�� ���� ]"); 
		}
		return -1;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
