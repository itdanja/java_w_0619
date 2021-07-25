package Day11;

public class Day11_5 {
	
	// 3개의 스레드를 실행하여 3개의 출력을 동시에 출력 
		//1. 강아지소리 출력 [ 1초간격으로 5번 출력 ]
		//2. 고양이소리 출력 [ 1초간격으로 5번 출력 ]
		//3. 호랑이소리 출력 [ 1초간격으로 5번 출력 ]
	
	public static void main(String[] args) {
		
		Thread 강아지소리 = new Thread( new Runnable() {
			@Override
			public void run() {
				for( int i = 0  ; i<5 ;i++ ) {
					System.out.println("강아지소리" + i );
					try {
						Thread.sleep(1000); // 1000 : 1초   2000:2초
					} catch (InterruptedException e) {
						
					}
				}
			}
		}); 
		Thread 고양이소리 = new Thread( new Runnable() {
			
			@Override
			public void run() {
				for( int i = 0  ; i<5 ;i++ ) {
					System.out.println("고양이소리"+i);
					try {
						Thread.sleep(1000); // 1000 : 1초   2000:2초
					} catch (InterruptedException e) {}
				}
				
			}
		});
		Thread 호랑이소리 = new Thread( new Runnable() {
			@Override
			public void run() {
				for( int i = 0  ; i<5 ;i++ ) {
					System.out.println("호랑이소리"+i);
					try {
						Thread.sleep(1000); // 1000 : 1초   2000:2초
					} catch (InterruptedException e) {}
				}
				
			}
		});
		강아지소리.start(); // run메소드 호출 
		고양이소리.start();
		호랑이소리.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		고양이소리.stop(); // 스레드 정지
		
	}
	
	

}
