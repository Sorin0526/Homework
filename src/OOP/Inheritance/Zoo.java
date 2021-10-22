package OOP.Inheritance;

import java.sql.SQLOutput;

public class Zoo {

    public static void main(String[] args) {

        Animal animal = new Animal();
        System.out.println(animal.color);

        WildAnimal wildAnimal = new WildAnimal();
        System.out.println(wildAnimal.color);

        Cat cat = new Cat();
        System.out.println(cat.color);

        animal.color="brown";
        System.out.println(animal.color);

        Animal animal1 = new Animal();
        System.out.println("animal1 color is "+animal1.color);//-->null
        System.out.println(cat.color);
        System.out.println(wildAnimal.color);
//------------------------------------------------

        System.out.println(animal.name);
        System.out.println(wildAnimal.name); //-->Hippo
        System.out.println(cat.name); //-->Hippo

 //------------------------------------------------

        System.out.println(wildAnimal.name);//-->Croc

        Lion lion = new Lion();
        System.out.println(lion.name);//--> Croc

        cat.name="Tom";
        System.out.println(cat.name); //-->Tom

        DomesticAnimal domesticAnimal = new DomesticAnimal();
        System.out.println(domesticAnimal.name); //-->Hippo

        domesticAnimal.name="Rex";
        System.out.println(domesticAnimal.name);//-->Rex

        //-Using methods
//----------------------------------------------------
        animal.eat();

        lion.eat();//Animal is eating
        wildAnimal.eat();//Animal is eating
// after we override methods in wildanimal class
// after we override methods in Lion class
        //------------------
        wildAnimal.run();
        //after override method in Lion class
        lion.run();
        lion.roar();// method available to lion only
    }
}
