package String;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Locale;

public class Methods2 {

    public static void main(String[] args) {

        String name = "Diana";

        // indexOf

         name.indexOf('D');
        System.out.println(name.indexOf('D')); // index number of 'D' --> 0

         name.indexOf("D");
        System.out.println(name.indexOf("D")); // index number of "D" --> 0

         name.indexOf("Di");
        System.out.println(name.indexOf("Di")); // index number of "Di" --> 0

        System.out.println(name.indexOf("ana")); // --> 2  , it looks for matching sequence of provided char
                                                // and returns first matching char's index umber
        System.out.println(name.indexOf("tina")); //  -1, there is no matching char sequence

        System.out.println(name.indexOf('k')); // -1 --> this is not an error code is still working

        System.out.println("this is sat morning");

       name = name.concat(" Bejan");
       // System.out.println(name.concat(" Bejan"));
        System.out.println(name); //Diana Bejan

        name.indexOf("a", 3); // -->
        System.out.println( name.indexOf("a", 3)); // --> it will start looking for that --> 4
                                                                // char starting from given index

        System.out.println(name.indexOf("B",name.indexOf(" "))); // --> 6
        System.out.println(name.indexOf("B",name.indexOf(" ")+1));// --> 6

        name = "Arzu Beril Sen";
        System.out.println(name.indexOf("e",7));
        System.out.println(name.indexOf("e",name.indexOf(" ")+3)); //

        name.indexOf(2); // --> values that you are giving inside the method parentheses are called parameters
                        // some methods take no parameters, some takes single parameter or multiple parameters

        name.length(); //--> no parameters
        name.charAt(3); //--> single parameter
        name.indexOf("e", 4); // --> you can pass either one or two parameters by separating them with come


        name = "Andra Moldovan";

        System.out.println(name.length());
        System.out.println(name.charAt(8));
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.replace("Andra", "Sorin" ));
        System.out.println(name.charAt(9));
        System.out.println(name.indexOf("Mol"));

        String name1 = " Sorin";
        name += name1;
        System.out.println(name);
        System.out.println(name.length());
        name= name.toUpperCase();
        System.out.println(name);
        System.out.println(name.indexOf("V"));
        System.out.println(name.indexOf("S", name.indexOf(" ")+2));
        System.out.println(name.indexOf("O", name.indexOf(" ")+1));
        System.out.println(name.indexOf("SORI"));

        System.out.println(name.startsWith("Sorin"));
        System.out.println("ANDRA");
        System.out.println(name.startsWith("ANDRA"));

        name = name.toLowerCase();
        char firstLetter = 'A';
        name+= firstLetter + name;
        System.out.println(name);
        name = "Andra Moldovan";
        System.out.println(name);




    }
}
