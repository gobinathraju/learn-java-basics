package com.learn.problems.array;
/*
https://leetcode.com/problems/maximum-subarray/
*/

class MaximumSubarray {

    public static int maxSubArray(int[] nums) {

        int maxSum = Integer.MIN_VALUE;
        ;
        int thisSum = 0;

        for (int i = 0; i < nums.length; i++) {
            thisSum += nums[i];
            maxSum = Math.max(thisSum, maxSum);
            if (thisSum < 0) thisSum = 0;
        }

        return maxSum;

    }


    // Driver method to test above
    public static void main(String args[]) {
        int nums[] = {-1,2,-2,1, 2, 3, 4,-1};
        System.out.println("Process starts");

        int output = maxSubArray(nums);
        System.out.println("output " + output);


    }


}
