package com.luo.dataStructure.introduction;

import java.util.Arrays;

/**
 * @author lkx
 * @version 1.0.0
 */
public class SortedSquares {
    public int[] sortedSquares(int[] nums) {
        int m = nums.length - 1, result = 0, i, j = 0;
        int[] res = new int[m + 1];
        for (i = 0; i <= m; i++) {
            int temp = nums[i];
            result = temp * temp;
            res[i] = result;
        }
        Arrays.sort(res);
        return res;
    }
}
