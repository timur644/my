package my.HomeWork.dz6;


import java.util.ArrayList;

public class Stroka {
    void obratniy(ArrayList<String>list){
      for(int i = list.size()-1; i>=0; i--) {
          System.out.println(list.get(i));
       }
    }
    public static void main(String[] args){
       ArrayList<String> stroki = new ArrayList<>();
                stroki.add("Laravel");
                stroki.add("Yii");
                stroki.add("Symphony");
        for(String s:stroki) {
            System.out.println(s);
        }
        System.out.println("");
        Stroka st = new Stroka();
        st.obratniy(stroki);
   }
}