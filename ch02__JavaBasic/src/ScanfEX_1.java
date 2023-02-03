import java.util.Scanner; // import java.util.*;라고 추가해도 상관없다.

/**
 * 
 * @author manjuSnack
 *
 * Ch2-14. 화면으로부터 입력받기
 */
public class ScanfEX_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // 입출력 관련 객체들은 닫아주어야 한다는 경고메시지로 노란 밑줄이 생긴다. Console에서 작업하는 경우는 JVM의 의해 종료되기 때문에 굳이 scanner.close()를 하지 않아도 된다.
		
		int num1 = scanner.nextInt(); // nextInt() : 입력된 값을 정수로 받는다.
		int num2 = scanner.nextInt(); 
		System.out.println(num1);
		System.out.println(num2);
		
		String input = scanner.nextLine(); // nextLine() : 한 행씩 읽어오기, 여러 값 등을 받을 때 쓰인다.
		int num3 = Integer.parseInt(input); // Integer.parseInt()는 입력된 문자열을 정수로 바꾼다.
		
		System.out.println(num3);
	}

}

/*
🍘 #Ch02-14, 화면으로부터 입력받기

실습

ScanfEx1.java 참고

Scanner란?
: 화면으로부터 데이터를 입력받는 기능을 제공하는 Class

🍘 Scanner를 사용하려면?

import문 추가
: 자세한 내용은 7장을 참고한다.

Scanner객체의 생성
: 자세한 내용은 6장을 참고한다.

Scanner객체를 사용
: int num = scanner.nextInt();

🍘 Scanner 입력관련 method()
scanner.nextInt()는 정수를 입력받는다.
scanner.nextFloat()는 실수를 입력받는다.
scanner.nextLine()는 한 행단위로 입력받는다.

🍘 문자열을 정수, 실수로 변환
Integer.parseInt(문자열);은 문자열을 정수로 바꾼다.
Double.parseDouble(문자열);은 문자열을 실수로 바꾼다.

🍘 숫자를 문자열로 변환
숫자 + "";는 숫자를 문자열로 바꾼다.
*/