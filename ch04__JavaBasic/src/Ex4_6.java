import java.util.Scanner;

/**
 * 
 * @author manjuSnack
 * 🍘 #ch4-9~11, switch문
 */
public class Ex4_6 {

	public static void main(String[] args) {
		System.out.print("현재 월을 입력하세요.>");
		
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		
		switch(month) {
			case 3:	
			case 4: 
			case 5:
				System.out.println("현재의 계절은 봄입니다.");
				break;
			case 6: case 7: case 8: // 나란히 작성하여도 상관없다.
				System.out.println("현재의 계절은 여름입니다.");
				break;
			case 9: case 10: case 11:
				System.out.println("현재의 계절은 가을입니다.");
				break;
			default:
//				case 12: case 1: case 2:
				System.out.println("현재의 계절은 겨울입니다.");
		}
		
	}

}

/*
🍘 #ch4-9~11, switch문

Ex4_6.java

🍘 switch문

처리해야 하는 경우의 수가 많을 때 사용하는 조건문, if else문과 switch문을 주로 쓴다.

switch (조건식) {
	case 값1 :
		// 조건식의 결과가 값1과 같을 경우 수행될 문장들
		// ...
		break;
	case 값2 :
		// 조건식의 결과가 값2와 같을 경우 수행될 문장들
		// ...
		break;
	// ...
	default :
		// 조건식의 결과와 일치하는 case문이 없을 때 수행될 문장들
		// ...
}

: default문은 switch문은 제일 마지막에 오면 벗어나는 조건문이므로 break; 를 생략할 수 있고, default문 또한 생략할 수 있다.
그러나 그외 작업문에서 break; 가 없는 경우 다음 작업문에 break; 까지 수행하므로 실수로 break;를 생략하지 않도록 주의해야 한다.

: if문의 조건식에서는 true, false로만 계산하지만 switch문의 조건식은 정수와 문자열만 올 수 있다. switch문은 제약조건이 있다.
이 때문에 if문에서 switch문으로 변환할 수 없는 경우가 있어 if문을 쓰는 경우도 있다.

🍘 switch문의 제약조건

1. switch문의 조건식 결과는 정수 또는 문자열이어야 한다.
: 단, JDK 1.7 이후에만 문자열도 허용되지만 실무에서는 JDK 1.7보다 낮은 버전을 사용하기도 한다.

2. case문의 값은 정수, 상수(문자 포함), 문자열만 가능하며, 중복되지 않아야 한다.
: 따라서 변수, 실수는 사용할 수 없다. 상수의 경우에는 초기화한 변수로 고정된 값을 제공하므로 사용할 수 있다.
*/

