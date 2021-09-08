package String;

import java.util.Scanner;

public class TaskPractice1 {
    public static void main(String[] args) {
      /*  TASK: Ask user to enter a String value which shuold have space at the beginning or end
        - Replace all letter 'a's with single '*' and letter 'e's with double '**',
                - change all string value to UPPERCASE
                - Find index of First '*'
                - Multiply that value by 10 and
                - Print out the result


        Scanner Sorin = new Scanner(System.in);

        System.out.println( "please enter your name with 5 spaces before  and 5 spaces after it");
        String name = Sorin.nextLine();
        System.out.println(name.replace("a","*"));
        System.out.println(name.replace("e","**"));
        System.out.println(name.toUpperCase());
        System.out.println(name.indexOf("*"));
        System.out.println(name.indexOf("*")*10);
        System.out.println(name);*/

        //instructor ex:
        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter a string value may have some space in the beginning or at the end");

        String text = scanner.nextLine();
        System.out.println(text);

        text = text.trim();

        text = text.replace("a", "*");
        System.out.println(text);

        text = text.replace("e", "**");
        System.out.println(text);

        text = text.toUpperCase();
        System.out.println(text);

        int indexOfStar = text.indexOf('*');

        System.out.println(indexOfStar);
        System.out.println(indexOfStar*10);


        // find and print out middle chars index number
        // text is Chicago

        text.charAt(4);
        text.charAt((text.length()-1)/2);

        text.indexOf("a");
        int index = text.indexOf(text.charAt((text.length()-1)/2));
        System.out.println(index);

















    }
}
