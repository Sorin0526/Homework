package OOP.Interface2;

public class Dolphin implements CanSwim {

    @Override
    public void swim() {
        System.out.println("Dolphin is swimming");
    }

    @Override
    public void eat() {
        System.out.println("Dolphin is eating");
    }
}
