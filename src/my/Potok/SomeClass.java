package my.Potok;

public class SomeClass implements Runnable
{
    @Override
    public void run()
    {
        for(int i= 0; i<10; i++){
            System.out.println("Secondary: " + i);
            try {
                Thread.sleep(5000);
            }catch (InterruptedException e){

            }
        }
        System.out.println("Привет из побочного потока");
    }
}