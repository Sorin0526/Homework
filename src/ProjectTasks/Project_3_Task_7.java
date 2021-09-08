package ProjectTasks;

import java.util.Locale;
import java.util.Scanner;

public class Project_3_Task_7 {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please enter two values with spaces in the beginning and at the end. Make sure the second word starts with lower case letter.");


        String word1 = myScanner.next();
        String word2 = myScanner.next();
        String word = word1 + " "+ word2;
        System.out.println(word.trim());

        String word3 = word2.toUpperCase().charAt(0) + word2.substring(1);
        System.out.println((word1 + " " + word3));



    }
}
