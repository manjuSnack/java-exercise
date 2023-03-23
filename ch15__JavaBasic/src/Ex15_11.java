
// #15.24 BufferedReader와 BufferedWriter
import static java.lang.System.*;
import java.io.*;

public class Ex15_11 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("Ex15_11.java");
            // FileReader fr = new FileReader(".\\src\\Ex15_11.java");
            BufferedReader br = new BufferedReader(fr);

            String line = "";
            for (int i = 1; (line = br.readLine()) != null; i++) {
                // ";"를 포함한 라인을 출력한다.
                if (line.indexOf(";") != -1)
                    out.println(i + ":" + line);
            }
            br.close();
        } catch (IOException e) {

        }
    }
}
