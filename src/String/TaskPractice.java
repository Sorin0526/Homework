package String;

import com.sun.jmx.snmp.SnmpUnknownAccContrModelException;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TaskPractice {

    public static void main(String[] args) {
        /*TASK: get a string from User via scanner and:
-print:
	- first char
	- last char
	- index of second matching letter 'c'
	- length of string
	- index of x
	  */

        Scanner bobby= new Scanner(System.in);

        System.out.println("Please enter a String value");

        String str = bobby.nextLine();

        System.out.println(str.charAt(0)); //--> first char

        System.out.println(str.charAt(str.length()-1)); //--> last char

        str.indexOf("c", str.indexOf("c")+1);

        System.out.println(str.indexOf(str.indexOf("c", str.indexOf("c")+1))); //--> for 2nd matching lower case "c"

        System.out.println(str.length()); //--> lenght of String

        System.out.println(str.indexOf('x')); //--> index of 'x'



        // Task : " Do whatever it takes"
        /*
        concat with " to learn Java"
        remake everything to uppercase
        replace "Java" with "JOB"
        check if the text contains  "Chicago"
        print


        String word1 = " Do whatever it takes";
        String word2 = " to learn Java";
        String word3 = word1.concat(word2);
        word3 = word3.toUpperCase();
        System.out.println(word3);
        word3 = word3.replace("Java", "JOB");
        System.out.println(word3);


         */









    }
}
