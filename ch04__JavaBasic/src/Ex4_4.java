import java.util.Scanner;

/**
 * 
 * @author manjuSnack
 * 🍘 #ch4-5~8, if-else if문과 중첩 if문
 */
public class Ex4_4 {

	public static void main(String[] args) {
		int score = 0;
		char grade = 'D';
		
		System.out.print("점수를 입력하세요.>");
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt();
		
		if (score>=90) grade = 'A';
		else if (score >= 80) grade = 'B';
		else if (score >= 70) grade = 'C';
//		else grade='D'; refactoring 과정에서는 else문을 생략할 수 있다면 생략한다.
		
		System.out.println("당신의 학점은 " + grade + "입니다.");
	}

}

/*
🍘 #ch4-5~8, if-else if문과 중첩 if문

실습 중점
Ex4_4.java
Ex4_5.java

🍘 if-else if문

여러 개 중의 하나가 참 일 때 처리. 여러 개의 조건식을 포함한 조건식

if (조건식1) {
    // 조건식1의 연산결과가 참일 때, 수행될 문장들을 적는다.

} else if (조건식2) {
    // 조건식2의 연산결과가 참일 때, 수행될 문장들을 적는다.

} else if (조건식3) {
    // 조건식3의 연산결과가 참일 때, 수행될 문장들을 적는다.

} else {
    // 마지막은 else Block으로 끝나며, else Block은 생략할 수 있고 위의 어느 조건식도 만족하지 않을 때 수행될 문장들을 적는다.
}

refactoring 과정에서 else는 생략할 수 있다면 생략하는 것이 좋다. 

🍘 중첩 if문, if문 안의 if문

if (조건식1) {
	// 조건식1의 연산결과가 true일 때 수행될 문장들을 적는다.
	
	if (조건식2) {
		// 조건식1과 조건식2가 모두 true일 때 수행될 문장들
	} else {
		// 조건식1이 true이고, 조건식2가 false일 때 수행될 문장들
	}
} else {
	// 조건식1이 false일 때 수행될 문장들
}

: 중첩횟수는 제약이 없다. 
*/
