/**
 * 
 * @author manjuSnack
 *
 * 🍘 #Ch3-9~10, 사칙 연산자, 산술변환
 */
public class Ex3_8 {

	public static void main(String[] args) {
		byte a = 10;
		byte b = 30;
//		byte c = a * b; a와 b를 연산할 경우 byte에서 int로 자동 형변환(casting) 후 계산하게 된다. 
		byte c = (byte)(a * b); // int를 byte로 값을 대입할 때에는 형변환을 해주어야 한다.
		System.out.println(c);
	}

}
