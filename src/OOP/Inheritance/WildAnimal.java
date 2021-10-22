package OOP.Inheritance;

public class WildAnimal extends Animal{

    String name= "Croc";
    String color;
    int age;

    public void eat(){
        System.out.println("Wild animal is eating");
    }

    public int sleep(){
        System.out.println("Wild animal is sleeping");
return 2;
    }

    Animal run (){
        System.out.println("Wild animal is runnig");
        return new Animal();
    }
}
