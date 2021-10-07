package MAP;

import java.util.ArrayList;
import java.util.HashMap;

public class StudentInfo_Task {

    public static void main(String[] args) {
        /*
        StudentInfo
-------------
FirstName: David LastName: Pena Age: 25 Gender: M City: Chicago

FirstName: Jeremiah
LastName: Michaelson
Age: 15
Gender: M
City: HighPark

FirstName: Michael
LastName: White
Age: 35
Gender: M
City: Winnetka

FirstName: Sarah
LastName: Star
Age: 29
Gender:f
City: Chicago
         */
        HashMap<String, String> student1 = new HashMap();
        student1.put("firstName", "David");
        student1.put("lastName", "Pena");
        student1.put("age", "25");
        student1.put("gender", "M");
        student1.put("city", "Chicago");

        HashMap<String, String> student2 = new HashMap();
        student2.put("firstName", "Jeremiah");
        student2.put("lastName", "michaelson");
        student2.put("age", "15");
        student2.put("gender", "M");
        student2.put("city", "high park");

        HashMap<String, String> student3 = new HashMap();
        student3.put("firstName", "michael");
        student3.put("lastName", "white");
        student3.put("age", "35");
        student3.put("gender", "M");
        student3.put("city", "Winnetka");

        HashMap<String, String> student4 = new HashMap();
        student4.put("firstName", "Sarah");
        student4.put("lastName", "star");
        student4.put("age", "29");
        student4.put("gender", "f");
        student4.put("city", "Chicago");


        ArrayList<HashMap> ls = new ArrayList();
        ls.add(student1);
        ls.add(student2);
        ls.add(student3);
        ls.add(student4);

        System.out.println(ls);


        //if student's city is 'chicago' creat an email adress as name+  chicago@gmail.com

        for (int i = 0; i <ls.size() ; i++) {

            if(ls.get(i).get("city").equals("chicago")){

                System.out.println(ls.get(i).get("firstName"));


            }
        }


















//        for (Object studentsInfo:ls) {
//
//            System.out.println(studentsInfo);
//
//            System.out.println(student1.get("firstName"));
//        }
        for (int i = 0; i < ls.size(); i++) {

            if (Integer.parseInt((String) ls.get(i).get("age")) < 20) {
                System.out.println(ls.get(i).get("firstName"));
            }
        }

        //if student age is less than 20 show their name


        // print out elements from map as pair
        for (int i = 0; i < ls.size(); i++) {


            System.out.println(ls.get(i).entrySet());
        }

    }
}




