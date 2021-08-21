package Day17;

import java.net.InetAddress;

public class Day17_1 {
	
	// ��Ʈ��ũ : ��Ÿ� => ���ͳ�
		// ���ͳ� : TCP/IP ��� �������� 
			// �������� : ��ǻ�ͳ��� Ȥ�� ��ǻ�ͻ��̰� ��� ��Ģ[�Ծ�]
			// IP[Internet Protocol] : ��ǻ�͵鰣�� ���ͳ� ���� �Ծ� [ ���ͳ��ּ� == ���ּ� ] 
				// * ���ͳ� ����ϱ� ���ؼ� IP �ʼ� [ WIFI , ��� ���ͳ� ] 
				// 127.0.168.5
			// TCP[ Transmission Control Protocol ] : ���� ���� �Ծ�  

			// TCP/IP �� [ ��ǻ�͵��� ���� ������ �ְ�޴� �� ���̴� ��űԾ� ]
	
		// IP Ȯ�� ��� 
			// PC ip Ȯ�� :  ��������۹�ư => CMD [ ���������Ʈ] => ipconfig 
			// java���� ip Ȯ�� : InetAddress Ŭ���� �̿�
	
		// �ٸ� pc�� ip Ȯ�� ��� 
			// ���̹� ȸ���� ipȮ�� 
	
		// ������ [ www.naver.com ] 
			// ip[����] ----> ������[����] : ������ ip�� ������ ������ ���ķ� ��ȯ 
			

	public static void main(String[] args) throws Exception {
		
		// java���� ip Ȯ�� 
		InetAddress inetAddress = InetAddress.getLocalHost(); // ������ ����ó�� �߻� 
			// InetAddress : ���ͳ��ּ� ���� �޼ҵ带 �������ִ� Ŭ���� 
				// .getLocalHost() : [Local : ����pc] :����pc�� ȣ��Ʈ���� ȣ�� 
		System.out.println(" ���� pc�� ������ü : " + inetAddress );
		System.out.println(" ���� pc�� �̸� : " + inetAddress.getHostName() );
		System.out.println(" ���� pc�� �ּ� : " + inetAddress.getHostAddress() );
		
		// naver ȸ���� ip Ȯ�� 
		InetAddress inetAddress2 = InetAddress.getByName("www.naver.com");
		System.out.println(" ���̹� pc�� ������ü : " + inetAddress2);
		System.out.println(" ���̹� pc�� �̸� : " + inetAddress2.getHostName() );
		System.out.println(" ���̹� pc�� �ּ� : " + inetAddress2.getHostAddress() );
		
		// naver ȸ���� �ټ� ip Ȯ�� 
		InetAddress[] inetAddressess = InetAddress.getAllByName("www.naver.com");
		for( InetAddress address : inetAddressess ) {
			System.out.println(" ���̹� �迭 pc�� �̸� : " + address.getHostName() );
			System.out.println(" ���̹� �迭 pc�� �ּ� : " + address.getHostAddress() );
		}
		
		// google ȸ���� ipȮ�� 
		InetAddress inetAddress3 = InetAddress.getByName("www.google.com");
		System.out.println(" ���� pc�� ������ü : " + inetAddress3);
		System.out.println(" ���� pc�� �̸� : " + inetAddress3.getHostName() );
		System.out.println(" ���� pc�� �ּ� : " + inetAddress3.getHostAddress() );
		
		//facebook ȸ���� ipȮ�� 
		InetAddress inetAddress4 = InetAddress.getByName("www.facebook.com");
		System.out.println(" ���̽��� pc�� ������ü : " + inetAddress4);
		System.out.println(" ���̽��� pc�� �̸� : " + inetAddress4.getHostName() );
		System.out.println(" ���̽��� pc�� �ּ� : " + inetAddress4.getHostAddress() );
		
		// �ٸ� pc �� ip Ȯ�� 
			// InetAddress address = InetAddress.getByAddress("ip�ּ�")
		
		
	}
	
}				





			
