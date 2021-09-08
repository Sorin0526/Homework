package Loops;

import java.util.Scanner;

public class Practice4 {

    public static void main(String[] args) {

        /*
        user has $100
        as long as user has balance more than $0
        ask user how much money s/he wants to spend
        if the amount is less than balance
                update the balance and show it to user
        if the amount is more than the balance
        --> print " you don't have enough money in the account!! your balance is .."
         */
        Scanner input = new Scanner(System.in);
        /*int money = input.nextInt();
        System.out.println("how much money do you want to spend?");

        int amount = 100;
        if (amount>0){
            while(amount<0 && amount>0){
                System.out.println("you don't have enough money in the account!! your balance is "+ amount);

                amount++;
            }
            }*/
        double balance = 100;

        while(balance>0){
            System.out.println("how much do you want to spend?");

            double spending = input.nextDouble();
            if (spending<= balance){
                balance -= spending;
                System.out.println(" your new balance is "+ balance);

            }else {
                System.out.println("you don't have enough money in the account!! your balance is "+ balance);
            }
        }


        }
    }

