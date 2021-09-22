package Mentoring_Ahmet.InterviewQuestions;

import com.sun.java.swing.plaf.windows.WindowsInternalFrameTitlePane;

public class AlphaCharacters {

    public static void main(String[] args) {

        /*
        print out only alphabetic characters
        print out only digit characters
        print out only symbols(other characters)
         */

        String given="ertwsFADSF::IJ67585498testtest8732484375efds*&(&*^)5%^";
        String onlyAlphabet="";
        String onlyDigits="";
        String onlySpecial="";
        // i need to reach out each of the letter

        for (int i = 0; i < given.length(); i++) {

            char ch = given.charAt(i);

            if (Character.isAlphabetic(ch)&& !Character.isDigit(ch)){

                onlyAlphabet+=ch;
            }else if (!Character.isAlphabetic(ch)&& Character.isDigit(ch)){

                onlyDigits+=ch;

            }else {
                onlySpecial+=ch;
            }

        }
        System.out.println(onlyAlphabet);
        System.out.println(onlySpecial);
        System.out.println(onlySpecial);
    }

}
