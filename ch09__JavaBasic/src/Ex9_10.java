import static java.lang.System.out;

public class Ex9_10 {

	public static void main(String[] args) {
		int iVal = 100;
		String strVal = String.valueOf(iVal); // int를 String으로 변환
		
		double dVal = 200.0;
		String strVal2 = dVal + ""; // int를 String으로 변환하는 또 다른 방법
		
		double sum = Integer.parseInt("+".trim() + strVal) + Double.parseDouble(strVal2.trim()); 
		double sum2 = Integer.valueOf(strVal) + Double.valueOf(strVal2);
		
		out.println(String.join("", strVal, "+", strVal2, "=") + sum);
		out.println(strVal + "+" + strVal2 + "=" + sum2);
		
	}

}
