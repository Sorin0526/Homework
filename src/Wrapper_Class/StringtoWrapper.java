package Wrapper_Class;

public class StringtoWrapper {

    public static void main(String[] args) {

        String str1 = "54321";

        Integer i1 = Integer.valueOf(str1);
        System.out.println(i1);

        String str2 = "5.9";
        Float fl1 = Float.valueOf(str2);
        System.out.println(fl1);

        String str3 = " False";
        Boolean bl1 =  Boolean.valueOf(str3);
        System.out.println(bl1);
        System.out.println(bl1 == false);
        System.out.println(bl1.equals(true));

        String str4 = ""+'c';
       // Character.valueOf(str4); --> compile time error - you cannot convert string value to Character object


    }
}
