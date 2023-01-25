/**
 * 
 * @author manjuSnack
 * 🍘 #ch5-1~3, 배열의 생성과 선언, 배열의 인덱스
 */

public class Ex5_1_tmp {

	public static void main(String[] args) {
//		int[] score; 		 // 1. 배열 score를 선언(참조변수(reference variable))
//		score = new int [5]; // 2. 배열의 생성(int Type으로 저장공간을 5개 할당)
		
		int[] score = new int[5]; // 배열의 선언과 생성을 동시에 하는 방법
		
		// 배열에 값을 저장하기
		score[3] = 100; // score[]의 3번째 index에 따른 요소에 100을 저장
		
		System.out.println("score[0]="+score[0]);
		System.out.println("score[1]="+score[1]);
		System.out.println("score[2]="+score[2]);
		System.out.println("score[3]="+score[3]); // 100이 저장
		System.out.println("score[4]="+score[4]);
		
		// 배열의 값을 읽어오기
		int value = score[3]; // 배열 요소의 저장된 값을 불러와 다른 변수에 저장
		System.out.println("value="+value);
		
		// 배열의 index로 상수 대신 변수나 수식도 사용할 수 있는 예제
		for (int i=0; i<=4; i++) {
			score[i] = i * 10;
			System.out.println("score["+i+"]="+ score[i]);
		}
	} // main

}
