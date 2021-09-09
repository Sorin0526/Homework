package Loops;

import java.util.Scanner;

public class for_loop_practice {

    public static void main(String[] args) {

        /*
        create a new practice class
get a positive integer from user which is less than 10
print out the number starting from the given number to 10
         */

        Scanner myScanner = new Scanner(System.in);
        System.out.println(" Please provide a positive integer less than 10 ");
        int number = myScanner.nextInt();

        for(    ;number<=10; number++   ){

            System.out.println("your numbers are "+ number);
        }
    }
}
