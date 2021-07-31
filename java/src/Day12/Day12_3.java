package Day12;

import java.util.Arrays;
import java.util.Scanner;

public class Day12_3 {
	
	// ����1  
	//  ���ѷ��� �̸�,���� �Է¹޾� ��� ��ġ 
	// ��� Ŭ���� < ���׸� > ��ܸ��
	
			// ���[super]	����Ŭ����[sub] : ��ġ����� [ ���̰� 8 �̸� ] 
			//				�л�Ŭ����[sub] : �л���� [ ���̰� 20 �̸� ] 
			//				����Ŭ����[sub] : ���θ�� [ ���̰� 20�� �̻� ] 
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// 1. ���Ƹ��
		Member<Child> childlist = new Member<>("���Ƹ��");
		Member<Student> studentlist  = new Member<Student>("�л����");
		Member<Adult> adultlist = new Member<>("���θ��");
		
		while(true) {
			System.out.println(" ��� ���� ���α׷� ");
			// ��� ��� 
				memberprint(childlist);
				memberprint(studentlist);
				memberprint(adultlist);
			System.out.print(" 1. �̸� : "); String name = scanner.next();
			System.out.print(" 2. ���� : "); int age = scanner.nextInt();
			
			if( age < 8 ) {
				childlist.add( new Child(name, age) );
			}
			else if( age < 20 ) {
				studentlist.add( new Student(name, age) );
			} 
			else {
				adultlist.add( new Adult(name, age) );
			}
		}
	} // main �� 
	
	public static void memberprint( Member<?> list ) {
		
		System.out.println( list.getMembername()+ " ��� : "+ Arrays.toString( list.getMemberlist() ));
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
