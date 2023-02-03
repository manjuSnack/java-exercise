/**
 * 
 * @author manjuSnack
 * 🍘 #ch6-32~35 생성자( constructor ), 기본생성자
 */

class Data_1 {
	int value;
}
class Data_2 {
	int value;
	
	public Data_2() {} // compile error 발생됬을 때 요구하는 Constructor
	
	public Data_2(int x) { // 매개변수가 있는 생성자
		value = x;
	}
}
public class Ex6_11 {

	public static void main(String[] args) {
		Data_1 d1 = new Data_1();
		Data_2 d2 = new Data_2(); // compile error 발생
		Data_2 d22 = new Data_2(10); // OK
	}

}
