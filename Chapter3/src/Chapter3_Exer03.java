/**
 * 
 * @author manjuSnack
 *
 * Exercise 03. 1에서 100까지 3의 배수를 더하는 while문이다. 빈칸에 적절한 코드를 삽입하라.
 * 
 */
public class Chapter3_Exer03 {
	
	public static void main(String[] args) {
		int sum = 0, i=1;
		while (i<100) {
			if(i%3 != 0) { // 연산자 / : 나누기(몫), 연산자 % : 나머지
				i++;
				continue; // 정답은 continue; 3의 배수가 아니면 i++ 하나 올리고 합계 계산은 없이 계속 진행
			}
			else sum += i; // a += b는 a = a + b와 동일. 대입연산자로는 += , -= , *= , /= , %= 이 있다.
			i++;
			System.out.println("sum : " + sum + " ( +" + (i-1) + " )");
		}
	}

}
