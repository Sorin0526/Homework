package Variables;

public class Proj1Task6 {

    public static void main(String [] args){
        /*write a java program to convert minutes into a number of years and days
        imput the number of minutes: 3456789
        output: 3456789 minutes is aprox 6 years and 210 days

         */
        int hour= 60;
        int day=24;
        int year=365;
        int totalMinutesPerYear=(hour*day*year);
        System.out.println(totalMinutesPerYear);
        int totalMinutes=3456789;
        int numberOfDaysLeft=(totalMinutes-(totalMinutesPerYear*6));
        System.out.println(numberOfDaysLeft);
        float numberOfYears=(totalMinutes/totalMinutesPerYear);
        System.out.println(numberOfYears);

    }
}
