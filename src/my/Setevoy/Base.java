package my.Setevoy;


import java.net.InetAddress;

public class Base {
    public static void main(String[] args){
        try{
            InetAddress ia = InetAddress.getByName("ya.ru");
            System.out.println("HostAdress " + ia.getHostAddress());
            System.out.println("HostName "   + ia.getHostName());
         //   System.out.println("Localhost "  + ia.getLocalHost());
        }catch (Exception e ){
            System.out.println("Ошибка!");
            System.out.println(e);
        }
    }
}
