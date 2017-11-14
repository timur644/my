package my.Setevoy;


public class Potoki extends Thread {
    @Override
    public void run (){
        for (int i = 0; i < 10; i++) {
            System.out.println("Поехали ");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.err.print(e);
            }
        }
    }
    public static void main(String[] args) {
        new Potoki().start();
    }
}
