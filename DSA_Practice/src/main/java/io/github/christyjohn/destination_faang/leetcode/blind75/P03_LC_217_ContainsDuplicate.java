package io.github.christyjohn.destination_faang.leetcode.blind75;

import java.util.HashSet;
import java.util.Set;

public class P03_LC_217_ContainsDuplicate {
    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[] {1,2,3,1}));
        System.out.println(containsDuplicate(new int[] {1,2,3,4}));
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num))
                return true;
            else
                set.add(num);
        }

        return false;
    }
}
