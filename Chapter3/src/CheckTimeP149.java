/**
 * 
 * @author manjuSnack
 * 
 * CheckTime P149,
 * 
 * 1번 main() 메소드의 매개변수 타입은 무엇인가? String []로 문자열 배열이다.
 * 2번 main() 메소드에서 사용자가 입력한 명령행 인자의 개수를 알아내는 방법은? args.length로 알아낼 수 있다.
 * 3번 명령행 인자를 모두 출력하는 main() 메소드를 작성하라.
 * 
 */
public class CheckTimeP149 {
	
	// 문제 3번.
	public static void main(String[] args) {
		for (int i = 0; i<args.length; i++)
			System.out.println(args[i]);
	}

}
