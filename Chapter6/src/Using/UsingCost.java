package Using;
import Book.Cost;

/**
 * 
 * @author manjuSnack
 *
 * CheckTime P337. (2) 다음 UsingCost 클래스는 Using 패키지에 속하며, 문제 1에서 작성한 Cost 클래스를 사용한다.
 *  
 */

public class UsingCost {

	public static void main(String[] args) {
		Cost c = new Cost();
		System.out.println(c.sum(1, 2));
	}

}
