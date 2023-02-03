/**
 * 
 * @author manjuSnack
 * 🍘 #ch4-12, 임의의 정수 만들기
 */
public class Ex4_7 {

	public static void main(String[] args) {
		int num = 0;
		
		// Quiz1. 1~10사이의 난수를 20개 출력하시오. 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
		// Quiz2. -5~5사이의 난수를 20개 출력하시오. -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5
		for (int i=1; i<=20; i++) {
//			Quiz1.
//			System.out.println(Math.random()); // 0.0 <= x < 1.0 
//			System.out.println((Math.random()*10)); // 0.0 <= x < 10.0 
//			System.out.println((int)(Math.random()*10)); // 0 <= x < 10, 0~9 
//			System.out.println(((int)(Math.random()*10)+1)); // 1 <= x < 11, 1~10
			
//			Quiz2.
			System.out.println((int)(Math.random()*11)-5); // -5 <= x < 6, -5~5 
			
		}
	}
}

/*
🍘 #ch4-12, 임의의 정수 만들기

Ex4_7.java

임의의 정수
: 난수라고 하며, 어지러울 난(亂)을 사용한다. 게임이나 뒤섞고자할 때 사용한다.

🍘 Math.random()
: 0.0과 1.0 사이의 임의의 double값을 반환

0.0 <= Math.random() < 1.0
: 0.0 ~ 0.9999... 까지 포함되며, 1.0은 포함되지 않는다.

예를 들어, 1~3 사이의 정수를 구하고자 원한다면,

1. 각 변에 3을 곱한다.
: 0.0 <= Math.random() * 3 < 3.0

2. 각 변을 int형으로 변환한다.
: 0 <= (int)(Math.random() * 3) < 3 
즉, 0~2의 범위를 갖는다.

3. 각 변에 1을 더한다.
: 1 <= (int)(Math.random() * 3) + 1 < 4
즉, 1~3의 범위를 갖는다.
*/