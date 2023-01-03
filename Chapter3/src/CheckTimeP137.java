/**
 * 
 * @author manjuSnack
 * 
 * CheckTime P137, 
 * 
 * 1번 10개의 정수를 저장하는 배열 tenArray를 선언하고 생성하는 코드를 작성하라.
 * 2번 배열 tenArray의 크기를 어떻게 알아낼 수 있는가? 답:tenArray.length
 * 3번 배열 tenArray에 1~10까지 저장한 뒤, 모든 원소의 값을 더하여 출력하는 프로그램을 작성하라.
 *
 */
public class CheckTimeP137 {

	public static void main(String[] args) {
		int [] tenArray = new int[10];
		int tenArrayAnother[] = new int[10];
		
		for (int i=0; i<tenArray.length; i++)
			tenArray[i] = i+1;
		
		int sum = 0;
		
		for (int i=0; i<tenArray.length; i++){
			sum = sum + tenArray[i];
		
		System.out.println(sum);
		}
	}

}
