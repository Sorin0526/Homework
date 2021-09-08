package Scanner;

import java.util.Scanner;

public class ScannerPracticeTask {

    public static void main(String[] args) {

        /*
David wants to deposit his money into his bank account
-he already got $200 in his account
-he got three different paychecks ($480, $600 and $350)
-he can only deposit one paycheck at a time
-after he got his all money in the account
- he bought a phone for $599 and headphone for $299
- calculate his final money in his account
*/

        Scanner scanner = new Scanner(System.in);
        double account = 200;
        System.out.println( " how much you wanna deposit?");
        double firstDeposit = scanner.nextDouble();
        System.out.println("how much you wanna deposit?");
        double secondDeposit = scanner.nextDouble();
        System.out.println("how much you wanna deposit?");
        double thirdDeposit = scanner.nextDouble();
        System.out.println("how much your phone costs?");
        double phonePrice = scanner.nextDouble();
        System.out.println(" how much your headphones cost?");
        double headphones = scanner.nextDouble();
        double accountLeft = account+firstDeposit+secondDeposit+thirdDeposit-phonePrice-headphones;
        System.out.println( " your account is -->" +accountLeft );

        // use double data type when working with money
        // we can also use account += firstDeposit;  --> for balance update
    }
}
