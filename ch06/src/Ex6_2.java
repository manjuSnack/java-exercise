/**
 * 
 * @author manjuSnack
 * 🍘 #ch6-6~7, 객체의 생성과 사용
 */
public class Ex6_2 {

	public static void main(String[] args) {
		// Tv Class는 Ex6_1.java에서 호출
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println("t1의 channel값은 "+ t1.channel + "입니다.");
		System.out.println("t2의 channel값은 "+ t2.channel + "입니다.");
		
		t1.channel = 7;
		System.out.println("t1의 channel값을 "+t1.channel+"로 변경하였습니다.");
		
		System.out.println("t1의 channel값은 "+ t1.channel + "입니다.");
		System.out.println("t2의 channel값은 "+ t2.channel + "입니다.");		
	}

}


