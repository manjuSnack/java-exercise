/**
 * 
 * @author manjuSnack
 * 
 * Exercise 02. 다음 for문의 실행 결과 sum 값이 다른 하나는?
 */
public class Chapter3_Exer02 {
	
	
	public static void main(String[] args) {
		// 보기 1.
		int sum1 = 0;
		for (int i=0; i<10; i++) {
			sum1 += i;
			System.out.print(sum1 + " ");
			
		}
		System.out.println("/");
		
		// 보기 2.
		int sum2 = 0;
		for (int i=9; i>0; i--) {
			sum2 += i;
			System.out.print(sum2 + " ");
			
		}
		System.out.println("/");
		
		// 보기 3.
		int sum3 = 0;
		for (int i=0; i>10; i++) {
			sum3++;
			System.out.print(sum3 + " ");
		}
		System.out.println("/");
		
		// 보기 4.
		int sum4 = 0;
		for (int i=0; i<10; sum4+=i, i++) {
			System.out.print(sum4 + " ");
		}
		System.out.println("/");
		
		/**
		 * 결과는 보기 3번만 다르다.
		 */
	}

}
