package JUST_PRACTICE;

public class Check_ifNumber_isPrime {

    public static void main(String[] args) {


        // Write a java program to check whether a given number is prime or not?
        int num = 28;

        boolean flag = false;

        for (int i = 2; i < num / 2; ++i) {

            if (num % i == 0) {
                flag = true;
                break;

            }
        }
        if (!flag) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }

    }
}


//        boolean flag = false;
//
//        for (int i = 2; i <= num / 2; ++i) {
//            if (num % 2 == 0) {
//                flag = true;
//                break;
//            }
//        }
//        if (!flag) {
//            System.out.println("number is prime" + num);
//        } else {
//            System.out.println("number is not prime" + num);
//        }
