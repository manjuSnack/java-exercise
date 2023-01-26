import java.util.Arrays;

/**
 * 
 * @author manjuSnack
 * 🍘 #ch5-6~7, 배열의 출력
 */
public class Ex5_1 {

	public static void main(String[] args) {
		int[] iArr1 = new int[10];
		int[] iArr2 = new int[10];
//		int[] iArr3 = new int[] {100,95,80,70,60};
		int[] iArr3 = {100,95,80,70,60};
		char[] chArr = {'a','b','c','d'};
		
		for (int i=0;i<iArr1.length;i++) iArr1[i] = i+1; // 1~10의 숫자를 순서대로 배열에 넣는다.
		
		for (int i=0;i<iArr2.length;i++) iArr2[i] = (int)(Math.random()*10) + 1; // 1~10의 난수를 배열에 저장
		
		// 배열의 값 출력
		for (int i=0; i<iArr1.length; i++) System.out.print(iArr1[i]+",");
		System.out.println();
		
		System.out.println(Arrays.toString(iArr2)); // for문보다 배열의 값을 쉽게 출력할 수 있다.
		System.out.println(Arrays.toString(iArr3));
		System.out.println(Arrays.toString(chArr));
		System.out.println(iArr1); // [I@1c4af82c 에서 @뒤에 값은 메모리가 저장된 위치를 나타내기 때문에 매번 달라진다.
		System.out.println(iArr2); // [I@379619aa
		System.out.println(iArr3); // [I@cac736f
		System.out.println(chArr); // char type인 배열에 대해서만 위에 [I@~ 와는 다르게 출력해준다.
	}

}
