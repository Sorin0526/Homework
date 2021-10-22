package OOP.Inheritance3;

import OOP.Inheritance2.Book;

public class Shirt {

    final String COLOR = "Blue";
    String size;
    double price;

    public Shirt(String size, double price) {
        this.size = size;
        this.price = price;
    }

    final public String info() {

        return "this is info ab shirt";

    }


    //OVERLOADING IS POSSIBLE FOR FINAL METHOD


    final public String info(boolean clean) {

        return "this is info ab shirt";

    }
}


