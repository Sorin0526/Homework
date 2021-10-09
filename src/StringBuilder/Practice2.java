package StringBuilder;

public class Practice2 {

    public static void main(String[] args) {

       /*
        create a method that will take String as a parameter
        this method will delete '-' (dashes) given string
        use delete/deleteCharAt() method to solve (StringBuilder object)
        print final version of string/stringbuilder object with no dashes
        "I-n-t-e-r-v-i-e-w" >> Interview

         */
        String str = "I-n---t-e---r-v-i-e-w";

        removeDash(str);
    }


    public static void removeDash (String string){

        StringBuilder builder = new StringBuilder(string);

        for (int i = 0; i < builder.length(); i++) {

            if(builder.charAt(i)=='-'){

                builder.deleteCharAt(i);
                i--;

            }
        }
        System.out.println(builder);

    }


}
