package Leetcode;

import java.util.Arrays;
import java.util.Vector;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        // int [] nums = {-1,1,0,-3,3};
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));

        var n = 5;
        System.out.println(n);
    }

    public static int[] productExceptSelf(int[] nums) {

        int[] result = new int[nums.length];

        int[] t1 = new int[nums.length];
        int[] t2 = new int[nums.length];

        t1[0] = 1;
        t2[nums.length - 1] = 1;

        //scan from left to right
        for (int i = 0; i < nums.length - 1; i++) {
            t1[i + 1] = nums[i] * t1[i];
        }

        //scan from right to left
        for (int i = nums.length - 1; i > 0; i--) {
            t2[i - 1] = t2[i] * nums[i];
        }

        //multiply
        for (int i = 0; i < nums.length; i++) {
            result[i] = t1[i] * t2[i];
        }

        return result;
    }


}
//        int n = nums.length;
//        int[] result = new int[n];
//        int left = 1;
//
//        for (int i = 0; i < nums.length; i++) {
//            if (i > 0) {
//                left *= nums[i - 1];
//            }
//
//            result[i] = left;
//        }
//
//        int right = 1;
//
//        for (int i = n - 1; i >= 0; i--) {
//            if (i < n - 1) {
//                right *= nums[i + 1];
//            }
//
//            result[i] *= right;
//        }
//
//        return result;
//    }

