package com.learn.problems.array;
/*https://leetcode.com/problems/product-of-array-except-self/*/

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

class ProductOfArrayExceptSelf {

    public static int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0, tmp = 1; i < nums.length; i++) {
            result[i] = tmp;
            tmp *= nums[i];
        }
        for (int i = nums.length - 1, tmp = 1; i >= 0; i--) {
            result[i] *= tmp;
            tmp *= nums[i];
        }
        return result;
    }

    public static int[] productExceptSelf_easy(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < result.length; i++) result[i] = 1;
        int left = 1, right = 1;
        for (int i = 0, j = nums.length - 1; i < nums.length - 1; i++, j--) {
            left *= nums[i];
            right *= nums[j];
            result[i + 1] *= left;
            result[j - 1] *= right;
        }
        return result;
    }

    /*
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    * */

    // Driver method to test above
    public static void main(String args[]) {
        int nums[] = {1,2,3,4};
        System.out.println("Process starts");

        int[] output = productExceptSelf_easy(nums);
        System.out.println("output " );
        for (int number: output) {
            System.out.println(number);
        }

    }


}
