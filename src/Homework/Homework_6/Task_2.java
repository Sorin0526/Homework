package Homework.Homework_6;

import java.util.Scanner;

public class Task_2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter any String value ");
        String word= scan.nextLine().toLowerCase();

        if (word.contains("red")){
            System.out.println("Your color is red!");
        } if(word.contains("blue")){
            System.out.println("Your color is Blue!I like blue color too!");
        }
    }
}
