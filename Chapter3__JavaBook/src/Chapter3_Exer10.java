/**
 * 
 * @author manjuSnack
 *
 * Exercise 10. 배열 alpha를 모두 출력하고자 한다. 빈칸에 적절한 코드를 삽입하라.
 * 
 */
public class Chapter3_Exer10 {

	public static void main(String[] args) {
		// 보기 1번.
		char [] alpha = {'a','b','c','d'};
		for (int i = 0; i<alpha.length; i++) 
			System.out.print(alpha[i]);
			
		// 보기 2번.
		char [] alpha2 = {'a','b','c','d'};
		for (int i = 0; i<alpha.length; i++) {
			char c = alpha2[i];
			System.out.print(c);
		}
	}

}
