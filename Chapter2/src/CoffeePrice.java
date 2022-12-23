/**
 * 
 * @author manjuSnack
 * 
 * Example 2-15 Switch문 활용
 * switch문을 이용하여 커피 메뉴의 가격을 알려주는 프로그램을 작성하라. 에스프레소, 카푸치노, 카페라떼는 3500원
 * 아메리카노는 2000원이다.
 *
 */
import java.util.Scanner;

public class CoffeePrice {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("무슨 커피를 드릴까요? ");
		String order = scanner.next();
		
		int price = 0;
		switch(order) {
		case "에스프레소":
		case "카푸치노":
		case "카페라떼":
			price = 3500; break;
		case "아메리카노" :
			price = 2000; break;
		default: System.out.println("메뉴가 없습니다.");
		}
		if (price != 0) System.out.print(order + "는 " + price + "원입니다.");
		scanner.close();
	}

}
