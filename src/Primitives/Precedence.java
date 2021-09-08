package Primitives;

public class Precedence {

    public static void main(String[] args) {

        int count = 10 + 15;
        int count1= count + 3 * 5; //25 + 15
        System.out.println(count); //25
        System.out.println(count1); //40

        int count2 =  count - count1/ 2 * 3;
        System.out.println( count2);


        int count3 = 6 / 3 * 5 % 3;
        System.out.println(count3); // 1

        int count4 = 6 -4 - count + count3;
        System.out.println(count4); // -22
        System.out.println("the total of count3 and count4 --> " + (count3 + count4)); //-21

        //$50 food. $250 electronics, $80 shoes
        // 10% tax,     20% tax ,      15% tax

        //totalTax =  50 * 0.1  +   250 * 0.2  +   80 * 0.15

        //System.out.println(totalTotal);
        // totalPayment = 50 + 250 + 80 +  (50 * 0.1)  +   (250 * 0.2)  +  ( 80 * 0.15);
        // discount with %

        double payment = 50 + 250 + 80 +  (50 * 0.1)  +   (250 * 0.2)  +  ( 80 * 0.15);
        System.out.println(payment);

        double number = (20 *(.1 +500) * 2 + 30 ) * .07;
        System.out.println("number --> " + number);


    }
}
