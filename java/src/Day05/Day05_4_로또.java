package Day05;

import java.util.Random;
import java.util.Scanner;

public class Day05_4_�ζ� {

	// 1. 6�� ���� �Է¹޾� �迭 ���� 
	// 2. 6�� ������ ���� �����ؼ� �迭 ���� 
	// 3. �� �迭�� ���ؼ� ������ ���� ����
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		// 1. �ζ� ��ȣ �迭 
		int[] �ζ� = new int[6]; // int�� 6���� �����Ҽ� �ִ� �迭 
		int[] ��÷��ȣ = new int[6];
		
			// 6���� �Է¹޾� �迭�� ���� 
			for( int i = 0 ; i<6 ; i++) {
				System.out.print( (i+1) + "��° ���� �Է� : " );
				int ��ȣ = scanner.nextInt();
				if( ��ȣ <= 0 || ��ȣ > 45 ) {
					System.out.println("[���] 1~45 ���̸� �Է°��� ");
					i--; // �Է��� ���������� ��������� i �� 1 ���� 
				}else {
					// �ߺ����� = �迭�� �ִ� ��� ��Ҹ� �ϳ��� �� 
					int �ߺ�üũ = 0;
					
					for( int j = 0 ; j<6 ; j++ ) { // �ߺ�üũ ���� for
						if( �ζ�[j] == ��ȣ ) {
							// ������� == ���� �Էµ� ����
							System.out.println("[���] �̹� �Էµ� �� �Դϴ� ");
							i--;  // �Է��� ���������� ��������� i �� 1 ���� 
							�ߺ�üũ = 1; // �ߺ� �������  1
						}
					}
					// for ����ÿ��� �ߺ�üũ�� 0 �̸� ��ȣ�� �迭�� ���� 
					if( �ߺ�üũ == 0 ) �ζ�[i] = ��ȣ;
				}
			}
			
			// �迭 ��� 
			for( int i = 0 ; i<6 ; i++ ) {
				System.out.print((i+1)+"��° ��ȣ : "+�ζ�[i] +"\t");
			}
			System.out.println();
			
			// ��÷��ȣ ���� 
			for( int i = 0 ; i<6 ; i++ ) {
				// �ߺ����� 
				int ��ȣ = random.nextInt(45)+1; // 1~45 ���� ���� 
				int �ߺ�üũ= 0 ;
				for( int j = 0 ; j<6 ; j++ ) {
					if( ��÷��ȣ[j] == ��ȣ ) {
						�ߺ�üũ = 1; i--;
					}
				}
				if( �ߺ�üũ == 0 ) ��÷��ȣ[i] = ��ȣ;
			}
			
			// �迭 ��� 
			for( int i = 0 ; i<6 ; i++ ) {
				System.out.print((i+1)+"��÷ ��ȣ : "+��÷��ȣ[i] +"\t");
			}
			
			// �� �迭 �� => for ��ø 
			int ��÷���� = 0 ;
			for( int i = 0 ;i<6 ;i++ ) {
				for( int j = 0 ; j<6 ; j++ ) {
					if( ��÷��ȣ[i] == �ζ�[j]  ) ��÷����++;
				}
			}
			// ��� : 
			System.out.println();
			System.out.println("��÷���� : " + ��÷����);
			
			// ���� : 2��������Ʈ => ����Ƚ�� �Է¹޾� �Է¹��� ���Ӽ���ŭ �ζ��Ǻ��� 
			
			
			
			
		
		
		
		
		
		
		
		
	}
}
