package io.github.christyjohn.destination_faang.mega_course_48hrs.p01_array;

import java.util.HashSet;
import java.util.Set;

/**
 * Given an integer array nums and an integer k, return true if there are two distinct
 * indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
 *
 * Example 1:
 * Input: nums = [1,2,3,1], k = 3
 * Output: true
 *
 * Example 2:
 * Input: nums = [1,0,1,1], k = 1
 * Output: true
 *
 * Example 3:
 * Input: nums = [1,2,3,1,2,3], k = 2
 * Output: false
 *
 * Constraints:
 * 1 <= nums.length <= 105
 * -109 <= nums[i] <= 109
 * 0 <= k <= 105
 */
public class P003_LC_219_ContainsDuplicateII {
    public static void main(String[] args) {
        System.out.println(containsNearbyDuplicate(new int[] {1,2,3,1}, 3));
        System.out.println(containsNearbyDuplicate(new int[] {1,0,1,1}, 1));
        System.out.println(containsNearbyDuplicate(new int[] {1,2,3,1,2,3}, 2));
    }

    // This is a sliding window problem (with window size k).
    // We move the window each time if the window doesn't contain duplicate,
    // and remove the first elemnt from the window
    public static boolean containsNearbyDuplicate(int[] nums, int k) {

        Set<Integer> checkWindow = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (checkWindow.contains(nums[i]))
                return true;
            checkWindow.add(i);
            if (checkWindow.size() > k)
                checkWindow.remove(nums[i - k]);

            /*// Remove the element that is now outside the window
            if (i > k) {
                checkWindow.remove(nums[i - k - 1]);
            }

            // Try to add the current element. If it fails, a duplicate exists.
            if (!checkWindow.add(nums[i])) {
                return true;
            }*/
        }
        return false;
    }
}
