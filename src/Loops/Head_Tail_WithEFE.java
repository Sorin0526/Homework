package Loops;

import java.util.Random;
import java.util.Scanner;

public class Head_Tail_WithEFE {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String answer;


        do {
            System.out.println("Game is started, MAKE a GUESS! HEAD/TAIL ");
            String guess = scanner.next();
            int number = random.nextInt(2);


           String flip =  number == 0 ? "Head" : "Tail";


           if(guess.equalsIgnoreCase(flip)){
               System.out.println("You are lucky, it is your day today.");
           }else{
               System.out.println("Sorry, that was not the correct choice!");
           }



            System.out.println("Do you want to play again? Y/N ");
            answer= scanner.next();
        }while(answer.equalsIgnoreCase("y"));
        System.out.println("Its Ok, SEE you NEXT time!");
    }
}
