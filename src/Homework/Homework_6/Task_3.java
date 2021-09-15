package Homework.Homework_6;

import java.util.Scanner;

public class Task_3 {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("pLease enter a String");

        String word = myScanner.nextLine().toLowerCase();

        if(word.charAt(0) == 'x'){

            System.out.println(word.substring(1));

        }else if (word.charAt(1)== 'x'){

            System.out.println(word.charAt(0)+word.substring(2));

        }else {
            System.out.println(word);

        }


    }
}
