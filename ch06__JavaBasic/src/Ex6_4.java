/**
 * 
 * @author manjuSnack
 * 🍘 #ch6-17~19, 메서드호출
 */
public class Ex6_4 {

	public static void main(String[] args) {
		MyMath mm = new MyMath();
		
		long result1 = mm.add(5L, 3L);
		long result2 = mm.substract(5L, 3L);
		long result3 = mm.multyply(5L, 3L);
		double result4 = mm.divide(5L, 3L); // 반환값은 double로 자동 형변환이 된다.
		
		System.out.println("add(5L, 3L) = "+ result1);
		System.out.println("substract(5L, 3L) = "+ result2);
		System.out.println("multiply(5L, 3L) = "+ result3);
		System.out.println("divide(5L, 3L) = "+ result4);
	}

}

class MyMath {
	long add(long a, long b) {
		long result = a + b;
		return result;
//		return a + b; // 위에 두 줄을 이와 같이 한줄로 간단히 작성할 수 있다.
	}
	
	long substract(long a, long b) { return a-b; }
	long multyply(long a, long b) { return a*b; }
	double divide(double a, double b) { return a / b; }
}
