package my.HomeWork.dz7;


import java.util.LinkedList;

public class LinList {
    public void method2(){
        LinkedList<String> list = new LinkedList<String>();

        for(int i = 1; i<=10000; i++){
            list.add(String.valueOf(i)); // добавим string
        }

        long startedTime = System.currentTimeMillis(); //время начало
        while(list.size() !=1){                        //пока list.size не равно 1
            for(int i = 0; i < list.size(); i+=2){   //будет отнимать -2
                list.remove(i);
                if(list.size() == 1){
                    break;
                }
            }
        }
        long diff = System.currentTimeMillis() - startedTime;

        System.out.println(diff + " milliseconds");
    }
}