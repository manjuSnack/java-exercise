/**
 * 
 * @author manjuSnack
 *
 *Example 3-1 for문을 이용하여 1에서 10까지의 합 출력
 *for문을 이용하여 1에서 10까지 덧셈으로 표시하고 합을 출력하라.
 *
 */
public class ForSample {

	public static void main(String[] args) {
		int sum = 0;
		
		for(int i=1; i<=10; i++) {
			sum+=i;
			System.out.print(i);
			if (i<=9)
				System.out.print("+");
			else {
				System.out.print("=");
				System.out.print(sum);
			}
		}
	}
}
