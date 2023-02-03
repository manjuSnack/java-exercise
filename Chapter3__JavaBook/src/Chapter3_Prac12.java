/**
 * 
 * @author manjuSnack
 *
 * Practice 12. 명령행 인자 중에서 정수만을 골라 합을 구하라.
 * 
 */
public class Chapter3_Prac12 {

	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("명령행 인자가 없습니다.");
			return;
		}
		
		int sum = 0;
		for (int i=0; i<args.length; i++)
			try { 
				sum = sum + Integer.parseInt(args[i]);
			} catch (NumberFormatException e) {
				System.out.println(args[i] + "는 정수가 아닙니다.");
				continue;
		}
		System.out.println("합은 : "+ sum);
	}

}
