package MAP;


import java.util.*;

public class Practice2 {

    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "des plaines");
        map.put(2, "lake forest");
        map.put(3, "chicago");
        map.put(4, "austin");
        map.put(5, "new york");

        System.out.println(map.size());

        map.put(null,null);
        System.out.println(map);

        map.put(1, "schaumburg");
        System.out.println(map);

        map.replace(1,"xyz");
        System.out.println(map);

        map.replace(1, "xyz","yyy");
        System.out.println(map);

        Boolean bl =  map.containsKey(2); // true
        boolean bl1 = map.containsKey(3);
        boolean bl2 = map.containsValue("washington");
        System.out.println(bl2);

        map.remove(1);
        System.out.println(map);

        System.out.println( map.getOrDefault(2,"-"));

        //print out values from this map

        map.get(1);

        // TO GET ALL KEYS FROM MAP

        Set<Integer> zipCodes= map.keySet();
        // ITERATE OVER THE SET WHICH CONTAINS ALL THE KEYS (ZIPCODES)
        for (Integer zipCode: zipCodes){
            System.out.println(map.get(zipCode)); // PASS EACH KEY INTO GET() METHOD TO GET VALUES
        }


        // METHOD TO GET VALUES

         Collection<String> cities = map.values();
        System.out.println(cities);


        for(String city: map.values()){
            System.out.println(city);
        }






//        map.clear();
//        System.out.println(map);

    }
}
