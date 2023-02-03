/**
 * 
 * @author manjuSnack
 * 🍘 #ch6-12~13, 클래스 변수, 인스턴스 변수
 */
public class Ex6_3 {

	public static void main(String[] args) {
		System.out.println("Card.width = "+ Card.width);
		System.out.println("Card.height = "+ Card.height);
		
		Card c1 = new Card();
		c1.kind = "heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")" );
		System.out.println("c2은 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")" );
		System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다." );
		Card.width = 50; // c1.width, c1.height로 작성할 경우 Instance variable로 오해할 수 있기 때문에 '클래스명.클래스변수'로 작성하여야 한다.
		Card.height = 80;
		
		System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")" );
		System.out.println("c2은 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")" );
	}

}

class Card {
	String kind;
	int number;
	static int width = 100;
	static int height = 250;
}