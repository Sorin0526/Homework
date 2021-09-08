package ProjectTasks;

public class Project_2Task_3 {

    public static void main(String[] args) {

        double dollarAmount = 2.36;
        double totalAmountInPennies = dollarAmount * 100;
        System.out.println(totalAmountInPennies);

        int quarter = (int)( totalAmountInPennies / 25);
        System.out.println(quarter);

        totalAmountInPennies = totalAmountInPennies - quarter * 25;
        System.out.println(totalAmountInPennies);

        int dime = (int)(totalAmountInPennies / 10);
        System.out.println(dime);

        totalAmountInPennies = totalAmountInPennies - dime * 10;
        System.out.println(totalAmountInPennies);

        int nickel = (int)(totalAmountInPennies / 5);
        System.out.println(nickel);

        System.out.println(totalAmountInPennies);
        System.out.println(dollarAmount + " will make " + quarter + " quarters " + dime + " dime " + nickel + " nickel and " + totalAmountInPennies + " pennies" );






    }
}
