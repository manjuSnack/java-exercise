/**
 * 
 * @author manjuSnack
 *
 * 🍘 #Ch03-5~6, 증감연산자, 부호연산자
 * 
 * 예제 3-2.
 */
public class Ex3_2 {

	public static void main(String[] args) {
		int i=5, j=0;
		
//		j = i++; 후위형을 풀면 아래와 같다.
		j = i;
		i++;
		System.out.println("j=i++; 실행 후, i=" + i + ", j=" + j);
		
		// 결과를 비교하기 위해, i와 j의 값을 다시 5와 0으로 변경
		i=5; 
		j=0;
		
//		j = ++i;  전위형을 풀면 아래와 같다.
		++i;
		j = i;
		System.out.println("j=++i; 실행 후, i=" + i + ", j=" + j);

	}

}

/*
🍘 #Ch03-5~6, 증감연산자, 부호연산자( 단항연산자 )

실습

Ex3_2.java를 참고
Ex3_4.java를 참고

🍘 증감 연산자

증가연산자(++) 
: 피연산자의 값을 1 증가시킨다.

감소연산자(--)
: 피연산자의 값을 1 감소시킨다.

상수(final)은 값을 변경할 수 없으므로 증감연산자가 쓰이지 못한다.

🍘 전위형과 후위형
: 식을 간소화하기 위해 만들어졌다.

🍘 전위형, j = ++i;
: 값이 참조되기 전에 1 증가시킨다.

풀어보면 
++i; 
j = i;

와 같다.

🍘 후위형, j = i++;
: 값이 참조되고 난 후에 1 증가시킨다.

풀어보면
j = i;
i++; // 독립적으로 사용될 경우 ++i; 와 차이가 없다

와 같다.

독립적으로 사용된 ++i; 와 i++;의 차이는 없다. 

🍘 부호연산자

' - '는 피연산자의 부호를 반대로 변경( 단항연산자이기도 하다 )
' + '는 Java에서는 아무런 일도 하지 않는다. 실제로 사용되지 않는다고 보는 것이 바람직하다.

부호연산자는 boolean형과 char형을 제외한 기본형에만 사용할 수 있다.
*/