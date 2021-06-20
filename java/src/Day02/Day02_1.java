package Day02;

public class Day02_1 { // c s
	
	// ctrl+ 스페이바 
	public static void main(String[] args) { // m s
		
		// 연산자 
		// 1. 산술연산자[ 결과 : 값 ]
			// +더하기  -빼기  *곱하기 /나누기 %나머지
			// 문자+문자 : 연결연산자
		System.out.println("더하기: " + (5+3) );
		System.out.println("빼기: " + (5-3) );
		System.out.println("곱하기: " + (5*3) );
		System.out.println("나누기: " + (5/3) );
		System.out.println("나머지: " + (5%3) );
		
		// 2. 비교연산자 [ 결과 : true / false ]
			// > : 초과 			< : 미만		== : 같다  [ = 대입 ] 
			// >= : 이상			<= : 이하		!= : 같지않다 
		System.out.println("초과: " + (5>3) );
		System.out.println("이상: " + (5>=3) );
		System.out.println("미만: " + (5<3) );
		System.out.println("이하: " + (5<=3) );
		System.out.println("같다: " + (5==3) );
		System.out.println("같지않다: "+ (5!=3) );
		
		// 홀수/짝수 판단 
			// 값 % 2 ==0 : 나머지가 0이면 값은 짝수 
			// 값 % 2 ==1 : 나머지가 1이면 값은 홀수 
		System.out.println("3은 홀수 : " + (3%2==1) );
		// 배수 판단 
			// 값 % 수 == 0 : 나머지가 0 이면 해당 값은 그 수의 배수 
		System.out.println("36은 3의배수 : " + (36%3==0) );
		
		// 3. 관계/논리 연산자 [ 비교연산자 2개 이상일경우에 
			// and : && : 이면서 면서 이고 모두 그리고 [ 비교연산자 모두 T => T ]
			// or : || : 이거나 거나 또는 하나라도 [ 비교연산자 하나라도 T => T ]
			// 부정 : ! : true => false     false => true
		System.out.println(" and : " + (1<3 && 3<5 ) ); // T , T => T
		System.out.println(" or : " + (1<3 || 3<2) ); // T , F => T
		System.out.println(" 부정 : " + !(1<3) );
		
		//4. 대입연산자
			// = 대입 [ 오른쪽값 => 왼쪽 으로 대입 ] 
			// += [ 오른쪽값을 왼쪽에 더한후에 왼쪽에 대입 ]
			// -= *= /= %=
		int a = 10;
		a += 10;	// a = a + 10
		
		//5. 증감연산자
			// ++ : 1증가   ++변수 : 선위증가	변수++ : 후위증가 	
			// -- : 1감소	--변수 : 선위감소	변수-- : 후위감소 	
		System.out.println( ++a ); // 출력전 증가 // 21
		System.out.println( a++ ); // 출력후 증가 // 21
		System.out.println( a );				// 22
		
		System.out.println( --a ); // 출력전 감소  // 21
		System.out.println( a-- ); // 출력후 감소 	// 21
		System.out.println( a );				// 20
	
//		*문제3 
//		3. 365,420원의 지폐수 세기
//		출력 예) 십만원권 : 3장
//			만원권 : 6장
//			천원권 : 5장
//			백원 : 4개 
//		
		// 변수 : 메모리[ 데이터 저장소 ] 
		int 금액 = 365420;
		System.out.println("십만원권 : " + (금액/100000) + "장" );
			금액 -= (금액/100000) * 100000; // 십만원 단위 빼기
		System.out.println("만원권 : " + (금액/10000) + "장" );
			금액 -= (금액/10000) * 10000; // 만원 단위 빼기 
		System.out.println("천원권 : " + (금액/1000) +  "장" ) ;

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	} // m e
	
} // c e 
