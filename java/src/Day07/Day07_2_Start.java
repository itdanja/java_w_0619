package Day07;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Day07_2_Start {
	
	// 1. �ٸ� Ŭ������ �������� �޸� => static
		// 1. scanner 
	public static Scanner scanner = new Scanner(System.in);
		// 2. ����Ʈ�� �迭 
	public static ArrayList<Member> members = new ArrayList<>();
		// ArrayList : ����Ʈ Ŭ���� 
			// < ���׸� > : ����Ʈ��ü�� ���� ��ü��Ŭ����
				// ����Ʈ��.add( ��ü�� ) : ����Ʈ�� ��ü ��� 
				// ����Ʈ��.size() : ����Ʈ�� ��ü �� 
				// ����Ʈ��.get( �ε�����ȣ ) : ����Ʈ�� �ε�����ȣ�� �ش��ϴ� ��ü ȣ�� 
	public static void main(String[] args) {
		���α׷�����();
	} // main �� 
	
	// ���α׷� ���� �޼ҵ� 
	public static void ���α׷�����() {
		
		// ���Ͽ� �����ϴ� ��� ȸ���� ����Ʈ�� ����
		try {
			FileInputStream fileInputStream = new FileInputStream("c:/java/memberlist.txt");
			byte[] ����Ʈ = new byte[10000]; // ��ü �ϳ��� 100����Ʈ���� 
			
			fileInputStream.read(����Ʈ);
			String ���ȸ�� = new String(����Ʈ); // ����Ʈ => ���ڿ� 
			// ȸ���� ���� 
			String[] ȸ�� = ���ȸ��.split("\n");
					// ���ڿ�.split("��ȣ") : �ش� ��ȣ �������� �и�
	
			// ȸ������ ȸ�������� ���� 
			for( int i = 0 ; i<ȸ��.length-1 ; i++ ) {
				String[] ���� = ȸ��[i].split(",");
				Member member = new Member(����[0], ����[1], ����[2], Integer.parseInt( ����[3] ) ,
										����[4], Integer.parseInt(����[5]), Integer.parseInt(����[6]), ����[7]);
					// ���ڿ� String => ������ int 
						// Integer.parseInt(���ڿ�)
				members.add(member); // �ش� ����� ����Ʈ�� ��� 
			}
		} catch ( Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		// static : �������� : ���α׷� ���۽� �޸��Ҵ�ǰ� ��� ���α׷� ����� �޸� �ʱ�ȭ 
			// ���� : �޸� ȿ�� ���� [ ��� Ŭ������ ���Ǵ� �޸� ���� ]
		while(true) { // ���ѷ��� [ 5�� �Է½� ���� ] 
			System.out.println("\n[[[[ ȸ���� Ŀ�´�Ƽ ]]]]");
			System.out.println("[[[ 1.�α��� 2.ȸ������ 3.���̵�ã�� 4.��й�ȣã�� 5.���α׷�����]]]");
			System.out.print("[[[ ���� : ");	int ���� = scanner.nextInt();
			
			// ��� �ӽ� ��ü
			Member member = new Member();
			
			if( ���� == 1 ) {}
			else if( ���� == 2 ) {
				member.ȸ������();
			}
			else if( ���� == 3 ) {}
			else if( ���� == 4 ) {}
			else if( ���� == 5 ) {
				System.err.println("\n[����] �̿����ּż� �����մϴ�");
				break;
			}
			else {
				System.err.println("\n[���] �˼����� �ൿ�Դϴ�");
			} 
		}
	}
	
} // class �� 
