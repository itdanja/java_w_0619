package Day09_Board;

import java.util.Scanner;

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
		// 1. ������ ȸ������ ���ϸ��� 
		
		// 2. ���Ͽ� ���� 
		
	}
	// 2. ���Ϻ�����  [ ���϶��̺귯�� ]
	public void mailsend( String recipientmail , int type ) {
								// �޴»������		// ���ϳ��� ����
		
		
	}
	// 3. �α��� 
	// 4. ���̵�ã�� 
	// 5. �н�����ã��
	// 6. ȸ��Ż��
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
