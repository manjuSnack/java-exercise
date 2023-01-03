/**
 * 
 * @author manjuSnack
 * 
 * CheckTime P127 1번 2중 중첩을 사용한 do-while문
 */
public class CheckTimeP127_1_3 {

	public static void main(String[] args) {
		int i;
		i = 5;
		
		do {
			int j = 0;
			while(j++<i)
				System.out.print("*");
			
			System.out.println();
			i--;
		} while (i>0);

	}

}
