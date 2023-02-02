/**
 * 
 * @author manjuSnack
 * 🍘 #ch6-6~7, 객체의 생성과 사용
 */
public class Ex6_1 {

	public static void main(String[] args) {
		Tv t;				// Tv인스턴스를 참조하기 위한 변수 t를 선언
		t = new Tv();		// Tv인스턴스를 생성
		t.channel = 7; 		// Tv인스턴스의 멤버변수 channel의 값을 7로
		t.channelDown(); 	// Tv인스턴스의 메서드 channelDown()을 호출
		System.out.println("현재 채널은 "+ t.channel + " 입니다.");
	}
}

class Tv {
	// Tv의 속성(멤버변수 field)
	String color;	// 색상
	boolean power;	// 전원상태(on/off)
	int channel;	// 채널
	
	// Tv의 기능(메서드)
	void power() { power = !power; } 	// TV on/off method()
	void channelUp() { ++channel; }		// TV 채널 높이는 기능인 method()
	void channelDown() { --channel; }	// TV 채널 낮추는 기능인 method()
}
