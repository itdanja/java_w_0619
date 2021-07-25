package Day11;

import java.awt.Toolkit;

public class Day11_4 {
	
	// ������ :  ���μ����� �ڵ带 �о�[����]�ִ� ����
		// ���μ��� : [ code , data , stack , heap ] �������� ���α׷� 
			// ���α׷� : ��ɾ�[�ڵ�]���� ���� 
	
	// ��Ƽ������ : ����ó�� 
		// ��ǻ�� ����ó�� : ��Ƽ�������� ��� ���������� �����ư��鼭 ó�� 
			// �����ٸ� : ��Ƽ�������� ��� �������� ó�������� cpu�� ���� 
				// java������ �����ٸ� ��Ʈ��X
	
	// ��� vs �������̽� ���� 
		// ��� : Ŭ������ �θ�Ŭ�����κ��� ��ӹ޾� �ڽ�Ŭ�������� ���踦 �����ϱ�
			// �θ�Ŭ������ �޸𸮸� �̾�� 
			// ���� : ��Ը� ���� , ���� ���� 
			// extends �ڿ� �ϳ��� Ŭ������ ���� 
	
		// �������̽� : �߻�� �޼ҵ带 �ش� Ŭ�������� �����Ͽ� ����ϱ� 
			// ���� : ������ �������� ������ ��ɼ���
			// implements �ڿ� �������� �������̽� ���� 
	
	// 1. main �޼ҵ� : main�޼ҵ忡 main������ ����
	// 2. Thread Ŭ���� 
			// run�޼ҵ忡 �����ڵ� ���� 
			// start �޼ҵ� : run �޼ҵ� ȣ��
	// 3. Runnable �������̽� 
	
	public static void main(String[] args) {
		
		// ��1) ���� ������[] 
		// �Ҹ�1 
		Toolkit toolkit = Toolkit.getDefaultToolkit();
			// ����� ���� �޼ҵ� �������ִ� Ŭ���� 
		for( int i = 0 ; i<5 ; i++ ) {
			
			toolkit.beep(); // �����
				// �Ҹ��� 1�� ����Ǳ����� for���� ���� 5�� ȸ�� 
			try {
				// ������ 1�ʰ� �Ͻ�����
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
		// ��� 1
		for( int i = 0 ; i<5 ; i++ ) { 
			System.out.println("��");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
		
	System.out.println("---��Ƽ������ Ŭ���� ���� ");
		// ��2) ��Ƽ ������ Ŭ���� 
		Thread thread1 = new Sound();
		thread1.start(); // �����峻 run �޼ҵ� ȣ�� => ������ ���� ���� 
		
		// ��� 2
		for( int i = 0 ; i<5 ; i++ ) { 
			System.out.println("��");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
		
		// ��3) ��Ƽ ������ �������̽� 
	System.out.println("---��Ƽ������ �������̽� ���� ");	
		Runnable runnable = new Sound2(); // �������������̽��� Ŭ��������
		Thread thread2 = new Thread(runnable); // ������Ŭ������ �������̽� ����
		
		thread2.start();
		
		// ��� 2
		for( int i = 0 ; i<5 ; i++ ) { 
			System.out.println("��");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
		
		// ��4) �ұԸ� ������ �������̽� 
	System.out.println("---��Ƽ������ �������̽� ���� ");		
		Thread thread3 = new Thread( new Runnable() {
			
			@Override // ������ ������� ���� 
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for( int i = 0 ; i<5 ; i++ ) {
					toolkit.beep(); // ����� 
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {}
				}
			}
		} ); // ������ ������ end 
		
		thread3.start(); // run ȣ��
		
		// ��� 3
		for( int i = 0 ; i<5 ; i++ ) { 
			System.out.println("��");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
		
}
