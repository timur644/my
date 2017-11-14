package my.Potok;

public class Program
{
    static SomeClass mThing;
    public static void main(String[]args) throws InterruptedException
    {
      mThing = new SomeClass();

        Thread myThready = new Thread(mThing);
        myThready.start();
        for(int i= 0; i<10; i++){
            System.out.println("Main: " + i);
            Thread.sleep(5000);
        }
        System.out.println("Главный поток завершен...");
    }
}
