package MAP;

import java.util.Random;

public class Employee {


        String name;
        String city;
        int age;
        int id;

    public Employee(String name, String city, int age) {
        this.name = name;
        this.city = city;
        this.age = age;
        this.id = generateId();


    }

    public int generateId () {
        Random randon = new Random();
        String temp="";
        for (int i = 0; i <6; i++) {
            int firstDigit = randon.nextInt(10);
            temp += firstDigit;
        }
        return Integer.parseInt(temp);
//        int x = (int)Math.random()*100000;
//        return x;

    }
}

