import static java.lang.System.out;
import java.io.*;

public class Ex8_10 {

	public static void main(String[] args) {
		try {
			File f = createFile(args[0]);
			out.println( f.getName() + "파일이 성공적으로 생성되었습니다.");
		} catch (Exception e) {
			out.println(e.getMessage()+ " 다시 입력해 주시기 바랍니다.");
		}
	} // main메서드의 끝

	// 사용자로부터 파일 이름을 입력받아서 파일을 생성하는 예제
	static File createFile(String fileName) throws Exception {
		if (fileName == null || fileName.equals(""))
			throw new Exception("파일이름이 유효하지 않습니다."); 
		File f = new File(fileName); 	// File클래스의 객체를 만든다.
		f.createNewFile(); 				// File객체의 creatNewFile메서드로 실제 파일을 생성
		return f;						// 생성된 객체의 참조를 반환
	} // createFile메서드의 끝
} // 클래스의 끝
