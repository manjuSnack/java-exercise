/**
 * 
 * @author manjuSnack
 *
 * 🍘 #Ch3-11~12, 반올림 Math.round(), 나머지 연산자
 */
public class Ex3_11 {

	public static void main(String[] args) {
		double pi = 3.141592;
		double shorPi = Math.round(pi*1000) / 1000.0; // Math.round(식 또는 실수) : 실수를 소수점 첫 째자리에서 반올림한 정수를 반환
		System.out.println(shorPi);
		
		System.out.println(pi);
		System.out.println(pi*1000);
		System.out.println(Math.round(pi*1000));
		System.out.println(Math.round(pi*1000)/1000); // 3
		System.out.println(Math.round(pi*1000)/1000); // 3.142
		
//		만약 3.141로 바꾸려면?
		System.out.println(pi*1000);
		System.out.println((int)(pi*1000)); // 3141
		System.out.println((int)(pi*1000)/1000); // 3. 소수점을 나타내려면 실수인 1000.0으로 나누어주어야 한다.
		System.out.println((int)(pi*1000)/1000.0); // 3.141
	}
}

/*
🍘 #Ch3-11~12, 반올림 Math.round(), 나머지 연산자

실습
Ex3_11.java 참고
Ex3_12.java 참고

🍘 반올림 Math.round()

: 실수를 소수점 첫 째자리에서 반올림한 정수를 반환

long result = Math.round(4.52); 일때 result는 결과가 5이다.

🍘 나머지 연산자 %

: 오른쪽 피연산자로 나누고 남은 나머지를 반환. 나누는 피연산자는 0이 아닌 정수만 허용(부호(Sign type)은 무시됨)
음수 부호를 앞선 나누어햘 할 수에 붙이거나 두 수를 음수 부호를 넣고 나눌 경우 결과값이 음수가 된다.
*/