package ArrayList;


import Constructor.Car;

import java.util.ArrayList;

public class Practice1 {

    public static void main(String[] args) {

        ArrayList list1 = new ArrayList(5);

        ArrayList list2 = new ArrayList(3);

        ArrayList list3 = new ArrayList(list1);

        ArrayList<Integer> list4 = new ArrayList<>();

        ArrayList<Car> list5 = new ArrayList<Car>();

        System.out.println(list2);

        //list1.add(4,99);//IndexOutOfBoundsException
        list1.add(0, 99);
        System.out.println(list1);


        // add() method


        list2.add(11);
        list2.add("white");
        System.out.println(list2);
        list2.add(22);
        System.out.println(list2);
        list2.add(33);
        System.out.println(list2);//[11, white, 22, 33]
        list2.add(2, 44);
        System.out.println(list2);//[11, white, 44, 22, 33]


        // size(); method


        int list2Size = list2.size();
        System.out.println(list2Size);

        // list2.add(6,66);//IndexOutOfBoundsException
        System.out.println(list2);

        list2.add(5, 66);
        System.out.println(list2);


        //get(); method - gives you the element


        System.out.println(list2.get(3));
        //System.out.println(list2.get(10));//IndexOutOfBoundsException


        //remove(); -method


        list2.remove("white");
        System.out.println(list2);
        list2.remove(1);
        list2.add(66);
        System.out.println(list2);
        list2.remove("66");// if the element is not on the list nothing happens
        System.out.println(list2);
        list2.remove((Object) 66);//[11, 22, 33, 66]
        System.out.println(list2);
        list2.remove((Integer) 33);
        System.out.println(list2);


        //addAll(); - method --> you can add a whole collection to the arrayList/ Collection


        list3.addAll(list2);
        System.out.println("list 3--> " + list3);
        list3.add(77);
        System.out.println(list3);


        //removeAll(); --> you can remove a whole collection from an arrayList/ Collection


        list3.removeAll(list2);
        System.out.println(list3);

        list3.add(88);
        list3.add(100);


        //set(); -method


        System.out.println(list3);
        list3.set(2, 200);
        System.out.println(list3);


        // you can use String methods


        System.out.println(list3.contains(88));
        list3.set(0, "xxxx");
        System.out.println(list3.get(0).toString().startsWith("x"));


        //clear(); method --> it will delete

        System.out.println(list3);
        list3.clear();
        System.out.println(list3);
        System.out.println(list3.size());


    }
}