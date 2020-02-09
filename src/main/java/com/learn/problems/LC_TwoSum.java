package com.learn.problems;

class LC_TwoSum {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};
        twoSum(nums, 15);


    }

    static int[] twoSum(int[] nums, int target) {
        int[] output = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target && (i !=j)) {
                    //System.out.println("values are "+nums[i] +" - " +nums[j]);
                    System.out.println("index's are " + i + " and " + j);
                    output[0] = i;
                    output[1] = j;
                }
            }
        }
        return output;
    }
}


