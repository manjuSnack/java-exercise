import static java.lang.System.out;

public class Ex7_7 {

	public static void main(String[] args) {
		Car car = null; // 지역변수를 기본값으로 초기화
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null; // 지역변수를 기본값으로 초기화
		
		fe.water();
		car = fe; // car = (car)fe;에서 형변환 생략. 자손타입 → 조상타입으로는 형변환을 생략 가능
//		car.water();
		fe2 = (FireEngine)car; // 조상타입 → 자손타입으로는 형변환을 생략 불가
		fe2.water();
	}
}

class Car {
	String color;
	int door;
	
	void drive() {
		out.println("drive, Brrr~");
	}
	
	void stop() {
		out.println("stop!");
	}
}

class FireEngine extends Car {
	void water() {
		out.println("water!");
	}
}
