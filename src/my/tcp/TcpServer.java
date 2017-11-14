package my.tcp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.*;


public class TcpServer {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(12345);

            System.out.println("Server started to listen");
            Socket socket = ss.accept();

            DataInputStream inputStream = new DataInputStream(socket.getInputStream());
            DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());

            String incomingMessage = inputStream.readUTF();

            System.out.println("Received message: " + incomingMessage);

            outputStream.writeUTF("Hello from server. We received your message: " + incomingMessage);
            outputStream.flush();

            ss.close();
        } catch( Exception e) {
            System.out.println("Ошибка произошла");
            System.out.println(e);
        }
    }
}
