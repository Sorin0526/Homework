package Primitives;

public class ComparisonOperators {

    public static void main(String[] args) {

        int a = 3, b =4, c = 4;

        System.out.println(a==b); // false
        System.out.println(b==c); // true
        System.out.println(a==c);// false

        System.out.println(!(a==b)); //true
        System.out.println(b==c); //true
        System.out.println(!(b==c));// false
        //==================================================//

        System.out.println(a != b); // true
        System.out.println( b != c); // false

        System.out.println(!(b != c)); // true

        //=================================================//

        System.out.println(a>b); //false
        System.out.println(b>c); //false

        //=================================================//

        System.out.println(a < b); // true
        System.out.println(a < c); //true
        System.out.println(b < c); //false

        //==================================================//

        System.out.println( a >= b); // false
        System.out.println( c >= b); // true

        //=================================================//

        System.out.println(c <= b);// true
        System.out.println(a <= c); //true

        //=================================================//



    }
}
