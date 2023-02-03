/**
 * 
 * @author manjuSnack
 * 🍘 #ch4-20~24 break문, continue문, 이름붙은 반복문
 */
public class Ex4_16 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		
//		while (true) {
		for (;;) { // for (;true;)도 같다. for문에서의 무한 반복일 때
			if(sum > 100) break;
			++i;
			sum += i;
		} // end of while
		
		System.out.println("i="+i);
		System.out.println("sum="+sum);
	}

}
