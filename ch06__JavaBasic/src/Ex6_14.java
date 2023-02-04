/**
 * 
 * @author manjuSnack
 * 🍭 #ch6-38~41 변수의 초기화, 멤버변수의 초기화, 예제
 * 
 **/
public class Ex6_14 {
	static {
		System.out.println("static { }"); // 클래스 초기화 블럭. 첫번째 호출
	}
	
	{
		System.out.println("{ }"); // 인스턴스 초기화 블럭. 세번째 호출, 여섯번째 호출
	}
	
	public Ex6_14() {
		System.out.println("생성자"); // 네번째 호출, 일곱번째 호출
	}
	
	public static void main(String[] args) {
		
		// 클래스 초기화 블럭 --> 인스턴스 초기화 블럭 --> 생성자
		
		System.out.println("Ex6_14 bt = new Ex6_14(); "); // 두번째 호출
		Ex6_14 bt = new Ex6_14();
		
		System.out.println("Ex6_14 bt2 = new Ex6_14(); "); // 다섯번째 호출
		Ex6_14 bt2 = new Ex6_14();
	}

}
