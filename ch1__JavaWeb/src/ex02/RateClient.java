package ex02;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import ex01.Calculator;

/**
 * 
 * @author manjuSnack
 * 🍭 #1.2 클라이언트-서버 기반 프로그램
 * 
 * Ex1-3
 */

public class RateClient extends JFrame {
	JLabel title = new JLabel("원화");
	JTextField operand = new JTextField(10);
	String[] opExpression = {"선택","달러","엔화","위안","파운드","유로"};
	JComboBox<String> opSelection = new JComboBox<String>(opExpression);
	JTextField txtResult = new JTextField(10);
	JButton btnClear = new JButton("다시 입력");
	
	public RateClient() {
		Container contentPane = this.getContentPane();
		contentPane.setLayout(new FlowLayout());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
	}
	
	private void startFrame() {
		opSelection.addActionListener(new SelectionHandler());
		btnClear.addActionListener(new SelectionHandler());
		
		this.setTitle("클라이언트 프로그램");
		this.add(title);
		this.add(operand);
		this.add(opSelection);
		this.add(txtResult);
		this.add(btnClear);
		this.setSize(700,200);
	}
	
	class SelectionHandler implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==opSelection){
				calculate();
			}else if(e.getSource()==btnClear){
			  init();
			}
		}
	}
	
	private void init() {
		operand.setText("");
		txtResult.setText("");
	}
	
	private void calculate() {
		float won = Integer.parseInt(operand.getText());
		String result=null;
		String operator = opSelection.getSelectedItem().toString();
		
		InputStream is;
		BufferedReader br;
		BufferedWriter bw;
		OutputStream os;
		PrintWriter pw=null;
		
		try {
			Socket socket = new Socket("127.0.0.1",5434);
			
			os = socket.getOutputStream();
			is = socket.getInputStream();
			System.out.printf("전송데이터: %.6f, %.6f%n", won, operator);
			
			bw = new BufferedWriter(new OutputStreamWriter(os));
			pw = new PrintWriter(bw, true);
			pw.println(won+","+operator);
			
			br = new BufferedReader(new InputStreamReader(is));
			result = br.readLine();
			System.out.println("클라이언트 수신 데이터:"+result);
			txtResult.setText(result);
			socket.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		RateClient calc = new RateClient();
		calc.startFrame();
	}

}
