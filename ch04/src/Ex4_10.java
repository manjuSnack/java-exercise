/**
 * 
 * @author manjuSnack
 * 🍘 #ch4-13~14, for문
 */
public class Ex4_10 {

	public static void main(String[] args) {
		int sum = 0;
		
		for (int i=1; i<=5; i++) {
			sum += i; // sum = sum + i;
			System.out.printf("1부터 %2d 까지의 합: %2d%n", i, sum);
		}
	}

}
