package my.HomeWork.dz1;
import java.io.Console;


public class HelloWorld2 {
    public static void main (String[] args) {
        Console con = System.console();
        String s = "12345";
        char[] pass = con.readPassword("%s", "Введите пароль:");
        String passw = new String(pass);
        if (passw.equals(s)) {
            System.out.println("Верно");
        } else {
            System.out.println("Не верно");
        }
    }
}
