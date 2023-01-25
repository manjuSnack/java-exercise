/**
 * 
 * @author manjuSnack
 * 🍘 #ch4-15, 중첩 for문
 */
public class Ex4_11 {

	public static void main(String[] args) {
		// Ex4_11
		for(int i =1; i<=5; i++) {
			for(int j=1; j<=i;j++) {
				System.out.print("*");
			}
			System.out.println(); // 줄바꿈
		}
		
		// 별(*) 10개씩 찍기
		for (int i=1; i<=5; i++) { // 열의 수
//			System.out.println("**********"); 이 문장대신 아래 for문으로 바꿔 적을 수 있다.
			for(int j=1; j<=10; j++) { // 행의 수
				System.out.print("*");
			}
			System.out.println(); // 줄바꿈
		}
		
		
		// 구구단
		for(int i =2; i<=9; i++) { // 2~9단까지
			for(int j=1; j<=9;j++) { // x1 ~ x9
				System.out.println(i+"*"+j +"="+(i*j));
			}
			System.out.println();
		}
		
	} // main

}
