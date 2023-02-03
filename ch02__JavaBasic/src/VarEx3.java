/**
 * 
 * @author manjuSnack
 * 
 * Ch2-6 리터럴(Literal)의 타입과 접미사
 * Ch2-7~8 문자 리터럴(Literal)과 문자열 리터럴(Literal), 문자열 결합
 */
public class VarEx3 {

	public static void main(String[] args) {
		final int score = 100; // 상수에는 타입 앞에 final이라고 적는다.
		
//		boolean power = 0; 타입이 맞지 않아 에러발생
		boolean power = true;
		
		byte b = 127; // -128~127. 128은 byte의 범위를 초과한다.
		
		int oct = 010; // 8진수, 10진수로는 8
		int hex = 0x10; // 16진수, 10진수로는 16
		
		long l = 10_000_000_000L; // 접미사 L을 붙여 long타입을 선언해준다. 
		
		float f = 3.14f; // 접미사 f를 붙이지 않으면 에러발생
		double d = 3.14d;
		
		System.out.println(oct); // println은 10진수로 바꾸어 출력한다.
		System.out.println(hex);
		
		System.out.println(10.); // 10.0
		System.out.println(.10); // 0.1
		System.out.println(10f); // 접미사 f가 출력되지는 않는다.
		System.out.println(1e3); // 10의 3승
		
//		char ch = 'AB'; 문자에 값이 2개 이상이면 에러발생
		char ch = 'A';
		int i = 'A';

		System.out.println(ch);
		System.out.println(i); // 'A'의 문자코드 65가 출력
		
		String str = "";
		String str2 = "ABCD";
		String str3 = "123";
		String str4 = str2 + str3; // 문자열끼리 붙는다.
		
		System.out.println(str4);
		System.out.println(""+7+7); // 77
		System.out.println(7+7+""); // 14 출력. 출력은 왼쪽부터 연산하며 문자열을 만나면 사칙연산이 아닌 문자열끼리 붙인다.
	}

}

/* 
🍘 #Ch.02 - 6장, 리터럴의 타입과 접미사

VarEx3.java 참고

변수에 타입은 저장될 값의 타입(Literal의 타입)에 의해 결정된다.

접미사가 굳이 필요없는 기본형 정수와 실수는 int와 double이다.

정수형에 ob0101에서 ob는 2진수 literal를 뜻한다.
long은 접미사 'l' 혹 'L'을 붙이고 float는 접미사 'f' 혹 'F'를 붙인다. 접두사인 0b(2진수), 0(8진수), 0x(16진수) 또한 대소문자를 구별하지 않는다.

JDK 1.7 이후부터 정수형 literal 사이에 '_'로 구분자를 넣을 수 있다. 

🍘 소수점과 제곱
정수형 literal에 소수점 ' . '을 나타내는 경우 실수형 literal로 바뀐다. 1e3의 경우에는 10의 3승을 뜻하는 literal이다.

🍘 변수와 리터럴의 타입 불일치

범위가 '변수 > 리터럴'인 경우에는 에러가 없다.

int > char
long > int
double > float

그러나 '변수 < 리터럴' 인 경우에는 에러가 발생

int i = 30_0000_0000; 
: int의 범위 20억을 벗어난다.

long < float
float < double

위에 3가지는 에러가 발생

byte, short에 int literal도 저장가능하지만 byte와 short는 literal이 별도로 존재하지 않아 
int 타입의 literal을 사용하지만 byte와 short의 범위를 초과시 에러가 발생 

---

🍘 #Ch.02 - 7 ~ 8장, 문자, 문자열 리터럴, 문자열 결합

VarEx3.java 참고.

덧셈 연산자(+)는 피연산자가 모두 숫자일 때 두 수를 더하지만 어느 한 쪽이 String인 경우 다른 한쪽을 String으로 변환 후 두 String을 결합한다.

*/