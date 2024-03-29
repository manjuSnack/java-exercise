
// #15.18 SequenceInputStream 예제
import static java.lang.System.*;
import java.io.*;
import java.util.*;

public class Ex15_7 {
    public static void main(String[] args) {
        byte[] arr1 = { 0, 1, 2 };
        byte[] arr2 = { 3, 4, 5 };
        byte[] arr3 = { 6, 7, 8 };
        byte[] outSrc = null;

        Vector v = new Vector();
        v.add(new ByteArrayInputStream(arr1));
        v.add(new ByteArrayInputStream(arr2));
        v.add(new ByteArrayInputStream(arr3));

        SequenceInputStream input = new SequenceInputStream(v.elements());
        ByteArrayOutputStream output = new ByteArrayOutputStream();

        int data = 0;

        try {
            while ((data = input.read()) != -1) { // 읽을 것이 없으면 -1을 반환한다.
                output.write(data);
            }
        } catch (IOException e) {

        }

        outSrc = output.toByteArray();

        out.println("Input Source1 :" + Arrays.toString(arr1));
        out.println("Input Source2 : " + Arrays.toString(arr2));
        out.println("Input Source3 : " + Arrays.toString(arr3));
        out.println("Output Source : " + Arrays.toString(outSrc));
    }
}
