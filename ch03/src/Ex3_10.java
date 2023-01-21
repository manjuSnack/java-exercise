/**
 * 
 * @author manjuSnack
 * 
 * 🍘 #Ch3-9~10, 사칙 연산자, 산술변환
 */
public class Ex3_10 {

	public static void main(String[] args) {
		long a = 1_000_000 * 1_000_000; // int + int로 계산할 경우 int값이 초과되어 값손실이 발생되는 Overflow가 발생한다. 
		long b = 1_000_000 * 1_000_000L;
		
		System.out.println("a="+a);
		System.out.println("b="+b);
	}

}
