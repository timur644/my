package my.HomeWork.dz7;

import java.util.Scanner;

public class Osnovnoy {
    public static void main(String[]args){
        //10
        System.out.println("Выберите один из них");
        System.out.println("1. Через  ArrayList");
        System.out.println("2. Через LinkedList");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrList ar = new ArrList();
        LinList ln = new LinList();

        switch (n){

            case 1:
                ar.method1();
                break;

            case 2:
                ln.method2();
                break;

            default:
                System.out.printf("Неверный число");
                break;
        }

    }
}