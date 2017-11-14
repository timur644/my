 package my.Setevoy.Datagram;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public   class DatagramClient extends Thread{
       /*   Доделать:
       *   Создать 3 поток и через них отправить сообщение в сервер */
    @Override
    public void run(){

    }

    public static void main(String[]args){

     try{
            DatagramSocket ds = new DatagramSocket();

            String message = "Hi from Timur";
            System.out.println("Client sent a message: " + message);
            InetAddress address = InetAddress.getByName("localhost");

            System.out.println("Джонни: " + message);
            DatagramPacket dp = new DatagramPacket(message.getBytes(), message.length(), address, 9999);

            ds.send(dp);
            ds.close();

        }catch (Exception e){
            System.out.println("Ошибка произошло");
            System.out.println(e);
        }
    }
}