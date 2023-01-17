/**
 * 
 * @author manjuSnack
 *
 * 예제 2-6.
 */

public class Ex2_6 {

	public static void main(String[] args) {
		final int x = 100; // 상수(Constant)
//		x = 200; x는 상수라서 값을 변경할 수 없다.
		double pi = 3.14;
		char ch = 'a';
		String str = "abc";
		
		System.out.println(x);
		System.out.println(pi);
		System.out.println(ch);
		System.out.println(str);
	}

}

/*

🍘 #Chapter 2장. 05장 상수와 리터널

: 상수(Constant)는 한 번만 값을 저장 가능한 변수이며 변수(variable)과는 다르게 이후 변경은 불가능하다. 작성하는 방법은 아래와 같다.

final 변수타입 변수명(대문자) = 초기화할 값;

🍘 리터럴(Literal, 문자 그대로의)

: 상수를 수학적 개념이 아닌 '한 번만 값을 저장하는 변수'라고 의미를 달리 두었기 때문에 Literal을 사용한다. Literal은 그냥 값을 의미한다.

*/