package Day11;

public class Day11_5 {
	
	// 3���� �����带 �����Ͽ� 3���� ����� ���ÿ� ��� 
		//1. �������Ҹ� ��� [ 1�ʰ������� 5�� ��� ]
		//2. ����̼Ҹ� ��� [ 1�ʰ������� 5�� ��� ]
		//3. ȣ���̼Ҹ� ��� [ 1�ʰ������� 5�� ��� ]
	
	public static void main(String[] args) {
		
		Thread �������Ҹ� = new Thread( new Runnable() {
			@Override
			public void run() {
				for( int i = 0  ; i<5 ;i++ ) {
					System.out.println("�������Ҹ�" + i );
					try {
						Thread.sleep(1000); // 1000 : 1��   2000:2��
					} catch (InterruptedException e) {
						
					}
				}
			}
		}); 
		Thread ����̼Ҹ� = new Thread( new Runnable() {
			
			@Override
			public void run() {
				for( int i = 0  ; i<5 ;i++ ) {
					System.out.println("����̼Ҹ�"+i);
					try {
						Thread.sleep(1000); // 1000 : 1��   2000:2��
					} catch (InterruptedException e) {}
				}
				
			}
		});
		Thread ȣ���̼Ҹ� = new Thread( new Runnable() {
			@Override
			public void run() {
				for( int i = 0  ; i<5 ;i++ ) {
					System.out.println("ȣ���̼Ҹ�"+i);
					try {
						Thread.sleep(1000); // 1000 : 1��   2000:2��
					} catch (InterruptedException e) {}
				}
				
			}
		});
		�������Ҹ�.start(); // run�޼ҵ� ȣ�� 
		����̼Ҹ�.start();
		ȣ���̼Ҹ�.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		����̼Ҹ�.stop(); // ������ ����
		
	}
	
	

}
