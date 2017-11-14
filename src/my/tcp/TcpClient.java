package my.tcp;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.*;

public class TcpClient {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getByName("localhost");
            Socket socket = new Socket(address, 12345);

            String message = "Hello from client";
            System.out.println("Client sent a message: " + message);
            DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());
            outputStream.writeUTF(message);
            outputStream.flush();

            DataInputStream inputStream = new DataInputStream(socket.getInputStream());
            message = inputStream.readUTF();
            System.out.println(message);

            socket.close();
        } catch (Exception e) {
            System.out.println("Ошибка произошла");
            System.out.println(e);
        }
    }
}
