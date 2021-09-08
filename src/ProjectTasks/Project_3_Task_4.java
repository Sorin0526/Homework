package ProjectTasks;

import java.util.Scanner;

public class Project_3_Task_4 {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please enter three strings");

        String input = myScanner.nextLine();

        String input1 = myScanner.nextLine();

        String input2 = myScanner.nextLine();

        String temp1 = input, temp2 = input1, temp3 = input2;

        input = input.toLowerCase();
        input1 = input1.toLowerCase();
        input2 = input2.toLowerCase();


        if(input.length() == input1.length() && input.length()==input2.length()

        && input.contains("java")== input1.contains("java")&&input2.contains("java")&&

                temp1.charAt(0)<97 && temp2.charAt(0)<97&& temp3.charAt(0)<97) {

            System.out.println(true);

        }
        else {
            System.out.println(false);
        }



    }
}
