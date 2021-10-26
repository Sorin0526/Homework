package JUST_PRACTICE;

import java.awt.*;
import java.util.Arrays;

public class Ways_to_Reverse_String {
    public static void main(String[] args) {

        String toReverse="Hello Techtorial";



        //StringBuffer

        StringBuffer buffer= new StringBuffer(toReverse);

        System.out.println(buffer.reverse());



        //StringBuilder

        StringBuilder builder = new StringBuilder(toReverse);

        System.out.println(builder.reverse());



        // Reverse with for Loop - charAt method

        String reverse ="";
        for (int i = toReverse.length()-1; i >=0 ; i--) {
            if(toReverse.charAt(i)>0){
                reverse+=toReverse.charAt(i);
            }
        }
        System.out.println(reverse);



        // Reverse using charArray

        String reverse1= "";
        char [] charArray= toReverse.toCharArray();

        for (int i = toReverse.length()-1; i >=0 ; i--) {

            reverse1+=charArray[i];
        }
        System.out.println(reverse1);



        // Reverse using substring

        String reverse2="";

        for (int i = toReverse.length(); i >=1 ; i--) {

            reverse2+=toReverse.substring(i-1,i);

        }
        System.out.println(reverse2);

        //Reverse a  String word by word

        String str = "I love java";
        String strReverse = "";
        String [] strArray = str.split(" ");

        for (int i = strArray.length-1; i >=0 ; i--) {
            strReverse+=strArray[i]+" ";

        }
        System.out.println(strReverse);


        // Reverse each word in a sentence

        String str1 = "I love java";
        String strReverse1="";
        String[] array = str.split(" ");
        for (int i = 0; i <array.length ; i++) {
            String word = "";
            for (int j = array[i].length()-1; j >=0; j--) {
                word+=array[i].charAt(j);
            }
            strReverse1+=word+" ";

        }

        System.out.println(str1);
        System.out.println(strReverse1);
    }

}
