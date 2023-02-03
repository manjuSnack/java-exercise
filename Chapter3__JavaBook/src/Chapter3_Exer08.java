/**
 * 
 * @author manjuSnack
 *
 * Exercise 08. 배열을 선언하고 생성하는 다음 물음에 답하라.
 * 
 * (1) 4개의 논리 값을 가진 bool을 선언하고 true, false, false, true로 초기화하라.
 * (2) 5행 4열 크기의 2차원 실수 배열 d를 선언하라.
 * (3) 1에서 12까지 순서대로 초기화되는 4행 3열의 2차원 배열 val을 선언하라.
 */
public class Chapter3_Exer08 {

	public static void main(String[] args) {
		// 보기 1번.
		boolean bool [] = {true, false, false, true};
		
		// 보기 2번.
		double d[][] = new double[5][4];
		
		// 보기 3번.
		int val [][] = { {1,2,3},{4,5,6},{7,8,9},{10,11,12} };
		
		for (int i [] : val)
			for (int j : i)
				System.out.print(j + " ");
	}
}
