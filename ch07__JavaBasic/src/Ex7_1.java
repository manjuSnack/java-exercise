/**
 * 
 * @author manjuSnack
 * 🍭 #ch7-1~2 상속
 * 
 **/
class Tv {
	boolean power; // 전원상태(on/off)
	int channel;
	
	void power() { power = !power; }
	void channelUp() { ++channel; }
	void channelDown() { --channel; }
}

class SmartTv extends Tv { // SmartTv는 Tv에 캡션(자막)을 보여주는 기능을 추가
	boolean caption; // 캡션상태(on/off)
	void displayCaption(String text) {
		if(caption) System.out.println(text); // 캡션상태가 on(true)일때만 text를 보여준다.
	}
}

public class Ex7_1 {

	public static void main(String[] args) {
		SmartTv stv = new SmartTv();
		stv.channel = 10;
		stv.channelUp();
		System.out.println(stv.channel);
		stv.displayCaption("Hello, World");
		stv.caption = true; // 캡션(자막) 기능을 켠다.
		stv.displayCaption("Hello, World");
	}

}
