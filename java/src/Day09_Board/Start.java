package Day09_Board;

import java.util.Scanner;

public class Start {
	
	public static void main(String[] args) {
		
		FileUtil.fileload(1); // ȸ�� �ҷ����� 
		
		start();
		
	}
	
	public static void start() {
	// public ���������� : ������Ʈ �� ��� ������ ȣ�� ���� 
	// static �������� : ���α׷� ���۽� �޸� �Ҵ� , ���α׷� ����� �޸� �ʱ�ȭ
		// void : retrun ������ ��ȯ �����Ͱ� ���� 
		
		Scanner scanner = new Scanner(System.in);
		
		Member member = new Member();
		
		while( true ) {
			System.out.println("1.ȸ������");
			System.out.println("2.�α���");
			System.out.println("3.���̵�ã��");
			System.out.println("4.��й�ȣã��");
			int ���� = scanner.nextInt();
			if( ���� == 1 ) { member.signup(); }
			if( ���� == 2 ) { 
			
				Member logmember = member.login();
				
				if( logmember == null ) { return;}
				while(true) {
					System.out.println("1.ȸ������");
					System.out.println("2.Ŀ�´�Ƽ[�Խ���]");
					System.out.println("3.�α׾ƿ�");
					int ����2 = scanner.nextInt();
					if( ����2 == 1 ) { logmember.infomember();  }
					if( ����2 == 2 ) { 		 }
					if( ����2 == 3 ) { break; }
				}
			}
			if( ���� == 3 ) { member.findid(); }
			if( ���� == 4 ) { member.findpassword(); }
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
