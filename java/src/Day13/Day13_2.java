package Day13;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

import com.sun.tools.jdeprscan.scan.Scan;

public class Day13_2 {
	
	public static void main(String[] args) {
		
		// 2. Set �÷��� : 1.HashSet 2.TreeSet
			// List : ������ �ִ� ���� [ �ߺ� ��� ] 
			// Set : ������ ���� ���� [ �ߺ� �Ұ� ] 
				// �޼ҵ� 
					// 1. .add( ��ü ) : �ߺ� �Ұ��� 
					// 2. .size() : ��ü ��ü�� 
					// 3. .remove(��ü) : �ش� ��ü ���� 
					// 4. .iterator() : set�� ��ü ��ȸ 
						// Iterator �������̽�  : �÷��ǳ� ��� ��� ��ȸ �ϴ� �������̽� 
							// 1. hasNext() : ���� ��� ���� Ȯ�� 
							// 2. next() : ���� ��� ȣ�� 
		
		// 1. HashSetŬ���� 
		HashSet<String> hashSet = new HashSet<>();
			// HashSet Ŭ������ StringŬ������ ���׸����� �����Ͽ� ��ü ����
			// 2. �޼ҵ� 
			hashSet.add("java");
			hashSet.add("python");
			hashSet.add("database");
			hashSet.add("c++");
			hashSet.add("c++"); // ��ü �ߺ� �Ұ��� 
			// ���� ���� ���� 
			System.out.println(" hashset�� ��ü : " + hashSet);
			System.out.println(" hashset�� ��ü�� : " + hashSet.size() );
			System.out.println(" hashset�� ��ü ���� ");
			hashSet.remove("java");// �ε��� ���⶧���� ��ü �̸�
			System.out.println(" hashset�� ��ü : " + hashSet);
			
			// 1. ��� �ҷ����� 
			for( String string : hashSet ) {
				System.out.println(" ��ü : " + string );
			}
			// 2. Iterator �������̽� Ȱ��
				// Iterator : ������ ���� �׸�鿡 �ϳ��� ��ȸ �������̽� 
			Iterator<String> iterator = hashSet.iterator();
			
			while( iterator.hasNext() ) {
							// hasNext() : ���� ��Ұ� ���� ���� [ true / False ] 
				String string = iterator.next();
							// next : ���� ��� ȣ�� 
				System.out.println(" ��ä : " + string );
			}
			
			// ����1 :  HashSet Ŭ���� 
				// 1. 6���� ���ڸ� �Է¹ޱ� set���� [ �ߺ����� ]
				// 2. set����� 6���� ���� ��� 
			
			Scanner scanner = new Scanner(System.in);
			
			HashSet< Integer > set = new HashSet<>();
			
			for( int i = 0 ; i<6 ; i++ ) {
				
				int num = scanner.nextInt();
				if( set.contains(num) ) {
					System.out.println("�ߺ��� ");
					i--;
				}
				set.add(num);
			}
			System.out.println( set );
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
	}

}
