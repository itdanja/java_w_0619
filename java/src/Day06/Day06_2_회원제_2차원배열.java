package Day06;

import java.util.Scanner;

public class Day06_2_ȸ����_2�����迭 {

	/*
	1. ȸ���� ���α׷� 
		1. �ִ� 100���� ȸ���� �����ϴ� �迭 ���� [ 2�����迭 ]
			1. ���̵� , ��й�ȣ 
		2. ���ѷ��� [ �ʱ� �޴� ] 
			1. ȸ������ [ �ߺ����̵� x ] 
			2. �α��� 
			3. ����
		3. ���ѷ��� [ �α��ν� ]   
			1.ȸ��Ż�� , �н����庯�� , �α׾ƿ�[�ʱ�޴���]
	*/
	public static void main(String[] args) {
		// �Է°�ü 
		Scanner scanner = new Scanner(System.in);
		
		// ȸ��100���� ���̵� �� ��й�ȣ 
		String[][] ȸ����� = new String[100][2];
									// [��=ȸ����][��=���̵�,��й�ȣ]
		// �ʱ�޴� => ���ѷ��� 
		while( true ) {
			System.out.println(" ----- ȸ���� ���α׷� ----- ");
			System.out.println("1.ȸ������ 2.�α��� 3.����");
			int ���� = scanner.nextInt();
			
			if( ���� == 1) { // ȸ������ : ���̵� , ��й�ȣ �Է¹޾� �迭�� ���� 
				System.out.println("----> ȸ������ ȭ�� ---->");
				System.out.print("-> ���̵� : "); 	String ���̵� = scanner.next();
					// �ߺ�üũ
					int �ߺ�üũ = 0; // �ߺ� �⺻�� 0
					for( int i = 0 ; i<ȸ�����.length; i ++ ) {
						
						if( ȸ�����[i][0] !=null && ȸ�����[i][0].equals(���̵�) ) { // ȸ���� �ƹ��� ������ ����
							System.err.println("\n[����] �ߺ��� ���̵� �ֽ��ϴ� ");
							�ߺ�üũ = 1;  // �ߺ��� �ִ°�� 1
							break;
						}
					}

				if( �ߺ�üũ == 0 ) { // �ߺ��� ���°�� 0 => ȸ������ ���� 
					System.out.print("-> ��й�ȣ : ");	String ��й�ȣ = scanner.next();
					// �Է¹��� ���� �迭�� ���� 
					for( int i = 0 ; i<ȸ�����.length ; i++ ) {
						// i�� 0���� �ִ�ȸ������ŭ 1�� ���� �ݺ� 
						if(ȸ�����[i][0] ==null ) { // i��° ���� ���̵� null �̸�
							ȸ�����[i][0] = ���̵�;	// ���̵� ���� 
							ȸ�����[i][1] = ��й�ȣ;	// ��й�ȣ ���� 
							System.err.println("\n[�Ϸ�] ȸ�������� �Ǿ����ϴ� ");
							break; //  ������ �ݺ��� ������ 
						}
					}
				}
			}
			else if( ���� == 2 ) {
				System.out.println("----> �α��� ȭ�� ---->");
				System.out.print("-> ���̵� : "); 	String ���̵� = scanner.next();
				System.out.print("-> ��й�ȣ : "); 	String ��й�ȣ = scanner.next();
				
				int �α��ο��� = 0 ; // �α��� �ߴ��� üũ�ϴ� ���� 
				
				for( int i = 0 ; i<ȸ�����.length ; i++ ) {
					if( ȸ�����[i][0] !=null && ȸ�����[i][0].equals(���̵�) && ȸ�����[i][1].equals(��й�ȣ) ) {
						System.err.println("\n[�α��μ���] �α��� �Ǿ����ϴ� ");
						�α��ο��� = 1;
						while( true ) {
							System.out.println(" ------ ȸ����� ------ ");
							System.out.println("\t ���̵� \t ��й�ȣ ");
								for( int j = 0 ; j<ȸ�����.length ; j++ ) {
									if( ȸ�����[j][0] !=null ) System.out.println( "\t "+ȸ�����[j][0] +" \t " + ȸ�����[j][1] );
								
								}
							System.out.println("1.ȸ��Ż�� 2.�н����庯�� 3.�α׾ƿ�"); 	int ����2 = scanner.nextInt();
							
							if( ����2 == 1 ) { // ���� ȸ���� null�� ���� [ Ż��� ȸ���������� ��ȸ���� ��ĭ�� ���� ]
									// i�� ���� �α��ε� ȸ���� �ε����� ��ȣ 
								ȸ�����[i][0] = null; // ���� ȸ���� null�� ���� 
								ȸ�����[i][1] = null;
								
									// Ż���� ȸ�� �������� �ڿ� �ִ� ȸ������ ��ĭ�� ����
									for( int h = i ; h<ȸ�����.length ; h++ ) {
										
										if(ȸ�����[h+1][0] !=null ) {	// ����ȸ���� ������ 
											ȸ�����[h][0] = ȸ�����[h+1][0]; // ��ĭ�� ���� ���� 
											ȸ�����[h][1] = ȸ�����[h+1][1]; // ��ĭ�� ���� ���� 
										}else { // ������ȸ�� �̸� 
											ȸ�����[h][0] = null;
											ȸ�����[h][1] = null;
											break;
										} 
									}  
									System.out.println("[Ż�𼺰�] ȸ��Ż�� �Ǿ����ϴ� ");
									break; // �α׾ƿ� 
							}
							if(����2 == 2 ) {
								System.out.println("----> �н����� ���� ȭ�� ---->");
								System.out.print("-> ���ο� ��й�ȣ : "); 	
								ȸ�����[i][1] = scanner.next();
								System.out.println("[�н����庯��Ϸ�] �н����尡 ���� �Ǿ����ϴ� ");
								break; // �α׾ƿ� 
							}
							if( ����2 == 3 ) {
								System.err.println("\n[�α׾ƿ�] �α׾ƿ� �Ǿ����ϴ� ");
								break;  // �α׾ƿ� 
							}
						}
					}
				}
				if( �α��ο��� == 0 ) { System.err.println("\n[�α��ν���] ������ ���̵� Ȥ�� ��й�ȣ�� �����ϴ� ");  } 
			}
			else if( ���� == 3 ) { 
				System.err.println("\n[����] �̿����ּż� �����մϴ�"); 
				break; // ���尡��� �ݺ��� Ż�� 
			}
		}
		
		
	}

}
