package OOP.Inheritance1;

public class Rose extends Flower {

    public Rose(){
        super("Flower", "yellow", 12);
    }

    public Rose(String color){
        super("Flower","Red",33);
        this.color=color;
        super.color="blue";
    }




}
