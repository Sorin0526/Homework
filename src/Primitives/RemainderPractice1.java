package Primitives;

public class RemainderPractice1 {

    public static void main(String[] args) {

        //123 --> find the sm of the digits from given numbers  123 % %10 -->3
        // 1+2+3=6 --> print "the sum of digits = 6"
        int number = 456;
        int firstDigit = number % 10; //  123/10-->12 remainder is 3
        System.out.println("First digit or first remainder:"+ firstDigit);

        number = number/10;
        System.out.println(number);

        int secondDigit =  number % 10; // 12/10-->1 remainder is 2

        number = number /10;
        int thirdDigit = number%10;
        System.out.println(thirdDigit);

        System.out.println("the sum of digits ="+ (firstDigit + secondDigit + thirdDigit));




    }
}
