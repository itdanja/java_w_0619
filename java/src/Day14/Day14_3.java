package Day14;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Day14_3 {
	
	public static void main(String[] args) {

		// ��¥/�ð� ���� Ŭ���� 
		
		// Date Ŭ���� 
		Date date = new Date(); // �ý��� ���� ��¥/�ð� ��ü ���� 
		System.out.println(" ���糯¥/�ð� : " + date );
		
		// SimpleDateFormat Ŭ���� : ��¥ ���� ��ȯ 
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yy��MM��dd�� hh:mm:ss");
			//��¥���� : y:����  M:��  d:��  h:�� m:�� s:��
		System.out.println(" ���ĺ��� : " + simpleDateFormat.format(date) );
		
		// Calender Ŭ���� : �޷�Ŭ���� [ �̹� ��ü�� ���� ] 
		Calendar calendar = Calendar.getInstance(); // Ŭ������ �̹� ��ü�� ���� 
		System.out.println(" Ķ���� : " + calendar );
		
			int ���� = calendar.get( calendar.YEAR );
			System.out.println(" ���� Ķ������ ���� : " + ���� );
			System.out.println(" �� : " + (calendar.get( calendar.MONTH)+1) ); // 0:1�� ~~  11:12��
			System.out.println(" ��[������] : " + (calendar.get( calendar.DAY_OF_MONTH) ) );
			System.out.println(" ��[�ִ���] : " + (calendar.get( calendar.DAY_OF_WEEK) ) );
			System.out.println(" ��[������] : " + (calendar.get( calendar.DAY_OF_YEAR )));
			
			if( calendar.get(calendar.DAY_OF_WEEK) == 1  )System.out.println("�Ͽ���");
			if( calendar.get(calendar.DAY_OF_WEEK) == 2  )System.out.println("������");
			if( calendar.get(calendar.DAY_OF_WEEK) == 3  )System.out.println("ȭ����");
			if( calendar.get(calendar.DAY_OF_WEEK) == 4  )System.out.println("������");
			if( calendar.get(calendar.DAY_OF_WEEK) == 5  )System.out.println("�����");
			if( calendar.get(calendar.DAY_OF_WEEK) == 6  )System.out.println("�ݿ���");
			if( calendar.get(calendar.DAY_OF_WEEK) == 7  )System.out.println("�����");
			
			// �ð� 
			System.out.println(" ����/���� : " + calendar.get( calendar.AM_PM ));
				if( calendar.get(calendar.AM_PM) == 0 )System.out.println("����");
				else System.out.println("����");
			
			System.out.println(" �� : "+calendar.get( calendar.HOUR_OF_DAY ) );
			System.out.println(" �� : "+calendar.get( calendar.MINUTE ) );
			System.out.println(" �� : "+calendar.get( calendar.SECOND ) );
			
			
			
	}
	
	
	
}
















