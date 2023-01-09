/**
 * 
 * @author manjuSnack
 *
 * Example 3-11. 비정방형 배열의 생성과 접근
 * 다음 그림과 같은 비정방형 배열을 만들어 값을 초기화하고 출력하라.
 * 
 */
public class SkewedArray {

	public static void main(String[] args) {
		int intArray[][] = new int[4][];
		intArray[0] = new int [3];
		intArray[1] = new int [2];
		intArray[2] = new int [3];
		intArray[3] = new int [2];
		
		for (int i=0; i<intArray.length; i++)
			for (int j=0; j<intArray[i].length; j++)
				intArray[i][j] = (i+1)*10 + j;
		
		for (int i=0; i<intArray.length; i++)
			for (int j=0; j<intArray[i].length; j++)
				System.out.print(intArray[i][j] + " ");
			System.out.println(); // 다음 줄로 넘어가기
		
		// for-each문은 배열의 값을 읽어들일 때 적합하다.
		for (int[] i : intArray) // i = intArray[0], intArray[1], intArray[2] ... 순으로 바뀌면서 반복
			for (int j : i) // j = i(intArray[0])의 열, i(intArray[1])의 열 ...
				System.out.print(j + " ");
			System.out.println();
	}

}
