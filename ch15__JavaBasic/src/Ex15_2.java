// #15.8 InputStream과 OutputStream 예제2

import static java.lang.System.*;
import java.io.*;
import java.util.Arrays;

public class Ex15_2 {
    public static void main(String[] args) {
        byte[] inSrc = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        byte[] outSrc = null;
        byte[] temp = new byte[10];

        ByteArrayInputStream input = null;
        ByteArrayOutputStream output = null;

        input = new ByteArrayInputStream(inSrc);
        output = new ByteArrayOutputStream();

        input.read(temp, 0, temp.length); // 최대 temp.length개의 byte를 읽어 데이터를 0번째(off)부터 배열 temp에 담는다.
        output.write(temp, 5, 5); // 주어진 배열 temp에 저장된 데이터 중 5번째(off)부터 5개(len)만큼 읽어 출력소스에 쓴다.

        outSrc = output.toByteArray();

        out.println("Input Source  :" + Arrays.toString(inSrc));
        out.println("temp          :" + Arrays.toString(temp));
        out.println("Output Source :" + Arrays.toString(outSrc));
    }
}
