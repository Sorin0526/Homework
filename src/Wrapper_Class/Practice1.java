package Wrapper_Class;

public class Practice1 {

    public static void main(String[] args) {

        byte b1 = 2;
        Byte bt1= new Byte(b1);
        System.out.println(bt1);

        short s1 = 4;
        Short sh1 = new Short(s1);
        Short sh2 = new Short((short)5);
        System.out.println(sh2);

        Integer i1 = new Integer(12);
        System.out.println(i1);

        long l1 = 123;
        Long lg1= new Long(l1);
        Long lg2 = new Long(123);
        System.out.println(lg1);

        Double db1= new Double(3.5);
        System.out.println(db1);

        Float fl1 = new Float(2.5);
        System.out.println(fl1);

        Boolean bl1 = new Boolean(true);
        System.out.println(bl1==true);

        Boolean bl2= new Boolean("TRUE");
        System.out.println(bl2==true);

        Character ch1 = new Character('R');
        System.out.println(ch1);
        char c = 'T';
        Character ch2 = new Character(c);
        Character ch3 = new Character('5');
       // Character ch4 = new Character(65); compile time error
        System.out.println(ch3);


        //AUTOBOXING---->converting primitives data to Object types (Wrapper class)


        Integer i2 = 25;// --> autoboxing

        Boolean bl3 = true; // --> autoboxing


        // UNBOXING ----> CONVERTING WRAPPER CLASS OBJECT TO PRIMITIVE DATA


        int a = new Integer(11);// --> unboxing

        char c1 = ch1; // --> unboxing

        Character ch4 = ch3;

        double d2 = db1;











    }
}
