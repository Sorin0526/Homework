package AccessModifiers;

public class Cat extends Animal{

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.gender="m"; //protected
        animal.run();//protected
        System.out.println(animal.gender);
    }
}
