package Day06;

import java.util.Scanner;

public class �Խù� {

	// �ʵ�
		String ����;
		String ����;
		String �ۼ���;
		int ��ȸ��;
		
	// ������ : ��ü�� �ʱⰪ 
		// 1. �������
		public �Խù�() {}
		// 2. Ǯ������
		public �Խù�( String ���� , String ���� , String �ۼ��� , int ��ȸ�� ) {
			this.���� = ����;
			this.���� = ����;
			this.�ۼ��� = �ۼ���;
			this.��ȸ�� = ��ȸ��;
		}
	// �޼ҵ� [ �̸� �ۼ��� �ڵ� => �ڵ��� ��Ȱ��  ] 
		// 1. �Խù� ��� 
		public static void �Խù����() {
			System.out.println("----> �Խù� ��� ȭ��");
			System.out.print(" ���� : "); 
				String ���� = Day06_4_�Խ���.�Է°�ü.next();
				
			System.out.print(" ���� : "); 
				String ���� = Day06_4_�Խ���.�Է°�ü.next();
				
			System.out.print(" �ۼ��� : "); 
				String �ۼ��� = Day06_4_�Խ���.�Է°�ü.next();
				
			// �Է¹��� ������ ��ü ���� [ ������ ] 
			�Խù� temp = new �Խù�(����, ����, �ۼ���, 0);
			Day06_4_�Խ���.�Խù����.add(temp);
					// ����Ʈ��.add( ��ü�� ) : ����Ʈ�� ��ü �߰� 
		}
		// 2. �Խù� ��� 
		public static void �Խù���� () {
			System.out.println("��ȣ\t����\t\t\t�ۼ���\t��ȸ��");
			// ��� �Խù� ��� 
			for( int i = 0 ; i<Day06_4_�Խ���.�Խù����.size() ; i++ ) {
				System.out.println(i+"\t"+Day06_4_�Խ���.�Խù����.get(i).���� 
						+"\t\t\t"+Day06_4_�Խ���.�Խù����.get(i).�ۼ���
						+"\t"+Day06_4_�Խ���.�Խù����.get(i).��ȸ��);
			}
		}
		// 3. �Խù� ���� 
		
		// 4. ��ȸ�� ���� 
		public void ��ȸ������() {
			this.��ȸ��++;
		}
		// 5. �ش� �Խù� �󼼺��� 
		public static void �Խù��󼼺���( int ��ȣ ) {
								// �������ϴ� �Խù��� ��ȣ
			�Խù� temp = Day06_4_�Խ���.�Խù����.get(��ȣ);
				// ���õ� �Խù��� ��ȸ�� ���� 
				temp.��ȸ������();
				
			System.out.println("[ ���� ] : " + temp.����);
			System.out.println("[ �ۼ��� ] : " + temp.�ۼ��� + "    [ ��ȸ�� ] : "+temp.��ȸ��);
			System.out.println("[ ���� ] : " + temp.����);
		}
		


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
