/**
 * 
 * @author manjuSnack
 * 
 * Check Time Example 1, 2, 3
 *
 */
public class CheckTimeP93 {

	public static void main(String[] args) {
		// 1. 다음 문장을 수행한 후 z값은?
		int x =2, y=10, z = 0;
		z = x++*2+--y-5+x*(y%2);
		
		System.out.println(z);
		
		// 2. 다음 문장을 실행하면 화면에 출력되는 값은?
		System.out.println(8 >> 2);
		System.out.println(-16 >> 2);
		
		// 다음 문장을 실행하면 화면에 출력되는 값은?
		int opr = 4;
		System.out.println(opr++);
		
	}

}
