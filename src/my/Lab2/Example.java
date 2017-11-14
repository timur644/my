package my.Lab2;


import java.util.Scanner;

public class Example {
    public static void method1() throws ExceptionDivByTwo, ExceptionDivByThree, ExceptionDivByAny, Exception{

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if (n % 2 == 0) {
            if(n % 3 ==0) {
                throw new Exception() {
                    @Override
                    public String toString(){
                        return n +  " Divisible by two and three";
                    }
                };
            }
            else{
              throw  new ExceptionDivByTwo("Divisible by two", + n);
            }

        } else if (n % 3 == 0) {
            throw new ExceptionDivByThree(" Divisible by three ", n);

        } else {
            throw new ExceptionDivByAny(" Divisible by any ", n);
        }
    }

    public static void main(String[]args){
         try{
             method1();
         }catch (ExceptionDivByTwo e){
             System.out.println(e);
         } catch (ExceptionDivByThree e) {
            System.out.println(e);
        } catch (ExceptionDivByAny e) {
            System.out.println(e);
        }catch (Exception e){
             System.out.println(e);
         }
    }
}