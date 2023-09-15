package testcases.C00AE_MISSINTER__CWE353;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.zip.CRC32;

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

            // CRC 체크섬 생성
            CRC32 crc = new CRC32();
            crc.update(sendData);
            long checksum = crc.getValue();

            // 체크섬을 메시지에 추가
            String messageWithChecksum = secret + ":" + checksum;
            sendData = messageWithChecksum.getBytes();

            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, port);
            serverSocket.send(sendPacket);
        }
    }
}