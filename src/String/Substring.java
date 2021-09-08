package String;

import com.sun.org.apache.bcel.internal.generic.FSUB;

public class Substring {
    public static void main(String[] args) {

        String str = "Techtorial";

        String part1 = str.substring(2); // when you pass single index number into the substring method
                                        // it will take partial text starting from that index,and
                                        // it will include that index's  char

        System.out.println(part1);

        String part2 = str.substring(2,4); // when you pass beginning and ending index numbers,
                                           // it will start from the beginning index which is included and
                                           // stop at ending index which is not included
        System.out.println(part2);

        System.out.println(str.substring(0)); //--> Techtorial

        // print last 3 chars from string "I will do it SOON"

        String x= "I will do it SOON";
        /*int a = x.length();
        System.out.println(a);

        String y = x.substring((17-3),17);
        System.out.println(y);*/

        x.substring(x.length()-3);
        System.out.println( x.substring(x.length()-3)); // when your string value does not have enough value to take substring
                                                        // it will throw an exception "StringOutOfBound" exception

        String string1 = "ON";
        System.out.println( string1.substring(string1.length()-3)); // when your string value does not have enough value to take substring
                                                                    // it will throw an exception "StringOutOfBound" exception

        //because of the error anything after it will not work

        System.out.println("This is all about String Method");





    }
}