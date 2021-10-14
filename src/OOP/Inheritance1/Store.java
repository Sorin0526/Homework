package OOP.Inheritance1;

public class Store {

    public static void main(String[] args) {

        Flower flower= new Flower("Lilly", "violet", 11);
        Rose rose = new Rose();

        System.out.println(flower.color);//-->violet
        System.out.println(rose.color);//-->yellow;

        //create a new Rose
        Rose rose1 = new Rose("pink");
        System.out.println(rose1.color);//-->pink
        System.out.println(rose1.color);//-->blue
        System.out.println(rose.color);//-->yellow

        Tulip tulip = new Tulip();
        System.out.println(tulip.color);//null

        tulip.color= "green";
        System.out.println(tulip.color);

        Flower flower1= new Flower();
        System.out.println(flower1);

        Tulip tulip1= new Tulip();
        System.out.println(tulip1);//color-->abc

        Tulip tulip2 = new Tulip("TuLIP2","White",4.5);
        System.out.println(tulip2.name);


    }
}
