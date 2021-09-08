package IfStatement;

import java.util.Scanner;

public class Practice2_DaysOfWeek {

    public static void main(String[] args) {
        /*
        ask user to enter first letter of the day
        print
         M --> It is Monday
         T --> It is Tuesday or Thursday
         W --> It is Wednesday
         F --> It is Friday
         S --> It is saturday or Sunday


        Scanner myscanner = new Scanner(System.in);

        System.out.println(" Please enter first letter of any day.");

        char letter ='M';
        char letter1 ='T', letter3 = 'T';
        char letter4 = 'W';
        char letter5 ='F';
        char letter6 = 'S', letter7 = 'S';

        if (){}
        */

        Scanner object = new Scanner(System.in);
        System.out.println("PLease enter first letter of the day you want to see the full name of:");

        String letter = object.nextLine();

        if (letter.equalsIgnoreCase("M")){
            System.out.println("It is Monday");
        }

        if (letter.equalsIgnoreCase("t")){
            System.out.println("it is either Tuesday or Thursday");
        }

        if (letter.equalsIgnoreCase("w")){
            System.out.println("It is Wednesday");
        }

        if (letter.equalsIgnoreCase("f")){
            System.out.println("It is Friday");
        }

        if (letter.equalsIgnoreCase("s")){
            System.out.println("It is Sat or Sunday");
        }

        else{
            System.out.println("Your entry is not valid, there is no day starting with that char");
        }
    }
}
