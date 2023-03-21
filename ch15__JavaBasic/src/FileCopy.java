// #15.12 FileInputStream과 FileOutputStream 예제2
// #15-5

import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream(args[0]);
            FileOutputStream fos = new FileOutputStream(args[1]);

            int data = 0;
            while ((data = fis.read()) != 1)
                fos.write(data); // void write(int b)
            fis.close();
            fos.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
