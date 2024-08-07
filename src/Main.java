//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Exercise 1;
        int sum= 0;

            for ( int i=1 ; i<=10 ; i++){
              sum += i;
            }
            System.out.println("Exercise 1");
            System.out.println("The Sum of the numbers from 1 to 10 is "+sum +".");
            System.out.println("=================================================================");

        //Exercise 2;
        int factorial=1;

        for (int i =1 ; i<=5; i++){
            factorial *= i;
        }
        System.out.println("Exercise 2");
        System.out.println("The Factorial of number 1 to 5 is "+ factorial +".");
        System.out.println("=================================================================");

        //Exercise 3;
        int multipleOf7 =7;

        System.out.println("Exercise 3");
        System.out.println("Multiplication Table of 7:");
        for (int i=1;i<=10;i++){
            int result= 7*i;
            System.out.println("7 * "+i+" = "+ result);
        }
        System.out.println("=================================================================");


    }
}