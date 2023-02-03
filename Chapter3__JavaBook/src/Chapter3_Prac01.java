/**
 * 
 * @author manjuSnack
 *
 * Practice 01. 다음 프로그램에 대해 물음에 답하라.
 * 
 * (1) 무엇을 계산하는 코드이며, 실행 결과 출력되는 내용은? 정답 : 0~99까지의 짝수들의 합을 구하는 코드이며 결과는 2450을 출력
 * (2) 생략
 * (3) for문을 이용해 동일하게 실행해보자.
 * (4) do-while문을 이용해 동일하게 실행해보자.
 */
public class Chapter3_Prac01 {

	public static void main(String[] args) {
		int sum = 0, i=0;
		while (i<100) {
			sum = sum + i;
			i += 2;
			System.out.println(sum + "( +" + (i) + ")");
		}
		
		// 보기 3번.
		int sum2 = 0, j= 0;
		for (j=0; j<100; j+=2) {
			sum2 = sum2 + j;
		}
		System.out.println(sum2);
		
		// 보기 4번.
		int sum3 = 0, k=0;
		do {		
			if (k >= 99)
				break; // 99까지 계산하면 while문 끝내기.
			sum3 = sum3 + k; 
			k += 2; // 직접 값을 2씩 더해야 한다.
		} while (true); // 무한 loop

		System.out.println(sum3);
	}

}
