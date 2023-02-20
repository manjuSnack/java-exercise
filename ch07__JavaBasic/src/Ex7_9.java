import static java.lang.System.out;

import java.util.Vector;

class Product2 {
	int price;
	int bonusPoint;
	
	public Product2(int price) {
		this.price = price;
		this.bonusPoint = (int)(price/10.0);
	}
	
	public Product2() {}	// 기본 생성자
}

class Tv2 extends Product2 {
	Tv2() {
		super(100);
	}
	
	public String toString() { return "Tv"; }
}

class Computer2 extends Product2 {
	Computer2() {
		super(200);
	}
	
	public String toString() { return "Computer";}
}

class Audio2 extends Product2 {
	Audio2() {
		super(50);
	}
	public String toString() { return "Audio"; }
}

class Buyer2 {
	int money = 1000;
	int bonusPoint = 0;
	Product2[] cart = new Product2[10];		// 구입한 제품을 저장하기 위한 배열
	int i = 0;								// 배열에 넣은 제품을 셀 카운터
	
	void buy(Product2 p) {
		if(money < p.price) {
			out.println("잔액이 부족하여 물건을 살 수 없습니다. ");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		cart[i++] = p; 							// 자손타입의 참조변수에 따라 반환된 문자열을 차례로 저장.
		out.println(p + "을/를 구입하셨습니다.");
	}
	
	void summary() {			// 구매한 물품에 대한 정보를 요약
		int sum = 0;			// 구입한 물품의 가격합계
		String itemList = "";	// 구입한 물품목록
		
		// 반복문을 이용하여 구입한 물품의 총 가격과 목록을 만든다.
		for (int i=0; i<cart.length; i++) {
			if(cart[i]==null) break;
			sum += cart[i].price;		// 배열로 저장된 자손타입 참조변수에 따른 가격을 차례로 더하여 저장.
//			itemList += cart[i] + ", ";	// 배열로 저장된 자손타입 참조변수에 따른 문자열을 차례로 저장.
			itemList += (i == 0) ? "" + cart[i] : ", " + cart[i];
		}
		
		out.println("구입하신 물품의 총 금액은 " + sum + "만원입니다.");
		out.println("구입하신 제품은 " + itemList + "입니다.");
	}
}

public class Ex7_9 {

	public static void main(String[] args) {
		Buyer2 b = new Buyer2();
		
		b.buy(new Tv2());
		b.buy(new Computer2());
		b.buy(new Audio2());
		b.summary();
	}

}
