/**
 * 
 * @author manjuSnack
 *
 * CheckTime P127 1번 2중 중첩을 사용한 for문
 */
public class CheckTimeP127_1_1 {

	public static void main(String[] args) {
		int i;
		for (i=5; i>0; i--) {
			for (int j=0; j<i; j++) 
				System.out.print("*");
			
			System.out.println();
		}

	}

}
