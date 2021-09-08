package Switch;

import com.sun.org.apache.bcel.internal.generic.BREAKPOINT;

import javax.xml.bind.annotation.XmlType;
import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Nested_Switch_Practice {

    public static void main(String[] args) {

        /*
        you are making a call to a company
        there are three dept  IT-1 HR- 2   REP-3
        in the IT dept : Raj , Alex, Jessi
        in the HR dept: Ana , Tima
        in the REP dept: Jeremiah, John, David
            ask user which dept they want to talk to
            after they choose the dept ask them who do they want to talk to
         */

        Scanner input = new Scanner(System.in);
        System.out.println(" please choose the right dept : IT, HR or REP");
        String dept= input.nextLine().toLowerCase();
        switch (dept){
            case "it":
                System.out.println("choose Raj, Alex or Jessi");
                String name = input.nextLine().toUpperCase();
                switch (name){
                    case "RAJ":
                        System.out.println("good choice");
                        break;
                    case "ALEX" :
                        System.out.println("Also a great choice");
                        break;
                    case "JESSI":
                        System.out.println("I like your choice");
                        break;
                    default:
                        System.out.println("Invalid selection");break;
                }break;

            case "hr":
                System.out.println("choose ana or tima");
                String name1 = input.nextLine().toUpperCase();
                switch(name1) {
                    case "ANA":
                        System.out.println("good choice");
                        break;
                    case "TIMA":
                        System.out.println("Also a great choice");
                        break;
                    default:
                        System.out.println("Invalid selection");
                        break;
                }break;

            case "rep":
                System.out.println("choose Jeremiah, John or David");
                String name2 = input.nextLine().toUpperCase();
                switch (name2){
                    case "JEREMIAH":
                        System.out.println(" great choice wih Jeremiah");
                        break;
                    case "JOHN":
                        System.out.println(" I like that you choose John");
                        break;
                    case "DAVID":
                        System.out.println("David is the way to go");
                        break;
                    default:
                        System.out.println("Invalid selection ");
                        break;
                }break;

            default:
                System.out.println("There is no such dept");
        }

    }
}
