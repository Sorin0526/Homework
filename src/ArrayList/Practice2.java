package ArrayList;

import java.util.ArrayList;

public class Practice2 {

    public static void main(String[] args) {

        /*
create a Practice2 class
create an ArrayList to store 5 colors
store 5 dif colors in that arraylist
use traditional for loop to print out each element from the arraylist
*/

        ArrayList<String> colors = new ArrayList();
        colors.add("red");
        colors.add("blue");
        colors.add("yellow");
        colors.add("white");
        colors.add("black");

        for (int i = 0; i < colors.size(); i++) {

            System.out.println(colors.get(i));


        }
        for (String color : colors) {
            System.out.println("this is from for each loop--> " + color);
        }


        // name your method as --> printFruits
        //create a method that will take an arraylist as a parameter
        // print the elements if they have 5 or more letters
        ArrayList<String> fruitNames = new ArrayList<>();
        fruitNames.add("kiwi");
        fruitNames.add("apple");
        fruitNames.add("banana");
        fruitNames.add("plum");
        fruitNames.add("orange");


        Practice2 object = new Practice2();
        object.printFruits(fruitNames);
        // printFruits(colors);  --->with static
        // printFruits(fruitNames); --> with static
    }

    //remove the short fruit names from the arraylist


    public void printFruits(ArrayList<String> fruits) {

//            for (String fruit: fruits) {
//
//                if(fruit.length()<=5){
//
//
//
//                    System.out.println(fruit);
//
//                }else {
//                    fruits.remove(fruit);
//                }
//
//            }

        for (int i = 0; i < fruits.size(); i++) {

            if (fruits.get(i).length() < 5) {

                fruits.remove(i);

            } else {
                System.out.println(fruits.get(i));
            }
        }
        System.out.println(fruits);

    }
}
