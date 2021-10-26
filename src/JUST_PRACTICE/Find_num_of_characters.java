package JUST_PRACTICE;

public class Find_num_of_characters {

    public static void main(String[] args) {

        String given="ertwsFADSF::IJ67585498testtest8732484375efds*&(&*^)5%^";

        String replace = given.replaceAll("[^A-Za-z]","");

        // ^ symbol means -replace all non-alphabetic with space

        // without ^ it would replace all letters with space and count all symbols

        System.out.println(replace.length());
    }
}
