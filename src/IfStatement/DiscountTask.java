package IfStatement;

import java.util.Scanner;

public class DiscountTask {

    public static void main(String[] args) {

        /*
        if your payment is $100 or more you'll get 20 % discount otherwise you'll get 5 % discount
        print out disc total.

        int payment = 100;
        int total = payment *20/100;
        int total1 = payment * 5/100;

        if(payment > 100){
            System.out.println("your total");

         */

        double payment = 80;


        if (payment >= 100) {
            payment -= payment * 0.2;

            System.out.println("Your payment after 20% discount is " + payment);
        }



        else {
            payment -= payment *0.05;

            System.out.println(" Your payment after 5% discount is:" + payment);

        }
    }
    }

