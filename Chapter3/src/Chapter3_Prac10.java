/**
 * 
 * @author manjuSnack
 *
 * Practice 10. 4x4의 2창원 배열을 만들고 이곳에 1에서 10까지 범위의 정수를 10개만 랜덤하게 생성하여 임의의 위치에 삽입하라.
 * 동일한 정수가 있어도 상관없다. 나머지 6개의 숫자는 모두 0이다. 만들어진 2차원 배열을 화면에 출력하라.
 * 
 */
public class Chapter3_Prac10 {

	public static void main(String[] args) {
		int intArray[][] = new int[4][4];
		int count = 0;
		
		while (true) {
			// 🍌 배열 안에 랜덤한 경로
			int x = (int)(Math.random()*4);
			int y = (int)(Math.random()*4);
		
			// 🍌 정수 10개를 입력하면 while문 종료.
			if (count == 10)
				break;
			
			// 🍌 각 배열의 값이 기본값은 0이다. 10개의 정수만 입력하면 되므로 따로 0을 입력할 필요는 없다.
			if (intArray[x][y] == 0) {
				intArray[x][y] = (int)(Math.random()*10 + 1);
				count++;
			}			
		} // while문	
		
		// 🍌 결과 출력
		for (int i [] : intArray) {
			for (int j : i)
				System.out.print(j + "\t");
			System.out.println("");
		}
	}
}

