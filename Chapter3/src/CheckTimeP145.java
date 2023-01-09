/**
 * 
 * @author manjuSnack
 *
 * CheckTime P145,
 * 
 * 1번 다음 중 배열 선언과 생성이 옳은 것은? int a [ ] = new int [5];
 * 2번 int형 원소를 갖는 2x3 크기의 2차원 배열을 생성하라.
 * 3번 다음은 원소 4개로 구성된 일차원 문자 배열을 리턴하는 makeCharArray()를 작성한 코드이다. 빈 칸을 채워라.
 * 4번 다음 그림과 같은 구조와 값을 갖는 비정방형 배열을 생성하라.
 * 
 */
public class CheckTimeP145 {
	// 문제 2번.
	int i [][] = new int [2][3];
	
	// 문제 3번.
	char [] makeCharArray() {
		char [] c = new char [4];
		return c;
	};
	
	// 문제 4번.
	
	public static void main(String[] args) {
	int n [][] = new int [4][];
	n[0] = new int [4];
	n[1] = new int [1];
	n[2] = new int [1];
	n[3] = new int [4];
	
	int k = 0;
	
	// 순서대로 위에서 아래로 k 레퍼런스에 값을 입력
	for (int i = 0; i<n[0].length; i++) { 
		n[0][i] = k++;
	}
	n[1][0] = k++;
	n[2][0] = k++;
	for (int i=0; i<n[3].length; i++) { 
		n[3][i] = k++;
	}
	
	// 값 확인하기
	for ( int x [ ] : n) { 
		for ( int y : x )
			System.out.print(y + " ");
		System.out.println();
	}
	
	}
}
