package my.Potok.eggs;

public class Chicken
{
    static Eggs mAnotheropinion;
    public static void main(String[]args)
    {
        mAnotheropinion = new Eggs();
        System.out.println("Спор начился");
        mAnotheropinion.start();

        for(int i = 0; i<5; i++)
        {
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){}
            System.out.println("курица");
        }

        if(mAnotheropinion.isAlive())
        {
            try{
                mAnotheropinion.join();
            }catch (InterruptedException e){}
            System.out.println("Первым пояфилось яйцо!");
        }
        else
        {
            System.out.println("Первым появилось курица!");
        }
        System.out.println("Спор закончен");
    }
}
