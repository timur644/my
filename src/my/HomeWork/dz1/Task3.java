package my.HomeWork.dz1;


public class Task3 {
    public static void main(String[] args) {
        int s=4, p=2;

        for(int i=0; i<args.length; i++) {
            int atata=Integer.parseInt(args[i]);
            s=s + atata;
            p=p * atata;
        }
        System.out.println("Сумма = " + s);
        System.out.println("Произведения = " + p);
    }
}
