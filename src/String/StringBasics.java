package String;

public class StringBasics {

    public static void main(String[] args) {

        String text = "School";
        String name = new String("Sorin");

        System.out.println(text);
        System.out.println(name);

        text = text + " is Techtorial";
        System.out.println(text);

        text += " Academy";
        System.out.println(text);

        // text -= "Academy; you can not use -, *, / or % with String
        //placing one String before the other String and combining them together is called CONCATENATION.

        String word = name + text;
        System.out.println(word);
        System.out.println(word +"5");
        System.out.println(word);

        name = name + text;
        name += text;
        System.out.println(name);

        String  str = "Java";
        String str1 = "Selenium";

        String result = str + " "+ str1;
        System.out.println(result);

        System.out.println(str1 + " is next");
        System.out.println(str + " is first");
        System.out.println(result +" "+ str +" "+ str1); // --> Java Selenium Java Selenium

        str = str + 5 + 6;
        System.out.println(str);

        str1 = str1 + "5" + "6";
        System.out.println(str1);

        result = 5 + 6 + result; // --> because of the numeric precedence 5 + 6 = 11 (left to right)
        System.out.println(result);

        str = "Java";
        str = str + 5 * 6; // --> multiply has priority against addition (numeric precedence)

        System.out.println(str);
        System.out.println(str + 15/3);// str is = to   5*6= 30 next to 15/3 --> 305

        str="Java";


        int a = 12 ;
        str.concat(" is cool");
        System.out.println(str);

        str = str.concat(" is very easy");
        System.out.println(str);

        str = str.toUpperCase();
        System.out.println(str);

    }
}
