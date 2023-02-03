/**
 * 
 * @author manjuSnack
 * 
 * Example 2-8 조건 연산
 * 다음은 조건 연산자의 사례이다. 실행 결과는 무엇인가?
 *
 */
public class TernaryOperator {

	public static void main(String[] args) {
		int a = 3, b = 5;
		
		System.out.println("두 수의 차는 "+ ((a>b)?(a-b):(b-a)));
	}
}
