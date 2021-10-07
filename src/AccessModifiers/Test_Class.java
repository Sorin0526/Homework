package AccessModifiers;

public class Test_Class {

    public static void main(String[] args) {

// testing to reach out fields in the animal class by their access modifiers

        Animal animal = new Animal();
        animal.sleep();
        animal.run();
        animal.swim();
        animal.name= "rex";
        animal.age= 12;
        animal.gender= "M";
    }
}
