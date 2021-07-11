package Day08;

public class Day08_6 {
	
	public static void main(String[] args) {
		
		회원 유저1 = new 회원("qwe" , "qwe");
		Vip클래스 유저2 = new Vip클래스("asd", "asd" , "골드");
		관리자클래스 유저3 = new 관리자클래스("zxc","zxc","대리");
		
		유저1.회원정보();
		System.out.println("------------------------");
		유저2.회원정보();
		System.out.println("------------------------");
		유저3.회원정보();
		
		
	}
	

}
