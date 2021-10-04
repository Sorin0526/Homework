package MAP;

import java.util.HashMap;

public class CountAndStoreTask2 {

    public static void main(String[] args) {

        String string = "It is easy with practice";


        HashMap<Character ,Integer> lettersCount = new HashMap();

        for (int i = 0; i <string.length(); i++) {

            if(string.charAt(i)==' '){
                continue;
            }

            if(!lettersCount.containsKey(string.charAt(i))){
                lettersCount.put(string.charAt(i),1);

            }else{
                lettersCount.put(string.charAt(i),lettersCount.get(string.charAt(i))+1);
            }
        }
        System.out.println(lettersCount);

    }
}
