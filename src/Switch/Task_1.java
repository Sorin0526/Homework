package Switch;

import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {

        /*solve the Q by using switch
        ask user to provide a num bet 1 to 7
        print the matching name of the day for that number
        when user enters one print --> "It is monday"
         */

        Scanner myscanner = new Scanner(System.in);
        System.out.println(" please enter a number from 1 to 7");
        int answer = myscanner.nextInt();
        switch (answer){
            case 1 :
                System.out.println("its monday");  //CANNOT have the same case more than once
                break;
            case 2:
                System.out.println("its tuesday");
                break;
            case 3:
                System.out.println("its wednesday");
                break;
            case 4:
                System.out.println("its thursday");
                break;
            case 5:
                System.out.println("its friday");
                break;
            case 6:
                System.out.println("its saturday");
                break;
            case 7:
                System.out.println("its sunday");
                break;
            default:
                System.out.println("Invalid entry");// usually DEFAULT is used at the end
        }
    }
}
