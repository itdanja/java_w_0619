package Day13;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import jdk.javadoc.internal.doclets.formats.html.resources.standard;


public class Day13_6 {
	
	public static void main(String[] args) {
		
		// ���� [ Stack ] : LIFO [Last in First out ] : ���Լ��� 
			// ���������� �Էµ� �����Ͱ� ���� ��� 
			// ���� ������ ���� 
			// �� ) ���λ���  , ctrl+z[�ڷΰ������Ű] ��
				//�޼ҵ� : Vector Ŭ���� ����
					// 1. .push( ��ü ) : ��ü �߰� 
					// 2. .pop( ��ü ) : ��ü ���� 
		
		// ť [ Queue ] : FIFO [ First in First out ] : ���Լ���
			// ���� �Էµ� ������ ���� ��� 
			// �Ա� ���� ��� ���� ����
			// ��) �ټ���� , ����ö �� 
				// Queue�������̽� =  new LinkedList<>();
					// 1. .offer( ��ü ) : ��ü �߰� 
					// 2. .poll( ��ü ) : ��ü ���� 
		
		// ��1 ) Stack[����Ŭ����] <----- Vector[����Ŭ����]
		Stack< ���� > ��������= new Stack<>();
		
		��������.push( new ����(100) );
		��������.push( new ����(200) );
		��������.push( new ����(300) );
		System.out.println(" stack ȣ�� : " + �������� );
		System.out.println(" stack ��ü �� : " + ��������.size() );
		
		// ��� 
		for( ���� temp : �������� ) {
			System.out.println( temp );
			System.out.println( temp.���� );
		}
		//���� 
		��������.pop(); // ���� [ *���������� ���� �����ͼ����� ���� ]  
		
		// ��� 
		for( ���� temp : �������� ) {
			System.out.println( temp );
			System.out.println( temp.���� );
		}
		// �ϳ��� ����ϸ� ���� 
		while( !��������.isEmpty() ) {
			���� �����ȵ��� = ��������.pop();
			System.out.println(" ���� ���� : " + �����ȵ���.���� );
		}
////////////////////////////////  ť ���� /////////////////////////////////////////////
		
		// 2. Queue �������̽� 
		Queue<����> ��������2 = new LinkedList<>();
		
		��������2.offer( new ����(100) );
		��������2.offer( new ����(200) );
		��������2.offer( new ����(300) );
		
		System.out.println(" ���� ���� " + ��������2 );
		System.out.println(" ���� ������ ������ : " + ��������2.size());
		
		// ��� 
		for( ���� temp : ��������2 ) {
			System.out.println( temp +"/"+ temp.����);
		}
		
		// ���� 
		��������2.poll(); // ���� [ ���� ���� �����ͼ����� ���� ] 
		
		// ��� 
		for( ���� temp : ��������2 ) {
			System.out.println( temp +"/"+ temp.����);
		}
		
		while( !��������2.isEmpty() ) {
			���� �����ȵ��� = ��������2.poll();
			System.out.println(" ���� ���� : "+�����ȵ���.���� );
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
