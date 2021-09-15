package Homework.Homework_6;

import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter first String");
        String first= input.nextLine();
        System.out.println("Please enter second String");
        String seocnd=input.nextLine();

        String answ=first.length()<=seocnd.length() ? first : seocnd;
        if(answ.equalsIgnoreCase(first)){
            int lengthFirst=first.length();
            String minus=seocnd.substring(0,lengthFirst);
            System.out.println(first.concat(minus));
        }else{
            int lengthSecond=seocnd.length();
            String minus=first.substring(0,lengthSecond);
            System.out.println(minus.concat(seocnd));
        }


    }

}

