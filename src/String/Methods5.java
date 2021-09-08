package String;

public class Methods5 {

    public static void main(String[] args) {

        String a = "David";
        String b = "David";
        String c = new String("David");
        String d = new String("David");

        System.out.println(a == b); // --> true

        System.out.println(a.equals(b));// --> true

        System.out.println(a == c); // --> false

        System.out.println(a.equals(c)); //--> true

        System.out.println(c == d); // --> false

        System.out.println(c.equals(d)); // --> true

        //what if

        System.out.println(a == "David"); // --> true
        System.out.println(a == new String("David"));

        System.out.println(a.equals("David")); //--> true

        System.out.println(c == "David"); //--> false

        String e = a;
        String f = c;

        System.out.println(e == b); //--> true

        System.out.println(f.equals(d)); //--> true






    }
}
