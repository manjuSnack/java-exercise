/**
 * 
 * @author manjuSnack
 *
 * Example 3-4 2중 중첩을 이용한 구구단 출력
 * 2중 중첩 for문을 사용하여 구구단을 출력하는 프로그램을 작성하라.
 * 
 * 한줄에 한 단씩 출력한다.
 */
public class NestedLoop {

	public static void main(String[] args) {
		for(int i=1; i<10; i++) {
			for(int j=1; j<10; j++) {
				System.out.print(i + "*" + j + "=" + i*j);
				System.out.print('\t');
			}
			System.out.println();
		}
	}

}
