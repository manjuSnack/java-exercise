
// #16.9 URL클래스 예제
import static java.lang.System.*;
import java.net.*;

public class Ex16_2 {
    public static void main(String args[]) throws Exception {
        URL url = new URL("https://nomadcoders.co/airbnb-clone/lobby");

        out.println("url.getAuthority():" + url.getAuthority());
        out.println("url.getContent():" + url.getContent());
        out.println("url.getDefaultPort():" + url.getDefaultPort());
        out.println("url.getPort():" + url.getPort());
        out.println("url.getFile():" + url.getFile());
        out.println("url.getHost():" + url.getHost());
        out.println("url.getPath():" + url.getPath());
        out.println("url.getPorotocol():" + url.getProtocol());
        out.println("url.getQuery():" + url.getQuery());
        out.println("url.getRef():" + url.getRef());
        out.println("url.getUserInfo():" + url.getUserInfo());
        out.println("url.toExternalForm():" + url.toExternalForm());
        out.println("url.toURI():" + url.toURI());
    }
}