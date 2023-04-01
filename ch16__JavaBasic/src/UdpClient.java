
// #16.20 UDP 소켓 프로그래밍 - Client
import java.net.*;
import java.io.*;
import static java.lang.System.*;

public class UdpClient {
    public void start() throws IOException, UnknownHostException {
        DatagramSocket datagramSocket = new DatagramSocket();
        InetAddress serverAddress = InetAddress.getByName("127.0.0.1");

        // 데이터가 저장될 공간으로 byte배열로 크기 100을 할당해 생성한다.
        byte[] msg = new byte[100];

        DatagramPacket outPacket = new DatagramPacket(msg, 1, serverAddress, 7777);
        DatagramPacket inPacket = new DatagramPacket(msg, msg.length);

        datagramSocket.send(outPacket); // DatagramPacket을 전송한다.
        datagramSocket.receive(inPacket); // DatagramPacket을 수신한다.

        System.out.println("current server time :" + new String(inPacket.getData()));
        datagramSocket.close();
    }

    public static void main(String args[]) {
        try {
            new UdpClient().start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
