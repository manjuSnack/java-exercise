/**
 * 
 * @author manjuSnack
 * 
 * Example 2-6 대입 연산자와 증감 연산자 이용
 * 다음은 대입 연산자와 증감 연산자를 활용하는 사례이다. 실행 결과는 무엇인가?
 *
 */

public class AssignmentIncDecOperator {

	public static void main(String[] args) {
		int a=3, b=3, c=3;
		
		a += 3;
		b *= 3;
		c %= 2;
		System.out.println("a=" + a + ", b=" + b + ", c=" + c);
		
		int d = 3;
		
		a = d++;
		System.out.println("a=" + a + ", d=" + d);
		a = ++d;
		System.out.println("a=" + a + ", d=" + d);
		a = d--;
		System.out.println("a=" + a + ", d=" + d);
		a = d++;
		System.out.println("a=" + a + ", d=" + d);
		

	}

}
