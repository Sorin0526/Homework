package IfStatement;

import java.util.Scanner;

public class Nested_If_Practice {

    public static void main(String[] args) {

        /*
        Ask user for his/her city name
        if the city name is Chicago,         -  ask user the school name
        if the school name is 'Techtorial'   -  print  --> you are lucky to be in batch 10
        if the school is not Techtorial      -  print --> please come and visit us

        if the city name is not Chicago      -  print --> please come to Chicago

         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your city name?");
        String cityName = scanner.nextLine();

        if ( cityName.equalsIgnoreCase("Chicago")){

            System.out.println(" What is your school name?");
            String schoolName = scanner.nextLine();

            if(schoolName.equalsIgnoreCase("Techtorial")){
                System.out.println("You are one of the Heroes");
            }else{
                System.out.println("Please visit Techtorial");
            }
        } else {
            System.out.println("Please come to Chicago");
        }





    }
}
