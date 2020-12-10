package com.leetcode;

import com.leetcode.lang.Mark;
import com.leetcode.lang.Solution;

@Solution
public class S0911_0920 {
    @Mark(order = 912, name = "sort-an-array", description = "排序数组")
    public int[] sortArray(int[] nums) {
        sortArrayRecursion(nums, 0, nums.length);
        return nums;
    }

    private void sortArrayRecursion(int[] nums, int start, int end) {
        var baseIndex = end - 1;
        if (start > baseIndex) return;
        var i = start;
        var j = baseIndex;
        var base = nums[baseIndex];
        while (i < j) {
            while (nums[i] <= base && i < j) i++;
            while (nums[j] >= base && i < j) j--;
            if (i < j) {
                var temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        nums[baseIndex] = nums[i];
        nums[i] = base;
        sortArrayRecursion(nums, start, i);
        sortArrayRecursion(nums, i + 1, end);
    }
}
