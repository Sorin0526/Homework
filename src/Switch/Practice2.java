package Switch;

import javax.sound.midi.Soundbank;
import java.util.Locale;

public class Practice2 {

    public static void main(String[] args) {

        String name = "luna".toUpperCase();

        switch (name){
            default:
                System.out.println("Student is not here");
                break;

            case "Alex":
                System.out.println("Alex is here");
                break;
            case "David":
                System.out.println("David is here");
                break;
            case "LUNA":
                System.out.println("Luna is here");
                break;
        }


    }
}
