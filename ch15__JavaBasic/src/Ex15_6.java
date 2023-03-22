
// #15.16 BufferedOutputStream 예제
import java.io.*;

public class Ex15_6 {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("123.txt");

            // BufferOutputStream의 Buffer 크기를 5로 한다.
            BufferedOutputStream bos = new BufferedOutputStream(fos, 5); // 저장할 공간이 5byte. 숫자와 영어는 1byte

            // 파일 123.txt에 1부터 9까지 출력한다.
            for (int i = '1'; i <= '9'; i++) {
                bos.write(i);
            }

            fos.close(); // flush() 호출 후 null을 지정해 사용하던 자원들이 반환
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
