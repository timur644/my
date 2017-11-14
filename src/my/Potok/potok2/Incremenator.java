package my.Potok.potok2;

import my.Potok.Program;

public class Incremenator extends Thread{

    private boolean mIsIncrement = true;
    private boolean mFinish = false;
    public void changeAction() {mIsIncrement = !mIsIncrement;}
    public void finish()
    {
        mFinish = true;
    }

    @Override
    public void run()
    {
        do
        {
            if(!mFinish)
            {
                if(mIsIncrement)
                    Programm.mValue++;
                else
                    Programm.mValue--;

                System.out.println(Programm.mValue +"");
            }
            else
                return;
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){}
        }
        while (true);
    }
}
