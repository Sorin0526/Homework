package ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Flower {


    String color;
    String name;
    int numberOfPetals;
    double price;

    public Flower(String color, String name, int numberOfPetals, double price) {
        this.color = color;
        this.name = name;
        this.numberOfPetals = numberOfPetals;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", numberOfPetals=" + numberOfPetals +
                ", price=" + price +
                '}';
    }

    //create few flower objects and store them in an arraylist

    public static double price (ArrayList<Flower> flowers){

        double total = 0;

        for (int i = 0; i < flowers.size(); i++) {

            total+=flowers.get(i).price;

            }
        return total;

        }


    public static void main(String[] args) {


        ArrayList<Flower> flowers = new ArrayList();

        Flower flower1 = new Flower("red", "Rose",12, 3.99);
        Flower flower2 = new Flower("yellow","Rose",11, 4.99);
        Flower flower3 = new Flower("pink", "Rose", 10, 5.99);

        flowers.add(flower1);
        flowers.add(flower2);
        flowers.add(flower3);
        System.out.println(flowers);

        System.out.println(flower3.price);
        System.out.println(flowers.get(2).price);

        //create a method that will take an arraylist as a parameter
        //this method will return total prices of the flowers





        ArrayList <String> names = new ArrayList();
        names.add("Alex");


    }
}

