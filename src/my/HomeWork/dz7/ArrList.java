package my.HomeWork.dz7;


import java.util.ArrayList;

public class ArrList {
    public void method1(){
        ArrayList<String>  list = new ArrayList<>();

        for (int i = 1; i <=10000; i++) {
            list.add(String.valueOf(i));
        }

        long startedTime = System.currentTimeMillis();
        while (list.size() != 1) {
            for (int i = 0; i < list.size(); i += 2) {
                list.remove(i);
                if (list.size() == 1) {
                    break;
                }
            }
        }
        long diff = System.currentTimeMillis() - startedTime;

        System.out.println(diff + " milliseconds");
    }
}
