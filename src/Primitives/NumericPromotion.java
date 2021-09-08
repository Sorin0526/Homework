package Primitives;

public class NumericPromotion {

    public static void main(String[] args) {

        byte b1 = 112;

        short sh1 = 30;

       //  byte sum1 = b1 + sh1; it will not compile bc of the numeric promotion. java will automatically convert byte and short to int.

        int sum1 = b1 + sh1; // java promotes smaller data types byte and short to integer data type.
        System.out.println(sum1);

        //short sum3 = b1 +sh1; will not compile
        short sh3 = b1;
        float fl1 = 2.3f;
        double db1 = 3.4;
       // float sum4 = (float)(db1 + fl1); this is OK. it will be stored into a smaller data type
        //float sum2 = fl1 +db1; compile time error

        System.out.println(fl1 + db1);

        double sum2 = fl1 + db1;
        System.out.println(sum2);


       // int product1 = sum1 * sum2; result is a decimal number thats why you cannot store it int data type.
        double product1 = sum1 * sum2;

        int i1 = 23;
        double db2 = i1;

        //int i2 = db2; will not compile

        //long l1 = db2; will not compile



    }
}
