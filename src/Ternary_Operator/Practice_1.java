package Ternary_Operator;

public class Practice_1 {

    public static void main(String[] args) {

        int num1 = 5;
        int num2 = 5;
        int num3 = 6;
        double money = 200;

        int result1 = num1 == num2  ?  25 : 30 ;
        System.out.println("result is " + result1);

        String result2 = num1 == num3  ? "hello" : "bye";
        System.out.println(result2);


        // num1 == num2  ?  "Good morning" : 5; BECAUSE VALUES ARE DIF DATA TYPES IT CANNOT BE STORED BUT IT CAN BE PRINTED OUT


        int result3 = num1 == num3  ? num1++ + num2++ : num3++ + num3;  // num3 = 13
        double result4 = num1 == num3  ?  money : num3++ + num3;
        System.out.println(result3);
    }
}
