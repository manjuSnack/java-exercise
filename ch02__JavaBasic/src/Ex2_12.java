/**
 * 
 * @author manjuSnack
 *
 * 🍘 #Ch02-17 타입간의 변환방법
 * 
 * 예제 2-12
 */
public class Ex2_12 {

	public static void main(String[] args) {
		String str = "3";
		
		System.out.println(str.charAt(0) - '0'); // CharAt(0) : 문자열을 문자로 바꾼다. 결과로는, 문자 - 문자는 숫자로 바뀐다. 
		System.out.println('3' - '0' + 1); // 숫자 3으로 바뀌고 3+1=4가 된다.
		System.out.println('3' + 1); // 문자코드에 +1이 더해진다.
		System.out.println(Integer.parseInt("3") + 1); // Integer.parseInt(문자열) :  문자열을 정수로 
		System.out.println("3" + 1); // 문자열로 겹쳐진다.
		System.out.println((char)(3 + '0')); // (char) 형변환이 없다면 51이 된다. '0'은 숫자로 48이다.
	}

}

/*
🍘 #Ch02-17 타입간의 변환방법

실습

Ex2_12.java를 참고.

🍘 문자와 숫자간의 변환

숫자 + '0' = 문자
문자 - '0' = 숫자

문자 '0'을 더하거나 빼면 문자와 숫자로 변환할 수 있다.

🍘 문자열로의 변환

숫자 + "" = 문자열
문자 + "" = 문자열

숫자와 문자에 빈 문자열을 더해주면 문자열로 바꿀 수 있다.

🍘 문자열을 숫자로 변환

Integer.parseInt(문자열로 된 숫자)로 문자열 "3"을 숫자 3으로 바꿀 수 있다.

Double.parseDouble(문자열로 된 실수)로 문자열을 실수로 바꿀 수 있다.

CharAt(0)로는 문자열을 문자로 바꿀 수 있다. 예를 들면 변수(Literal).CharAt(0) 혹은 "3".CharAt(0)으로 '3'으로 바꿀 수 있다.
*/