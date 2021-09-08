package Ternary_Operator;

import sun.security.provider.ConfigFile;

import java.util.Locale;
import java.util.Scanner;

public class Practice3 {

    public static void main(String[] args) {

        /*
        ask user for last name.
        if the last name start from a - k
        concat the last name with " most popular last name"
        otherwise
        concat the last name with " well known last name"
         */
        /*Scanner myscanner = new Scanner(System.in);
        String answer = myscanner.nextLine();

        System.out.println("Please enter your last name");

        answer.startsWith("a","k");*/

        Scanner inout = new Scanner(System.in);
        System.out.println("Please enter your last name");
        String lastName = inout.nextLine().toUpperCase();
        String print = lastName.charAt(0) >= 'A' && lastName.charAt(0) <= 'K' ? lastName + " most popular last name" : lastName+ " well known last name";

        System.out.println(print);
    }

}
