/**
 * 
 * @author manjuSnack
 *
 * Example 3-13. main()에서 명령행 인자의 합 계산
 * 사용자가 명령행에 입력한 실수들을 main() 메소드에서 전달받아 합을 구하는 프로그램을 작성하라.
 * 
 */
public class Calc {

	public static void main(String[] args) {
		double sum = 0.0;
		
		for (int i = 0; i<args.length; i++)
			sum += Double.parseDouble(args[i]); // 문자열을 실수(double Type)으로 변환하여 합산
		
		System.out.println("sum = "+ sum);
		
	}

}
