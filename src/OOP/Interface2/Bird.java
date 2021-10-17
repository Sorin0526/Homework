package OOP.Interface2;

public class Bird implements Flyable, Flyable.runner{

    @Override
    public void run() {
        System.out.println("Animal is running");
    }

    public void fly (){
        System.out.println("Bird is flying");
    }

    @Override
    public void eat() {
        System.out.println("Bird is eating");
    }

    @Override
    public void sleep(){
        System.out.println("Bird is sleeping");
    }

}
