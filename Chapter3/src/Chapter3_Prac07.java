/**
 * 
 * @author manjuSnack
 *
 * Practice 7. 정수를 10개 저장하는 배열을 만들고 1에서 10까지 범위의 정수를 랜덤하게 생성하여 배열에 저장하라.
 * 그리고 배열에 든 숫자들과 평균을 출력하라.
 */
public class Chapter3_Prac07 {

	public static void main(String[] args) {
		int n [] = new int[10]; // 배열 생성
		
		for (int i=0; i<n.length; i++) { // 10개의 랜덤한 정수 생성 및 저장
			int r = (int)(Math.random()*10 + 1); // 생성
			n[i] = r; // 배열에 저장
		}
		
		int sum = 0;
		for (int i=0; i<n.length; i++) // 합 구하기
			sum += n[i];
		
		System.out.print("랜덤한 정수들 : "); // 10개의 랜덤한 정수 출력
		for (int i=0; i<n.length; i++)
			System.out.print(n[i] + " ");
		
		System.out.println("\n평균은 " + (double)sum/n.length); // 평균값 출력
	}

}
