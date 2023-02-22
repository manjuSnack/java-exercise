import static java.lang.System.out;

public class Ex8_6 {

	public static void main(String[] args) {
		try {
			Exception e = new Exception("고의로 발생시켰음");
			throw e; // 예외 발생
			
//			throw new Exception("고의로 발생시켰음"); 위의 두 줄을 한 줄로 줄여 쓸 수 있다.
		} catch (Exception e) {
			out.println("에러 메시지 : "+ e.getMessage());
			e.printStackTrace();
		}
		
		out.println("프로그램이 정상 종료되었음.");
	}

}
