/**
 * 
 * @author manjuSnack
 * 🍘 #ch5-21~23, 2차원 배열 예제
 */
public class Ex5_8 {

	public static void main(String[] args) {
		int[][] score = {
				{ 100, 100, 100 },
				{ 20, 20, 20 },
				{ 30, 30, 30 },
				{ 40, 40, 40 }
		};
		int sum = 0;
		
		for (int i=0;i<score.length;i++) { // 참조변수 0x100인 배열 score의 길이 : 0~3
			for (int j=0;j<score[i].length;j++) { // 참조변수 0x200 ~ 0x500인 각 배열의 길이 : 0~2
				System.out.printf("score[%d][%d]=%d%n", i, j, score[i][j]);
				sum += score[i][j];
			}
		}
		System.out.println("sum="+sum);
	} // main

}
