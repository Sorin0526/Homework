package Array;

import java.awt.image.AreaAveragingScaleFilter;
import java.lang.reflect.Array;
import java.util.Arrays;

public class BiggestNumber {

    public static void main(String[] args) {

        //create an array to store these numbers : 45, 5, 6, 47, 57, 8, 12, 0, 30
        // find the biggest number from this array
        int[] numbers = {45, 5, 6, 47, 57, 8, 12, 20, 30};

        int biggestNumber = numbers[0];


        for (int a = 1; a < numbers.length; a++) {

            if (numbers[a] > biggestNumber) {

                biggestNumber = numbers[a];

            }

        }
        System.out.println(biggestNumber);

        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers); //--> sort method put the elements in ascending order

        System.out.println(Arrays.toString(numbers));

        // print last element from this array

        System.out.println(numbers[numbers.length - 1]);// this is last element and also biggest number. since the array is sorted

        System.out.println(numbers[0]); // this is the first element also the smallest number

        // write a code to find smallest number without using sort method
        int[] numbers1 = {45, 5, 6, 47, 57, 8, 12, 20, 30};
        int smallestNumber = numbers1[0];
        for (int a = 1; a < numbers1.length; a++) {

            if (numbers1[a] < smallestNumber) {

                smallestNumber = numbers1[a];

            }

        }
        System.out.println(smallestNumber);

    }
}
