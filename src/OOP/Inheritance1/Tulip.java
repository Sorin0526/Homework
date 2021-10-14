package OOP.Inheritance1;

public class Tulip extends Flower {

    public Tulip() {
        super("xyz","abc",2.5);

    }


    public Tulip (String color){
        super.color=color;
        this.color=color;

    }

    public Tulip(String newName, String newColor, double newHeight){
        super(newName,newColor,newHeight);
    }

}
