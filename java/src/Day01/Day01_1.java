package Day01; // ��Ű����

// �ּ� : ����ޱ� [ ����x ] 
	// : �����ּ�
	/*    */  // : ������ �ּ�

public class Day01_1 { // c s
			// Object Ŭ�����κ��� ������ ���� ����
				// ��� Ŭ������ object�� ���۵ȴ�
					// 100% Ŭ���� ��� == 100% ��ü���� ��� 
	// { } �ȿ� ���Ե� �ڵ� tab[�鿩����]
	// main �޼ҵ�
		// ctrl+�����̹� : �ڵ��ϼ�
	public static void main(String[] args) { // m s
					// main �޼ҵ� : main �����带 ������ ����
						// ������ : ���μ����� �ڵ带 �о��ִ� ����
							// main {} �ۿ� �ڵ�� ����x
		// ���
			// 1. Ŭ������ ù���ڴ� �빮��
			// 2. �޴� => run => run [ Ctrl+F11 ]
		System.out.println("java");
			// System : �ý��� ���� [ ����� ] Ŭ����
				// . : Ŭ������ ��� ���� ������[ Ư����ȣ ]
					// out : ��°��� ��Ʈ��
						// println("��³���") : ��¸޼ҵ�
							// ; : [��ó�� ���] �ڵ������� ��
		
		// ����1 : println [ �ڵ� �ٹٲ� ���� ]
			// ��ǻ�� ���� : 0,1 [��]
			// " " ����ó�� : Ű����[�̸� ������� �ܾ�/����]�� ������ ��� ����
		System.out.println(7); // ������ ����ó�� x
		System.out.println("java"); // ���ڿ��� ����ó��o
		System.out.println("java7"); // ���ڼ��� ����ó��o
		
		// ����2  : print [ �ڵ� �ٹٲ� ����x ]
		System.out.print(7);
		System.out.print("java");
		System.out.print("java7");
		
		// ����3 : printf [ ����=����=���²ٹ̱�=format ��� ] 
		System.out.printf( "%d" , 7);
		System.out.printf( "%s" , "java");
		System.out.printf( "%s" , "java7");
			// ���� ���� 
				// %d : ���� 
				// %f : �Ǽ� 
				// %s : ���ڿ� 
				// %c : ����
		// ����4 : print , printf ���� 
		System.out.println("java"+7+"�Դϴ�");
				// + ���ϱ� ������ : ���� + ���� ��� 
				// + ���� ������ : ���� + ���� ��� Ȥ�� ���� + ����
		System.out.printf( "%s%d%s" , "java" , 7 , "�Դϴ�");
		System.out.printf( "java%d�Դϴ�" , 7);
			// ���� ���� 
				// \ : ��ȭ��ȣ 
				// \n : �ٹٲ� 
				// \t : �鿩���� 
				// \r : ���� [������ ����]
				// \\ : \
				// \" : "
		
		// ����5  : ����� 
		System.out.print("\n"+7+"\n"+"java\njava7\n");
		System.out.print("\t"+7+"\t"+"java\tjava7\n");
		
		
		// ��Ŭ������ ȭ�� Ȯ��/��� : ctrl+shift+   + Ȥ�� - 
		// ȭ�� ���� : ctrl + [
		
		
		// ����1 : println
		// ��°�� 
		/*
		  		=============�⼮��=============
		  		�̸�		1����	2����	3����
		  		���缮	�⼮		�Ἦ		�⼮
		  		��ȣ��	�Ἦ		�⼮		�⼮
		  		===============================
		 */
		
		System.out.println("===========�⼮��=============");
		System.out.println("�̸�\t1����\t2����\t3����");
		System.out.println("���缮\t�⼮\t�Ἦ\t�⼮");
		System.out.println("��ȣ��\t�Ἦ\t�⼮\t�⼮");
		System.out.println("=============================");

		// ����2 : ����1���� printf
		System.out.printf("============%s============\n" , "�⼮��");
		System.out.printf("�̸�\t1����\t2����\t3����\n");
		System.out.printf("%s\t%s\t%s\t%s\n" , "���缮" , "�⼮" , "�Ἦ" , "�⼮");
		System.out.printf("%s\t%s\t%s\t%s\n" , "��ȣ��" , "�Ἦ" , "�Ἦ" , "�⼮");
		System.out.printf("=============================\n");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	} // m e

	
	
	
	
	
	
	
	
	
	
} // c e