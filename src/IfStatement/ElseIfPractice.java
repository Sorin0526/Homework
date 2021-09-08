package IfStatement;

import java.util.Scanner;

public class ElseIfPractice {

    public static void main(String[] args) {
        /*
        user will enter a number
        if the number falls in to range 0-5 --> your number is bet 0-5
        if the number falls in to range 6-10 --> your number is bet 6-10
        if the number falls in to range 11-15 --> your number is bet 11-15
        if the number falls in to range 16-20 --> your number is bet 16-20

         */
        Scanner input = new Scanner(System.in);
        System.out.println("PLease pick a number bet 0-20");

        int number = input.nextInt();
        if (number >=0 && number<=5){

            System.out.println("your number is bet 0-5");
        }
        else if (number>5 && number <=10){    // number >= 6 can also be used
            System.out.println("your number is bet 6-10");
        }else if (number>=11 && number<=15){
            System.out.println("your number is bet 11 - 15");

        }else if (number>=15 && number>=20){
            System.out.println("your number is bet 15 - 20");
        }else{
            System.out.println("your number does not fall into the range 0-20");
        }
    }
}
