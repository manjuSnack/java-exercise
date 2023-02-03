/**
 * 
 * @author manjuSnack
 * 🍘 #ch4-16~19 while문, do-while문
 */
public class Ex4_13 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		
		// i를 1씩 늘려가며 sum에 계속 더해보기
		while (sum <= 100) {
			System.out.printf("%d - %d%n", i, sum);
			sum += ++i;
		}
	}

}
