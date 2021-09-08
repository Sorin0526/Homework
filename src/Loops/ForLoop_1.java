package Loops;

public class ForLoop_1 {

    public static void main(String[] args) {

        for ( int number=1 ; number<=5 ;  number++){

            System.out.println("It is for loop"+number);
        }

        int number=1;

        for (  ; number<5 ;  number++){

            System.out.println("It is second for loop"+number);
        }


        for ( ; number<10 ;  ){// the fucking number is already 5, goddammit
            number++;

            System.out.println("It is the Third for loop"+number);
        }
//showing 6 to 10 because i have increment before print-out
//only the condition has to be in the parenthesis, and it has to be in the middle


    }
}
