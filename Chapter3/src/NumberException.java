/**
 * 
 * @author manjuSnack
 *
 * Example 3-18. 정수가 아닌 문자열을 정수로 변환할 때 예외발생(NumberFormatException)
 * 
 * 문자열을 정수로 변환할 때 발생하는 NumberFormatException을 처리하는 프로그램을 작성하라.
 */
public class NumberException {

	public static void main(String[] args) {
		String[] stringNumber = {"23", "12", "3.141592","998"};
		
		int i=0;
		try {
			for (i=0; i<stringNumber.length; i++) {
				int j = Integer.parseInt(stringNumber[i]); // "3.141592"를 정수로 변환할 때 예외발생
				System.out.println("정수로 변환된 값은 " + j);
			}
		} 
		catch (NumberFormatException e) {
			System.out.println(stringNumber[i] + "는 정수로 변환할 수 없습니다.");
		}

	}

}
