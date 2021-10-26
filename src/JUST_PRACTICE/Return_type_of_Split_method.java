package JUST_PRACTICE;

import java.util.Arrays;

public class Return_type_of_Split_method {

    public static void main(String[] args) {
        String techtorial="Techtorial interview preparation document. ";

        String [] words=techtorial.split(" ");

        // will split the string with the spaces. System.out.println(words.length);
        for (String string : words) {

            System.out.println(string);
            System.out.println(string.length());
        }
        System.out.println(Arrays.toString(words));
        System.out.println(words[3]);


    }
}
