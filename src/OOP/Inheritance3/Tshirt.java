package OOP.Inheritance3;

public final class Tshirt extends Shirt{

    String color;
    public Tshirt(){

        super("M",25);
    }

//    @Override  ---> you CANNOT OVERIDE A FINAL METHOD
//    public String info() {
//        return "this is info ab Tshirt";
//    }
}
