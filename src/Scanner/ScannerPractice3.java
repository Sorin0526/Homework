package Scanner;

import java.util.Scanner;

public class ScannerPractice3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // memorize this

        System.out.println(" please enter your full name");

        String fullName = scanner.nextLine(); // next is looking for the space(one word) but nextLine will take everything on the line

        System.out.println("you entered this value " + fullName);

        System.out.println(" please enter your state");
        char firstLetter = scanner.next().charAt(0);// indexing
                                                    //I l l i n o i s --> letter count is 8
                                                    //0 1 2 3 4 5 6 7 --> index numbers

        System.out.println(firstLetter);





    }
}
