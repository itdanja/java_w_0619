package Day06;

import java.util.ArrayList;
import java.util.Scanner;

public class Day06_4_�Խ��� {
	
	// main �ۿ� �����ϴ� ���� : �ٸ� Ŭ�������� �ش� �޸�[����/��ü] �����ϱ� ���� 
		// ���� : main ����Ǳ⶧���� main�޼ҵ尡 �ش� �޸� �ν�X
			// static : main �޼ҵ� ���� �޸� �켱�Ҵ�
				// ���α׷� ����ñ��� �޸� �Ҵ�
				// �������� ��� �ڵ忡 ���Ǵ� �޸� �Ҵ�� 
	static Scanner �Է°�ü = new Scanner(System.in);
	// ����Ʈ 
	static ArrayList<�Խù�> �Խù���� = new ArrayList<>();
		// ArrayList<����Ʈ������Ŭ����> ��ü�� = new ArrayList<>();
			// < > : ���׸�
			// ����Ʈ��.add(��ü��) : ����Ʈ�� ��ü �߰� 
			// ����Ʈ��.get(�ε�����ȣ) : �ش� �ε�����ȣ ��ġ�� ��ü ȣ�� 
	
	// �Խ��� ���α׷�
	public static void main(String[] args) {

		while( true) {
			System.out.println("---- Ŀ�´�Ƽ �Խ��� ----");
				�Խù�.�Խù����(); // �޼ҵ� ȣ�� 
				
			System.out.println("1.�۾��� 2.�Խù����� 3.�Խù�����");
			int ���� = �Է°�ü.nextInt();
			if( ���� == 1 ) {
				�Խù�.�Խù����(); // �޼ҵ� ȣ�� 
			}
			if( ���� == 2 ) {
				System.out.println("----> �Խù� ��ȣ ���� : ");
				int ��ȣ = �Է°�ü.nextInt();
				�Խù�.�Խù��󼼺���(��ȣ);
			}
			if( ���� == 3 ) {}
			
		}
		
	}
	
	
}
