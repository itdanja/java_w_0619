package Day03;

import java.util.Scanner;

public class Day03_3 {
	
	// ���ӿ��� ���� �̿��ϱ� ���α׷� 
		// ����1 : �Ѹ�ȸ�� [ ���̵� : qwe   ��й�ȣ:1234 ] 
			// �α���â ���� ���̵�� ��й�ȣ �� �Է¹޾� �����Ѱ�� ���� �̿� �ϱ� 
				// �������� ������ �α��� ����
		// ����2 : ���� 5000�� ������ ���� 
				// ��ǰ : 1. ����[100��] 2.����[200��] 3.��ű�[300��]
					// ��ٱ��� : ��ǰ ��ȣ�� �Է¹޾� ��ٱ��� ��� => ����
	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		while(true) { // while �ݺ��� ���� ��ȣ // ���ѷ��� => break ���ѷ��� ����
			
			System.out.println("-----> �α��� â ");
			System.out.print(" ���̵� : "); 	String ���̵� = scanner.next();
			System.out.print(" ��й�ȣ : ");	int ��й�ȣ = scanner.nextInt();

			// ����1 : ���̵�[ qwe ] ��й�ȣ [ 1234 ] �� ��쿡�� �α��� ���� 
				if( ���̵�.equals("qwe") && ��й�ȣ == 1234  ) {
					System.out.println("----> �α��� ����");
					
					// ����2 : ��ǰ �̿��ϱ� 
					int �ݾ� = 5000; // 5000�� �ֱ� 
					int ���౸�ż� = 0;
					int ���ϱ��ż� = 0;
					int ��ű����ż� = 0;
					System.out.println("-----> ��ǰ ���� ");
					
					while(true) {
						System.out.println("1.����[100��] 2.����[200��] 3.��ű�[300��] 4.����");
						int ���� = scanner.nextInt();
						if( ���� == 1 ) { 
							System.out.println("������ ��ٱ��Ͽ� ��ҽ��ϴ�") ; ���౸�ż�++; // ���౸�ż� += 1 // ���౸�ż� = ���౸�ż�+1 
						}
						if( ���� == 2 ) { 
							System.out.println("������ ��ٱ��Ͽ� ��ҽ��ϴ�") ; ���ϱ��ż�++;
						}
						if( ���� == 3 ) { 
							System.out.println("����� ��ٱ��Ͽ� ��ҽ��ϴ�") ; ��ű����ż�++;
						}
						if( ���� == 4 ) {
							System.out.println("----> ��ٱ��� ��Ȳ");
							System.out.println("��ǰ\t����\t�ݾ�");
							if( ���౸�ż� !=0 ) System.out.println("����\t"+���౸�ż�+"\t"+���౸�ż�*100);
							if( ���ϱ��ż� !=0 ) System.out.println("����\t"+���ϱ��ż�+"\t"+���ϱ��ż�*200);
							if( ��ű����ż� !=0 ) System.out.println("��ű�\t"+��ű����ż�+"\t"+��ű����ż�*300);
							if( ���౸�ż� == 0 && ���ϱ��ż� == 0 && ��ű����ż� == 0 ) { System.out.println("*��ٱ��Ͽ� ��ǰ�� �����ϴ�*"); }
							System.out.println(" �� ������ : " + ( (���౸�ż�*100 )+ (���ϱ��ż�*200) + (��ű����ż�* 300)) );
							break; // �ݺ��� Ż�� => ���� ����� while Ȥ�� for �� ��ȣ ������ 
						}
					}
				}else { 
					System.out.println("----> ���̵� Ȥ�� ��й�ȣ�� �ٸ��ϴ� ");
				}
			
		} // while �ݺ��� �� ��ȣ 
			
			
			
			
			
			
			
			
			
			
		
		
			
			
			
			
			
			
			
			
			
			
			
	}
	
	
	
	
	

}
