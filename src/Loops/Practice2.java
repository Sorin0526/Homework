package Loops;

public class Practice2 {

    public static void main(String[] args) {

        /*
        print out  " I am here today"
        for the ages from 23 to 26
        before 23 and  after 26 print "I am not here"
         */
        int age = 23;

        System.out.println("I am not here");



        while (age>=23 && age<=26){   // simple put age <= 26 because age already starts at 23
            System.out.println("I am here");
            age++;
        }




        System.out.println("I am not here");


        // print out numbers between 10 - 20

        int number = 10;

        while(number<=20){

            System.out.println("The number is now --> " +number); // or +number++ and no number++ on the next line
            number++;
        }


    }
}
