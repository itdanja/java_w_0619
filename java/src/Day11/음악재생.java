package Day11;

public class 음악재생 extends Thread {
	
	static boolean sw = true;// 실행/중지 변수 
	
	public static void 음악stop( boolean msw ) {
		sw = msw; // 중지
		if( sw ) { System.out.println("음악 시작");}
		else { System.out.println("음악 중지"); }
	}
	
	@Override
	public void run() {
		while( sw ) {
			System.out.println("음악재생중");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
