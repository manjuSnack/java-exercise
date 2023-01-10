/**
 * 
 * @author manjuSnack
 *
 * Practice 11. 다음과 같이 작동하는 Average.java를 작성하라.
 * 명령행 인자는 모두 정수만 사용되며 정수들의 평균을 출력한다. 다음 화면은 컴파일된 Average.class 파일을
 * c:\Temp 디렉터리에 복사한 뒤 실행한 경우이다. 원본 Average.class 파일은 이클립스의 프로젝트 폴더 밑에 bin 폴더에 있다.
 * 
 */
public class Chapter3_Prac11 {

	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("명령행 인자가 없습니다.");
			return;
		}
		
		int sum = 0;
		for (int i=0; i<args.length; i++) {
			sum = sum + Integer.parseInt(args[i]); // 인자를 정수로 변환하여 합산
		}
		System.out.println(sum/args.length); // 평균값 출력

	}

}
