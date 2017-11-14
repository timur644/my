package my.HomeWork.dz4;
import java.util.Scanner;

public class AllCars {
    public static void main(String[] args) {
        int select=0;
        int nYear=0;
        int yYear;
        int pPrice;
        int roz;
        System.out.println("\t\t\tМеню");
        System.out.println("1. Список всех автомобилей");
        System.out.println("2. Автомобили который экс-я больше n лет");
        System.out.println("3. Автомобили заданного год выпуска цена который больше указанной");
        System.out.println("4. Выход из приложении");
        Scanner sc = new Scanner(System.in);
        select = sc.nextInt();
        Car[] array = new Car[]{
                new Car(1, "BMW 740IL", 2000, "черный", 12000, 181),
                new Car(2, "Audi A8", 2008, "серый", 18000, 256),
                new Car(3, "Skoda Superb", 2016, "красный", 10000, 512),
                new Car(4, "Nissan GTR", 2005, "белый", 11000, 919),
                new Car(5, "Honda Accord", 2008, "синий", 42000, 525),
                new Car(6, "Fiat G350", 2009, "зеленый", 13800, 756),
                new Car(7, "Volvo S90", 2017, "черный", 35000, 777)
        };
        switch (select) {
            case 1:
                for (int i = 0; i < array.length; i++) {
                    System.out.println(array[i]);
                }
                break;

            case 2:
                System.out.println("Введите количество лет:");
                nYear = sc.nextInt();
                for (int i = 0; i < array.length; i++) {
                    roz = 2017 - array[i].getGod();
                    if (roz == nYear) {
                        System.out.println(array[i]);
                    }
                     else{
                     System.out.println("Не найден");
                     }
                }

                break;
            case 3:
                System.out.println("Введите год выпуска:");
                yYear = sc.nextInt();
                System.out.println("Введите цену:");
                pPrice = sc.nextInt();
                for(int i = 0; i < array.length; i++) {
                    if(array[i].getGod() == yYear && array[i].getPrice() > pPrice) {
                        System.out.println(array[i]);
                    }
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