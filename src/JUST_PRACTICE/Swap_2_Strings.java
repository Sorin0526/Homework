package JUST_PRACTICE;

public class Swap_2_Strings {

    public static void main(String[] args) {

        String name ="Honda";
        String name1="Toyota";


        //name= name.concat(name1;
        name= name+name1;
        System.out.println(name);
        name1=name.substring(0,name.length()-name1.length());
        System.out.println(name1);
        name= name.substring(name1.length());
        System.out.println(name);
    }
}
