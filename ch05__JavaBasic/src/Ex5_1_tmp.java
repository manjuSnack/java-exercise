import java.util.Arrays; // ctrl+shift+o : import를 자동으로 추가하고자 할 때 쓰는 단축키

/**
 * 
 * @author manjuSnack
 * 🍘 #ch5-1~3, 배열의 생성과 선언, 배열의 인덱스
 * 🍘 #ch5-4~5, 배열의 길이, 배열의 초기화
 * 🍘 #ch5-6~7, 배열의 출력
 */

public class Ex5_1_tmp {

	public static void main(String[] args) {
//		🍘 #ch5-1~3, 배열의 생성과 선언, 배열의 인덱스
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
		
//		🍘 #ch5-4~5, 배열의 길이, 배열의 초기화
//		index의 범위 : 0~8
		int[] arr = new int[9];
		System.out.println("arr.length="+arr.length);
		
		for (int i=0; i<arr.length;i++) // 조건식을 .length를 쓰지 않는다면 arr배열의 할당된 저장공간을 수정할 시 에러가 발생
			System.out.println("arr[" + i + "]=" + arr[i]);
		
//		🍘 #ch5-6~7, 배열의 출력
		int[] iArr = {100,95,80,70,60}; 
		System.out.println(iArr); // [I@1eb44e46 에서 [ 는 배열을 나타내고, I는 int Type을, @뒤에 숫자는 주소를 나타낸다. 9장에 설명이 되어 있다.
		
		for(int i=0; i<iArr.length;i++) System.out.println(iArr[i]); // 배열을 출력하는 방법
		
		System.out.println(Arrays.toString(iArr)); // Arrays.toString(배열이름)으로 배열을 쉽게 출력할 수 있다.
	} // main

}
