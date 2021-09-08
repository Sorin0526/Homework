package Primitives;

public class CastingPractice {

    public static void main(String[] args) {

        long l1 = 120;

        //int i1 = l1; bc larger data type CANNOT  be stored in smaller data type

        int i2 = (int)l1; // explicit casting (Auto narrowing) it makes it smaller

        double db1 = l1; // implicit casting (Auto widening)

        short apple = 126;
        short samsung = 4;

        short total = (short) (apple + samsung);
        System.out.println(total);

        byte total1 = (byte)(apple + samsung);// use ( ) to tell java to make the total short
        System.out.println(" total1 --> " + total1);

        byte a = 12;
        short b = a;

        int total2 = apple + samsung;


        double d1 = 2.3;
        int i = 12;

        i += d1; // i = i +d1

        System.out.println(" i --> " + i); // i --> i + d1  12 + 2.3 = 14.3 //14
                                            // when you do compound assignment you dont need to do explicit casting

        int i3 = (int)d1;
        System.out.println(i3);






    }
}
