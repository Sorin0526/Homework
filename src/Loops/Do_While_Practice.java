package Loops;

public class Do_While_Practice {

    public static void main(String[] args) {

        int number = 10;

        /*while(number>=0){

            System.out.println(number);
            number--;


        }*/

        do{
            System.out.println(number);
            number--;

        }while (number>=0);// or number-- > 0



        number = 10;
        do{
            System.out.println(number);
            number--;

        }while (number<0);


        // find the sum of the numbers from 10 to 15
        // print the result as  " the total is .."

        /*
        int number1 = 10;
        number1++;

        do {
            System.out.println(" the result is "+ number + number1++);

        }while ( number1>=10);
        */

        int total = 0;
        int number1 = 10;

        do {
            total = total + number1;
            number1++;
            //System.out.println("total is "+ total);

        }while(number1<=15);

        System.out.println("total is "+ total); // it will show the final total


    }
}
