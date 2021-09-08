package Primitives;

public class AreaofTriangle {
    public static void main(String[] args) {
        /*
        Create a  AreaofTriangle class under primitives
            find the area of the triangle if
        base=10
        height=12

        hint: area formula of triangle is --> base*height/2

        print out the total area of the triangle

        int base = 11;
        int height = 12;
        int totalAreaofTriangle = (base*height)/2;

        System.out.println(totalAreaofTriangle);
    */

        double base = 5.26, height = 12, area;

        area = base * height / 2;
        System.out.println("the area of the triangle is:" + area);

    }
}