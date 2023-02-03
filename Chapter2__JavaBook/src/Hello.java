/**
 * 
 * @author manjuSnack
 *
 * Example 2-1 자바 프로그램의 기본 구조
 */

public class Hello {
	public static int sum(int n, int m)  {
		return n + m;
	}
	
	public static void main(String[] args) {
		int i = 20;
		int s;
		char a;
		
		s = sum(i, 10);
		a = '?';
		System.out.println(a);
		System.out.println("Hello");
		System.out.println(s);
	}
}
