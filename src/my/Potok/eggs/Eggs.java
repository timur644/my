package my.Potok.eggs;

public class Eggs extends Thread
{
public void run(){
    for(int i = 0; i<5; i++)
    {
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){}
        System.out.println("Яйцо!");
    }
  }
}
