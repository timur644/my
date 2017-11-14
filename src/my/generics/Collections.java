package my.generics;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Collections {
    public static void main(String[]args){
        Collection<String> cs = new ArrayList<>();

        cs.add("1");
        cs.add("2");
        cs.add("3");
        for (String st: cs){
            System.out.println(st);
        }

        Iterator<String> it = cs.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}