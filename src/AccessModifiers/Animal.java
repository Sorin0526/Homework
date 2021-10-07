package AccessModifiers;

public class Animal {

    public String name;
    private String color;
    protected String gender;
    int age;

    /*
	PUBLIC : - anywhere in the project
    PRIVATE: - only in the same class
	PROTECTED: - same package and sub-classes
	DEFAULT: - there is no key word as 'default', if you dont specify acces modifier it is DEFAULT.
             - only in the same package.
 */

    public void sleep(){

        System.out.println("Animal is sleeping");
    }

    private void eat(){
        System.out.println("Animal is eating");
    }

    protected void run (){
        System.out.println("Animal is running");
    }

    void swim (){
        System.out.println("Animal is swimming");
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.color="orange";
        animal.eat();

    }


}
