package Scanner;

import java.util.Scanner;

public class PracticeScanner {

    public static void main(String[] args) {
        /*
        by using scanner
        ask user to provide their height and weight
        and calculate their BMI
        */
        Scanner scanner = new Scanner(System.in);

        System.out.println(" please provide your height in m");
        double height = scanner.nextDouble();
        System.out.println(" please provide your weight in kg");
        double weight = scanner.nextDouble();
        System.out.println( " your BMI is -->" + (int)(weight/(height*height)));




    }
}
