package OOP.Interface1;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class Test {

    public static void main(String[] args) {

        Square square = new Square();

        System.out.println(square.area(4));
        System.out.println(square.perimeter());

        // you cannot create object from interface
        //  Shape shape = new Shape();

        Shape shape = new Square();

        System.out.println(shape.area(5));
        System.out.println(shape.SIDE);
        System.out.println(Shape.SIDE);

        System.out.println(square.SIDE);

        //square.SIDE= 4; CANNOT reassign FINAL variables


        Triangle triangle = new Triangle();

        triangle.height=7;
        System.out.println(triangle.height);
        System.out.println(triangle.area(8));

        //shape.height; CANNOT reach the child fields

        shape.info();
        square.info();
        triangle.info();

        square.info("SQUARE");


    }
}
