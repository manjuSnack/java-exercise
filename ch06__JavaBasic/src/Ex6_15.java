import java.util.Arrays;

/**
 * 
 * @author manjuSnack
 * 🍭 #ch6-38~41 변수의 초기화, 멤버변수의 초기화, 예제
 */
public class Ex6_15 {
	static int[] arr = new int[10];
	
	static {
		for(int i=0;i<arr.length;i++) {
			// 1과 10사이의 임의의 값을 배열 arr에 저장한다.
			arr[i] = (int)(Math.random()*10+1);
		}
	}

	int[] iArr = new int[10];
	
	{
		for(int i=0;i<arr.length;i++) {
			iArr[i] = (int)(Math.random()*10+1);
		}
	}
	
	public Ex6_15() {
		
	}
	
	public static void main(String[] args) {
		for(int i=0; i<arr.length;i++) {
			System.out.println("arr["+i+"] :"+arr[i]);
		}
		
		// 인스턴스는 생성하고 난 뒤 호출할 수 있다.
		Ex6_15 bt = new Ex6_15();
		System.out.println(Arrays.toString(bt.iArr));
		
	}

}
