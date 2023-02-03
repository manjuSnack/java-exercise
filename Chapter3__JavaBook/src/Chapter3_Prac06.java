import java.util.Scanner;

/**
 * 
 * @author manjuSnack
 *
 * Practice 6. 배열과 반복문을 이용하여 프로그램을 작성해보자. 키보드에서 정수로 된 돈의 액수를 입력받아 오만원권,
 * 만원권, 천원권, 500원짜리 동전, 100원짜리 동전, 50원짜리 동전, 10원짜리 동전, 1원짜리 동전이 각 몇 개로 변환되는지 예시와 같이 출력하라.
 * 이때 반드시 다음 배열을 이용하고 반복문으로 작성하라.
 * 
 * 참고 : Chapter 2장, 실습문제 3번 참고
 */
public class Chapter3_Prac06 {

	public static void main(String[] args) {
		int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1}; // 환산할 돈의 종류
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("금액을 입력하시오>>");
		
		int res, money;
		money = scanner.nextInt();
		
		for (int i = 0; i<unit.length; i++) {
			res = money/unit[i];  
			money -= res*unit[i];
			if (res != 0) { // 환산하는 과정 중 0개인 돈의 종류는 출력하지 않는다.
				System.out.println(unit[i] + "원 짜리 : " + res + "개 ");
			}
		} System.out.println();
		
		scanner.close();
			
	}

}
