package com.christyjohn.destination_faang.mega_course_48hrs.p01_array;

import java.util.*;

/**
 * You are given an array of integers nums and an integer target, return indices of the two numbers
 * such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same
 * element twice.
 *
 * You can return the answer in any order.
 *
 * Example 1:
 *
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * Example 2:
 *
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * Example 3:
 *
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 */
public class P01_LC_01_Two_Sum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twosum(new int[] {2,7,11,15}, 9)));
        System.out.println(Arrays.toString(twosum(new int[] {3,2,4}, 6)));
        System.out.println(Arrays.toString(twosum(new int[] {3, 3}, 6)));
    }

    public static int[] twosum(int[] arr, int target) {
        int reminder = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            reminder = target - arr[i];

            if (map.containsKey(reminder))
                return new int[] {i, map.get(reminder)};
            else
                map.put(arr[i], i);
        }
        return null;
    }
}
