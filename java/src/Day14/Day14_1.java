package Day14;

import java.util.Scanner;

public class Day14_1 {

	// API Ŭ����
	
	public static void main(String[] args) {
		
		// String Ŭ���� : ����Ʈ => ���ڿ� ��ȯ Ŭ���� 
			// ��Ʈ�� : ������ ��� �帧 
				// ���� : ����Ʈ 
			// ����Ʈ => ���� ��ȯ 
				// �ƽ�Ű�ڵ� // �����ڵ� �� 
		
		// 1. ���ڿ� ó���ϴ� ��� 
			// 1. ����Ʈ�迭�� ������ ����Ʈ ���� 
		byte[] ����Ʈ�迭 = { 72, 101 , 108 , 108 , 111 , 32 , 74 , 97 , 118 , 97 };
							// H e  l      l       o   ����   J   a      v   a
			// 2. ����Ʈ�� => String ��ȯ [ ������ ]
		String ���ڿ�1 = new String( ����Ʈ�迭 );
		//Ŭ������ ��ü�� = new ������()
		System.out.println("���ڿ�1 : " + ���ڿ�1 );
		
		String ���ڿ�2 = new String( ����Ʈ�迭 , 6 , 4  );
											//���� , �� 
		System.out.println(" �Ϻ� ��ȯ : " + ���ڿ�2 );
	
		// 2. Ű���尡 ���ڿ� ó���ϴ� ���
			byte[] ����Ʈ�迭2 = new byte[100];
			// 1. �Է���ġ [ System.in ] 
			try {
				int count = System.in.read( ����Ʈ�迭2 ); // Ű����� �о�� ����Ʈ�� ����Ʈ�迭�� ���� 
				// Ű���� ��Ŵ����� ����Ʈ // ����ó�� ������ �߻� 
				// count���� ��Ȱ : �о�� ����Ʈ ���� // ���ڿ� ���п����� ���Ǵ� \r\n �ڵ� �߰�
				// String ���ڿ�3 = new String( ����Ʈ�迭2 ); // �Էµ� ����Ʈ �� ���� ����Ʈ������ �������� ��ȯ
				String ���ڿ�3 = new String( ����Ʈ�迭2 , 0 , count-2 ); // �Էµ� ����Ʈ�� ��ȯ 
															// count-2 :  \r\n ����
				System.out.println(" Ű���� �о�� ���ڿ� : " + ���ڿ�3 );
				
			}
			catch (Exception e) { }
		// [ Scanner Ŭ���� : �о�� ����Ʈ�� ��ü�� �����ϴ� �޼ҵ�[next,nextint,nextboolean��]�� ���� ����ȯ�� ������ ���� ] 
			
		// �޼ҵ� 
			// 1. ���� ���� [ charAt() ] �μ� : �ε���  ��ȯ : ���� 
			String ���ڿ�4 ="�ڹ� ���α׷���";
			System.out.println(" ���� ���� : " + ���ڿ�4.charAt(3) );
		
				// Ȱ�� : Ư�����ڿ����� Ư�����ڸ� ���� 
				String �ֹε�Ϲ�ȣ = "880420-2541225";
				char ���� = �ֹε�Ϲ�ȣ.charAt(7);
				switch( ���� ) {
					case '1' : 
					case '3' :
						System.out.println("���� �Դϴ� ");
						break; // switch Ż�� 
					case '2' :
					case '4' :
						System.out.println("���� �Դϴ� ");
						break;
				}
				
			// 2. ���ڿ� �� [ equals() ]  �μ� : �񱳴�� / ��ȯ : true , false
			String ���ڿ�5 = new String("���缮");
			String ���ڿ�6 = "���缮";
				// ��ü ����� �޸� �Ҵ� ������ : new 
					// ���� : �⺻�ڷ��� , String 
			
				// ���ڿ��� �񱳿����� �Ұ� 
				if( ���ڿ�5 == ���ڿ�6 ) {System.out.println(" �� ���ڴ� == ���� ");}
				if( ���ڿ�5.equals(���ڿ�6) ) {System.out.println(" �� ���ڴ� equals() ");}
				if( !���ڿ�5.equals(���ڿ�6) ) {System.out.println(" �� ���ڴ� !equals() ");}
				
			// 3. ����Ʈ�迭 ��ȯ [ getBytes ] �μ� : [����]���ڵ�Ÿ�� / ��ȯ : ����Ʈ�迭
			String ���ڿ�7 = "�ȳ��ϼ���abc";
							// �ѱ� : 2����Ʈ	 // ����,Ư������ : 1����Ʈ 
				// ���ڿ� => ����Ʈ�迭 
			byte[] ����Ʈ�迭3 =���ڿ�7.getBytes();
			System.out.println(" ���� : " + ����Ʈ�迭3.length );
			String ���ڿ�8 = new String( ����Ʈ�迭3 );
			System.out.println(" ��ȯ : " + ���ڿ�8 );
				
				// �ѱ� ���ڵ� Ÿ�� : EUC-KR , UTF-8 [ ����Ʈ => �ѱ� ��ȯ�ϴ� ������ ����� ] 
			
				try {
					
					byte[] ����Ʈ�迭4 = ���ڿ�8.getBytes("EUC-KR"); // ����ó�� ������ �߻�		
					System.out.println(" EUC-KR ���� : " + ����Ʈ�迭4.length ); // �ѱ� : 2����Ʈ 
					
					byte[] ����Ʈ�迭5 = ���ڿ�8.getBytes("UTF-8");
					System.out.println(" UTF-8 ���� : " + ����Ʈ�迭5.length );	// �ѱ� : 3����Ʈ 
					
				}catch (Exception e) {}
		
			// 4. ���ڿ� ã�� [ indexOf ] �μ� : �˻����  / ��ȯ : �˻������ �ε�����ġ��ȣ
			String ���ڿ�9 = "�ڹ� ���α׷���";
			System.out.println(" ��� ��ġ : " + ���ڿ�9.indexOf("���α׷���")) ;
			System.out.println(" ��� ��ġ : " + ���ڿ�9.indexOf("c���") );
				
				// Ȱ�� 
				String ���� ="����ִ� ���̽� �Թ�����";
				
				Scanner scanner = new Scanner(System.in);	
				System.out.print(" Ű���� : "); String Ű���� = scanner.next();
				
				if( ����.indexOf(Ű����) == -1 ) {
					System.out.println(" Ű������ �ش��ϴ� å�� �ƴմϴ� ");
				}else {
					System.out.println(" Ű������ �ش��ϴ� å �Դϴ� ");
				}
			
			// 5. ���ڿ� ���� [ length() ] : ��ȯ : ���ڿ��� ���ڼ� [ �������� ]
			System.out.println("���� ���ڼ� : " + ����.length() );
			
				// Ȱ�� : ��ȿ���˻� 
				System.out.print("�н�����[4����] �Է�:"); 
				String �н����� = scanner.next();
				
				if( �н�����.length() == 4 ) {
					System.out.println(" �� �Է��߽��ϴ� ");
				}else {
					System.out.println(" 4���� �Է����ּ��� ");
				}
			
			// 6. ���ڿ� �߶󳻱� [ substring() ] �μ� : �ڸ�����ġ / ��ȯ : ��ġ ������ ���ڿ�  
			System.out.println( �ֹε�Ϲ�ȣ.substring(7));
			System.out.println( �ֹε�Ϲ�ȣ.substring(0,6) );
			
			// 7. ���ڿ� ���� [ split() ] �μ� : ���� ���� / ��ȯ : ���ڿ��迭 
			String[] ���ں��� = �ֹε�Ϲ�ȣ.split("-"); // - �������� ���ؽ� 2���� ���ڿ� 
			System.out.println(" ������ ù��° ���ڿ� :" + ���ں���[0] );
			System.out.println(" ������ �ι�° ���ڿ� :" + ���ں���[1] );
			
			// 8. ���ڿ� ġȯ [ replace() ] �μ� : ��ü�ҹ���,���ο�� / ��ȯ : ��ü�� ���ڿ� 
			String ���ڿ�10 ="�ڹ� ���α׷���";
			String ��ü���� = ���ڿ�10.replace("�ڹ�", "java");
									// �ڹٸ� ã�Ƽ� java�� ��ȯ 
			System.out.println(" ��ü �� : " + ���ڿ�10 );
			System.out.println(" ��ü �� : " + ��ü���� );
			
			// 9. ��/�ҹ��� ��ȯ [ toLowerCase() , toUpperCase() ] 
			String ���ڿ�11 = "Java Programming";
			System.out.println(" �ҹ��� : " + ���ڿ�11.toLowerCase() );
			System.out.println(" �빮�� : " + ���ڿ�11.toUpperCase() );
			
			// 10. ���� ���� [ trim() ] : �յ� ���� ���� 
			String ���ڿ�12 = "           �ڹ�          ���α׷���       ";
			System.out.println(" ���� ���� : " +���ڿ�12.trim() );
			
			// 11. ���ڿ� ��ȯ [ valueOf() ] : ���ڿ��� ��ȯ  
			String ���ڿ�13 = String.valueOf(10); // int�� ---> String 
			System.out.println(" int -> String : " + ���ڿ�13 );
			
			String ���ڿ�14 = String.valueOf(10.5); // double ---> String 
			System.out.println(" double -> String : " + ���ڿ�14 );
			
			String ���ڿ�15 = String.valueOf(true); // boolean ---> String 
			System.out.println(" boolean -> String : " + ���ڿ�15 );
			
			// 12. ���ڿ� ���Կ���[ contains( ) ] : �μ� : �˻���� / ��ȯ : ���Կ��� [true/false ]
			System.out.println("���� ���Կ��� : " + ����.contains("���̽�") );
			
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
		
		
		
		
	}
	
}
