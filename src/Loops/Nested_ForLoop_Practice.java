package Loops;

public class Nested_ForLoop_Practice {

    public static void main(String[] args) {

        /*
        print the months for every year for the years from 2020 to 2023

         */

        for(int year = 2020; year<=2023;year++){

            System.out.println(year);

            for (int months = 1; months<=12; months++){

                System.out.print(months +" ");

            }
            System.out.println();
        }
    }

}
