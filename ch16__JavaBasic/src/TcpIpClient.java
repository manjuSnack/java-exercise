
// #16.19 TCP소켓 프로그래밍 예제 2
import java.net.*;
import java.io.*;
import static java.lang.System.*;

public class TcpIpClient {
    public static void main(String args[]) {
        try {
            String serverIp = "127.0.0.1";

            out.println("서버에 연결중입니다. 서버IP :" + serverIp);
            // 소켓을 생성해 연결요청한다.
            Socket socket = new Socket(serverIp, 7777);

            // 소켓의 입력스트림을 얻는다.
            InputStream in = socket.getInputStream();
            DataInputStream dis = new DataInputStream(in);

            out.println("서버로부터 받은 메시지 : " + dis.readUTF());
            out.println("연결을 종료합니다.");

            dis.close();
            socket.close();
            out.println("연결이 종료되었습니다.");
        } catch (ConnectException ce) {
            ce.printStackTrace();
        } catch (IOException ie) {
            ie.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}