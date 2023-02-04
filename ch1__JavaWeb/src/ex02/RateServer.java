
package ex02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 
 * @author manjuSnack
 * 🍭 #1.2 클라이언트-서버 기반 프로그램
 * 
 * Ex1-3
 */

public class RateServer {
	private static float USD_RATE= 1251.00F;
	private static float JPY_RATE= 9.53F;
	private static float CNY_RATE= 183.76F;
	private static float GBP_RATE= 1507.77F;
	private static float EUR_RATE= 1350.58F;
	
	public static void main(String[] args) {
		InputStream is;
		BufferedReader br;
		BufferedWriter bw;
		PrintWriter pw=null;
		OutputStream os;
		ServerSocket serverSocket;
		Socket socket=null;
		String ipAddrs = null;
		String inMessage = null;
		float outMessage=0f;
		
		try {
			serverSocket= new ServerSocket(5434);
			System.out.println("서버 실행 중...");
			
			while(true) {
				// 클라이언트의 접속을 인지 시에 accept() 메소드를 호출해서 소켓 객체를 생성한다.
				socket = serverSocket.accept();
				is = socket.getInputStream();
				os = socket.getOutputStream();
				br = new BufferedReader(new InputStreamReader(is));
				
				String data = br.readLine();
				System.out.println("서버 수신 데이터:"+data);
				
				String result = calculate(data);
				System.out.println("result");
				
				bw = new BufferedWriter(new OutputStreamWriter(os));
				pw = new PrintWriter(bw,true);
				pw.println(result);
				pw.close();
			}
		} catch(IOException ie) {
			ie.printStackTrace();
		} // try-catch
		
	}



private static String calculate(String data) {
	String [] token = data.split(",");
	
	float won = Float.parseFloat(token[0]);
	String operator = token[1];
	String result = null;
	
	switch(operator) {
	case "달러": result=String.format("%.6f", won/USD_RATE); break;
	case "엔화": result=String.format("%.6f", won/JPY_RATE); break;
	case "위안": result=String.format("%.6f", won/CNY_RATE); break;
	case "파운드": result=String.format("%.6f", won/GBP_RATE); break;
	case "유로": result=String.format("%.6f", won/EUR_RATE); break;		
	}
	
	return result;
  }
}