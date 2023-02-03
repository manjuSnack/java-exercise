/**
 * 
 * @author manjuSnack
 *
 * 🍘 #Ch3-11~12, 반올림 Math.round(), 나머지 연산자
 */
public class Ex3_12 {

	public static void main(String[] args) {
		int x = 10;
		int y = 8;
		
		System.out.printf("%d을 %d로 나누면, %n", x, y);
		System.out.printf("몫은 %d이고, 나머지는 %d입니다.%n", x / y, x % y);
		
		// 단항으로 나누기 할 때는 양수, 음수를 가지지 않는다.
		System.out.println(10 % 8); // 2
		System.out.println(10 % -8); // 위와 같은 결과를 얻는다.
	}

}
