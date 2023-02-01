import java.util.Arrays;

/**
 * 
 * @author manjuSnack
 * 🍘 #ch5-24, Arrays로 배열 다루기
 */
public class Ex5_10_tmp {

	public static void main(String[] args) {
		// 배열의 출력
		int[] arr = {0,1,2,3,4}; 			// 1차원 배열 arr
		int[][] arr2D = {{11,12},{21,22}}; 	// 2차원 배열 arr2D

		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2D)); // 타입@메모리주소로 출력. 틀린 방법
		System.out.println(Arrays.deepToString(arr2D)); 

		// 배열의 비교
		String[][] str2D = new String[][] {{"aaa","bbb"},{"AAA","BBB"}};
		String[][] str2D2 = new String[][] {{"aaa","bbb"},{"AAA","BBB"}};

		System.out.println(str2D==str2D2); // false. 틀린 방법
		System.out.println(str2D.equals(str2D2)); // false. 틀린 방법
		System.out.println(Arrays.deepEquals(str2D, str2D2));

		// 배열의 복사
		int[] arr2 = Arrays.copyOf(arr, arr.length);
		int[] arr3 = Arrays.copyOf(arr, 3);
		int[] arr4 = Arrays.copyOf(arr, 7);			// [0, 1, 2, 3, 4, 0, 0]
		int[] arr5 = Arrays.copyOfRange(arr, 2, 4); // [2, 3]
		
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
		System.out.println(Arrays.toString(arr5));
		
		// 배열의 정렬
		arr = new int[] {2,4,3,0,1}; // arr 요소의 순서 섞기
		Arrays.sort(arr); // 오름차순 정렬. 내림차순에 관해서는 11장, 컬렉션 프레임웍에서
		
		System.out.println(Arrays.toString(arr));
	}

}
