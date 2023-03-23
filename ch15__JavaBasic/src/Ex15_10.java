
// #15.23 StringReader와 StringWriter
import static java.lang.System.*;
import java.io.*;

public class Ex15_10 {
    public static void main(String[] args) {
        String inputData = "ABCD";
        StringReader input = new StringReader(inputData);
        StringWriter output = new StringWriter();

        int data = 0;

        try {
            while ((data = input.read()) != -1) {
                output.write(data); // void write(int b)
            }
        } catch (IOException e) {
        }

        out.println("Input Data : " + inputData);
        out.println("Output Data : " + output.toString());
        out.println("Output Data(getBuffer()) : " + output.getBuffer());
    }
}
