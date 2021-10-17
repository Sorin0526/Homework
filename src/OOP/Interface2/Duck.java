package OOP.Interface2;


public class Duck extends Animal implements Flyable, CanSwim{

    @Override
    public void fly() {
        System.out.println("Duck is flying");
    }

    @Override
    public void eat() {
        System.out.println("Duck is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Duck is sleeping");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming");
    }

    public void info (){
        System.out.println(" Duck's info");
    }
// if the info method is not overridden in the Duck class that there is no reason to have the same default method in two interfaces
// ( Flyable and CanSwim)
}
