package Day17;

import java.net.InetAddress;

public class Day17_1 {
	
	// 네트워크 : 통신망 => 인터넷
		// 인터넷 : TCP/IP 통신 프로토콜 
			// 프로토콜 : 컴퓨터내부 혹은 컴퓨터사이간 통신 규칙[규약]
			// IP[Internet Protocol] : 컴퓨터들간의 인터넷 정보 규약 [ 인터넷주소 == 집주소 ] 
				// * 인터넷 사용하기 위해서 IP 필수 [ WIFI , 모든 인터넷 ] 
				// 127.0.168.5
			// TCP[ Transmission Control Protocol ] : 전송 제어 규약  

			// TCP/IP 모델 [ 컴퓨터들이 서로 정보를 주고받는 데 쓰이는 통신규약 ]
	
		// IP 확인 방법 
			// PC ip 확인 :  윈도우시작버튼 => CMD [ 명령프롬프트] => ipconfig 
			// java에서 ip 확인 : InetAddress 클래스 이용
	
		// 다른 pc의 ip 확인 방법 
			// 네이버 회사의 ip확인 
	
		// 도메인 [ www.naver.com ] 
			// ip[숫자] ----> 도메인[문자] : 숫자인 ip를 문자인 도메인 형식로 변환 
			

	public static void main(String[] args) throws Exception {
		
		// java에서 ip 확인 
		InetAddress inetAddress = InetAddress.getLocalHost(); // 무조건 예외처리 발생 
			// InetAddress : 인터넷주소 관련 메소드를 제공해주는 클래스 
				// .getLocalHost() : [Local : 현재pc] :현재pc의 호스트정보 호출 
		System.out.println(" 현재 pc의 정보객체 : " + inetAddress );
		System.out.println(" 현재 pc의 이름 : " + inetAddress.getHostName() );
		System.out.println(" 현재 pc의 주소 : " + inetAddress.getHostAddress() );
		
		// naver 회사의 ip 확인 
		InetAddress inetAddress2 = InetAddress.getByName("www.naver.com");
		System.out.println(" 네이버 pc의 정보객체 : " + inetAddress2);
		System.out.println(" 네이버 pc의 이름 : " + inetAddress2.getHostName() );
		System.out.println(" 네이버 pc의 주소 : " + inetAddress2.getHostAddress() );
		
		// naver 회사의 다수 ip 확인 
		InetAddress[] inetAddressess = InetAddress.getAllByName("www.naver.com");
		for( InetAddress address : inetAddressess ) {
			System.out.println(" 네이버 배열 pc의 이름 : " + address.getHostName() );
			System.out.println(" 네이버 배열 pc의 주소 : " + address.getHostAddress() );
		}
		
		// google 회사의 ip확인 
		InetAddress inetAddress3 = InetAddress.getByName("www.google.com");
		System.out.println(" 구글 pc의 정보객체 : " + inetAddress3);
		System.out.println(" 구글 pc의 이름 : " + inetAddress3.getHostName() );
		System.out.println(" 구글 pc의 주소 : " + inetAddress3.getHostAddress() );
		
		//facebook 회사의 ip확인 
		InetAddress inetAddress4 = InetAddress.getByName("www.facebook.com");
		System.out.println(" 페이스북 pc의 정보객체 : " + inetAddress4);
		System.out.println(" 페이스북 pc의 이름 : " + inetAddress4.getHostName() );
		System.out.println(" 페이스북 pc의 주소 : " + inetAddress4.getHostAddress() );
		
		// 다른 pc 의 ip 확인 
			// InetAddress address = InetAddress.getByAddress("ip주소")
		
		
	}
	
}				





			
