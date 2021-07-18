package Day09_Board;

import java.util.Properties;
import java.util.Scanner;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Member {
	
	// �ʵ� = ����[ ���� , ��ü �� = �޸� ]
	private String id;			// ���̵�
	private String password;	// �н����� 
	private String name;		// �̸�
	private String email;		// �̸���
	private int point;			// ���� 
		// private : ���� Ŭ���������� ȣ�� ���� 
	Scanner scanner = new Scanner(System.in);
	
	// ������ = ��ü������ �ʱⰪ
	public Member() {}
	public Member(String id, String password, String name, String email, int point) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.email = email;
		this.point = point;
	}
	// �޼ҵ� = �ൿ
	// 1. ȸ������
	public void signup() {
		System.out.println("[[[ ȸ������ ]]]");
		// 1.�ߺ�üũ 2. 5~10�ڸ��� ���� 
		System.out.print("[[ id (5~10�̳�) : ");	String id = scanner.next();
			// 1. �ߺ�üũ 
			int result = idcheck(id);
			if( result == -1 ) {System.out.println("[[Ȯ��]] ��� ������ ���̵� �Դϴ� ");}
			else { System.err.println("[[���]] ������ ���̵� �����մϴ�"); return; }
			// 2. ���̵� ���� üũ 
			if( id.length() < 5 || id.length() > 10 ) {
				 System.err.println("[[���]] ���̵�� 5~10�̳��� �����մϴ�"); return;
			}
		// 1.�н����� ���� 1. 4�ڸ��� ����  
		System.out.print("[[ password : ");			String password = scanner.next();
		System.out.print("[[ password confirm : ");	String passwordconfirm = scanner.next();
			// 1. 
			if( !password.equals(passwordconfirm) ) {
				// ! : not : true => false
				System.err.println("[[���]] �н����尡 �ٸ��ϴ�"); return;
			}
			if( password.length() !=4 ) { System.err.println("[[���]] �н������ 4���ڸ� �����մϴ�"); return;  }
		
		System.out.print("[[ name: ");	String name = scanner.next();
		// 1.@ ���� ���� [ contains ] 
		System.out.print("[[ email ");	String email = scanner.next();
		if( !email.contains("@") ) { System.err.println("[[���]] ���̵�@�������ּ� �������� �Է����ּ���"); return;   }
		
		// ȸ������ ���� 
		List.members.add( new Member(id, passwordconfirm, name, email, 0) );

		// 2. ���Ͽ� ����
		int result2 =  FileUtil.filesave( 1 );
		if( result2 != 1) {
			System.err.println("[[ȸ������ ����]] �����ڿ��� ���� ");
		}
		
		System.out.println("[[ȸ������ ����]]");
		
		// 1. ������ ȸ������ ���ϸ��� 
		mailsend( email  , 1 , null );

	}
	// 2. ���Ϻ�����  [ ���϶��̺귯�� ]
	public void mailsend( String recipientmail , int type , String contents ) {
								// �޴»������		// ���ϳ��� ����
		// SMTP : ���� ���� �������� 
		// 1. ���� 
		String host ="smtp.naver.com"; // ������ȸ���� host�� 
			// ���̹� : smtp.naver.com // ���� :  smtp.gmail.com 
		String email = "";	// ���� ���̵�@�������ּ� 
		String password = "";	// �����н����� 
		
		Properties properties = new Properties();
			// Properties : ���� Ŭ���� 
		properties.put( "mail.smtp.host" , host );
		properties.put( "mail.smtp.port" , 587 );	// stmtp ���� ��ȣ // ���̹� 587
		properties.put( "mail.smtp.auth" , "true" );
		// 2. ���� 
		Session session = Session.getDefaultInstance( properties , new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(email, password);
			}
		} );
		// 3. ���� �ۼ� 
		try { // ����[����] �߻��� catch �̵�
			
			MimeMessage message = new MimeMessage( session ); // �޽����� ���� �ֱ� 
			message.setFrom( new InternetAddress(email) ); // �����»���� ���ͳ� �ּ� ��� 
			message.addRecipient( Message.RecipientType.TO , new InternetAddress( recipientmail ) ); // �޴»�� 
			
			if( type == 1 ) { //ȸ������ 
				message.setSubject(" ~~ Ȩ������ ���� ȯ���մϴ� ");	// ���� ���� 
				message.setText(" �پ��� �̺�Ʈ ���� �մϴ� ");	// ���� ���� 
			}
			if( type == 2 ) { // ��й�ȣã�� 
				
				message.setSubject(" ~~ Ȩ������ ȸ������ ��й�ȣ ");	// ���� ���� 
				message.setText("ȸ������ ��й�ȣ : " + contents );	// ���� ���� 
				
			}
			// ����
			Transport.send(message);

		}catch (Exception e) {
			System.err.println("[[���]] ���� ���� ���� ");
		}

	}
	// 3. �α��� 
	public Member login() {
		System.out.print("[[ id (5~10�̳�) : ");	String id = scanner.next();
		System.out.print("[[ password : ");		String password = scanner.next();
		for( Member member : List.members ) {
			if( member.getId().equals(id) && member.getPassword().equals(password) ) {
				System.out.println("[[[ �α��� ���� ]]] : " + member.getId()+"�� �ȳ��ϼ���");
				return member ;
			}
		}
		System.err.println("[[[������ ȸ�������� �����ϴ�]]]");
		return null;
	}
	// 4. ���̵�ã�� 
	public void findid() {
		System.out.print("[[ name: ");	String name = scanner.next();
		System.out.print("[[ email ");	String email = scanner.next();
	
		for( Member member : List.members ) {
			if( member.getName().equals(name) && member.getEmail().equals(email) ) {
				System.out.println("[[[ ȸ������ ���̵� : "+ member.getId() + "]]]");
				return;
			}
		}
		System.err.println("[[[������ ȸ�������� �����ϴ�]]]");
	}
	// 5. �н�����ã��
	public void findpassword() {
		System.out.print("[[ id (5~10�̳�) : ");	String id = scanner.next();
		System.out.print("[[ email ");	String email = scanner.next();
		for( Member member : List.members ) {
			if( member.getId().equals(id) && member.getEmail().equals(email) ) {
				System.out.println("[[[ ȸ������ ��й�ȣ�� �ش� ���Ϸ� �����߽��ϴ� ]]]");
					// ��������
					mailsend( email , 2 , member.getPassword() );
				return;
			}
		}
		System.err.println("[[[������ ȸ�������� �����ϴ�]]]");

	}

	// 7. ���̵�üũ
	public int idcheck( String checkid ) {
		// int : retrun ������ ��ȯ �Ǵ� Ÿ��
						// �μ� : String checkid : �޼ҵ� ������ ������ id
		for( int i = 0 ; i<List.members.size(); i++ ) {
			if( List.members.get(i).getId().equals(checkid) ) {
				// ����Ʈ��[�⺻ȸ��] ���̵�� üũ�� ���̵� �����ϸ�
				return i;
			}
		}
		return -1; // idüũ ���� 
	}
	// 8. ȸ������ �޴�
	public void infomember() {
		
		System.out.println(" [[[���̵� : " + this.id );
		System.out.println(" [[[�̸� : " + this.name );
		System.out.println(" [[[�̸��� : " + this.email );
		System.out.println(" [[[����Ʈ : " + this.point );
		
		System.out.println("1.ȸ������[�̸�,�̸��ϼ���] 2.ȸ��Ż��");
		int ����1 = scanner.nextInt();
		if( ����1 == 1 ) { deletemember();  }
		if( ����1 == 2 ) { updatemember();  }
		
	}
	// 9. ȸ��Ż��
	public void deletemember() {
		
	}
	// 9. ȸ������
	public void updatemember() {
		
	}

	// get , set  �޼ҵ� 
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	

}
