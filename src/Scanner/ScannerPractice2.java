package Scanner;

import java.util.Scanner;

public class ScannerPractice2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // as a rule, need to memorize --> this is creation of scanner object. can be written on any line.

        System.out.println("Please enter your name");
        String name = input.nextLine(); //input.next();

        System.out.println("my name is "+ name);

        System.out.println("Please enter you last name");
        String lastName = input.nextLine();

        System.out.println( " your full name is " + name + " " + lastName);

        //String c = "4215243534";

        System.out.println(" Please enter your age");
        int age = input.nextInt();
        System.out.println(" your age will be " + (age + 10)+ " in 10 years");

        int ageInFiveYears = age +5;
        System.out.println(" your age will be " + ageInFiveYears + "in next 5 years");

        System.out.println(" Please enter your city name");
        name += input.next();

        System.out.println(name);




    }
}
