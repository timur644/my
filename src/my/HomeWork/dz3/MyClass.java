package my.HomeWork.dz3;
import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        int a = 0;
        int[] mas = new int[20];

        System.out.println("Для создание массива из нечетных чисел нажмите 1");
        System.out.println("Для создания массива из чисел Фибоначчи нажмите 2");
        System.out.println("Для создания двумерного массива нажмите 3");
        System.out.println("Для выхода  из приложении нажмите 4");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

           switch (n) {
               case 1:
                   for (int i = 1; i <= 99; i++) {
                       if (i % 2 != 0)
                           a++;
                   }
                   int[] Mas = new int[a];
                   for (int i = 1, b = 0; i <= 99; i++) {
                       if (i % 2 != 0) {
                           Mas[b] = i;
                           System.out.print(Mas[b] + " ");
                           b++;
                       }
                   }
                   break;

               case 2:
                   for (int i = 0; i < mas.length; i++) {
                       if (i < 2) {
                           mas[i] = 1;
                       } else {
                           mas[i] = mas[i - 2] + mas[i - 1];
                       }
                       System.out.print(mas[i] + " ");
                   }
                   break;

               case 3:
                   int[][] arr = new int[8][5];
                   for (int i = 0; i < arr.length; i++) {
                       for (int j = 0; j < arr[i].length; j++) {
                           arr[i][j] = (int) (Math.random() * 90) + 10;
                           System.out.print(arr[i][j] + " ");
                       }
                       System.out.println(" ");
                   }
                   break;

               case 4:
                   System.exit(0);
                   break;
               default:
                   System.out.println("Неверный число");
                   break;
           }
    }
}