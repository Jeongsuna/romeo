package testcases.C00AE_MISSINTER__CWE353;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.security.MessageDigest;

public class good1 {
    public static void main(String args[]) throws Exception {
        // 서버 소켓 생성
        DatagramSocket serverSocket = new DatagramSocket(9876);
        byte[] receiveData = new byte[1024];
        byte[] sendData;

        while (true) {
            // 데이터 수신
            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
            serverSocket.receive(receivePacket);
            String sentence = new String(receivePacket.getData());

            // 클라이언트 주소 및 포트 가져오기
            InetAddress IPAddress = receivePacket.getAddress();
            int port = receivePacket.getPort();

            // 데이터 전송
            String secret = "비밀 메시지";
            sendData = secret.getBytes();

            // SHA-256 체크섬 생성
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(sendData);
            byte[] digest = md.digest();

            // 체크섬을 메시지에 추가
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                sb.append(String.format("%02x", b & 0xff));
            }

            String messageWithChecksum = secret + ":" + sb.toString();
            sendData = messageWithChecksum.getBytes();

            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, port);
            serverSocket.send(sendPacket);
        }
    }
}
