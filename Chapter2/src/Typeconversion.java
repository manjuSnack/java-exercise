/**
 * 
 * @author manjuSnack
 * 
 * Example 2-3 타입변환 & Check Time Example 2, 5
 * 
 * 자동 타입 변환과 강제 타입 변환이 들어 있는 코드이다. 실행 결과는 무엇인가?
 *
 */
public class Typeconversion {

	public static void main(String[] args) {
		byte b = 127;
		int i = 100;
		System.out.println(b+i);
		System.out.println(10/4);
		System.out.println(10.0/4);
		System.out.println((char)0x12340041);
		System.out.println((byte)b+i);
		System.out.println((int)2.9 + 1.8);
		System.out.println((int)(2.9 + 1.8));
		System.out.println((int)2.9 + (int)1.8);		
		// Check Time page.75. example 2.
		final int YEAR = 365;
		final int MONTH = 30;
		final int WEEK = 7;
		// Check Time page.75. example 5.
		System.out.println((byte)(128+128) + (int)22.9);
	}

}
