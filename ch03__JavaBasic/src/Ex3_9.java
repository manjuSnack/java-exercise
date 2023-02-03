/**
 * 
 * @author manjuSnack
 *
 * 🍘 #Ch3-9~10, 사칙 연산자, 산술변환
 */
public class Ex3_9 {

	public static void main(String[] args) {
		int a = 1_000_000; // 1,000,000	1백만 = 10의 6제곱
		int b = 2_000_000; // 2,000,000	2백만 = 10의 6제곱
		
//		10의 12제곱. int의 범위는 10의 9제곱이 한계.
//		long c = a * b; // a * b = 2,000,000,000,000 ? Overflow 발생으로 값이 손실된다.
		
		long c = (long)a * b; // 그래서 어느 한쪽을 형변환하여야 한다.
		
		System.out.println(c);
	}

}
