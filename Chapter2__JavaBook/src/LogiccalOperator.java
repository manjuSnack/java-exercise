/**
 * 
 * @author manjuSncak
 *
 * Example 2-7 비교 연산과 논리 연산
 * 다음은 비교 연산자와 논리 연산자의 사례이다. 실행 결과는 무엇인가?
 */
public class LogiccalOperator {

	public static void main(String[] args) {
		System.out.println('a' > 'b');
		System.out.println(3 >= 2);
		System.out.println(-1 < 0);
		System.out.println(3.45 <= 2);
		System.out.println(3 == 2);
		System.out.println(3 != 2);
		System.out.println(!(3 != 2));
		
		System.out.println((3>2)&& (3>4));
		System.out.println((3!=2)||(-1>0));
		System.out.println((3!=2)^(-1>0));
	}

}
