/**
 * 
 * @author manjuSnack
 *
 * Ch2-12~13, Printf를 이용한 출력, 예제
 */
public class PrintEx1 {

	public static void main(String[] args) {
		System.out.println(10/3); // 정수끼리 나누기한 결과
		System.out.println(10.0/3); // 실수 10.0과 정수 3을 나눈 결과
		
		System.out.printf("%d%n", 15); // %d : 10진수, %n : 개행문자(줄바꿈)
		System.out.printf("%#o%n", 15); // %o : 8진수, #을 추가한 %#o : 8진수 접미사(0)를 추가. 10의 자리는 10이 아닌 8이 된다.
		System.out.printf("%#x%n", 15); // %x : 16진수, #을 추가한 %#x : 16진수 접미사(0x)를 추가
		System.out.printf("%s%n", Integer.toBinaryString(15)); // Integer.toBinaryString() method는 값을 2진수로 출력
		
		float f = 123.456789f;
		double d = 1.23456789; // 뒤에 d는 생략가능.
		System.out.printf("%f%n", f); // %f : 실수, float는 기본적으로 소수점 6자리수까지만 정확하게 나온다. 뒤에 숫자 2자리는 의미가 없다.
		System.out.printf("%f%n", d); // 15자리수까지 정확하게 나온다.
		System.out.printf("%e%n", d); // %e : 지수형태로 출력. 
		System.out.printf("%g%n", d); // %g : 간략하게 글자 7자리만 표현
		
		System.out.printf("[%5d%n]", 10); // [%nd] : 총 n자리수인 칸 안에서 정수 표현. [ ]: 구분하기 어려워서 추가한 괄호이며 기본적으로 오른쪽 정렬. [   10]  	
		System.out.printf("[%-5d]%n", 10); // [%-nd] : 총 n자리수인 칸 안에서 정수를 왼쪽정렬하여 표현. [10   ] 
		System.out.printf("[%05d]%n", 10); // [%0nd] : 총 n자리수인 칸 안에서 빈칸은 0으로 채운 정수표현. [00010]
		System.out.printf("[%5d]%n", 1234567); // 뒤에 값이 n 자리수보다 클 경우 값의 자리수만큼 키워 표현. [1234567]
		
		System.out.printf("%14.10f%n", d); // %자리수.소수점 아래수f : 전체 자리수인 칸 안에 소수점 몇번째까지의 실수 표현.
		System.out.printf("%14.6f%n", d); 
		System.out.printf("%.6f", d); // %.소수점 아래수f : 전체 자리수는 생략가능하며 소수점 몇번째까지의 실수 표현.
		
		System.out.printf("[%s]%n", "www.manjuSnack.com"); // %s : 문자열 출력
		System.out.printf("[%20s]%n", "www.manjuSnack.com"); // %ns : 총 n자리수인 칸 안에서 문자열 출력. 기본적으로 오른쪽 정렬.
		System.out.printf("[%-20s]%n", "www.manjuSnack.com"); // %-ns : 총 n자리수인 칸 안에서 문자열을 왼쪽정렬 후 출력.
		System.out.printf("[%.10s]%n", "www.manjuSnack.com"); // %.ns : 총 n자리수만큼만 문자열을 출력.		
	}

}

/*

🍘 #Ch.02 - 12~13장, printf를 이용한 출력

PrintEx.java 참고

println()의 단점 
: 출력형식 지정불가

실수의 자리수 조절불가하며 10진수로만 출력이 되는 단점이 있다.
소수점 n자리수를 지정해 출력하거나 8진수, 16진수를 출력하려면 printf() 를 사용하여야 한다.

printf() method는 지시자(specifier)를 통해 선택해 원하는 출력이 가능하다. 지시자의 구성의 갯수에는 한계가 없고 원하는 만큼 표현할 수 있다.

🍘 printf()의 지시자(specifier)를 참고할 Java API

: Class Formatter를 참고하면 지시자(specifier)에 대한 내용을 자세히 알아볼 수 있다.

🍘 printf()의 자주 쓰이는 지시자(specifier) 형식. 

%b : Boolean 형식으로 출력

"%s", Interger.toBinaryString(숫자) : Integer.toBinaryString()는 값을 2진수로 출력
%d : 10진수(decimal) 정수의 형식
%o : 8진수(octal) 정수의 형식
%#o : 8진수(octal) 정수에 접미사 추가해 출력
%x : 16진수(hexa-decimal) 정수의 형식
%#x : 16진수(hexa-decimal) 정수에 접미사 추가해 출력

%f : 부동소수점(floating-point)의 형식
%e : 지수(exponent) 표현식의 형식
%g : 실수를 간략한 형식으로 출력. 기본적으로 글자 7자리만 출력

%c : 문자(character)로 출력
%s : 문자열(String)로 출력
%n : 개행문자(줄바꿈) 실행

[ ] : 중괄호

% 다음에 정수는 전체 자리수를 결정하는 수이고, 소수점 뒤에 숫자를 표기할 경우 소수점 n번째 자리까지 표현하라는 의미이다.
또한 % 뒤에 ' - ' 부호를 넣을 경우 정렬을 반대로 정렬한다. 기본 정렬은 우측정렬이며 ' - ' 부호를 작성할 경우 왼쪽정렬로 출력한다.
% 뒤에 숫자 0을 붙일 경우, 전체자리 중 빈자리에는 숫자 0으로 채운다.

 */