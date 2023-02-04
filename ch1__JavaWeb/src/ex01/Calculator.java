package ex01;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
	
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * 
 * @author manjuSnack
 * 🍭 #1.1 클라이언트 PC 기반 프로그램
 * 
 * Ex1_2 Calculator
 *  
**/

public class Calculator extends JFrame {
	// 2023/02 기준
	private static float USD_RATE= 1251.00F;
	private static float JPY_RATE= 9.53F;
	private static float CNY_RATE= 183.76F;
	private static float GBP_RATE= 1507.77F;
	private static float EUR_RATE= 1350.58F;
	
	JLabel title = new JLabel("원화");
	JTextField operand = new JTextField(10);
	String[] opExpression = {"선택","달러","엔화","위안","파운드","유로"};
	JComboBox<String> opSelection = new JComboBox<String>(opExpression);
	JTextField txtResult = new JTextField(10);
	JButton btnClear = new JButton("다시입력");
	
	public Calculator() {
		Container contentPane = this.getContentPane();
		contentPane.setLayout(new FlowLayout());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
	}
	
	private void startFrame() {
		opSelection.addActionListener(new SelectionHandler());
		btnClear.addActionListener(new SelectionHandler());
		
		this.setTitle("환율 계산하기");
		this.add(title);
		this.add(operand);
		this.add(opSelection);
		this.add(txtResult);
		this.add(btnClear);
		this.setSize(700, 200);
	}
	
	class SelectionHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==opSelection) {
				calculate();
			} else if (e.getSource()==btnClear) {
				init();
			}
		}
	}
	
	private void calculate() {
		float won = Float.parseFloat(operand.getText());
		String result = null;
		String operator = opSelection.getSelectedItem().toString();
		
		switch(operator) {
		case "달러": result=String.format("%.6f", won/USD_RATE); break;
		case "엔화": result=String.format("%.6f", won/JPY_RATE); break;
		case "위안": result=String.format("%.6f", won/CNY_RATE); break;
		case "파운드": result=String.format("%.6f", won/GBP_RATE); break;
		case "유로": result=String.format("%.6f", won/EUR_RATE); break;		
		}
		txtResult.setText(result);
	}
	
	private void init() {
		operand.setText("");
		txtResult.setText("");
	}
	
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.startFrame();
	}

}
