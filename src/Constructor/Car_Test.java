package Constructor;

public class Car_Test {
    public static void main(String[] args) {

        Car car1= new Car("Lexus");
        Car car2= new Car("Lexus");
        Car car3= new Car("Lexus");
        Car car4= new Car("BMW");

        Car car5= new Car("BMW");
        Car car6= new Car("BMW");
        Car car7 = new Car("Lexus");

        car1=null;

        String str= "Test";
        String str1= "Test";

        String str3 = new String("Test");
        String str4 = new String("Test");



        System.out.println(car4);

      //  System.gc();

        // equal() vs ==

        System.out.println(car2.equals(car3)); //false
        System.out.println(car2== car3);//false

        System.out.println(car2.equals(car3)); //true
        System.out.println(car2== car3);//true

        System.out.println(str.equals(str3));// true
        System.out.println(str3.equals(str4));//true

        System.out.println(car3.equals(car7));// false
        System.out.println(car5.equals(car7));//false
        System.out.println(car5==car7);//false

        Car car8 = car3;

        System.out.println(car3.equals(car8));



    }

}
