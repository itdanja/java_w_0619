package Day03;

import java.util.Scanner;

public class Day03_4 {
	
	// Ű����ũ ���α׷� [ ���� ���α׷� ] 
		// �Ǹ���ǰ : 1.�ݶ�[500] 2.Ŀ��[600] 3.������[700] 4.���� 
			// ������ ��ǰ�� ��ٱ��Ͽ� ��� 
				// ���� ���� ����� ������ ���� �Է¹ޱ� [ �ܵ� ����� ���� ]
		// ��ǰ��� : �ݶ�[10��]	Ŀ��[10��]	������[10]
			// ��� ������� ������ ��� 
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int �ݶ���� = 10; int Ŀ����� = 10; int ��������� = 10;
		
		while(true) {
			System.out.println("-----> ī�� Ű����ũ �޴� ");
			// ���� ���� / ��ٱ��� , ���
				// �������� : { } �ȿ��� ����� ������ { } ������ ������
					// { } �ȿ��� �ۿ��� ����� ������ { } ������ ��
			int �ݶ󱸸ż� = 0; int Ŀ�Ǳ��ż� = 0; int �����𱸸ż� = 0;
			int �Ѱ����� = 0;
			
			
			while(true) { // ���ѷ���    w s 
				System.out.println("-----> ��ٱ��� ��Ȳ");
			
				if( �ݶ󱸸ż� == 0 && Ŀ�Ǳ��ż� ==0 && �����𱸸ż� == 0 ) { System.out.println("    *** ��ٱ��� ��� ���� *** "); }
				else { 
					 System.out.println("��ǰ��\t���ż���\t�ݾ�");
					 if( �ݶ󱸸ż� != 0 )System.out.println("�ݶ�\t"+�ݶ󱸸ż�+"\t"+�ݶ󱸸ż�*500);
					 if( Ŀ�Ǳ��ż� != 0 )System.out.println("Ŀ��\t"+Ŀ�Ǳ��ż�+"\t"+Ŀ�Ǳ��ż�*600);
					 if( �����𱸸ż� != 0 )System.out.println("������\t"+�����𱸸ż�+"\t"+�����𱸸ż�*700);
					 	�Ѱ����� = (�ݶ󱸸ż�*500) + (Ŀ�Ǳ��ż�*600) + (�����𱸸ż�*700);
					 	System.out.println("----> �� ������ : "+ �Ѱ����� );
				}	
				System.out.println("1.�ݶ�[500] 2.Ŀ��[600] 3.������[700] 4.����");
				int ���� = scanner.nextInt(); // ���ùޱ�
				if( ���� == 1 ) { 
					if( �ݶ���� == 0 ) { System.out.println("[�غ���] ��� �����ϴ�");}
					else { System.out.println("�ݶ��� ��ҽ��ϴ�"); �ݶ󱸸ż�++; }
				}
				if( ���� == 2 ) { 
					if( Ŀ����� == 0 ) { System.out.println("[�غ���] ��� �����ϴ�");}
					else { System.out.println("Ŀ���� ��ҽ��ϴ�"); Ŀ�Ǳ��ż�++; }
				}
				if( ���� == 3 ) { 
					if( ��������� == 0 ) { System.out.println("[�غ���] ��� �����ϴ�");}
					else { System.out.println("�������� ��ҽ��ϴ�"); �����𱸸ż�++; }
				}
				if( ���� == 4 ) { 
					System.out.println(" �� ��ٱ��Ͽ� ��ǰ�� ���� �Ͻðڽ��ϱ�?[y / n]");
					String �������� = scanner.next();
					if( ��������.equals("y") || ��������.equals("Y") || ��������.equals("��") ) {
						
						System.out.println("---->������ �־��ּ���"); 	int �ݾ�  = scanner.nextInt(); 
						// �ݾ��� �����ϸ� ��������
						if( �ݾ� < �Ѱ����� ) { 
							System.out.println("[����]�ݾ��� �����մϴ�");
							System.out.println("---> ���� ����մϴ� ");
							break;
						}else {
							System.out.println("---> �������� ");
							// ��� ���� 
								�ݶ���� -= �ݶ󱸸ż�;
								Ŀ����� -= Ŀ�Ǳ��ż�;
								��������� -= �����𱸸ż�;
							System.out.println("---> �ܵ� : " + (�ݾ� - �Ѱ�����) );
							break;
						}	
					}else {
						System.out.println("----->������ ����մϴ�");
						break;
					}
					
				}

			} // w e
		} // w e 
	} // m e 
} // c e 
