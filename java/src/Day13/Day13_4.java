package Day13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Day13_4 {

	public static void main(String[] args) {
		
		// �÷��� ��ø 
		
		// ��1 ) List �÷��� => map
		
		ArrayList< HashMap<String, Integer> > arrayList = new ArrayList<HashMap<String,Integer>>();
				// ���׸��� �÷��� �ֱ�
			HashMap<String, Integer> map = new HashMap<>();
			HashMap<String , Integer> map2 = new HashMap<>();
			
		arrayList.add(map);
		arrayList.add(map2);
		
		System.out.println( arrayList  );
		
		// ��2 ) map �÷��� => list 
		HashMap< String ,  ArrayList<String> > map3 = new HashMap<String, ArrayList<String>>();
		
			ArrayList<String> list = new ArrayList<>();
		
		map3.put("1", list );
		
		System.out.println( map3 );
		
		// ��3 ) set �÷��� => map
		
		HashSet< HashMap<String, Integer>> set = new HashSet<>();
		
			HashMap<String, Integer> map4 = new HashMap<String, Integer>();
		
		set.add(map4);
		
		System.out.println( set );
		
		// ��3) ��ǰ��� ���� 
		
		HashMap< String , Integer > clothingmap = new HashMap<String, Integer>();
			clothingmap.put("����Ű����", 20);
			clothingmap.put("����Ű����", 10);
			
		HashMap<String , Integer > bagmap = new HashMap<String, Integer>();
			bagmap.put("����Ű����", 10);
			bagmap.put("�Ƶ�ٽ�����", 20);
			
		ArrayList< HashMap<String , Integer> > productlist = new ArrayList<>();
		
			productlist.add( clothingmap);
			productlist.add( bagmap );
			
			System.out.println(" ��� ��Ȳ : " + productlist );
			System.out.println(" �Ƿ� ��� ��Ȳ : " + productlist.get(0) );
			System.out.println(" ���� ��� ��Ȳ : " + productlist.get(1) );
			System.out.println(" �Ƿ� ����Ű���� ��� : " + productlist.get(0).get("����Ű����") );
			System.out.println(" ���� �Ƶ�ٽ����� ��� : " + productlist.get(1).get("�Ƶ�ٽ�����") );
			
	
	}
	
	
}
