package String;

import java.util.Locale;

public class Methods3 {
    public static void main(String[] args) {

        String string= "Selenium";

        // method used .toUpperCase();
        // it will convert all String to upper case

        string = string.toUpperCase();
        System.out.println(string);

        // method used .toLowerCase();
        // it will convert all string to lower case

        string.toLowerCase();
        System.out.println(string.toLowerCase());
        System.out.println((string.toUpperCase()));
        System.out.println(string);//--> upper case

        string = string.toLowerCase();
        String a =""+ string.charAt(0); // VERY IMP
        a = a.toUpperCase();
        System.out.println(a);
        System.out.println(a+ string);

        //startWith();==================================================

        String word = "do whatever it takes";

        System.out.println(word.startsWith("do")); //--> true

        System.out.println(word.startsWith("what")); //--> false

        System.out.println( word.startsWith("d")); //--> true
        boolean result1 = word.startsWith("d");
        System.out.println(result1
        );
        System.out.println( word.startsWith("d o")); //--> false
        boolean result2 = word.startsWith("d o");
        System.out.println(result2);

       // char a = 'W';
        System.out.println(word.startsWith("do whatever it takes")); //--> true

        // endWith();======================================================
        //do whatever it takes

        word.endsWith("do");//-->false

        System.out.println(word.endsWith("s"));//--> true
        System.out.println(word.endsWith("es"));//--> true
        System.out.println(word.endsWith("takes"));//--> true
        System.out.println(word.endsWith("takeS")); //--> false
        System.out.println(word.endsWith("it"));//--> false
        System.out.println("___________________________________________");

        String text = "Techtorial";

        System.out.println(text.contains("t")); //true
        text = text + word;

        System.out.println( text.contains("do"));// true
        System.out.println(text.contains("for"));// false
        System.out.println(text.contains("i")); //true





    }
}
