/**
 * 
 * @author manjuSnack
 *
 * Exercise 09. 다음 자바 코드에 대해 답하라.
 * 
 * int myArray[];
 * myArray[0] = 1;
 * myArray[1] = myArray[0] + 1;
 * 
 * (1) 어느 부분에 컴파일 오류가 있으며, 오류의 발생 원인은 무엇인가? java.lang.Error인 Compile오류, 초기화하지 않은 상태로 배열을 참조한 상태이다.
 * (2) 오류를 수정하라.
 */
public class Chapter3_Exer09 {

	public static void main(String[] args) {
		
		// 보기 2.
		int myArray[] = new int[2]; // 임의의 값으로 배열에 할당한다.
		myArray[0] = 1;
		myArray[1] = myArray[0] + 1;
		
	}

}
