package Variables;

public class Practice4 {

    public static void main(String [] args){
         /* in a farm
         there are 12 cows and 23 chickens
          each chicken cost is 10$
          each cow cost 500$
          1- calculate the total number of legs of the animals in this farm
          2- calculate the total cost of animals in this farm

       //this is my trial
        /*
        int chicken= 23;
        int chickenLegs=2;
        int totalChickenLegs= chicken*chickenLegs;
        int cows= 12;
        int cowsLegs=4;
        int totalCowsLegs= cowsLegs*cows;
        int totalNumberLegs=totalChickenLegs+totalCowsLegs;

        System.out.println(totalNumberLegs);
        */


// this is the instructor's version

        int cows= 12;
        int chickens= 23;
        int cowLegs=4;
        int chickenLegs= 2;

        int totalCowLegs= cows*cowLegs;
        int totalChickenLegs= chickens*chickenLegs;
        int totalLegs= totalChickenLegs+totalCowLegs;

        System.out.println("Total number of the legs in this farm is: " +totalLegs);


        int cow$ = 500;
        int chicken$= 10;

        int total$= cows*cow$ + chickens*chicken$;

        System.out.println("Total cost of animals in the farm is : " + total$);


    }
}
