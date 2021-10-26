package JUST_PRACTICE;

import org.omg.CORBA.WStringSeqHelper;

public class StringReverse {

    public static void main(String[] args) {

        //Reverse String: Using Reverse Function: StringBuilder

          String word= "Hello Techtorial ";
        StringBuilder builder = new StringBuilder(word);

        System.out.println(builder.reverse());

        // using charAt

        String reverse="";
        for (int i =word.length()-1; i >= 0; i--) {

            reverse+=word.charAt(i);

        }
        System.out.println(reverse);


        //using char []

        String reverse1="";
        char [] array = word.toCharArray();
        for (int i = array.length-1; i >=0 ; i--) {
            reverse1+=array[i];
        }
        System.out.println(reverse1);

        //reversed with substring

        String reverse2="";
        for (int i = word.length(); i >=1; i--) {

            reverse2 += word.substring(i-1,i);
        }
        System.out.println(reverse2);
        
        
        //****Reverse each word in the sentence**** 
        String str = "I love java";
        String rvers="";
        String [] array1 = str.split(" ");


        for (int i = 0; i < array1.length; i++) {
            String wordReverse = "";
            for (int j = array1[i].length()-1; j >=0 ; j--) {
                wordReverse+=array1[i].charAt(j);
            }
            rvers+=wordReverse+" ";


        }
        System.out.println(rvers);

    }
}
