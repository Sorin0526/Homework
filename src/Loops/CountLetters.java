package Loops;

import com.sun.org.apache.xpath.internal.objects.XString;

public class CountLetters {

    public static void main(String[] args) {

        /*
        "I want to solve this question by myself this time"
        count how many lower case 'i' and 'I' are in the given sentence.

        int index = 0, total = 0;
        String a ="I want to solve this question by myself this time";

        while(index<a.length()){

            if (a.charAt(index) == 'i' || (a.charAt(index)== 'I')){
                total++;
            }
index++;
        }
        System.out.println("There are " + total + " 'i' is in the given sentence.");
         */
        String text = "I want to solve this question by myself this time";

        int index = 0;
        int count = 0;

        while(index<text.length()){

           if ( text.charAt(index) == 'i'|| text.charAt(index)=='I'){

               count++;

           }
           index++;
        }
        System.out.println(" There are " + count + "    i or I in the sentence");
    }
}
