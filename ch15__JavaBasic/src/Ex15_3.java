// #15.9 InputStream과 OutputStream 예제3

import static java.lang.System.*;
import java.io.*;
import java.util.Arrays;

public class Ex15_3 {
    public static void main(String[] args) {
        byte[] inSrc = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        byte[] outSrc = null;
        byte[] temp = new byte[4]; // 예제2와는 다르게 배열의 크기가 다르다.

        ByteArrayInputStream input = null;
        ByteArrayOutputStream output = null;

        input = new ByteArrayInputStream(inSrc);
        output = new ByteArrayOutputStream();

        out.println("Input Source :" + Arrays.toString(inSrc));

        try {
            while (input.available() > 0) { // input 스트림으로부터 읽어올 수 있는 데이터의 크기를 반환한다.
                out.println("input.available :" + input.available());
                // input.read(temp); // temp의 배열에 크기만큼 읽어온다. 배열의 크기만큼 억지로 채운다. [8, 9, 6, 7]
                // output.write(temp); // temp의 배열에 크기만큼 불러와 쓴다.
                int len = input.read(temp); // 읽어온 만큼만 참조변수에 저장하고 쓸 수 있다. [8, 9]
                output.write(temp, 0, len);

                outSrc = output.toByteArray(); // 배열에 담는다.
                out.println("outSrc : " + Arrays.toString(outSrc));
                printArrays(temp, outSrc);
            }
        } catch (IOException e) {
        }
    } // main

    static void printArrays(byte[] temp, byte[] outSrc) {
        out.println("temp :" + Arrays.toString(temp));
        out.println("Output Source : " + Arrays.toString(outSrc));
        out.println("-----");
    }
}
