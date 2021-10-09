package StringBuilder;

public class Practice3 {

    //create a  method that takes StringBuildersArray as a parameter
    //this method will replace middle chars of each word if the word has odd number of letters
    //it will print out those words with their new versions
    //{'Efe","Sead","Sorin"}--> E$e, So$in

    public static void replaceChar(StringBuilder[] array) {


        for (int i = 0; i < array.length; i++) {

            if (array[i].length() % 2 != 0) {

                array[i].replace(array[i].length() / 2, (array[i].length() / 2 + 1), "$");
                System.out.println(array[i]);
            }

        }

    }

    public static void main(String[] args) {
        StringBuilder[]builders= {new StringBuilder("david"), new StringBuilder("Jash"), new StringBuilder("diana")};
        replaceChar(builders);
    }
}
