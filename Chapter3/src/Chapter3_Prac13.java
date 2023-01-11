/**
 * 
 * @author manjuSnack
 *
 * Practice 13. 반복문을 이용하여 369게임에서 박수를 쳐야 하는 경우를 순서대로 화면에 출력해보자.
 * 1부터 시작하며 99까지만 한다. 실행 사례는 다음과 같다.
 * 
 */
public class Chapter3_Prac13 {

	public static void main(String[] args) {
		String str[] = {" 박수 짝", " 박수 짝짝"};
		int res, num, numberOf369 = 0;
		
		for (int i=1; i<100; i++) {
			num = i;
			for (res = num % 10; num > 0; res = num % 10) {
				if (res == 3 || res == 6 || res == 9) 
					numberOf369++; // 정수에 3,6,9 중 하나가 있는 경우 numberOf369 증가
				num = num / 10; // num이 0이 될 때까지 반복, 예를 들어 66인 경우 for문을 2바퀴 돌고 numberOf369의 값은 2가 된다.
			}
			if (numberOf369 > 0) // 수에 3,6,9가 하나 이상 있는 경우
				System.out.println(i + str[numberOf369-1]);
			numberOf369 = 0;
		}
	}

}
