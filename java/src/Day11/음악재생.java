package Day11;

public class ������� extends Thread {
	
	static boolean sw = true;// ����/���� ���� 
	
	public static void ����stop( boolean msw ) {
		sw = msw; // ����
		if( sw ) { System.out.println("���� ����");}
		else { System.out.println("���� ����"); }
	}
	
	@Override
	public void run() {
		while( sw ) {
			System.out.println("���������");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
