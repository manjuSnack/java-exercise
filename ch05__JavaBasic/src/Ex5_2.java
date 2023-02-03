/**
 * 
 * @author manjuSnack
 * 🍘 #ch5-8~9, 배열의 활용 (1) ~ (4)
 */
public class Ex5_2 {

	public static void main(String[] args) {
		// 총합과 평균
		int sum = 0;		// 총합에 대한 변수
		float average = 0f; // 평균에 대한 변수
		
		int[] score = {100,88,100,100,90};
		
		for (int i=0; i<score.length; i++) sum += score[i]; // 배열에 값을 반복문을 통해 하나씩 모두 더한다.
		average = sum / (float)score.length; // 보다 정확하게 결과를 얻기 위해 실수로 형변환
		
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + average);
	}

}
