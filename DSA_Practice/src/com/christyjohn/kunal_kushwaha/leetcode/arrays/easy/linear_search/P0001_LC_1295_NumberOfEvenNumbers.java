package com.christyjohn.kunal_kushwaha.leetcode.arrays.easy.linear_search;

/**
 * Given an array nums of integers, return how many of them contain an even number of digits.
 *
 * Example 1:
 *
 * Input: nums = [12,345,2,6,7896]
 * Output: 2
 * Explanation:
 * 12 contains 2 digits (even number of digits).
 * 345 contains 3 digits (odd number of digits).
 * 2 contains 1 digit (odd number of digits).
 * 6 contains 1 digit (odd number of digits).
 * 7896 contains 4 digits (even number of digits).
 * Therefore only 12 and 7896 contain an even number of digits.
 * Example 2:
 *
 * Input: nums = [555,901,482,1771]
 * Output: 1
 * Explanation:
 * Only 1771 contains an even number of digits.
 *
 * Constraints:
 *
 * 1 <= nums.length <= 500
 * 1 <= nums[i] <= 105
 */
public class P0001_LC_1295_NumberOfEvenNumbers {
    public static void main(String[] args) {
        System.out.println(findNumbers3(new int[] {12,345,2,6,7896}));
        System.out.println(findNumbers3(new int[] {555,901,482,1771}));
        System.out.println(findNumbers3(new int[] {437,315,322,431,686,264,442}));
    }

    public static int findNumbers(int[] nums) {
        // optimized code as per Kunal, but not as per ChatGPT
        /*
        Time: approximately O(n)
        Extra space: O(1)

        The interesting point is that calculating the number of digits is treated as constant time, so the overall complexity is O(n).

        However, there are drawbacks:

        Math.log10() involves floating-point computation.
        Floating-point calculations can theoretically introduce precision issues around powers of 10.
        It is less intuitive during an interview.
        You're doing more computational work than necessary.
         */
        int numDigits = 0;
        int count = 0;
        for (int i : nums) {
            numDigits = (int) (Math.log10(i) + 1);
            if (numDigits % 2 == 0)
                count++;
        }

        return count;
    }

    public static int findNumbers2(int[] nums) {
        // method 1 - from solutions (check constraints.)
        /*
            ChatGPT
            I'd actually submit findNumbers2() if the goal is purely to exploit the given constraints.

            tomorrow the problem changes to:

            1 <= nums[i] <= 10^9

            you'd have to change the conditions:

            10–99
            1000–9999
            100000–999999
            10000000–99999999
            ...

            So it's not a general solution.
         */
        int count = 0;
        for (int i : nums) {
            if( (i >= 10 && i <= 99) || (i >= 1000 && i <= 9999) || (i == 100000) ) {
                count++;
            }
        }
        return count;
    }

    public static int findNumbers3(int[] nums) {
        //method 2 - mine. This best as per ChatGPT
        int ans = 0;

        for (int num : nums) {
            int digits = 0;
            while (num > 0) {
                num = num / 10;
                digits++;
            }

            if (digits % 2 == 0)
                ans++;
        }

        return ans;
    }
}
