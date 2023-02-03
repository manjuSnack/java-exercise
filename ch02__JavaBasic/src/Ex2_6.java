/**
 * 
 * @author manjuSnack
 * 
 * Ch2-3 변수의 선언과 저장
 * Ch2-4 변수의 타입
 * Ch2-5 상수(Constant)와 리터럴(Literal)
 * Ch2-10 기본형과 참조형
 * Ch2-11 기본형의 종류와 범위
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
🍘 Chapter 2장. 03 변수의 선언과 저장

Ex2_6.java 참고

🍘 변수(variable)란?

: 수학적 개념의 변하는 수가 아닌 하나의 값을 저장할 수 있는 메모리 공간을 뜻한다.
이미 값이 저장된 변수에는 새로운 값을 저장하면 기존의 값은 지워지고 새로 저장된 값만 남는다.

🍘 변수의 선언

변수의 선언 이유
: 값(data)을 저장할 공간을 마련하기 위해서

🍘 변수의 선언 방법

'변수타입 변수이름;' 으로 작성한다. 

예를 들면, int age;
: 정수(Integer) 타입의 변수 age를 선언

🍘 변수에 값 저장하기

변수이름 = 저장할 값;

🍘 변수의 초기화

: 변수에 처음으로 값을 저장하는 것.

🍘 변수의 종류

Class 변수
Instance 변수
Local variable (지역변수)

단, 지역변수(Local variable)의 경우에는 초기화를 꼭 해주어야 한다. 그 외 Class 변수, Instance 변수에 경우에는 초기화하지 않아도 된다.

🍘 변수의 값 읽어오기

초기화 한 후 변수의 이름으로 값을 불러올 수 있다.

---

🍘 #Chapter 2장. 04장 변수의 타입

: 저장할 값의 타입에 의해 결정하며 저장할 값과 일치하는 타입으로 변수를 선언해야 한다.

🍘 값의 타입, 문자와 실수 그리고 논리

🍘 문자(character), 문자열(String)

: char, String

🍘 숫자

/ 정수(integer)
: byte, short, int, long

숫자 20억이 넘을때는 long을 사용한다.

/ 실수 (floating-point number)
: float, double

float는 오차없이 7자리수, double은 15자리수이다.

🍘 논리

: Boolean

Boolean은 true와 false의 값을 가지고 있다.

---

🍘 #Chapter 2장. 05장 상수와 리터널

: 상수(Constant)는 한 번만 값을 저장 가능한 변수이며 변수(variable)과는 다르게 이후 변경은 불가능하다. 작성하는 방법은 아래와 같다.

final 변수타입 변수명(대문자) = 초기화할 값;

🍘 리터럴(Literal, 문자 그대로의)

: 상수를 수학적 개념이 아닌 '한 번만 값을 저장하는 변수'라고 의미를 달리 두었기 때문에 Literal을 사용한다. Literal은 그냥 값을 의미한다.

---

🍘 #Ch.02 - 10장, 기본형과 참조형

앞서 Ch.2-4 변수타입 참고.

Java는 C언어와 달리 참조형 변수(Reference Type) 간의 연산을 할 수 없으므로 실제 연산은 기본형(Primitive type)의 변수만으로 계산한다.

🍘 자료형(data type)에는 기본형과 참조형인 2가지가 있다.

🍘 기본형(Primitive type)
: 오직 8개 (논리: boolean / 문자형 : char / 정수형 : byte, short, int, long / 실수형 : float, double)

🍘 참조형(Reference type)
: 기본형을 제외한 나머지로써, String, System 등
참조형은 갯수가 무한대이다. Ch 6장 참고

메모리 주소를 저장(4 byte 또는 8byte)
4 byte의 경우 40억의 변수(40억 byte인 약 4GB)를 사용할 수 있고 32bit JVM은 4byte를 사용한다.
8 byte의 경우 160경(1600만 TB)의 변수를 사용할 수 있고 64bit JVM은 8byte를 사용한다.

---

🍘 #Ch.02 - 11장, 기본형의 종류와 범위

🍘 기본형(Primitive type)의 종류와 크기

논리형, 문자형, 정수형, 실수형이 있다.

boolean은 조건식과 논리적 계산에 사용된다.
char는 유니코드(2byte)를 사용하며 C언어에서는 1byte를 사용한다.
byte는 1byte이며 주로 이진데이터를 다루는데 사용된다.
short는 2byte이며 c언어와의 호환을 위해 추가되었지만 잘 쓰이지 않는다.
int는 4byte로 정수형에서 default이다.
long은 8byte로 int보다 높은 값을 사용할 때 쓰인다.
float는 부동소수점(floating point, 떠다니는 점)이라 불리며 4byte이다.
double은 실수형에서 default이며 float보다 정밀도가 2배이며 8byte이다.

🍘 기본형(Primitve type)의 표현범위

1 bit는 0, 1로만 구성되어 있다.
1 byte는 8bit로 구성되어 있다.

n비트로 표현할 수 있는 값의 개수
: 2의 n승 개

n비트로 표현할 수 있는 부호없는 정수의 범위
: 0 ~ (2의 n승 - 1)

n비트로 표현할 수 있는 부호있는 정수의 범위
: -2의 n-1승 ~ (2의 n-1승 - 1)

byte의 경우에는 0을 포함해야 하기 때문에 부호없는 정수에 경우 0~255(256개)이고, 부호있는 정수에 경우에는 -128 ~ 127(256개)까지이다.

byte는 맨 좌측 bit를 부호비트(sign bit)라고 하며 0 (양수), 1(음수)를 표현하기 위해 쓰이기 때문에 2의 7승인 256개로 값을 표현한다.

short는 2byte로 부호가 있는 정수의 범위로써 -2의 15승 ~ (2의 15승 - 1)으로 -32,768 ~ 32,767의 값이 쓰인다.

char는 2byte로 부호가 없는 정수의 범위로써 0 ~ 65,535의 값이 쓰인다. \u0000 ~ \uffff까지 표현한다.

int는 4byte로 부호가 있는 정수의 범위로써 -2의 31승 ~ (2의 31승 - 1), 2의 31승은 2의 10승을 3번 곱한 뒤 2를 곱한 값을 표현한다.
2E10(2의 10승)은 약 1,024이며 10의 3승이다. 고로 양수만으로 2 x E9 = 약 20억으로 -20억 ~ 20억까지 표현할 수 있다.

long은 8byte로 부호가 있는 정수의 범위로써 -2의 63승 ~ (2의 63승 - 1), 2의 63승은 2의 3승과 2의 60승을 곱한 값으로, 8 x 10의 18승인 800경이다.
고로 -800경 ~ 800경까지를 표현할 수 있다. 

만약, 800경을 넘는 수를 사용할 경우 BigInteger라는 Class를 사용해야 한다. Ch 9장에서 설명한다.

float는 양수만을 표현할 경우 1.4E-45 ~ 3.4E38, 단 -1.4E-45 ~ 1.4E-45는 표현할 수 없는 범위이다.
float는 4byte로 부호(Sign bit) 1개, 지수 8개, 가수 23개(정규화로 24개까지 표현할 수 있다)로 구성되어 있다.  
가수는 3.4를 가리키고 지수는 E38을 가리킨다. 오차 없는 범위는 값을 7자리만을 표현할 수 있다. 
가수의 자리 수 24인 2의 24는 E7(10의 7승)보다 크고 E8(10의 8승)보다 작기 때문에 오차범위는 7자리가 된다.

double은 양수만을 표현할 경우 4.9E-324 ~ 1.8E308, 오차 없는 범위는 15자리이다.
double은 8byte로 부호(Sign bit) 1개, 지수 11개, 가수 52개로 구성되어 있다. 정밀도로 인해 실수에서 double은 default이다.

*/