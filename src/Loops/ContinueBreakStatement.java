package Loops;

public class ContinueBreakStatement {

    public static void main(String[] args) {

        OUTER:
        for(int number=0; number<15; number++){

//            if (number==4){
            //               break OUTER;
            //           }
            if(number>=1 && number<=3){
                continue;
            }

            for(char ch = 'A'; ch<'H'; ch++){

                if(number==10){
                    break OUTER;// the word outer is only for labeling purposes
                    // the break statement will stop the execution for certain condition
                    //

                }
                if (ch == 'C' || ch == 'D') {
                    continue;//the continue statement will skip those specific conditions
                }

                System.out.print(number);
                System.out.println(ch);
            }
            System.out.println();
        }


















    }
}
