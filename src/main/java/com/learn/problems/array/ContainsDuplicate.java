package com.learn.problems.array;
/*https://leetcode.com/problems/contains-duplicate/*/

import java.util.Arrays;
import java.util.HashSet;
import java.util.HashMap;

class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {

        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
        Boolean result = false;

        for (int i = 0; i < nums.length; i++) {
            if (hash.containsKey(nums[i])) {
                result = true;
                break;
            } else {
                hash.put(nums[i], 0);
                result = false;
            }

        }

        return result;
    }

    public static boolean containsDuplicate_leet1(int[] nums) {
        HashSet temp = new HashSet<>();
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            if (temp.contains(nums[i]))
                return true;
            temp.add(nums[i]);
        }
        return false;
    }

    public boolean containsDuplicate_leet2(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; ++i) {
            if (nums[i] == nums[i + 1]) return true;
        }
        return false;
    }

    public boolean containsDuplicate_3ms(int[] nums) {
        byte[] mark = new byte[150000];
        for (int i : nums) {
            int j = i/8;
            int k = i%8;
            int check = 1<<k;
            if ((mark[j] & check) != 0) {
                return true;
            }
            mark[j]|=check;
        }
        return false;
    }

    // Driver method to test above
    public static void main(String args[]) {
        int nums[] = {1,1,1,3,3,4,3,2,4,2};
        System.out.println("Process starts");

        Boolean profitValue = containsDuplicate(nums);
        System.out.println("Duplicate " + profitValue);

    }


}
