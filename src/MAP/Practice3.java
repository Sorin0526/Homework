package MAP;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Practice3 {

    public static void main(String[] args) {

        HashMap<String, Integer> dataMap = new HashMap<>();

        dataMap.put("IT", 111);
        dataMap.put("HR", 222);
        dataMap.put("Help", 333);
        dataMap.put("Admin", 444);


        // SO FAR WE WERE ABLE TO :
        //GET INDIVIDUAL VALUES;
        //GET ALL VALUES
        //GET SINGLE ELEMENT

        //entrySet

        dataMap.entrySet();

        System.out.println(dataMap);
        System.out.println(dataMap.entrySet());

        Set<Map.Entry<String,Integer>> data = dataMap.entrySet();
        System.out.println(data);


        //TASK: PRINT OUT ELEMENTS FROM THIS SET ONE AT A TIME

        for (Map.Entry<String,Integer> keyAndValue :data) {
            System.out.println(keyAndValue);

        }




        //CREATE A METHOD WHICH TAKES A PARAMETER OF MAP AND THIS METHOD WILL PRINT OUT EACH EXTENSION ONE BY ONE

        //printValues(dataMap);

    }


    public static void printValues(HashMap<String, Integer> map1 ){

        for (Integer extension : map1.values()) {
            System.out.println(extension);
        }

    }
}
