package Primitives;

public class LogicalOperatorPractice {

    public static void main(String[] args) {

        // there is an event for kids.
        // they must be older than 5 younger than 12
        //the  other req is: their height need to be more than 46 inches to be able to play

      /*
        int ageKids = 5;
        boolean ageToAttend = ageKids >= 12;
        int heightNeeded = 46;
        boolean heightNeededToPlay = heightNeeded >= 46;

                 boolean CanTheyPlay = ageKids >= ageToAttend && heightNeeded >= heightNeededToPlay;
       */

        int kidAge = 12;
        int kidHeight = 56;

        int minAge = 5;
        int maxAge =12;
        int reqHeight = 46;

        boolean ok = (kidAge >= minAge && kidAge <= maxAge) && kidHeight >= reqHeight;

        System.out.println(ok);




    }
}
