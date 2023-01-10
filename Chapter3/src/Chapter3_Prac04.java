import java.util.Scanner;

/**
 * 
 * @author manjuSnack
 *
 * Practice 4. Scanner를 이용하여 소문자 알파벳을 하나 입력받고 다음과 같이 출력하는 프로그램을 작성하라.
 * 다음은 e를 입력받았을 경우이다.
 * 
 * Reference : Example 3-3 / 3장까지의 내용만으로는 풀 수 없는 문제
 */
public class Chapter3_Prac04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("소문자 알파벳 하나를 입력하시오>>");
		
		String s = scanner.next();
		char c = s.charAt(0);
		
		for(int i=0; i<=c-'a'; i++) { // c-'a'로 c의 length를 구할 수 있다. 
			for(char j='a'; j<=c-i; j++) // char j = 'a'로 초기화하고 c-i의 length만큼만 char j에 값을 기입한다.
				System.out.print(j);
			System.out.println();
		}
	}

}
