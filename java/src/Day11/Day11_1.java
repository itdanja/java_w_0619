package Day11;

public class Day11_1 {
	
	public static void main(String[] args){
		
		
		// ����ó�� : ����[����]�� �߻������� �ش� ���� ó��[��������x] ���ִ� ����
			// ���� : ������ ���α׷� 
				// [ �ڵ�� ������ �ƴ� ����ڰ� ����ġ���� ������ �߻���������� ���α׷� ����ȭ ]
			// ���� : 
				//try{ ���ܰ� �߻��Ұ� ���� �ڵ� } 
				//catch(����Ŭ���� ��ü��){ ���ܰ� �߻���������� �ڵ� }
				//finally{ ���� ���� ������� ������ ����Ǵ� �ڵ� }
		
				// if : �����ڰ� �̹� �˰� �ִ� ���ܰ� ������� 
				// try : ����ġ ���� ���ܰ� ������� 
		
			// ����Ŭ���� : Exception ���� ����Ŭ���� 
					// ArrayIndexOutOfBoundsException
					// NumberFormatException
					// NullPointerException
			// ���ܴ����� 
				// �ش� �ڵ忡�� ���ܸ� ó������ �ʰ� �ٸ��ڵ�� ���� ���ѱ�� 
				// ���� : try�� �ټ� �߻�������� �Ѱ��� ��Ƽ� ó�� 
				
		
		//��1) �迭�� ũ�Ⱑ �����������
		try { // ���ܰ� �߻��Ұ� ���� �ڵ� 
				// 1. ���ܹ߻� ���� ������ �״�� ����  // 2.���ܹ߻� ������� ���ܹ߻��������� catch �̵�
			String[] ���ڿ��迭 = new String[3]; // 3���� String ��ü�� �����ϴ� �迭 ���� 
			
			���ڿ��迭[0] = "���缮";	// [ ] : �ε���    0������ ���������� �����ϴ� ������ȣ 
			���ڿ��迭[1] = "�ŵ���";	
			���ڿ��迭[2] = "��ȣ��";
			System.out.println(���ڿ��迭);
			���ڿ��迭[3] = "������";  // �ڵ�� ������ ���� // �ε����������� ���ܹ߻� => catch �� �̵� 
		
		} catch( ArrayIndexOutOfBoundsException ���ܰ�ü ) {
			System.out.println("���ܹ߻� ���� : " + ���ܰ�ü ); // ���ܹ߻��������� ��ü �ڵ� 
		}
		
		//��2) ����ȯ [ ���� -> ���� ] [ ���� -> ���� ] 
		try {
			String ����1 = "10"; // "10" -> 10 
			String ����2 = "a10";
			
			// ����ȯ 
			System.out.println("����ȯ1 : " + Integer.parseInt(����1)  );
							// Integer.parseInt(����) -> ���ڿ� ��ȯ �޼ҵ� 
			System.out.println("����ȯ2 : " + Integer.parseInt(����2) );
			
		}catch(NumberFormatException ���ܰ�ü2) {
			System.out.println("���ܹ߻� ���� : "+ ���ܰ�ü2);
		}
		
		// ��3 ) null �ϰ�쿡 ������������� ���� 
		try {
			String ����3 = null;
			System.out.println(" ���ڿ�[��ü] ��� : " + ����3 );
			System.out.println(" ���ڿ�[��ü] ���� : " + ����3.toString() );
								// ��ü��.toString() 
		}catch (NullPointerException ���ܰ�ü3 ) {
			System.out.println("���ܹ߻� ���� : " + ���ܰ�ü3 );
		}
		
		// ��4 ) �������� ���ܰ� �߻������� 
		try {
			String[] ���ڿ��迭 = new String[3]; // 3���� String ��ü�� �����ϴ� �迭 ���� 
			System.out.println(���ڿ��迭);
			���ڿ��迭[3] = "������";  // �ڵ�� ������ ���� // �ε����������� ���ܹ߻� => catch �� �̵� 
			
			String ����2 = "a10";
			System.out.println("����ȯ2 : " + Integer.parseInt(����2) );
			
			String ����3 = null;
			System.out.println(" ���ڿ�[��ü] ���� : " + ����3.toString() );
		
		}catch( Exception e ) {
				//  Exception : ��� ����ó�� ���� 
			System.out.println("���ܹ߻� ���� : " + e );
		}finally {
			System.out.println("���ܹ߻� ���� ������� ����Ǵ� �ڵ� ");
		}
		
		// ��5 ) ���� ������ 
		
		try {
			Day11_2.���ܴ�����();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}



}
