package IfStatement;

import java.util.Scanner;

public class ElsePractice {

    public static void main(String[] args) {

        /*
        ask user to enter an integer value
        if the number is "even " print it
        otherwise print "odd number"
         */

        Scanner myscannner = new Scanner(System.in);
        System.out.println("Please enter an integer value");

        // int number = 0;
        // if (number){}
        int a = myscannner.nextInt(); //DON'T FORGET GETTING THE VALUE FROM USER!!!!!!!!!!!

            if (a % 2 == 0) {
                System.out.println("your number is even " + a);
            }

            else{
                    System.out.println("your number is odd number " + a);
                }
            }

    }

