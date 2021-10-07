package Blocks;

public class Practice1 {

    int number;
    static int id;




   static  {
       id=25;
        System.out.println("Static Block");
    }


    {
        number=99;

        System.out.println("Instance Block");
    }
}
