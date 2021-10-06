package MAP;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;

public class Employee_Test {

    public static void main(String[] args) {


        Employee e1 = new Employee("John","Chicago",27);
        Employee e2 = new Employee("Zack", "Austin", 27);
        Employee e3 = new Employee("Lia", "Denver", 28);
        Employee e4 = new Employee("David", " New York", 36);

        HashMap <Integer,Employee> employees = new HashMap();

        employees.put(e1.id, e1);
        employees.put(e2.id, e2);
        employees.put(e3.id, e3);
        employees.put(e4.id, e4);

        System.out.println(e1.name);

        printNames(employees);
     //   System.out.println(employees.keySet());
        printId(employees);

    }

    public static void printNames (HashMap<Integer,Employee> map1){

        for (Employee e :map1.values()) {
            System.out.println(e.name);
        }
    }
    public static void printId(HashMap<Integer,Employee> map1){

            System.out.println(map1.keySet());

    }


}
