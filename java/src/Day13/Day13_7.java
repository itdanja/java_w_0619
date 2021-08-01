package Day13;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import jdk.javadoc.internal.doclets.formats.html.resources.standard;

public class Day13_7 {
	/*
	 * 
	 * ����
	// Queue 4�� list 1��
			// 1. ��ö �о�� 
			// 2. �� : ������ -> ��� -> ���� -> ����
			// 3. ������ : ��ö 3���� ��ü 
			// 4. ��� ��ȣ�� �޾Ƽ� �ش翪���� ����ؼ� �������� ����
			// 5. ���� �ҿ�ð� 1��
	
		�޴�[���ѷ���]
			���� ��� ��ȣ : 1.���� 2.��� 3.���� 4.����
	 */
	
	// main �ۿ��� �����ϴ� ���� : main �޼ҵ� �ȿ��� ����� �ٸ� �޼ҵ忡�� ȣ�� �Ұ� 
	public static Queue<String> ������ = new LinkedList<>();
	public static Queue<String> ��꿪 = new LinkedList<>();
	public static Queue<String> ���￪ = new LinkedList<>();
	public static Queue<String> ���ο� = new LinkedList<>();	
	public static ArrayList< Queue<String> > ��ö��Ȳ = new ArrayList<>();
	
	
	public static void main(String[] args) {
			��ö��Ȳ.add( ������ ); ��ö��Ȳ.add(��꿪); ��ö��Ȳ.add(���￪); ��ö��Ȳ.add(���ο�);
			��ö��Ȳ.get(0).offer("��ö1"); ��ö��Ȳ.get(0).offer("��ö2"); ��ö��Ȳ.get(0).offer("��ö3");
			Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("===========[[ ���� ��ö�� ��Ȳ ]]==========");
				��ö����Ȳ(); 
			System.out.println(" ��ö ��� ��ȣ : 1.���� 2.��� 3.���� 4.���� ");
			int ch = scanner.nextInt();
			if( ch == 1 ) { ��߽�ȣ(0);}
			if( ch == 2 ) { ��߽�ȣ(1);}
			if( ch == 3 ) { ��߽�ȣ(2);}
			if( ch == 4 ) { ��߽�ȣ(3);}
		}
	} // main �� 
	public static void ��ö����Ȳ() {
		// static : main�޼ҵ尡 ���� ���� ���� �Ǳ⶧���� static���°�� main�޼ҵ忡�� ȣ�� �Ұ��� 
			// ���α׷����۽� �޸� �켱�Ҵ� => ���α׷� ����� �ʱ�ȭ 
		System.out.println(" ���� �������� ��ö ��Ȳ : " + ��ö��Ȳ.get(0) );
		System.out.println(" ���� ��꿪�� ��ö ��Ȳ : " + ��ö��Ȳ.get(1) );
		System.out.println(" ���� ���￪�� ��ö ��Ȳ : " + ��ö��Ȳ.get(2) );
		System.out.println(" ���� ���ο��� ��ö ��Ȳ : " + ��ö��Ȳ.get(3) );
	}
	public static void ��߽�ȣ(int ����ȣ) {
		if( ��ö��Ȳ.get(����ȣ).isEmpty() ) {
			System.out.println(" [[[ ���� ������� ��ö�� �����ϴ� ]]]" );
			return; // �Լ� ���� 
		}
		String temp = ��ö��Ȳ.get(����ȣ).poll(); // ����ȣ�� ��ö ������ 
		System.out.println(" [[ ��� : " + temp );
		System.out.println(" �ҿ�ð� : 1 �� ");
		try {
			Thread.sleep(1000); // 1�ʰ� ���  // ����ó�� �߻� 
			if( ����ȣ+1 >= ��ö��Ȳ.size() ) ��ö��Ȳ.get(0).offer(temp);
			��ö��Ȳ.get(����ȣ+1).offer(temp); // �������� ��ö �߰�  
			System.out.println("[[ ���� : "+temp );
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
