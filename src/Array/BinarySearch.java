package Array;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {

        //Binary Search

        // binary search will return index number if the number is present in the array

        // if the element is not in the array it will return possible element position with negative sign

        // you need to SORT THE ARRAY BEFORE  you apply the BINARY SEARCH

        int[] studentNumber= {100, 10 ,15,20,30,35};

        //----> [10, 15, 20, 30, 35, 100]

        Arrays.sort(studentNumber);

        System.out.println(Arrays.toString(studentNumber));

        System.out.println(Arrays.binarySearch(studentNumber,35)); // the Binary Search MUST BE  done after sorting

        // it will show the element number not the array index number

        System.out.println(Arrays.binarySearch(studentNumber,25));         // it will show the element number not the array index number
        System.out.println(Arrays.binarySearch(studentNumber,150));        // it will show the element number not the array index number
        System.out.println(Arrays.binarySearch(studentNumber,111));        // it will show the element number not the array index number
        System.out.println(Arrays.binarySearch(studentNumber,49));         // it will show the element number not the array index number






        // it is similar to string.indeOf

        String string = "java";

        System.out.println(string.indexOf('a'));//  -->  index number of first 'a' --> 1


    }
}
