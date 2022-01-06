package Loops;

public class MultiplicationTable {

    public static void main(String[] args) {

        /*
        use for loop to create a multiplication table for number 6 from 1 to 10

        6*1=6...
         */
        int number = 6;
        for (int i=1; i<=10; i++){

            System.out.println(number + " * "+ " =" + number*i );

            // use for loop to create a multiplication table for numbers 1 to 10
            //from 1 to 10

        }

        for (int num = 1; num<=10; num++){

            for (int num1 = 1; num1<=10;num1++){

                System.out.println(num + " * "+ " =" + num * num1 );
            }
        }

        // perfect number: a number is equal to its divider' sum
        // ex : 6 --> dividers : 1 2 3 except the number itself  1+2+3 = 6 is a perfect number

        int num = 28;
        int sum = 0;

        for ( int divisor = 1; divisor< num; divisor++){

            if(num%divisor==0) {
                sum = sum + divisor;

            }
        }
        System.out.println("the sum is " + sum);

        if(num ==sum){

            System.out.println("the number " + num + " is a perfect number");

        }else{

            System.out.println("the number " + num + " is not a  perfect number");

        }
    }
}
