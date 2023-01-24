/**
 * 
 * @author manjuSnack
 *
 * 🍘 #ch4-1~4, 조건문if문과 if-else문
 */
public class Ex4_1 {

	public static void main(String[] args) {
		int score = 80; 
		
		if (score>60) {
			System.out.println("합격입니다.");
		}
	}
}

/*
🍘 #ch4-1~4, 조건문if문과 if-else문

이론 중점
Ex4_1.java
Ex4_2.java
Ex4_3.java

🍘 조건문 

: 조건을 만족할때에만 { }를 수행(0~1번), if문과 switch문이 있다.

🍘 반복문

: 조건을 만족하는 동안 { }를 수행(0~n번), for문과 while문이 있다.

조건문과 반복문을 제어문( Flow control statements )이라고 한다.

🍘 if문

: 조건식이 참(true)일 때, 중괄호 { } 안에 작업문들을 수행한다.

if (조건식) {
    // 조건식이 참(true)일 때 수행될 문장들을 적는다.
}

조건식에는 true, false만이 올 수 있으며 다른 연산인 경우 에러가 발생한다.

만약, 등가비교 연산자 '==' 대신 대입연산자 '='를 사용할 경우 if (x=0) { ... } 는 if (0) { ... }이 되며 결과가 true 혹 false가 아니라서 에러가 발생한다.

🍘 조건식의 다양한 예,

90 <= x && x <= 100
: 정수 x가 90이상 100이하일때 

x < 0 || x > 100
: 정수 x가 0보다 작거나 100보다 클 때

x%3==0 && x%2!=0
: 정수 x가 3의 배수지만, 2의 배수는 아닐 때

ch == 'y' || ch == 'Y'
: 문자 ch가 'y' 또는 'Y' 일때

ch==' ' || ch=='\t' || ch=='\n'
: 문자 ch가 공백이거나 탭 또는 개행 문자일 때

'A' <= ch && ch <= 'Z'
: 문자 ch가 대문자일 때

'a' <= ch && ch <= 'z'
: 문자 ch가 소문자일 때

'0' <= ch && ch <= '9'
: 문자 ch가 숫자일 때

str.equals("yes")
: 문자열 str의 내용이 "yes"일 때 ( 대소문자 구분 ). 만약 Yes인 경우에는 false로 된다.

str.equalsIgnoreCase("yes")
: 문자열 str의 내용이 "yes"일 때 ( 대소문자 구분 안함 ). 만약 Yes인 경우에라도 true가 된다.

문자열 비교일 때는 '=='를 사용해서는 안 된다.

🍘 블럭(block) { }

: 중괄호( curly bracket )를 블럭이라고 하며, 여러 문장을 하나로 묶어주는 데에 쓰인다. 안에 내용은 들여쓰기(indentation)를 하여 구분해 준다.

C/C++나 Java에서는 작업문이 하나일 경우에는 블럭 { }을 생략할 수 있다.

🍘 if-else 문

: 둘 중의 하나의 조건식이 참일 때와 거짓일 때로 나눠서 처리

if (조건식) {
    // 조건식이 참(true)일 때 수행될 문장들을 적는다.
} else {
    // 조건식이 거짓(false)일 때 수행될 문장들을 적는다.
}
*/