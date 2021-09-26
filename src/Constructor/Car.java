package Constructor;

public class Car {
    //create a car class with instance field of brand of the car
//create one move method to simply print out " car is moving"
//create a constructor to initialize instance variables
//create a test class to test this car class
//inside of the test class create multiple objects
//sent some of the object to garbage
//call garbage collector
//make sure gc(); is working

    String carBrand;

    public void move(){
        System.out.println("Car is moving");
    }

    public Car(String carBrand) {
        this.carBrand = carBrand;
    }

    public Car (){

    }

    @Override
    public String toString() {
        return "The brand of the car is"+ carBrand;
    }

    protected void finalize(){
        System.out.println("Object sent to garbage");
    }
}
