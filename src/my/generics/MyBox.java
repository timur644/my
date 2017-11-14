package my.generics;



    public class MyBox<T> implements Box<T> {
    public T item;
    public void put(T element){
        item = element;
    }

    public T get(){
        return item;
    }
}