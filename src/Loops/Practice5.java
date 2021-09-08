package Loops;

import java.util.Scanner;

public class Practice5 {

    public static void main(String[] args) {

        /*
        ask user to give a number
        create a multiplication table from 1 to 10 from that given number
        5 --> 5 x 1 = 5
               5x2 = 10
               5x3 = 15.....
         */
        Scanner myScanner = new Scanner(System.in);
        System.out.println(" please provide an integer value");
        int number = myScanner.nextInt();

        int multiplier = 1;

        while( multiplier<=10){
            System.out.println(number+" *"+ multiplier +" =" + number * multiplier );
            multiplier++;

        }

    }
}
