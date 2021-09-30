package ArrayList;

import java.util.ArrayList;

public class Store {

    public static void main(String[] args) {

        Computer c1 = new Computer("Apple", "Macbook Air", 1500, 13.5);
        Computer c2 = new Computer("Apple", "Macbook Pro", 2000, 16);
        Computer c3 = new Computer("HP", "Envyr", 1100, 15.0);
        Computer c4 = new Computer("Lenovo", "ThinkPad", 900, 11);

        ArrayList<Computer> computers = new ArrayList();

        computers.add(c1);
        computers.add(c2);
        computers.add(c3);
        computers.add(c4);

        c1.findComputer(computers);// you can call static method with the help of object

        Computer.findComputer(computers);// you can call static method with the help of Class




    }
}
