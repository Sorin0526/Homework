package OOP.Inheritance4_Task;

public class Vehicle {

    protected String model;
    final int year = 2021;
    public String brand;
    int speed;

    public Vehicle(String model, String brand) {
        this.model = model;
        this.brand = brand;
    }

    public static void Drive(){
        System.out.println("vehicle is moving");
    }

    public  boolean Stop (){
        System.out.println("vehicle is stopping");
        return true;
    }

    protected final boolean Start(){
        System.out.println("vehicle is starting");
        return true;
    }

     Object accelerate(){
        return new Object();
    }

}

