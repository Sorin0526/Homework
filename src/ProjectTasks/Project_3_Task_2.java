package ProjectTasks;

import java.util.Scanner;

public class Project_3_Task_2 {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please enter the string value");

        String input = myScanner.nextLine();

        System.out.println("Please enter the starting number ");

        int start = myScanner.nextInt();

        System.out.println("Please enter the ending number");

        int end = myScanner.nextInt();

        System.out.println(input.substring((start)-1,end));

    }
}
