/**
 * 
 * @author manjuSnack
 *
 * 🍘 #Ch3-17~19, 조건 연산자, 대입 연산자
 */
public class Ex3_17 {

	public static void main(String[] args) {
		int x, y, z;
		int absX, absY, absZ;
		char signX, signY, signZ;
		
		x = 10;
		y = -5;
		z = 0;
		
		absX = x >= 0 ? x : -x; // x의 값이 음수이면, 양수로 만든다.
		absY = y >= 0 ? y : -y;
		absZ = z >= 0 ? z : -z;
		signX = x > 0 ? '+' : (x==0 ? ' ' : '-'); // 조건 연산자 중첩
		signY = y > 0 ? '+' : (y==0 ? ' ' : '-');
		signZ = z > 0 ? '+' : (z==0 ? ' ' : '-');
		
		System.out.printf("x=%c%d%n", signX, absX);
		System.out.printf("y=%c%d%n", signY, absY);
		System.out.printf("z=%c%d%n", signZ, absZ);
	}

}

/*
🍘 #Ch3-17~19, 조건 연산자, 대입 연산자

조건 연산자 ? :

: 조건식의 결과에 따라 연산결과를 달리한다.

🍘 result = ( x > y ) ? x : y ;

: result = (조건식) ? 식1 : 식2; 인 구조를 가지고 조건식이 true이면 식1이, false이면 식2가 result로 대입된다.

조건식을 괄호로 묶지만 가독성을 위한 것이며 필수는 아니다.

if문과 같다.

🍘 대입 연산자

: 오른쪽 피연산자를 왼쪽 피연산자에 저장 후 저장된 값을 반환. 예를 들면 아래와 같다.

System.out.println( x = 3 );
System.out.println( 3 );

🍘 lvalue, rvalue

x = 3
: x는 lvalue( left value )라 하고 값을 저장할 공간을 지칭하며, 3은 rvalue( right value )라고 하며 Literal을 가리킨다.

🍘 대입연산자에서의 Error
int i = 0;

3 = i + 3;
i + 3 = i;

: lvalue가 값을 저장할 공간이 아니다.

final int MAX = 3;
MAX = 10;

: 상수는 값을 한번 저장하면 변경할 수 없다.

🍘 복합 대입연산자

: 대입 연산자와 다른 연산자를 하나로 축약

i += 3; 
: i = i + 3;

i -= 3;
: i = i - 3;

i *= 3;
: i = i * 3;

i /= 3;
: i = i / 3;

i %= 3;
: i = i % 3;

i <<= 3;
: i = i << 3;

i >>= 3;
: i = i >> 3;

i &= 3;
: i = i & 3;

i ^= 3;
: i = i ^ 3;

i |= 3;
: i = i | 3;

i *= ( 10+j );
: i = i * ( 10 + j );
*/
