/**
 * 
 * @author manjuSnack
 *
 * Ch02-15~16, 정수형의 오버플로우(Overflow, 넘치다), 부호있는 정수의 오버플로우(Overflow)
 */
public class Ex2_11 {

	public static void main(String[] args) {
		short sMin = -32768, sMax = 32767; // 부호있는 정수
		char cMin = 0, cMax = 65535; // 부호없는 정수
		
		System.out.println("sMin = " + sMin);
		System.out.println("sMin-1 = " + (short)(sMin-1));
		System.out.println("sMax = " + sMax);
		System.out.println("sMax+1 = " + (short)(sMax+1));
		System.out.println("cMin = " + (int)cMin);
		System.out.println("cMin-1 = " + (int)--cMin);
		System.out.println("cMax = " + (int)cMax);
		System.out.println("cMax+1 = " + (int)++cMax);
	}

}

/*
🍘 #Ch02-15~16, 정수형의 오버플로우(Overflow, 넘치다)

실습

Ex2_11.java 참고

10진수를 예를 들면, 계수기(Counter)처럼 최대값인 9999 다음 10000이 아닌 다시 0000, 0001, 0002, ... 과 같이 정해진 숫자 안에서 다시 초기화되어 0부터 시작하는 것을 Overflow라고 한다.

2진수도 마찬가지로 4개의 bit로 구성될 때 최대값인 1111 다음 10000이 아닌 다시 0000, 0001, 0010, ... 과 같이 다시 초기화되어 0부터 시작되는 것을 Overflow라고 한다.

결국, 최대값 + 1은 최소값으로 돌아가며 최소값 - 1은 최대값으로 돌아간다.
Overflow원리는 TV의 채널을 올리고 내리는 것과 유사하다.

🍘 부호없는 정수와 부호있는 정수, 4bit의 경우

: 부호없는 정수인 4bit의 표현범위는 0(최소값) ~ 15(최대값)

15 + 1 = 0
0 - 1 = 15

: 부호있는 정수인 4bit의 표현범위는 -8(최소값) ~ 7(최대값)이다.

7 + 1 = 8
8 - 1 = 7

부호없는 정수는 2진수로 '0000'이 될 때 Overflow가 발생하고 
부호있는 정수는 부호비트(Sign bit)가 0 (7은 0111)에서 1(-8은 1000)이 될 때 Overflow가 발생한다.
*/