/**
 * 
 * @author manjuSnack
 *
 * Practice 2. 다음 2차원 배열 n을 출력하는 프로그램을 작성하라.
 */
public class Chapter3_Prac02 {

	public static void main(String[] args) {
		int n [][] = {{1}, {1,2,3}, {1}, {1,2,3,4}, {1,2}};
		
		for (int i [] : n) {
			for (int j : i)
				System.out.print(j + " ");
			System.out.println();
		} 
	}

}
