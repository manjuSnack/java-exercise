import java.util.Scanner;

/**
 * 
 * @author manjuSnack
 *
 * 🍘 #Ch3-15~16, 논리 연산자, 논리 부정연산자
 */
public class Ex3_15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char ch = ' ';
		
		System.out.printf("문자를 하나 입력하세요.>");
		
		String input = scanner.nextLine();
		ch = input.charAt(0);
		
		if ('0' <= ch && ch <= '9') 
			System.out.printf("입력하신 문자는 숫자입니다.%n");
		
		
		if (('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z'))
			System.out.printf("입력하신 문자는 영문자입니다.%n");
	} // main

} 

/*
🍘 #Ch3-15~16, 논리 연산자, 논리 부정연산자

🍘 논리연산자 && ||
: 조건식을 연결할 때 사용하는 연산자

|| (OR결합)
: 피연산자 중 어느 한 쪽이 true이면 true를 결과로 얻는다.

&& (AND결합)
: 피연산자 양쪽 모두 ture이어야 true를 결과로 얻는다.

🍘 x는 10보다 크고, 20보다 작다. 일때

: x > 10 && x < 20 으로 표현하며, 10 < x && x < 20으로 가독성을 높여 표현하는 것이 보다 나을 수도 있다.

🍘 i는 2의 배수 또는 3의 배수지만 6의 배수는 아니다. 일때

: ( i%2==0 || i%3==0 ) && i%6 != 0

🍘 문자 ch는 숫자( '0' ~ '9' )이다.

: '0' <= ch && ch <= '9'

🍘 문자 ch는 대문자 또는 소문자이다.

: ( 'a' <= ch && ch <= 'z' ) || ( 'A' <= ch && ch <= 'Z' )

🍘 논리 부정 연산자 !

: true를 false로, false는 true로 바꾼다. 주로 사용되는 곳은 조건문과 반복문의 조건식이다.

🍘 !!true

boolean b = true;
!!b 일 경우
!!b --> !!true --> !false --> true 로 되돌아온다.

이 같은 원리는 토글 버튼(toggle button)과 유사하다.

🍘 문자 ch가 소문자가 아니다. 일때

ch < 'a' || ch > 'z' 보다는 !( 'a' <= ch && ch <= 'z' )로 적는 것이 더 직관적이다.
*/
