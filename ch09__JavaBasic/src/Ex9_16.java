import static java.lang.System.*;

public class Ex9_16 {

	public static void main(String[] args) {
		int i = 10; // 기본형
		
		// 기본형을 참조형으로 형변환(생략가능)
		Integer intg = (Integer)i;
		Integer intg2 = i;
		Integer intg3 = Integer.valueOf(i); 
		Object obj = (Object)i;
		Object obj2 = i;
		Object obj3 = (Object)Integer.valueOf(i); 
		
		Long lng = 100L;
		Long lng2 = new Long(100L);
		
		int i2 = intg + 10;		
		long l = intg + lng; 	
		
		Integer intg4 = new Integer(20);
		int i3 = (int)intg2; // 참조형을 기본형으로 형변환(생략가능)
		
		Integer intg5 = intg2 + i3;
		
		out.println("i		="+i);
		out.println("intg		="+intg);
		out.println("intg2		="+intg2);
		out.println("intg3		="+intg3);
		out.println("obj		="+obj);
		out.println("obj2		="+obj2);
		out.println("obj3		="+obj3);
		out.println("lng		="+lng);
		out.println("lng2		="+lng2);
		out.println("intg + 10	="+i2);
		out.println("intg + lng	="+l);
		out.println("intg4		="+intg4);
		out.println("intg2		="+i3);
		out.println("intg2 + i3 ="+intg5);		
		
	}

}
