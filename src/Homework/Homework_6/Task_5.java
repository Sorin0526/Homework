package Homework.Homework_6;

import java.util.Scanner;

public class Task_5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please insert any year to find out if it is a leap year or not");
        int number = scan.nextInt();
        int result1 = number % 4;
        int result2 = number % 100;
        int result3 = number % 400;


        if (result1 == 0 && result2 !=0 || result3 ==0) {
            System.out.println(number + " is a leap year");

        } else {
            System.out.println(number + " is not a leap year");
        }
    }
}







