package MAP;

import javax.swing.*;
import java.util.HashMap;

public class CountAndStoreTask {

    public static void main(String[] args) {


        String[] brands = {"nike","addidas","reebok","puma","armani","clarks","nike","puma","puma"};



        //nike --> 2
        // addidas --> 1
        // reebok -->? 1
//        for (int i = 0; i < brands.length ; i++) {
//
//            HashMap<String, Integer> brandCount = new HashMap<>();
//

        HashMap<String, Integer> brandCounts = new HashMap<>();

        for (int i = 0; i < brands.length ; i++) {

           // brandCounts.put(brands[i],1);

                if(!brandCounts.containsKey(brands[i])){
                    brandCounts.put(brands[i],1);
                }else{
                    int count = brandCounts.get(brands[i]);
                    brandCounts.put(brands[i], count+1);
                }
            }
        System.out.println(brandCounts);

        }


    }




