package Day11;

import java.awt.Toolkit;


public class Sound2 implements Runnable {
				// implements 인터페이스 연결 [ 추상메소드 정의 ]
	
	@Override // 메소드 재정의 
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for( int i = 0 ; i<5 ; i++ ) {
			toolkit.beep(); // 경고음 
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
	}
}
