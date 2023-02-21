import java.awt.*;
import java.awt.event.*;

public class Ex7_19 {

	public static void main(String[] args) {
		Button b = new Button("start");
		b.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("ActionEvent occurred!!");
			}
		} // 익명 클래스의 끝

	);
} // main의 끝

}
