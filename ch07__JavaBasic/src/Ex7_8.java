import static java.lang.System.out;

class Product {
	int price;		// 제품 가격
	int bonusPoint;	// 제품 구매 시 보너스 점수
	
	// 생성자(Constructor)
	public Product(int price) {
		this.price = price;
		this.bonusPoint = (int)(price/10.0);	// 제품 가격 10%가 보너스 점수
	}
}

class Tv1 extends Product {
	Tv1() {
		// 조상클래스의 생성자 Product(int price)를 호출
		super(100);	// Tv의 가격을 100만원
	}
	
	// Object 클래스의 toString()을 overriding
	public String toString() { return "Tv"; }
}

class Computer extends Product {
	Computer() {
		super(200); // Computer의 가격을 200만원
	}
	
	public String toString() { return "Computer"; }
}

class Buyer {			// 고객, 물건을 사는 사람
	int money = 1000;	// 소유금액
	int bonusPoint = 0;	// 보너스점수
	
	void buy(Product p) {
		if (money < p.price) {
			out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		
		money -= p.price;						// 고객이 갖고 있는 돈에서 구입한 물건의 가격을 뺀다.
		bonusPoint += p.bonusPoint;				// 고객이 구매한 제품의 보너스 점수를 추가한다.
		out.println(p + "을/를 구입하셨습니다.");	// 참조변수 + 문자열은 `참조변수.toString() + 문자열`과 같다.
	}

}

public class Ex7_8 {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		b.buy(new Tv1());
		b.buy(new Computer());
		
		out.println("현재 남은 돈은 " + b.money + "만원입니다.");
		out.println("현재 보너스 점수는 " + b.bonusPoint + "점입니다.");
	}

}
