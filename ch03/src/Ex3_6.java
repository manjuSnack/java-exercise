/**
 * 
 * @author manjuSnack
 * 
 * 🍘 #Ch3-7~8, 형변환 연산자, 자동 형변환
 * 🍘 #Ch3-9~10, 사칙 연산자, 산술변환
 */
public class Ex3_6 {

	public static void main(String[] args) {
		int a = 10;
		int b = 4;
		
		System.out.printf("%d + %d = %d%n", a, b, a + b);
		System.out.printf("%d - %d = %d%n", a, b, a - b);
		System.out.printf("%d * %d = %d%n", a, b, a * b);
		System.out.printf("%d / %d = %d%n", a, b, a / b);
		System.out.printf("%d / %f = %f%n", a, (float)b, a / (float)b); // int 10 --> float 10.0f로 바꾸고 float 4.0f로 나눈다. 
	}

}

/*
🍘 #Ch3-7~8, 형변환 연산자, 자동 형변환

🍘 형변환이란?
: 연산을 수행하기 전에 타입을 일치 시켜야 하는데, 변수 또는 상수의 타입을 다른 타입으로 변환하는 것

'(타입)피연산자' 의 구조로 작성한다.

double d = 85.4;
int score = (int)d;

(int)d; 처럼 앞에 타입을 적어야 한다. 변수 d의 값은 변하지 않고 읽어온 값으로만 변환한다.

🍘 형변환 연산자

: 유니코드에서 문자에 따른 숫자를 변수에 저장한다. 실제로는 10진수가 아닌 2진수의 값을 변수에 저장한다.

int --> char로 형변환 시 (char)65에 경우, 결과는 'A'가 된다.
float --> int로 형변환 시 (int)1.6f에 경우, 결과는 '1'이 된다. 소수점은 반올림이 되지 않는다.
int --> float로 형변환 시 (float)10에 경우, 결과는 '10.0f'가 된다.

🍘 유니코드에 따른 간단 표, 일명 암호표

문자 0~9는 숫자 48~57, 문자 A~Z는 숫자 65~90, 문자 a~z는 97~122으로 기록되어 있다. 
이를 참고하여 Computer는 변수에 저장된 숫자를 읽고 문자를 표현한다.

참고로, 유니코드는 6만자로 출시했다가 한자로 인한 수량부족으로 현재는 100만자까지 표기할 수 있게 바뀌었다.

🍘 자동 형변환

float f = 1234; 처럼 형변환을 생략하면 사실 Compile하는 과정 중에 아래처럼 바꾼다.
float f = (float)1234; 이처럼 바꿔주는 것을 자동 형변환이라고 한다.

타입은 작은 것이 큰 것으로 변환할 때 자동으로 형변환하여 준다.

int i = 3.14f;
: 이 경우에는, 에러가 발생한다. 3.14f에서 .14f는 값손실이 발생하며 int i = (int)3.14f;로 바꾸어야 한다.

실제로는 형변환은 자동으로 이루워지나, Compiler가 값손실이 예상될 경우 수동으로 타입을 지정하게 권한다.
만약, int --> byte로 형변환 시 1byte를 제외한 나머지 메모리 공간이 사라지기 때문에 '300'은 값손실로 '44'가 된다.

🍘 자동 형변환 가능 표

byte --> short --> int --> long --> float --> double

char는 표현하는 양이 다르기 때문에 short가 아닌 int로 자동 형변환이 가능하다.
long은 E19(10의 19승)이고 float는 E38(10의 38승)이므로 float가 더 크다.

byte b = 100; 인 경우 '100'이 int 타입이지만, 값이 byte보다 작기 때문에 Compiler가 자동으로 변환해준다.
byte i = b;인 경우, Literal이 '100'이라는 것이 알지만, Compiler는 b를 읽어올 때는 크기를 알 수 없어 (int) b; 로 표기해야 한다.


---

🍘 #Ch3-9~10, 사칙 연산자, 산술변환

실습
Ex3_6.java 참고
Ex3_9.java 참고

사칙 연산자 + - * /
: +는 덧셈, -는 뺄셈, *는 곱하기, /는 나누기로 기본 4칙 연산할 때 필요한 수식이다.

🍘 산술변환

: 연산 전에 피연산자의 타입을 일치시키는 것

🍘 두 피연산자의 타입을 같게 일치시킨다. (보다 큰 타입으로 일치)

: 서로 다른 type은 자료형(primitive)의 범위가 넓은 것으로 자동 형변환이 이뤄진 후 연산한다. 연산 결과는 변환된 type을 따른다.

long + int --> long + long --> long
float + int --> float + float --> float 
double + float --> double + double --> double

🍘 피연산자의 타입이 int보다 작은 타입이면 int로 변환된다.

byte + short --> int + int --> int
char + short --> int + int --> int

byte는 -128~127, char는 0~6만, short는 -3만 ~ 3만의 범위이지만 계산범위가 작기 때문에 Overflow로 인해 int로 형변환을 하고 계산을 한다.

'2' - '0' --> 50 - 48 --> 2

char는 int로 자동 형변환이 이뤄지는데 '2'와 '0'의 유니코드의 의한 값은 50과 48이다. 따라서 결과는 int type의 숫자 2가 된다.
*/