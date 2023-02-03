/**
 * 
 * @author manjuSnack
 * 🍘 #ch6-30~31 Overloading
 */
public class Ex6_10 {

	public static void main(String[] args) {
		MyMath3 mm = new MyMath3();
		System.out.println("mm.add(3, 3) 결과: "+ mm.add(3,3)); // 아래 result 매개변수를 통한 구성과 같은 의미라 println()보다 add()가 먼저 호출된다.

		int result = mm.add(3, 3);
		System.out.println("mm.add(3, 3) 결과: "+ result);

		System.out.println("mm.add(3L, 3) 결과: "+ mm.add(3L,3));
		System.out.println("mm.add(3, 3L) 결과: "+ mm.add(3,3L));
		System.out.println("mm.add(3L, 3L) 결과: "+ mm.add(3L,3L));

		int[] a = {100,200,300};
		System.out.println("mm.add(a) 결과: "+mm.add(a));
	}
}

class MyMath3 {
	int add(int a, int b) {
		System.out.print("int add(int a, int b) - ");
		return a+b;
	}
	long add(int a, long b) {
		System.out.print("long add(int a, long b) - ");
		return a+b;
	}
	long add(long a, int b) {
		System.out.print("int add(long a, int b) - ");
		return a+b;
	}
	long add(long a, long b) {
		System.out.print("long add(long a, long b) - ");
		return a+b;
	}
	int add(int [] a) { // 배열의 모든 요소의 합을 결과로 돌려준다.
		System.out.print("int add(int [] a) - ");
		int result = 0;
		for (int i=0; i<a.length; i++)
			result += a[i];
		return result;
	}
}