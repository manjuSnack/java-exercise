/**
 * 
 * @author manjuSnack
 *
 * Exercise 04. 1에서 50까지의 합을 더하는 while문이다. 빈칸에 적절한 코드를 삽입하라.
 */
public class Chapter3_Exer04 {

	public static void main(String[] args) {
		int sum = 0, i=1;
		while(true) {
			if (i>50) break; // (i>50)이 정답.
			sum += i;
			i++;
		}
		System.out.println("while문이 끝난 i의 값 : " + i);
		System.out.print("while문이 끝난 후 sum의 값 :" + sum);

	}

}
