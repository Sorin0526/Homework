package Mentoring_Ahmet;

import java.util.Scanner;

public class ATMProject {

    public static void main(String[] args) {


       //  i am going to create a card number and password

        String savedCardNumber = "1";
        String savedPassword = "1" ;
        Scanner scan = new Scanner(System.in);
        int chances= 3, choice;
        double balance = 100;
        int[] options= new int[]{5,10,20, 50 , 100};
        int[] deposit = new int[]{5,10,20, 50 , 100, 200, 500, 1000};
        String[]bills = new String[]{"gas", "electricity","internet","water"};
        double[]cost= new double[]{10.55, 34.66,64.65, };




        do{
            System.out.println("Please enter your card number: ");
            String cardNUmber = scan.nextLine();
            System.out.println("Please enter your password");
            String password = scan.nextLine();

            if (cardNUmber.equals(savedCardNumber)&& password.equalsIgnoreCase(savedCardNumber)){

                System.out.println("welcome to Bank of America");
//                System.out.println("what would you like to do?");
//                System.out.println("1-withdraw\n2-Deposit\n3-Balance\n4- Payments\n5-Change the password\n6-Exit");
                do{
                    System.out.println("what would you like to do?");
                    System.out.println("1-withdraw\n2-Deposit\n3-Balance\n4- Payments\n5-Change the password\n6-Exit");
                    choice=scan.nextInt();
                    switch (choice){
                        case 1:
                            for(int i = 0; i < options.length; i++){
                                System.out.print(options[i]+" $");
                            }
                            System.out.println("How much would you like to withdraw");
                            int money = scan.nextInt();
                            if(balance>money){
                                balance-=money;
                                System.out.println("you succesfully withdraw the monay!!!your new balance is " + balance + "$");
                                break;
                            }else{
                                System.out.println("you do not have enough balance");
                                break;
                            }
                        case 2:
                            for(int i= 0; i<deposit.length; i++){
                                System.out.println(deposit[i] +"$");
                            }
                            System.out.println("how much would you like to deposit");
                            int moneyDeposit= scan.nextInt();
                            balance += moneyDeposit;
                            System.out.println(" you succesfully deposit "+ deposit+ " and your new balance is"+ balance);
                            break;

                        case 3:
                            System.out.println( " your balance is "+ balance);
                            break;

                        case 4:
                            for (int i = 0; i< bills.length; i++){
                                System.out.println(bills[i]+ "=" + cost[i]);

                                //which one do you want to pay?
                                // balance will be balance - the bill paid
                            }
                            System.out.println("what bill would u like to pay?");
                            String option= scan.next();

                            for (int k =0; k< bills.length; k ++ ){
                                if(option.equalsIgnoreCase(bills[k])){
                                    if(balance>cost[k]){
                                    balance-=cost[k];
                                    bills[k]="paid";
                                    cost[k]=0;
                                        System.out.println("you succesfully paid "+ bills[k]+ " your new balance is "+ balance);

                                }else{
                                        System.out.println("you do not have enough balance");
                                        break;
                                    }
                                }

                            }


                    }

                }while (true);

            }else{
                chances--;
                System.out.println("wrong card number or password. please try again"+"and you have "+ chances+ "left");

                if(chances==0){
                    System.out.println("your card is hold by the ATM. please contact customer service");
                    break;

                }

            }

        }while(true);
    }
}
