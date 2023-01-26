import java.util.Arrays;

/**
 * 
 * @author manjuSnack
 * 🍘 #ch5-8~9, 배열의 활용 (1) ~ (4)
 */
public class Ex5_4 {

	public static void main(String[] args) {
		// 섞기(shuffle)
		int[] numArr = {0,1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(numArr));
		
		for (int i=0; i<numArr.length; i++) {
			int n = (int)(Math.random()*numArr.length); // 배열의 길이 사이에 한 값을 임의로 얻는다. 이 값이 배열을 가리키는 index 값으로 지정된다.
			// ch2-9, 두 변수의 값 바꾸기 - Ex2_8.java와 VarEx2.java 참고
			int tmp = numArr[i];
			numArr[i] = numArr[n];
			numArr[n] = tmp;
		} // for
		System.out.println(Arrays.toString(numArr));
	} // main

}
