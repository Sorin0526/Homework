package OOP.Inheritance3;

public class Mall {

    public static void main(String[] args) {

        Shirt shirt= new Shirt("L",26);
        System.out.println(shirt.price);

        //shirt.COLOR= "red";--> you CANNOT  re-assign value for final variable

        Tshirt tshirt= new Tshirt();
       // tshirt.COLOR= "black";-> you CANNOT  re-assign value for final variable

        tshirt.color="Orange";
        System.out.println(tshirt.COLOR);
        Tshirt tshirt1 = new Tshirt();
        System.out.println(tshirt1.COLOR);
        System.out.println(tshirt.color);

        shirt.info();

    }
}
