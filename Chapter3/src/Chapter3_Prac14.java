import java.util.Scanner;

/**
 * 
 * @author manjuSnack
 * 
 * Practice 14. 다음 코드와 같이 과목과 점수가 짝을 이루도록 2개의 배열을 작성하라.
 */
public class Chapter3_Prac14 {

	public static void main(String[] args) {
		String course [] = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
		int score [] = {95, 88, 76, 62, 55};
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("과목 이름>>");
			String name = scanner.next();			

			if (name.equals("그만")) // 맨 아래에 옮길 경우 checkBox if문을 출력하고 while문을 빠져나오게 된다.
				break;
			
			/**
			 * 아래 if문의 else문으로 '없는 과목입니다.'를 넣을 경우 for문의 반복되는 과정에서 여러 번 출력하게 된다. 
			 * 따로 String print라는 변수를 만들어 단일 출력으로 바꾸더라도 이후에 초기값은 바꿀 수 없었다.
			 * 그래서 true와 false로 구분하여 출력할 수 있게 Boolean Type의 checkBox 만들어 이에 따른 결과로 각각 개별로 출력을 할 수 있게 하였다.
			 * 반복문 안에서는 검증하는 과정 중 필요한 검증의 결과를 저장할 수 있는 공간이 필요한 듯 하다.
			 */			
			
			boolean checkBox = false; 
			for (int i = 0; i<course.length; i++) {
				if (course[i].equals(name)) {
					int n = score[i];
					System.out.println(course[i] + "의 점수는 " + n);
					checkBox = true;
				}
			}
			
			if (checkBox == false)
				System.out.println("없는 과목입니다.");			
			
		}
		
		scanner.close();
	
	}

}
