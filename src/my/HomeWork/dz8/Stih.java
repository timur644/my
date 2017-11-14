package my.HomeWork.dz8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Stih {

    public static void main(String[] args){

        ArrayList<String> str = new ArrayList<>();
        System.out.println("\tдо сортировки");
        str.add("Усталый день склонился к ночи,");
        str.add("Затихла шумная волна,");
        str.add("Погасло солнце, и над миром");
        str.add("Плывёт задумчиво луна.");

            for(String st: str){
                 System.out.println(st);
            }

        Collections.sort(str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() < o2.length()) {
                    return -1;
                } else if (o1.length() > o2.length()) {
                    return 1;
                } else return o1.compareTo(o2);
            }
        });

        System.out.println("\tпосле сортировки");
        for(String st: str){
            System.out.println(st);
        }
    }
}