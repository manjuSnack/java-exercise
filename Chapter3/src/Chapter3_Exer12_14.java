/**
 * 
 * @author manjuSnack
 *
 * Exercise 12 ~ 14. 
 * 
 * 12번. 다음 그림과 같은 구조를 가지는 double 타입의 2차원 배열을 선언하고, 값을 직접
 * 배열에 삽입하는 방법으로 그림에 있는 값으로 초기화하는 코드를 작성하라.
 * 
 * 13번. 다음 중 main() 메소드에 대한 설명 중 틀린 것은?
 * 
 * (1) 원형은 public abstract void main(String[] args)이다. // 정답 : public static void main(String[] args)이다.
 * 
 * 14번. 다음 문장에서 빈 칸에 적절한 단어를 찾아 삽입하라.
 * 
 * 정답 : JVM(자바 가상 기계), 예외, 일시중단, try, catch, finally.
 */
public class Chapter3_Exer12_14 {
	
	// Exercise 12.
	public static void main(String[] args) {
		double num [][] = new double [4][];
		num[0] = new double[4];
		num[1] = new double[2];
		num[2] = new double[3];
		num[3] = new double[1];
		
		num [0][0] = 1.1;
		num [0][1] = 1.2;
		num [0][2] = 1.2;
		num [0][3] = 1.4;
		num [1][0] = 2.1;
		num [1][1] = 2.2;
		num [2][0] = 3.1;
		num [2][1] = 3.2;
		num [2][2] = 1.2;
		num [3][0] = 4.1;
		
		for (int i = 0; i<num.length; i++) {
			for (int j =0; j<num[i].length; j++)
				System.out.print(num[i][j] + " ");
			System.out.println();
		}
	}
}
