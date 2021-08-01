package Day13;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import jdk.javadoc.internal.doclets.formats.html.resources.standard;

public class Day13_7 {
	/*
	 * 
	 * 문제
	// Queue 4개 list 1개
			// 1. 전철 밀어내기 
			// 2. 역 : 종점역 -> 용산 -> 서울 -> 구로
			// 3. 종점역 : 전철 3개의 객체 
			// 4. 출발 신호를 받아서 해당역에서 출발해서 다음역에 도착
			// 5. 역당 소요시간 1초
	
		메뉴[무한루프]
			전출 출발 신호 : 1.종점 2.용산 3.서울 4.구로
	 */
	
	// main 밖에서 선언하는 이유 : main 메소드 안에서 선언시 다른 메소드에서 호출 불가 
	public static Queue<String> 종점역 = new LinkedList<>();
	public static Queue<String> 용산역 = new LinkedList<>();
	public static Queue<String> 서울역 = new LinkedList<>();
	public static Queue<String> 구로역 = new LinkedList<>();	
	public static ArrayList< Queue<String> > 전철현황 = new ArrayList<>();
	
	
	public static void main(String[] args) {
			전철현황.add( 종점역 ); 전철현황.add(용산역); 전철현황.add(서울역); 전철현황.add(구로역);
			전철현황.get(0).offer("전철1"); 전철현황.get(0).offer("전철2"); 전철현황.get(0).offer("전철3");
			Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("===========[[ 현재 전철역 상황 ]]==========");
				전철역현황(); 
			System.out.println(" 전철 출발 신호 : 1.종점 2.용산 3.서울 4.구로 ");
			int ch = scanner.nextInt();
			if( ch == 1 ) { 출발신호(0);}
			if( ch == 2 ) { 출발신호(1);}
			if( ch == 3 ) { 출발신호(2);}
			if( ch == 4 ) { 출발신호(3);}
		}
	} // main 끝 
	public static void 전철역현황() {
		// static : main메소드가 가장 먼저 실행 되기때문에 static없는경우 main메소드에서 호출 불가능 
			// 프로그램시작시 메모리 우선할당 => 프로그램 종료시 초기화 
		System.out.println(" 현재 종점역의 전철 현황 : " + 전철현황.get(0) );
		System.out.println(" 현재 용산역의 전철 현황 : " + 전철현황.get(1) );
		System.out.println(" 현재 서울역의 전철 현황 : " + 전철현황.get(2) );
		System.out.println(" 현재 구로역의 전철 현황 : " + 전철현황.get(3) );
	}
	public static void 출발신호(int 역번호) {
		if( 전철현황.get(역번호).isEmpty() ) {
			System.out.println(" [[[ 현재 대기중인 전철이 없습니다 ]]]" );
			return; // 함수 종료 
		}
		String temp = 전철현황.get(역번호).poll(); // 역번호의 전철 나가기 
		System.out.println(" [[ 출발 : " + temp );
		System.out.println(" 소요시간 : 1 초 ");
		try {
			Thread.sleep(1000); // 1초간 대기  // 예외처리 발생 
			if( 역번호+1 >= 전철현황.size() ) 전철현황.get(0).offer(temp);
			전철현황.get(역번호+1).offer(temp); // 다음역에 전철 추가  
			System.out.println("[[ 도착 : "+temp );
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
