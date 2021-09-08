package Variables;

import javafx.collections.ObservableArrayBase;

public class Practice3 {

    public static void main(String [] args){

        int apple; // declaring the variable which means giving the data type a name

        apple=25; // initializing the variable which means assigning the value for it

        int banana=2; //declaring and initializing in one line ( at the same time)

        System.out.println("Number of apples: "+apple);//25

        apple=23;// is called re-assigning  the value for the variable(changing the value of the variable)
        System.out.println("Nuber of apples: "+ apple);//23

        int $apple=10;
        int _apple=11;// and int apple=11 are more common
        int apple$=12;
        int apple_=13;
       // int %apple=15; compile time error
        //int 2apple=16; compile time error
        int apple2=17; // you CANNOT start name of variable with number, but you can end with a number
        int a$$pple=18;

        //there are 23 apples and 2 bananas
        int applePrice= 3;
        int bananaPrice = 2;

        int totalApplePrice= apple*applePrice;

        int totalBananaPrice=banana*bananaPrice;

        System.out.println(totalApplePrice+totalBananaPrice+ " is your total payment");

        int payment= totalApplePrice+totalBananaPrice;

        System.out.println(payment);








    }
}
