package JUST_PRACTICE;

public class Computer {
    /*
    create a computer class
have instance field of price of the computer
create a calculator method to find the total price of 4 computers
this method will take an array an parameter which represents the prices of those 4 computers
this method will return the total price

create 2 constructor: 1 with no args
					  1 with 1 arg to initialize the instance variable

override the toString method to show price of the computer

     */
    double price;

    public Computer() {
        System.out.println("This is No argument Constructor");
    }

    public Computer(double price) {
        this.price = price;
        System.out.println("This is One argument constructor");
    }


    public static double calculate(double[] pricesOfComputers) {
        double totalPrice = 0;
        for (double price : pricesOfComputers) {
            totalPrice += price;
        }
        return totalPrice;
    }

    @Override
    public String toString() {
        return "" + price;
    }

    public static void main(String[] args) {
        double[] array = {1.2, 2.3, 4.5, 8.6};

        double total = calculate(array);
        System.out.println(total);
        Computer c1 = new Computer();
        System.out.println(c1);


    }
}


