package ProjectTasks;

import java.util.Locale;

public class Project_3_Task_3 {

    public static void main(String[] args) {

        String name = "Snicker";
        String name1 = "Cookie";

        System.out.println(name.trim().toUpperCase().substring(2).charAt(0));

        System.out.println(name1.toLowerCase().replace("o","u").concat("s").startsWith("C"));




    }
}
