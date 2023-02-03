import java.util.Scanner;

/**
 * 
 * @author manjuSnack
 * 🍘 #ch4-16~19 while문, do-while문
 */
public class Ex4_14 {

	public static void main(String[] args) {
		int num = 0, sum = 0;
		System.out.print("숫자를 입력하세요(예:12345)>");
		
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine(); // 화면을 통해 입력받은 내용을 tmp에 저장
		num = Integer.parseInt(tmp); // 입력받은 문자열(tmp)을 숫자로 변환
		
		while (num!=0) {
			// num을 10으로 나눈 나머지를 sum에 더한다.
			sum += num%10; // sum = sum + num%10;
			System.out.printf("sum=%3d num=%d%n", sum, num);
			
			num /= 10; // num = num / 10; num을 10으로 나눈 값을 다시 num에 저장
		}
		System.out.println("각 자리수의 합:"+sum);
		sum = 0;
		
		// for문으로 바꿨을 때
		for(num=Integer.parseInt(tmp); num>0; num=num/10) {
			System.out.println(num%10);
			sum += num%10;
		}
		System.out.println("각 자리수의 합:"+sum);
		sum = 0;
		
		// while문으로 바꿧을 때
		num = Integer.parseInt(tmp);
		
		while(num>0) {
			sum += num%10;
			System.out.println("sum="+sum+ ",num%10="+num%10);
			num = num / 10; // num /= 10;
		}
		System.out.println("각 자리수의 합:"+sum);
	}

}
