/**
 * 
 * @author manjuSnack
 * 
 * Ch2-9. 두 변수의 값 바꾸기
 */
public class VarEx2 {

	public static void main(String[] args) {
		int x = 4, y = 2;
		int tmp;
		
//		순서대로 x의 값을 tmp에 저장, y의 값을 x에 저장, y에 tmp의 값(x의 처음값) 저장
		tmp = x; 
		x = y;
		y = tmp;
		
		System.out.println("x="+x);
		System.out.println("y="+y);
	}

}
