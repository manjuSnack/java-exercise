/**
 * 
 * @author manjuSnack
 * 🍘 #ch5-8~9, 배열의 활용 (1) ~ (4)
 */
public class Ex5_3 {

	public static void main(String[] args) {
		// 최대값과 최소값
		int[] score = {79,88,91,33,100,55,95};
		
		// 변수 max와 min을 이용해 값을 알아내면 수월하다.
		int max = score[0]; // 배열의 첫 번째 값으로 최대값을 초기화 한다.
		int min = score[0]; // 배열의 첫 번째 값으로 최소값을 초기화 한다.
		
		for(int i=1;i<score.length;i++) {
			if(score[i]>max) max = score[i];
			else if (score[i]<min) min = score[i];
		} // for
		
		System.out.println("최대값 :" + max);
		System.out.println("최소값 :" + min);
	} // main
}
