import java.util.Arrays;

/**
 * 
 * @author manjuSnack
 * 🍘 #ch5-8~9, 배열의 활용 (1) ~ (4)
 */
public class Ex5_5 {

	public static void main(String[] args) {
		// 로또 번호 만들기
		int[] ball = new int[45]; // 로또 공 갯수 45개(index 범위 : 0~44 ) 생성
		
		for (int i=0; i<ball.length; i++) ball[i] = i+1; // 순서대로 ball[0]에 1이 저장되며 배열의 각 요소에 1~45를 저장한다.
		System.out.println(Arrays.toString(ball)); // 로또 번호 1~45를 가진 공
		
		int tmp = 0; // 두 값을 바꾸는데 사용될 임시변수
		int j = 0; // 난수를 얻어 저장될 변수
		
		for (int i=0; i < 6; i++) {
			j = (int)(Math.random()*ball.length); // 0~44범위의 임의의 값을 얻는다. 배열의 index를 가리킬 때 쓰인다.
			// ball[i]와 ball[j]를 섞는다.
			tmp = ball[i];
			ball[i] = ball[j];
			ball[j] = tmp;
		} // for
		
		for (int i=0; i< 6; i++) System.out.printf("ball[%d]=%d%n", i+1, ball[i]);
	} // main
}
