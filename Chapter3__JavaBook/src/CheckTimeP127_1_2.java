/**
 * 
 * @author manjuSnack
 * CheckTime P127 1번 2중 중첩을 사용한 while문
 */
public class CheckTimeP127_1_2 {

	public static void main(String[] args) {
		int i;
		i = 5;
		while (i>0) {
			int j = 0;
			while (j++<i) 
				System.out.print("*");
			
			System.out.println();
			i--;
		}

	}

}
