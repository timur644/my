package my.Setevoy;

import java.net.*;
import java.io.*;

public class Client {
    public static void main(String args)throws IOException{
        Socket socket = new Socket("localhost", 1234);

        InputStream inn = socket.getInputStream();
        OutputStream out  = socket.getOutputStream();

        String st = "Hello form Tom";
        out.write(st.getBytes());
    }
}
