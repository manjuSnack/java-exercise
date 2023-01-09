/**
 * 
 * @author manjuSnack
 *
 * Example 3-12. 배열 리턴
 * 정수 4개를 가지는 일차원 배열을 생성하고 1,2,3,4로 초기화한 다음, 배열을 Return하는 makeArray()를 작성하고
 * 이 메소드로부터 배열을 전달받아 값을 출력하는 프로그램을 작성하라.
 */
public class ReturnArray {
	static int[] makeArray() {
		int temp[] = new int[4];
		for (int i = 0; i<temp.length; i++)
			temp[i] = i;
		return temp;
	}
	
	public static void main(String[] args) {
		int intArray[];
		intArray = makeArray();
		
		for (int i : intArray) // for (int i = 0; i<intArray.length; i++)
			System.out.print(intArray[i] + " ");
	}

}
