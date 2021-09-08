package Primitives;

public class RemainderPractice2 {

    public static void main(String[] args) {

        // find the product of digits from a four given number
        //print the results as following:
        //"the product is ="

        int number = 1432;
        int firstDigit = number%10;// this is first digit --> 2
        number=number/10;// this is my new number--->143
        int secondDigit = number%10; // this is my second digit --> 3
        number=number/10; // this is my new number --> 14
        int thirdDigit = number %10; // this is my third digit --> 4
        number=number/10; // this is my new number --> 1
        int fourthDigit = number%10; // this is my fourth digit --> 1
        number=number/10;
        int product = firstDigit*secondDigit*thirdDigit*fourthDigit;

        System.out.println("the product is " + firstDigit*secondDigit*thirdDigit*fourthDigit);
        System.out.println(firstDigit*secondDigit*thirdDigit*fourthDigit);

    }
}
