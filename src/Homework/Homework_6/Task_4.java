package Homework.Homework_6;

import java.util.Locale;
import java.util.Scanner;

public class Task_4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string value :");
        String text = scanner.next().toLowerCase();
        int letters = text.length();
        if (text.substring(0, 2).equals(text.substring(text.length() - 2))) {
            System.out.println(text.substring(2, text.length() - 0));
        } else {
            System.out.println(text);
        }
    }
}


