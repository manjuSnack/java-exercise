/**
 * 
 * @author manjuSnack
 * 
 * Example 3-8 배열 원소의 평균 구하기
 * 
 * 배열의 length 필드를 이용하여 배열 크기만큼 정수를 입력받고 평균을 구하는 프로그램을 작성하라.
 */
import java.util.Scanner;
public class ArrayLength {

	public static void main(String[] args) {
		int intArray[] = new int[5];
		int sum = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print(intArray.length + "개의 정수를 입력하세요>> ");
		for (int i=0; i<intArray.length; i++)
			intArray[i] = scanner.nextInt();
		
		for (int i=0; i<intArray.length; i++)
			sum += intArray[i];
		
		System.out.print("평균은 " + (double)sum/intArray.length);
		scanner.close();
	}

}
