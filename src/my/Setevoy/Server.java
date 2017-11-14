package my.Setevoy;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.*;

public class Server {
    public static void main(String[] args)throws IOException{
     ServerSocket socket = new ServerSocket(1234);

        System.out.println("Начали слушать");
        Socket clint = socket.accept();

        InputStream is = clint.getInputStream();
         byte[] bytes = new byte[1024];
      //   in.read(bytes);
      //  for()
     //   OutputStream os = clint.getOutputStream();

    }
}