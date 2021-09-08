package IfStatement;

import java.util.Scanner;

public class Else_If_Practice {

    public static void main(String[] args) {
/*
There is a course that user need to pass
User got three test scores for this course
To be able print/show users Letter grade
-Ask User to provide those three test scores as integer between 0 to 100
-find the average of the provided test scores
-Based on the average score
- if the average is 90 to 100 --> print 'Your average test score is <average> and letter grade is A'
- if the average is 80 to 89 --> print 'Your average test score is <average> and letter grade is B'
- if the average is 70 to 79 --> print 'Your average test score is <average> and letter grade is C'
- if the average is 60 to 69 --> print 'Your average test score is <average> and letter grade is D'
- if the average is less than 60 --> 'You need to take this course again!!'

        Scanner scanner = new Scanner(System.in);
        System.out.println(" please provide the three test scores as integer from 0-100");
        System.out.println( " first score");
        int a = scanner.nextInt();
        System.out.println("second score");
        int b = scanner.nextInt();
        System.out.println("thirrd score");
        int c = scanner.nextInt();
        int avScore = (a+b+c)/3;

        if(avScore >= 90 || avScore<= 100){
            System.out.println("Your average test score is <average> and letter grade is A");
        }
        if (avScore >=80 || avScore <= 89){
            System.out.println("Your average test score is <average> and letter grade is B");
        }
        if (avScore >=70|| avScore <= 79) {
            System.out.println("Your average test score is <average> and letter grade is C");
        }
        if (avScore >=60 || avScore <= 69) {
            System.out.println("Your average test score is <average> and letter grade is D");
        }
        else{
            System.out.println("You need to take this course again!!");
        }*/
        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter your three scores bet 0-100");
        int firstScore = scanner.nextInt();
       // System.out.println("please enter your first score bet 0-100");
        int secondScore = scanner.nextInt();
        //System.out.println("please enter your first score bet 0-100");
        int thirdScore = scanner.nextInt();

        int average = (firstScore+secondScore+thirdScore)/3;

        if (average >= 90&& average<= 100){
            System.out.println("our average test score is "+ average+ " and letter grade is A");
        }
        else if (average >= 80&& average<90) {
            System.out.println("our average test score is " + average + " and letter grade is B");
        }
        else if (average >= 70&& average<79) {
            System.out.println("our average test score is " + average + " and letter grade is C");
        }
        else if (average >= 60&& average<=69) {
            System.out.println("our average test score is " + average + " and letter grade is D");
        }
        else{
            System.out.println("You need to take this course again!!");
        }


    }
}
