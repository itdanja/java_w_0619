package Day05;

import java.util.Random;
import java.util.Scanner;

public class Day05_3_ƽ���� {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		// �� ���� = ���� 9���� �����Ҽ� �ִ� 1�����迭 
		String[] ������ = { "[ ]" , "[ ]" , "[ ]" , 
							"[ ]" , "[ ]" , "[ ]" , 
							"[ ]" , "[ ]" , "[ ]"  };
		
		String �¸��� =" "; // �¸� �� �� �����ϱ� ���� ���� 
		
		
		while(true ) { // ���� ��ü�� ���ѷ��� [ ��� ���� �ξ����� , �¸��ڰ� ���ð�� ���� ] 
			
			// ������ ��� 
			for( int i = 0 ; i<������.length ; i++ ) {
				System.out.print( ������[i] );
				// 3���� ����Ŀ� �ٹٲ�
				if( i % 3 == 2 ) System.out.println();
			}
			
			// ���� 
				if( �¸���.equals("[O]")) {
					System.out.println("[��������] : �÷��̾� �¸�");
					break; // while ���ӹ��ѷ��� ����
				}
				if( �¸���.equals("[X]")) {
					System.out.println("[��������] : ��ǻ�� �¸�");
					break; // while ���ӹ��ѷ��� ����
				}
	
			while(true) { // �÷��̾� �Է� ���ѷ��� [ �������� �Է��� �Ҷ� ���� ] 
				// �÷��̾ �Է¹޾� �ش� ��ġ�� �� �α�
				System.out.print("[����] �ΰ����ϴ� ��ġ : ");
				int �÷��̾� = scanner.nextInt(); // �ε���
					// 0~8 ���̸� �Է¹ޱ� 
					if( �÷��̾� < 0 || �÷��̾� > 8 ) System.out.println("[���] �˼����� ��ȣ�Դϴ� ");
					else if( !������[�÷��̾�].equals("[ ]") ) {
							// ! : ����[�ݴ�]
						System.out.println("[���] �̹� �� �� �����ϴ� ��ġ �Դϴ� ");
					}else {
						������[�÷��̾�] = "[O]"; // �Է¹��� �ε����� �� �ٲٱ�
						break; // ���� ����� �ݺ��� Ż�� 
					}
					
			} // while 2 end
			
						// ��� �� �ξ�����  => ���� 9�� �̸� 
						int ����˼� = 0;
						for( int i = 0 ; i<9 ; i++ ) {
							if(!������[i].equals("[ ]") ) ����˼�++;
						}
						if( ����˼� == 9 ) {
							// ������ ��� 
							for( int i = 0 ; i<������.length ; i++ ) {
								System.out.print( ������[i] );
								// 3���� ����Ŀ� �ٹٲ�
								if( i % 3 == 2 ) System.out.println();
							}
							System.out.println("[��������] : ���º�");
							break; // while ���ӹ��ѷ��� ����
						}
						
			// ��ǻ�� [ ���� �����ؼ� �� �α� ] 
				// ���� ���� Ŭ���� = Random
			while( true ) {
				Random random = new Random(); // ���� ��ü ���� 
				int ��ǻ�� = random.nextInt(9); // ��ü���� ���� ���� �������� 
					// random.nextInt(); : 0~20������ ������ ���� ����
					// random.nextInt(10); : 0~9������ �������� 
					// random.nextInt( ��������ȣ )+���۹�ȣ;
					// random.nextInt(10)+10;	10 ~ 19���� ��������
				if( ������[��ǻ��].equals("[ ]") ) { ������[��ǻ��] = "[X]"; break; }
			}
			
			// ���� 
				// ���η� �̱�� ��  [ 0 1 2 , 3 4 5 , 6 7 8 ] 
	//				if( ������[0].equals(������[1]) && ������[1].equals(������[2]) )
	//				if( ������[3].equals(������[4]) && ������[4].equals(������[5]) )
	//				if( ������[6].equals(������[7]) && ������[7].equals(������[8]) )
				for( int i = 0 ; i<=6 ; i+=3 ) {
					// i�� 0���� 6���� 3�� �����ϸ鼭 �ݺ� => 0 3 6
					if( ������[i].equals(������[i+1] )&& ������[i+1].equals(������[i+2])) {
						if( !������[i].equals("[ ]") ) �¸��� = ������[i];
					}
				}
				// ���η� �̱�� ��  [ 0 3 6 , 1 4 7 , 2 5 8 ]
				for( int i = 0 ; i<=2 ; i++ ) {
					if( ������[i].equals(������[i+3]) && ������[i+3].equals(������[i+6]) ) {
						if( !������[i].equals("[ ]") ) �¸��� = ������[i];
					}
				}
				// �밢������ �̱�¼� [ 0 4 8 , 2 4 6 ]
				if( ������[0].equals(������[4]) && ������[4].equals(������[8])) {
					if( !������[0].equals("[ ]") ) �¸��� = ������[0];
				}
				if( ������[2].equals(������[4]) && ������[4].equals(������[6])) {
					if( !������[2].equals("[ ]") ) �¸��� = ������[2];
				}

		} // while 1 end 
	} // main end 
} // class end 
