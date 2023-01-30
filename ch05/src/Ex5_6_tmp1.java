import java.util.Arrays;

/**
 * 
 * @author manjuSnack
 * 🍘 #ch5-12~13, String 배열
 */
public class Ex5_6_tmp1 {

	public static void main(String[] args) {
		String[] strArr = {"가위", "바위", "보"};
		System.out.println(Arrays.toString(strArr));
		
		for (int i=0;i<10;i++) {
			int tmp = (int)(Math.random()*3); // 0~2의 난수
			System.out.println(strArr[tmp]); 
		}
	} // main

}
