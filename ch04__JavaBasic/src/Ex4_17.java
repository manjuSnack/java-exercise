/**
 * 
 * @author manjuSnack
 * 🍘 #ch4-20~24 break문, continue문, 이름붙은 반복문
 */
public class Ex4_17 {

	public static void main(String[] args) {
		for(int i=0; i<=10; i++) {
			if(i%3==0) continue; // 0을 포함한 3의 배수일때는 다음 반복문으로 건너뛴다.
			if(i%2==0) continue; // 0을 포함한 2의 배수일때는 다음 반복문으로 건너뛴다.
			System.out.println(i);
		}
	}

}
