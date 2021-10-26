package JUST_PRACTICE;

import java.util.Arrays;

public class Second_largest_num {
    public static void main(String[] args) {

        //easiest way

        int[] numArray= {12,13,12,15,0, -1};

        Arrays.sort(numArray);
        System.out.println(Arrays.toString(numArray));

        System.out.println(numArray[numArray.length-2]);

        // interview way

        int[] numArray1= {12,13,12,15,0, -1};

        int largestNum = numArray1[0];
        int secondLargestNum= 0;

        for (int i = 0; i < numArray.length; i++) {

            if(numArray1[i]>largestNum){

                secondLargestNum=largestNum;

                largestNum=numArray1[i];


            }else if(numArray1[i]>secondLargestNum&&numArray1[i]!=largestNum){

                secondLargestNum=numArray1[i];
            }

            }
        System.out.println(secondLargestNum);

    }






    }

