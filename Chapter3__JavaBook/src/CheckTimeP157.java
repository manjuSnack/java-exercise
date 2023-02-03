/**
 * 
 * @author manjuSnack
 *
 * CheckTime P157.
 * 
 * 1번 예외가 발생할 소지가 있는 코드는 try 블록에 두는가, catch 블록에 두는가? try블록
 * 2번 다음 밑줄 친 문장을 실행할 때 발생하는 예외는 무엇인가?
 * 
 */
public class CheckTimeP157 {

	public static void main(String[] args) {
		
		// 2-1번.
		int ar [] = new int[3];
		try {
			ar[4] = 5;
		} catch (ArrayIndexOutOfBoundsException e) { 
			System.out.println("ArrayIndexOfBoundsException : 배열의 범위를 벗어난 접근 시 발생");
		}
		
		// 2-2번
		String s = "Java";
		try {
			int n = Integer.parseInt(s);
		} catch (NumberFormatException e) {
			System.out.println("NumberFormatException : 문자열이 나타내는 숫자와 일치하지 않는 타입의 숫자로 변환시 발생");
		}
		
		// 2-3번
		int arr [];
		try {
			// arr[2] = 4;
		} catch (NullPointerException e) {
			System.out.println("NullPointerException : Null Reference를 참조할 때 발생");
		}
	}

}
