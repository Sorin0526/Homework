package OOP.Inheritance;

public class Animal { //already extended from Object class of Java

    String name="Hippo";
    String color;
    int age;

    public int sleep(){
        System.out.println("Animal is sleeping");
        return 3;
    }

    public void eat (){
        System.out.println("Animal is eating");
    }

}
