
// #16.6 InetAddress클래스 예제
import static java.lang.System.*;
import java.net.*;
import java.util.*;

public class Ex16_1 {
    public static void main(String[] args) {
        InetAddress ip = null;
        InetAddress[] ipArr = null;

        try {
            ip = InetAddress.getByName("www.naver.com");
            out.println("getHostName() :" + ip.getHostName());
            out.println("getHostAddress() :" + ip.getHostAddress());
            out.println("toString :" + ip.toString());

            byte[] ipAddr = ip.getAddress();
            out.println("getAddress() :" + Arrays.toString(ipAddr));

            String result = "";
            for (int i = 0; i < ipAddr.length; i++)
                result += (ipAddr[i] < 0 ? ipAddr[i] + 256 : ipAddr[i]) + ".";
            out.println("getAddress()+256 :" + result);
            out.println();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

        try {
            ip = InetAddress.getLocalHost();
            out.println("getHostName : " + ip.getHostName());
            out.println("getHostAddress : " + ip.getHostAddress());
            out.println();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

        try {
            ipArr = InetAddress.getAllByName("www.naver.com");

            for (int i = 0; i < ipArr.length; i++)
                out.printf("ipArr[ %d ] : %s%n", i, ipArr[i]);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

    } // main
}
