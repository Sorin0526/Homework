package Loops;

import java.util.Locale;

public class charPractice {
    public static void main(String[] args) {
        // print out the alphabet in upper case letters
        // now printing letters as one upper case, one lower case

        for( char ch = 'A', ch1 = 'b'; ch <= 'Z' && ch1<= 'z' ; ch +=2, ch1 +=2){

            System.out.print(ch + "-");
            System.out.print(ch1 + "-");
        }

        }
    }

