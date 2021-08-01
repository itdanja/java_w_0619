package Day13;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Day13_1 {
	
	// �÷��� �����ӿ�ũ : �������� �޸𸮸� �������ִ� Ŭ�������� ����  
	// �÷��� : ����[�޸𸮼���]  // �����ӿ�ũ : �̸� ������� �ϳ��� Ʋ 
	// �޸� ��� 
		// 1. ���� : �ڷ���������� �޸��Ҵ���� 1�� �����
		// 2. ��ü : Ŭ����������� �޸��Ҵ���� 1�� ����� 
		// 3. �迭 : ������ �ڷ���/Ŭ���� �� ������ �޸� �Ҵ� 
		// 4. ����Ʈ : <���׸�>�� ���� Ŭ���� ������� ������ �޸� �Ҵ� 
	// ���� : 1.List 2.SET 3.MAP
	// ���׸� �̿��� �޸� ���� �ϴ� ��ü 
	// 1. List �÷��� : 1.ArrayList 2.Vector 3.LinkedList
		// 1. ���� 
	
		// 2. �޼ҵ� 
				// 1. ����Ʈ��.add( ��ü ) : ����Ʈ�� ��ü �߰� 
				// 2. ����Ʈ��.get( �ε�����ȣ ) : �ش� �ε�����ȣ ��ġ�� ��ü ȣ�� 
				// 3. ����Ʈ��.remove( �ε�����ȣ ) : �ش� �ε�����ȣ ��ġ�� ��ü ���� 
				// 4. ����Ʈ��.size() : ����Ʈ�� ��ü�� ��ȯ
				// 5. ����Ʈ��.clear() : ����Ʈ�� ��� ��ü ���� 
				// 6. ����Ʈ��.contains(��ü��) : ����Ʈ�� �ش� ��ü�� ���� ���� [ true / false ] 
				// 7. ����Ʈ��.indexOf(��ü��) : ����Ʈ�� ��ü�� ������ȣ[�ε�����ȣ]
				// 8. ����Ʈ��.isEmpty() : ����Ʈ�� ��ü�� ��� �ִ°�� true �ƴϸ� false
	
		// Arraylist vs Vector  :  ����ȭ x vs ����ȭo
		// Arraylist vs LinkedList : �˻����� vs ����,��������
	
	// 2. Set �÷��� : 1.HashSet 2.TreeSet
	// 3. Map : 1. HashMap 2. HashTable 3.TreeMap

	
	public static void main(String[] args) {
		
		
		// 1. LinkedList
		ArrayList<String> arrayList = new ArrayList<>();
			// arraylistŬ������ StringŬ������ ���׸����� �����Ͽ� ����Ʈ ��ü ���� 
		LinkedList<String> linkedList = new LinkedList<>();
		
		Long start;
		Long end;
		
		start = System.nanoTime(); // ���� �ð�[����] �޼ҵ�
		for( int i = 0 ; i<10000 ; i++ ) {
			arrayList.add( 0 , String.valueOf(i) );
		}
		end = System.nanoTime();
		System.out.println("arraylist ������ add �ϴµ� �ɸ��½ð� : "+(end-start));
		
		start = System.nanoTime();
		for( int i = 0 ; i<10000 ; i++ ) {
			linkedList.add( 0 , String.valueOf(i) );
		}
		end = System.nanoTime();
		System.out.println("linkedList ������ add �ϴµ� �ɸ��½ð� :"+(end-start));

		
		
		// ����1  : ����� ���α׷� [ Linkedlist Ŭ���� ��� ] 
			// �޴�[ ���ѷ��� ]
				// ��� ��� ��� 
				// 1. ��� �߰� [ �ο��� �Է¹޾� => ����ȣ[����Ʈ�Ǽ���] �ο�
				// 2. ��� ���� [ ���� �տ� �ִ� ����ȣ ���� ]
				// 3. ��� ��� [ ����ȣ�� �Է¹޾� ��� ]
		
		
		// 1. ����� �ο����� �����ϱ� ���� ����Ʈ ���� 
		LinkedList<Integer> list = new LinkedList<Integer>();
		Scanner scanner = new Scanner(System.in);
		while(true) {
			
			System.out.println("[[[ ��� ��� ]]] ");
			System.out.println("����ο��� : " + list.size() +" ����ð� : " + list.size()*10+"��");
			System.out.println("��ȣ \t �ο��� ");
			for( int i = 0 ; i<list.size() ; i++ ) {
				System.out.println((i+1)+"\t"+list.get(i) );
			}
			System.out.println("1.����߰� 2.������ 3.������� ");
			int ch = scanner.nextInt();
			if( ch==1 ) { 
				System.out.println("�ο��� : "); 
				int count = scanner.nextInt(); 
				list.add(count);
				System.out.println("����ȣ : "+ list.size() );
			}
			if( ch==2 ) {
				System.out.println("��ҹ�ȣ : "); 
				int count = scanner.nextInt();
				list.remove(count-1);  // �ε����� 0���� // ����ȣ 1���� 
			}
			if( ch==3 ) {
				System.out.println("��� ���� ");
				list.remove(0);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
