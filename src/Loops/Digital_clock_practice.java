package Loops;

public class Digital_clock_practice {

    public static void main(String[] args) {

        /* create a digital cloak that prints hours and minutes

--> hours from 0 to 12
--> minutes from 0 to 59

skip hours --> 5-7 in the execution
stop the execution for 10 and after 10

*/

        for (int a = 0; a< 2; a++){

            if(a==0)
                continue;

            LABEL:
            for (int hours = 0; hours < 12; hours++) {

                if(hours>=5 && hours<=7)
                    continue;
                //if (hours>=10)
//                    break;

                for (int min = 0; min < 60; min++) {

                    if (hours>=10)
                        break LABEL;

                    if(a==0){
                        System.out.println(hours + " : " + min+ " am");

                    }else{
                    System.out.println(hours + " : " + min+ " pm");}
                }
            }
        }
    }
}