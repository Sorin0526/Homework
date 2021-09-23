package Methods;

public class BankAccount {

    String bankName= " Techtorial";
    int accountNumber;
    double balance;
    String accountHolderName;
    boolean loggedIn;
    String userName;
    String passWord;


    //create a method that will display all account information
    // create a method named as deposit, it will update the balance
    // create a method named as withdraw, it will update the balance
    // create a method named as logIn, it will check if the user log in or not, it will return true or false

    public void accountInfo (){

       // System.out.println(" The account holder's name is "+ accountNumber +" Bank's name is "+ bankName +", your account number is "+ accountNumber + " your balance is "+ balance );
        System.out.println("Bank name: "+ bankName + "/n Account number is : "+ accountNumber+"/n Balance is : "+bankName+"/n Account holder's name is: "+ accountHolderName+"/n Logged in : "+ loggedIn);
    }

    public double deposit (double depositAmount){

        balance+=depositAmount;
        System.out.println("Your balance after deposit amount of "+ depositAmount+ " is "+ balance);
        return balance;

    }

    public double withDraw ( double withdrawAmount){
        balance-=withdrawAmount;
        System.out.println("Your balance after withdrawal amount of "+ withdrawAmount+ " is "+ balance);
        return balance;

    }

    public boolean logIn (String user, String pass){

        if(userName.equals(user)&& passWord.equals(pass)){

            System.out.println(" You succesfully logged in");

            loggedIn=true;


        }else{
            System.out.println("Your credentials are not matching. Try again! ");
        }

        return loggedIn;

    }

    public static void main(String[] args) {

        BankAccount Java= new BankAccount();

        Java.accountInfo();
        Java.accountNumber = 123345;
        Java.accountHolderName= "Joe";
        Java.userName= "abc";
        Java.passWord="123";
        Java.balance= 100_000;

        Java.accountInfo();

        Java.deposit(5000);
        Java.withDraw(60);
        Java.logIn("abc","123");
        Java.accountInfo();




    }




}
