package Day09_Board;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class FileUtil {
	
	private static final String memberpath = "C:/Users/User/git/java_w_0619/java/src/Day09_Board/member.txt";
	private static final String boardpath = "C:/Users/User/git/java_w_0619/java/src/Day09_Board/board.txt";
	
	public static int filesave( int type) { // 리스트 => 객체하나씩 => 필드별 분류 => 회원하나씩 내보내기
		try {
					// 예외 :FileNotFoundException
					FileOutputStream fileOutputStream = null;
						
						if( type == 1 ) {		
							fileOutputStream = new FileOutputStream(memberpath);
																				// 현 pc 경로로 설정하기 
						for( Member member : List.members ) {
							// 리스트 for문 활용 : 리스트내 요소수만큼 하나씩 대입 
							String outstring = member.getId()+","+member.getPassword()+","+member.getName()+","+
												member.getEmail()+","+member.getPoint()+"\n";
							
							//예외 :  IOException
							fileOutputStream.write( outstring.getBytes() );
						}
							fileOutputStream.close();
							return 1; // 성공 
						}
						
						if( type == 2 ) {		
							fileOutputStream = new FileOutputStream(boardpath);
																				// 현 pc 경로로 설정하기 
						for( Board board : List.boards) {
							// 리스트 for문 활용 : 리스트내 요소수만큼 하나씩 대입 
							String outstring = board.getBno()+","+board.getBtitle()+","+board.getBcontents()+","+
									board.getBwriter()+","+board.getBdate()+","+board.getBcount()+"\n";
							
							//예외 :  IOException
							fileOutputStream.write( outstring.getBytes() );
						}
							fileOutputStream.close();
							return 1; // 성공 
						}


		} catch ( Exception e) {
			System.out.println("[파일처리 오류1 ]"+e); 
		}
		return -1; // 실패 
	}
	
	public static int fileload( int type ) {
		try {
			FileInputStream  fileInputStream = null;
			
			if( type == 1 ) {
				fileInputStream = new FileInputStream(memberpath);
				// 1. 입력스트림에서 바이트 로 읽어오기
				byte[] bytes = new byte[10000]; // 10kb 배열 
				fileInputStream.read( bytes );
				
				// 2. 문자열 변환 
				String instring = new String( bytes );
				// 3. 회원 분리하기 
				String[] temp = instring.split("\n");
				
				// 4. 회원마다 변수 분리
				for( int i = 0 ; i<temp.length-1 ; i++ ) {
					String[] temp2 = temp[i].split(",");
					Member member = new Member( temp2[0] ,temp2[1] ,temp2[2] 
							, temp2[3] , Integer.parseInt( temp2[4] ) );
					// 5. 리스트에 다시 담기	
					List.members.add(member);
				}		
				fileInputStream.close();
				return 1;
			}
			
			if( type == 2 ) {
				fileInputStream = new FileInputStream(boardpath);
				// 1. 입력스트림에서 바이트 로 읽어오기
				byte[] bytes = new byte[100000]; // 100kb 배열 
				fileInputStream.read( bytes );
				
				// 2. 문자열 변환 
				String instring = new String( bytes );
				// 3. 게시물 분리하기 
				String[] temp = instring.split("\n");
				
				// 4. 회원마다 변수 분리
				for( int i = 0 ; i<temp.length-1 ; i++ ) {
					String[] temp2 = temp[i].split(",");
					Board Board = new Board(  Integer.parseInt(temp2[0]) ,temp2[1] ,temp2[2] 
							, temp2[3] , temp2[4] , Integer.parseInt(temp2[5]) );
					// 5. 리스트에 다시 담기	
					List.boards.add(Board);
				}		
				fileInputStream.close();
				return 1;
			}
			
			
		} catch ( Exception e) {
			System.out.println("[파일처리 오류2 ]" + e); 
		}
		return -1;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
