package Loops;

import java.util.Scanner;

public class Practice3 {

    public static void main(String[] args) {

        /*
        ask user to enter an integer number
        find and print the numbers which can divide that given number
        input == 1
         */
        Scanner myscanner = new Scanner(System.in);

        System.out.println("please introduce an integer value");
        int number = myscanner.nextInt();

        int divider = 1;

        while(divider<= number){

           if (number % divider == 0){
               System.out.println(divider);
           }
           divider++;

        }


       // number%1 == 0
       // number%2 == 0
    }
}
