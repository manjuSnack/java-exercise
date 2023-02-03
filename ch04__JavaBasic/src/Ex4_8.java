/**
 * 
 * @author manjuSnack
 * 🍘 #ch4-13~14, for문
 */
public class Ex4_8 {

	public static void main(String[] args) {
		int i; // scope(범위) - 선언된 위치부터 선언된 블럭의 끝까지이며, 가능한 필요한 범위 안에서만 쓰이도록 하여야 한다.
		
//		for (int i=1; i<=5; i++) System.out.println("Hello");
//		for (int i=1; i<=10; i=i+2) System.out.println(i); // i를 2씩 증가, i=1,3,5,7,9로 5번 반복.
//		for (int i=1; i<=10; i=i*2) System.out.println(i); // i를 2씩 곱하며 증가, i=1,2,4,8,16로 4번 반복.
//		for (int i=10; i >= 1; i--) System.out.println(i); // i를 10부터 1까지 출력.
//		for (int i=10; 1 >= 1; i--) System.out.println(i); // 조건식이 1 >= 1;이 true이며 무한반복(infinite loop)으로 주의해야 한다.
//		for (int i=1, j=10; i <= 10; i++, j--) System.out.println("i="+ i +",j=" + j); // 초기화와 증감식을 여러 변수에 대해 줄 수 있다. 단, type은 같아야 한다.
		
//		for (i=1; i<=10; i++) System.out.println(i); 
//		System.out.println(i); // for문 밖에서 int i;를 선언하면 for문 밖에서도 변수 i를 사용할 수 있다.

		for (;;) { } // 조건식을 생략하면 무한반복이 된다. for (;true;) { } 와 같다.
		
		
	}	
	
}
