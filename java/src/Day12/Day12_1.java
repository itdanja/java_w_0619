package Day12;



public class Day12_1 {
	
	// ���׸�
		// �迭 = [ ] �ε��� ��� : �迭�� ����Ǵ� ������ȣ 
		// ����Ʈ = < > ���׸� ��� 
		// ���� : �Ű�Ŭ���� : Ŭ������ ���� ����Ǵ� ���
			// Ŭ���������� �ڷ��� ���� ����Ǵ� ��ü ������ 
		// ���� : 
			// Ŭ������<���׸�1>
			// Ŭ������<���׸�1,���׸�2>
			
			// Ŭ����< ���׸������� Ŭ������ > ��ü�� = new Ŭ������<��������>();
		
	public static void main(String[] args) {
		
		// 1. ���׸� ���� ��� 
		box ����1 = new box(); // box��ü ���� 
		����1.setobject("����ڽ�");
		String name = (String)����1.getobject();
		System.out.println(name);
		
		����1.setobject( new ���() );
		��� ��� = (���)����1.getobject();
		System.out.println(���);
		
		// 2. ���׸� ����ϴ� ��� 
		box2<String> ����2 = new box2<>();
		����2.set��ü("����ڽ�");
		String name2 = ����2.get��ü();
		System.out.println(name2 );
		
		box2<Integer> ����3 = new box2<Integer>();
		����3.set��ü(10);
		int num = ����3.get��ü();
		System.out.println(num);
		
		box2<���> ����4 = new box2<>();
		����4.set��ü( new ���() );
		System.out.println( ����4.get��ü() );
		
		////////////////////////////////////////////////
		// 3. ��Ƽ ���׸� 
		��ǰ<�ڷ�����, String> ��ǰ1 = new ��ǰ<>();
		��ǰ1.setKind( new �ڷ�����() );
		��ǰ1.setModel("����Ʈ�ڷ�����");
		
		System.out.println(" ��ǰ1 : " + ��ǰ1.getKind() + ��ǰ1.getModel() );
		
		��ǰ<�ڵ��� , String> ��ǰ2 = new ��ǰ<>();
		��ǰ2.setKind( new �ڵ���() );
		��ǰ2.setModel("�����ڵ���");
		
		System.out.println(" ��ǰ2 : " + ��ǰ2.getKind() + ��ǰ2.getModel() );
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
