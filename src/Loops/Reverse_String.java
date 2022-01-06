package Loops;

public class Reverse_String {

    public static void main(String[] args) {

         //  Selenium - reverse it and print it as a new String as reversed version
        //muileneS
        // palindrome  word ==> efe, anna , madam
        // check if the given string is a palindrome or not

        String word = "1234*4321";
        String reverse = "";

        for (int index= word.length()-1; index>= 0; index--){

            reverse = reverse + word.charAt(index);

            System.out.println(reverse);

        }
        System.out.println("Final version " + reverse); // final version

        if (word.equalsIgnoreCase(reverse)){

            System.out.println("the word is palindrome " + word);

        }else{
            System.out.println(" The word is not palindrome " + word);
        }

    }
}
