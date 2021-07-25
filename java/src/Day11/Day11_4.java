package Day11;

import java.awt.Toolkit;

public class Day11_4 {
	
	// 스레드 :  프로세스내 코드를 읽어[실행]주는 역할
		// 프로세스 : [ code , data , stack , heap ] 연속적인 프로그램 
			// 프로그램 : 명령어[코드]들의 집합 
	
	// 멀티스레드 : 병행처리 
		// 컴퓨터 병행처리 : 멀티스레드인 경우 순차적으로 번갈아가면서 처리 
			// 스케줄링 : 멀티스레드인 경우 스레드의 처리순서는 cpu내 배정 
				// java내에서 스케줄링 컨트롤X
	
	// 상속 vs 인터페이스 차이 
		// 상속 : 클래스가 부모클래스로부터 상속받아 자식클래스에서 설계를 연장하기
			// 부모클래스의 메모리를 이어쓰기 
			// 목적 : 대규모 설계 , 빠른 설계 
			// extends 뒤에 하나의 클래스만 가능 
	
		// 인터페이스 : 추상된 메소드를 해당 클래스에서 정의하여 사용하기 
			// 목적 : 동일한 목적하의 동일한 기능수행
			// implements 뒤에 여러개의 인터페이스 가능 
	
	// 1. main 메소드 : main메소드에 main스레드 내장
	// 2. Thread 클래스 
			// run메소드에 실행코드 정의 
			// start 메소드 : run 메소드 호출
	// 3. Runnable 인터페이스 
	
	public static void main(String[] args) {
		
		// 예1) 단일 스레드[] 
		// 소리1 
		Toolkit toolkit = Toolkit.getDefaultToolkit();
			// 경고음 관련 메소드 제공해주는 클래스 
		for( int i = 0 ; i<5 ; i++ ) {
			
			toolkit.beep(); // 경고음
				// 소리가 1번 실행되기전에 for문이 먼저 5번 회전 
			try {
				// 스레드 1초간 일시정지
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
		// 출력 1
		for( int i = 0 ; i<5 ; i++ ) { 
			System.out.println("띵");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
		
	System.out.println("---멀티스레드 클래스 시작 ");
		// 예2) 멀티 스레드 클래스 
		Thread thread1 = new Sound();
		thread1.start(); // 스레드내 run 메소드 호출 => 스레드 실행 시작 
		
		// 출력 2
		for( int i = 0 ; i<5 ; i++ ) { 
			System.out.println("띵");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
		
		// 예3) 멀티 스레드 인터페이스 
	System.out.println("---멀티스레드 인터페이스 시작 ");	
		Runnable runnable = new Sound2(); // 스레드인터페이스에 클래스연결
		Thread thread2 = new Thread(runnable); // 스레드클래스에 인터페이스 연결
		
		thread2.start();
		
		// 출력 2
		for( int i = 0 ; i<5 ; i++ ) { 
			System.out.println("띵");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
		
		// 예4) 소규모 스레드 인터페이스 
	System.out.println("---멀티스레드 인터페이스 시작 ");		
		Thread thread3 = new Thread( new Runnable() {
			
			@Override // 스레드 실행과정 정의 
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for( int i = 0 ; i<5 ; i++ ) {
					toolkit.beep(); // 경고음 
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {}
				}
			}
		} ); // 스레드 생성자 end 
		
		thread3.start(); // run 호출
		
		// 출력 3
		for( int i = 0 ; i<5 ; i++ ) { 
			System.out.println("띵");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
		
}
