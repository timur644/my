package my.Lab2;


public class ExceptionDivByThree extends Exception{
    private String description;
    private int n;

    public ExceptionDivByThree(String description, int n){
        this.description=description;
        this.n =n;
    }

    @Override
    public String toString(){
        return n + " is " + description;
    }
}
