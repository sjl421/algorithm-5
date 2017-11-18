/**
 * 
 */
package com.zhazhapan.algorithm.leetcode;

/**
 * <a href= "https://leetcode.com/problems/two-sum/description/">visit LeetCode
 * page</a>
 * 
 * @author pantao
 *
 */
public class TwoSum {

	/**
	 * 遍历数组
	 * 
	 * @param nums
	 * @param target
	 * @return
	 */
	public int[] getResult(int[] nums, int target) {
		int[] temp = {};
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					temp = new int[] { i, j };
					return temp;
				}
			}
		}
		return temp;
	}
}
