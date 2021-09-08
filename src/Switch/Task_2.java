package Switch;

import java.util.Scanner;

public class Task_2 {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Tell me your fav color");
        String color = myScanner.nextLine();

        switch (color.toUpperCase()){
            case "blue" :
                System.out.println("My fav color is Blue, too");
                break;
            case "red" :
                System.out.println(" I also like red");
                break;
            case "green":
                System.out.println(" I also like green");
                break;
            case "pink" :
                System.out.println(" I also like pink");
                break;
            default:
                System.out.println("there is no matching color");
                break;

        }
    }
}
