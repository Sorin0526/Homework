package OOP.Inheritance4_Task;

public class Car extends Vehicle{

    public Car(String model, int year, String brand) {
        super(model, brand);
    }

    String model;
    String engineType;

    //@Override
    // because the static method cannot be override it we created a new one
    public static void Drive(){
        System.out.println("car is moving");
    }

    @Override
    protected Integer accelerate(){
        System.out.println(super.model);
        return 5;
    }




}
