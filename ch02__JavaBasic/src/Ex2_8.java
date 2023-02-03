/**
 * 
 * @author manjuSnack
 *
 * Ch 2-9. 두 변수의 값 바꾸기
 * 
 * 예제 2-8.
 * VarEx2 참고
 */
public class Ex2_8 {

	public static void main(String[] args) {
		int x = 10, y = 5;
		System.out.println("x="+x);
		System.out.println("y="+y);
		
		int tmp = x;
		x = y;
		y = tmp;
		System.out.println("x="+x);
		System.out.println("y="+y);
	}

}

/* 
🍘 #Ch.02 - 9장, 두 변수 바꾸기

Ex2_8.java 참고

변수를 하나의 컵이라고 가정하고 우유와 주스를 바꿔 담고자 할 때 빈 컵이 필요할 것이다. 
빈 컵을 이용해 우유와 주스를 바꿔 담을 수 있다. 이처럼 임시로 저장할 변수가 하나 더 필요하다.
*/