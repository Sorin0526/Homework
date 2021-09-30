package ArrayList;

import java.util.ArrayList;

public class ArrayListToArray {

    public static void main(String[] args) {

        ArrayList <String> cars = new ArrayList<>();

        cars.add("Honda");
        cars.add("Tofas");
        cars.add("Lada");


        // HOW TO CONVERT ARRAYLIST TO ARRAY IS BY USING 'toArray' method
       Object [] cars1 =  cars.toArray();

        System.out.println(cars1[1]);



    }
}
