/**
 * 
 */
package com.zhazhapan.algorithm.leetcode;

import com.zhazhapan.algorithm.modules.constant.Values;

/**
 * <a href=
 * "https://leetcode.com/problems/single-element-in-a-sorted-array/description/">visit
 * LeetCode page</a>
 * 
 * @author pantao
 *
 */
public class SingleElementInSortedArray {

	public int singleNonDuplicate(int[] nums) {
		for (int i = 0; i < nums.length; i += Values.TWO_INT) {
			if (i == nums.length - 1) {
				return nums[i];
			}
			if (nums[i] != nums[i + 1]) {
				return nums[i];
			}
		}
		return 0;
	}
}
