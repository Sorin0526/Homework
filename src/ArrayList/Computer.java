package ArrayList;

import java.util.ArrayList;

public class Computer {
    /*

        make       model       price   screen
        apple      macbook Air 1500    13.5
        apple      macbookpro  2000    16
        HP         Envy        1100    15.0
        Lenova     ThinkPad     900    11

        show the make of the computer that has price bet 500 to 1500
    // */
    String make;
    String model;
    double price;
    double screen;

    public Computer(String make, String model, int price, double screen) {
        this.make = make;
        this.model = model;
        this.price = price;
        this.screen = screen;

    }

    public static void findComputer(ArrayList<Computer> list) {

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i).price >= 500 && list.get(i).price <= 1500) {

                System.out.println(list.get(i).make);
            }
        }

    }
}





//        Computer electronic1 = new Computer("Apple", "Macbook Air", 1500, 13.5);
//        Computer electronic2 = new Computer("Apple", "Macbook Pro", 2000, 16);
//        Computer electronic3 = new Computer("Apple", "Macbook Air", 1100, 15.0);
//        Computer electronic4 = new Computer("Apple", "Macbook Air", 900, 11);
//
//
//
//
//
//    @Override
//    public String toString() {
//        return "Computer{" +
//                "electronic1=" + electronic1 +
//                ", electronic2=" + electronic2 +
//                ", electronic3=" + electronic3 +
//                ", electronic4=" + electronic4 +
//                '}';
//    }
//
//    public static void main(String[] args) {
//        ArrayList <Computer>  electronics = new ArrayList<Computer>();
//
//        electronics.add(
//    }





