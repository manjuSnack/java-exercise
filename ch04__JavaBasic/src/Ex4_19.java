/**
 * 
 * @author manjuSnack
 * 🍘 #ch4-20~24 break문, continue문, 이름붙은 반복문
 */
public class Ex4_19 {

	public static void main(String[] args) {
		Loop1 : for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				if(j==5)
					break Loop1; // 해당 if문일 때 Loop1이라는 for문까지 벗어나 반복을 끝낸다.
//					break; // 해당 if문일 때 하나의 for문만을 벗어난다.
//					continue Loop1; // 해당 if문일 때 Loop1이라는 for문까지 바로 건너뛰어 반복한다. 
//					continue; // 해당 if문만을 건너뛴다.
				System.out.println(i+"*"+j+"="+i*j);
			} // end of for j
			System.out.println();
		} // end of Loop1
	}

}
