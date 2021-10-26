package JUST_PRACTICE;

import RecapJavaWithAhmet.Array;

import java.util.Arrays;

public class SortArray_NoSortMethod {

    public static void main(String[] args) {

        //How to sort the array without the sort method?

        int[] nums = {3, 7, 6, 2, 9};

        for (int i = 0; i < nums.length; i++) {
            int temp = 0;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));


    }

}
