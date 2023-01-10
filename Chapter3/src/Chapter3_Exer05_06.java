/**
 * 
 * @author manjuSnack
 *
 * Exercise 5~6. 다음 배열 선언이 잘못된 것은? 다음 코드에 대해 실행 중 오류가 발생하는 것은?
 */
public class Chapter3_Exer05_06 {
	
		// 5번 문제.
		int [ ] a = {1,2,3,4,5};
		int b [ ] = {0};
		int [ ] c = new int [3];
		// int d [3] = new int [3]; 정답 : int d [ ] = new int [3];으로 고쳐야 한다.
			
	public static void main(String[] args) {
		
		// 6번 문제.
		int array[] = {1,2,3,4,5};
		
		array[0] = -1;
		int list [] = array;
		System.out.println(array[4]);
		array[array.length] = 100; // 정답 : java.lang.ArrayIndexOutOfBoundsException이 발생한다.
	}

}
