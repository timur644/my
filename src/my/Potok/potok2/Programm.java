package my.Potok.potok2;

public class Programm {
    public static int mValue = 0;

    static Incremenator mInc;

    public static void main(String[]args)
    {
        mInc = new Incremenator();
        System.out.println("Значение = ");
        mInc.start();

        for(int i = 0; i<=3; i++)
        {
            try{
                Thread.sleep(4*1000);
            }catch (InterruptedException e){}

        mInc.changeAction();
        }
        mInc.finish();
    }
}