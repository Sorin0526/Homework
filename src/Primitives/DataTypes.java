package Primitives;

public class DataTypes {

    /*there are 8 dif primitive data types
    byte, short, int, long, float, double --> used for numbers
    char --> for single character (unicode)
    boolean --> for true/false options
     */

    public static void main(String [] args){

        byte number=6;
        byte number1=127;


       // byte number2= 129; capacity issue. can't use the same name and the number should be in the range of -128 to 127.that is why it will not compile.

        short number3= 100;
        short number4= 31789;

        int number5=32_000; // you can use underscore (_) in between digits
        int number6= 1_000_000; //more readable, it will affect the value

        System.out.println(number6);

        long number7 = 341345;
        long number8 = 748564856748356l; // you should use 'l/L' at the end of long values

        System.out.println(number8);

        float number9= 2.3f; // you should use 'f/F at the end of float value
        float number10=56;// 56-->56.0
        System.out.println("the value of number 10--> " + number10);
        //int a=5.6; you can not store decimal value in int data  type
        float number11= 56.0f;
        //2.3  56.0  -->56 (same value)

        double number12=2.1;
        //most common primitive data type usage are int, double, long, boolean, char

        double number13= 89; // 89 is also 89.0 double data type can store int value
        System.out.println(number13);
    }
}
