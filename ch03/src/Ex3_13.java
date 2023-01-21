/**
 * 
 * @author manjuSnack
 *
 * 🍘 #Ch3-13~14, 비교 연산자, 문자열의 비교
 */
public class Ex3_13 {

	public static void main(String[] args) {
		System.out.println(-10%8); // -2
		System.out.println(10%-8); // 2
		System.out.println(-10%-8); // -2. 음수를 10에 붙이거나 두 수를 음수로 나눌 경우 결과값이 음수가 된다.
	}

}

/* 
🍘 #Ch3-13~14, 비교 연산자, 문자열의 비교

비교연산자 > < >= <= == !=
: 두 피연산자를 비교해서 True(참)과 False(거짓)을 반환

비교연산자 역시 이항 연산자이므로 비교하는 피연산자의 타입이 서로 다를 경우에는 
자료형의 범위가 큰 쪽으로 자동 형변환하여 타입을 일치시킨 후에 비교한다.


🍘 대소비교 연산자
> 
: 좌변 값이 크면, true 아니면 false

<
: 좌변 값이 작으면, true 아니면 false

>=
: 좌변 값이 크거나 같으면, true 아니면 false

<=
: 좌변 값이 작거나 같으면, true 아니면 false

단, =>와 =< 혹은 사이에 공백이 들어갈 경우에는 사용될 수 없다. 항상 좌변을 기준으로 한 대소비교만을 전재로 한다.

만약, 'A' > 'B' 를 비교할 경우, char type이 int type으로 변환되어 65 > 66으로 대소비교를 하게되어 false 값을 결과로 얻는다.

🍘 등가비교 연산자
==
: 두 값이 같으면, true 아니면 false

!=
: 두 값이 다르면, true 아니면 false

기본형과 참조형 변수에 경우에는 서로 형변환이 가능하지 않기 때문에 기본형과 참조형을 비교할 수는 없다.

🍘 문자열 비교

: 문자열 비교에는 == 대신 equals() method를 사용해야 한다.

예를 들어, 

String str1 = "abc";
String str2 = "abc";
System.out.println(str1==str2); // true
System.out.println(str1.equals(str2)); // true

결과값 두개는 서로 같은 값이 나온다. 그러나 new 연산자를 이용해 생성할 경우 ==의 결과는 false로 다르게 나온다. 이 차이는 9장에서 배우게 된다.

String str1 = new String("abc");
String str2 = new String("abc");
System.out.println(str1==str2); // false
System.out.println(str1.equals(str2)); // true

이러한 이유로 equals() method를 사용해야 한다.
*/