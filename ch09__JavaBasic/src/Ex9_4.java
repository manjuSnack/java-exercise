import static java.lang.System.out;

import java.util.Objects;

class Card {
	String kind;
	int number;
	
	Card(){
		this("SPADE", 1);
	}
	
	Card(String kind, int number){
		this.kind = kind;
		this.number = number;
	}
	
	public boolean equals(Object obj) {
		if(!(obj instanceof Card))
			return false;
		
		Card c = (Card)obj;
		
		return this.kind == c.kind && this.number == c.number;
	}
	
	// equls( )를 오버라이딩하면 hashCode( )도 오버라이딩 해야한다.
	public int hashCode() {
		return Objects.hash(kind, number); // 매개변수가 가변인자(Object..)라서 호출 시 지정하는 값의 개수가 굳이 정해져있지 않다
	}
}

public class Ex9_4 {

	public static void main(String[] args) {
		Card c1 = new Card();
		Card c2 = new Card();
		
		out.println(c1.toString());
		out.println(c2.toString());
	}

}
