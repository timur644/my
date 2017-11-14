package my.generics;

class GenMethod{
    public static <T> boolean eq(T one, T two) {
        return one.equals(two);
    }

    public static <T> boolean present(T[] arr, T item) {
        for (int i=0; i<arr.length; i++)
            if(arr[i].equals(item)) // элемент массива сравниваем с значениями которые мы передали на вывод, если они одинаковы возвращаем
                return true;       //  В нашем случае это 2, и 2 есть в массиве 2 = 2;
                return false;
    }
}

public class Main {
    public static void main(String[]args){

        SimpleGeneric<String> sg1 = new SimpleGeneric<>();
        sg1.setElement("Hi");
        System.out.println(sg1.getElement());

        SimpleGeneric<Integer> sg2 = new SimpleGeneric<>();
        sg2.setElement(123);
        System.out.println(sg2.getElement());

        Integer[] arr = new Integer[]{1,2,3,4};
        System.out.println(GenMethod.present(arr, 2));

        Pair <Integer, String> p =  new Pair<>(new Integer(2), new String("Pudge"));
        System.out.println(p.getFirst() + "" + p.getSecond2());
    }
}
