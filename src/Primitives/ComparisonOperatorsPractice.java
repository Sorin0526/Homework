package Primitives;

public class ComparisonOperatorsPractice {

    public static void main(String[] args) {

        // ==, !=, >, <, >=, <= ----> any comparison operators will return/ gives true or false (boolean)

        int x = 10, y = 10, z = 65;

        boolean result1 = x == y; //---> true

        System.out.println(" result1 --> " + result1);

        char ch1 = 'A';
        char ch2 = 65;
        char ch3 = 66;

        boolean result2 = ch1 == ch2;
        System.out.println(" result2 --> " +result2);

        boolean result3 = z == ch2;
        System.out.println(" result3 --> " + result3);

        boolean result4 = z == ch3;
        System.out.println(" result4 --> " + result4);

        boolean result5 = x > y;
        System.out.println(result5); // false

        boolean result6 = x <= y;
        System.out.println(result6); // true

        boolean r7 = result1 == result2;
        System.out.println(r7); // true

        //boolean r8 = result1 != result2; comparing to boolean condition can only use == or !=, but comparing to variables is possible
       // boolean r8 = result1 == result2;













    }
}
