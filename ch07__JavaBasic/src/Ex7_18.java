import java.awt.*;
import java.awt.event.*;

// awt : Java의 윈도우 프로그래밍

class Ex7_18 {
	public static void main(String[] args) {
		Button b = new Button("start");
		b.addActionListener(new EventHandler());
	}
}

// 한번 쓰고 나면 끝일 class를 굳이 아래와 같이 작성하지 않고 익명 클래스로 변환하여 쓸 수 있다. Ex7_19 참고
class EventHandler implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		System.out.println("ActionEvent occurred!!!");
	}
}