package my.generics;

public class SimpleGeneric <T> {
    private T element;

    public T getElement(){
        return element;
    }

    public void setElement(T element){
        this.element = element;
    }
}
