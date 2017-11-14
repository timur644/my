package my.Setevoy.Datagram;

import java.io.FileWriter;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class DatagramServer {
    public static void main(String[]args){

        try{
            DatagramSocket ds = new DatagramSocket(9999);

            byte[] data = new byte[1024];
            DatagramPacket dp = new DatagramPacket(data, 1024);

            System.out.println("Сервер слушает");
            ds.receive(dp);

            String message = new String(dp.getData(), dp.getOffset(), dp.getLength());
            System.out.println(message);

            FileWriter writer = new FileWriter("C:\\file\\nash.txt", false);
            writer.write(message);

            System.out.println("Получили сообщение " + message);

            System.out.println("Привет от сервера. Мы получили ваше сообщение" + message);

            writer.flush();

           }catch (Exception e){
            System.out.println("Произошло ошибка");
            System.out.println(e);
        }
    }
}