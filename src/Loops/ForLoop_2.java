package Loops;

public class ForLoop_2 {
    public static void main(String[] args) {

        // print out the letters from a given String value
        // chicago
        // print out the letter starting from end of the string
        //print out only letter 'o' from this String
        // count the amount  of letter 'o' s.


        String word = "Chicago";

        for ( int i = 0  ; i <= word.length()-1   ; i++  )

            System.out.println(word.charAt(i));

        System.out.println("***********");


        for( int index = word.length()-1;  index >= 0 ; index--){

            System.out.println(word.charAt(index));
        }

        System.out.println("***********");



        // print out only letter 'o' from this String

        String string = " Today is the day to practice for loop";

        //int k = 0;
        //k++;



        //string.charAt(0);
        //string.charAt(1);
        //string.charAt(2);


        int count = 0;

        for( int k = 0 ; k < string.length() ; k++  ){

            if(string.charAt(k) == 'o'){

                System.out.println(string.charAt(k));
                count++;

                // print out  " the index number of 'o' is "....(show index number of each letter 'o')


                System.out.println(" the index number of 'o' is " + k);

                System.out.println("The indesx number of  " + count+ ". 'o' is " + k);


            }

            // count the amount  of letter 'o' s.


        }
        System.out.println("count is --> " + count);

        // print out  " the index number of 'o' is "....(show index number of each letter 'o')


    }
}
