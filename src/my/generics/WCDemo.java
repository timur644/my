package my.generics;



    public class WCDemo {
    public static void unbox(Box<?> box){
        System.out.println(box.get());
    }
    public static void main(String[] args){
        MyBox<Integer> mb = new MyBox<>();
        mb.put(12);
        unbox(mb);
    }
}
