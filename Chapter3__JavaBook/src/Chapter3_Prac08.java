import java.util.Scanner;

/**
 * 
 * @author manjuSnack
 * 
 * Practice 8. 정수를 몇 개 저장할 지 키보드로부터 개수를 입력받아 (100보다 작은 개수) 정수 배열을 생성하고,
 * 이곳에 1에서 100까지 범위의 정수를 랜덤하게 삽입하라. 배열에는 같은 수가 없도록 하고 배열을 출력하라.
 * 
 * 참고 : Chapter 3장 실습문제 9번, 실습문제 16번.
 */
public class Chapter3_Prac08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수 몇 개?");

		int input = scanner.nextInt();
		
		// 🍥 입력받은 값이 100이 넘으면 입력받은 값을 버린다. 문제에선 입력받을 수 있는 범위는 1~100까지다.
		if (input > 100) {
			scanner.nextLine();
		}	
		
		// 🍥 입력받은 정수 값에 따라 배열의 크기를 할당 받는다.		
		int intArray [] = new int[input];
		
		for (int i = 0; i<intArray.length; i++) { 
			// 🍥 false : 중복아님, true : 중복.
			boolean checkBox = false; 
						
			int random = (int)(Math.random()*100 + 1);
			
			// 🍥 배열 안에 값을 검토하는 반복문.
			for (int j = 0; j<intArray.length; j++) { 
				// 🍥 배열 안에 같은 값이 검출 시 반복을 번복한다. 
				if (random == intArray[j]) { 
					checkBox = true;
					i--;
				}	
			}
			if (checkBox != true) // 🍥 중복되지 않을 때 배열 안에 값을 넣는다. 
				intArray[i] = random;
		}
		
		// 🍥 배열 안에 값 출력
		for (int i = 0; i<intArray.length; i++) {
			if(i%10 == 0) 
				System.out.println();
			System.out.print(intArray[i] + " ");
		}
		
		scanner.close();
		}
	}

