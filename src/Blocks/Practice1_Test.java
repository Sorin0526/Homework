package Blocks;

public class Practice1_Test {

    public static void main(String[] args) {

        Practice1 obj1 = new Practice1();
        Practice1 obj2 = new Practice1();
        Practice1 obj3 = new Practice1();
        Practice1 obj4 = new Practice1();

        System.out.println(obj1.number);
        System.out.println(obj1.id);
        System.out.println(obj2.number);
        System.out.println(obj2.id);

        obj1.number=44;
        System.out.println("=========");

        System.out.println(obj1.number);
        System.out.println(obj1.id);
        System.out.println(obj2.number);
        System.out.println(obj2.id);

        System.out.println("==========");

        obj1.id=55;

        System.out.println(obj1.number);
        System.out.println(obj1.id);
        System.out.println(obj2.number);
        System.out.println(obj2.id);





    }
}
