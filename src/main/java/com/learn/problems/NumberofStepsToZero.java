package com.learn.problems;
/*https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/*/
public class NumberofStepsToZero {

    public static int numberOfSteps(int num) {
        int output = 0;
        while (num != 1) {
            if (num % 2 == 0) {
                num = num / 2;
                output++;
            } else {
                num = (num - 1)/2;
                output+=2;
            }
        }
        return output+1;
    }

    public static void main(String[] args) {
        System.out.println("number-of-steps-to-reduce-a-number-to-zero "+numberOfSteps(14));
    }

}
