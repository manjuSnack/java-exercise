
// #16.12 URLConnection클래스 예제 2
import static java.lang.System.*;
import java.net.*;
import java.io.*;

public class Ex16_4 {
    public static void main(String args[]) {
        URL url = null;
        BufferedReader input = null;
        String address = "https://www.naver.com";
        String line = "";

        try {
            url = new URL(address);
            input = new BufferedReader(new InputStreamReader(url.openStream()));

            while ((line = input.readLine()) != null)
                out.println(line);
            input.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}