/**
 * 
 * @author manjuSnack
 * 
 * 🍘 #Ch03-5~6, 증감연산자, 부호연산자( 단항연산자 )
 */
public class Ex3_4 {

	public static void main(String[] args) {
		int i = -10;
		i = +i;
		System.out.println(i);
		
		i = -10;
		i = -i;
		System.out.println(i); // i = -(-10)으로 양수로 바뀐다.
	}

}
