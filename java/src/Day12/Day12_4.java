package Day12;

import java.util.ArrayList;
import java.util.Vector;

public class Day12_4 {
	
	public static void main(String[] args) {
		
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
		
		// 2. Set �÷��� : 1.HashSet 2.TreeSet
		// 3. Map : 1. HashMap 2. HashTable 3.TreeMap
		
		// 1.Arraylist
		ArrayList<String> arrayList = new ArrayList<>();
			// * �������� String �����Ҽ� �ִ� ����Ʈ ��ü ���� 
			arrayList.add("java");
			arrayList.add("python");
			arrayList.add("database");
			arrayList.add("C++");
		System.out.println(" ����Ʈ ȣ�� : " + arrayList );
		System.out.println(" ù��° ��ü ȣ�� : " + arrayList.get(0) );
		
		arrayList.remove(1); // �ι�° ��ü ���� 
		System.out.println(" ����Ʈ ȣ�� : " + arrayList );
		System.out.println(" ����Ʈ�� ��ü�� : " + arrayList.size() );
		
		// ����Ʈ�� �ݺ��� Ȱ�� 
		for( int i = 0 ; i<arrayList.size() ; i ++ ) {
			System.out.println( arrayList.get(i) );
		}
		//
		for( String string : arrayList ) { // ����Ʈ�� ��� ��ü�� �ϳ��� �ӽð�ü�� �����ϸ鼭 �ݺ�
			// ���׸� Ŭ������ �ӽð�ü : ����Ʈ�� 
			System.out.println( string );
		}
		
		if( arrayList.contains("java") ) {
			System.out.println("����Ʈ�� java�� �ֽ��ϴ� ");
		}else {
			System.out.println("����Ʈ�� java�� �����ϴ� ");
		}
		System.out.println("database�� �ε��� : " +  arrayList.indexOf("database") );
		
		arrayList.clear();
		System.out.println(" ����Ʈ ȣ�� : " + arrayList );
		
		System.out.println(" ���� ����Ʈ�� ��� �ִ��� : " + arrayList.isEmpty() );
		
		
		// 2. Vector Ŭ���� 
			// ArrayList : ����ȭX [ ��Ƽ������ �ƴҰ�� ] : �� ���� �ӵ� 
			// Vector : ����ȭO [��Ƽ������ ���� ] : �� ���� �ӵ� 
				// ����ȭ : ��Ƽ������ ���� �ϳ��� �޼ҵ��� ���� ���� ���� 
					// ����ȭ �ȵɰ�� : �ϳ��� �޼ҵ忡 ���� ������ �����尡 �����ϸ� ���� �߻�
					// ����ȭ ������� : �ϳ��� �޼ҵ忡 ���� ������ �����尡 �����Ұ�� �����ű��
						// ����ȭ�� �ϳ��� �����尡 ��� ó���� => ���������尡 ���� 
		Vector<String> vector = new Vector<>();
		vector.add("java");
		vector.add("python");
		vector.add("database");
		vector.add("c++");
		System.out.println(" ���͸���Ʈ ��� : " + vector );
		System.out.println(" ù��° ��ü ȣ�� : " + vector.get(0) );
		vector.remove(1);// �ι�° ��ü ����
		System.out.println(" ���͸���Ʈ ��� : " + vector );
		System.out.println(" ���͸���Ʈ�� ��ü�� : " + vector.size() );
		
		for( String string : vector ) {
			System.out.println( string );
		}
		
		if( vector.contains("java") ) {
			System.out.println("java�� �����մϴ�");
		}else {
			System.out.println("java�� �����ϴ� ");
		}
		
		System.out.println( "database �ε�����ġ : " + vector.indexOf("database"));
		
		vector.clear();
		
		System.out.println(" ���׸���Ʈ ��� �ִ��� :  " + vector.isEmpty() );
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
