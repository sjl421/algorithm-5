/**
 * 
 */
package com.zhazhapan.algorithm.leetcode;

/**
 * <a href=
 * "https://leetcode.com/problems/median-of-two-sorted-arrays/description/">visit
 * LeetCode page</a>
 * 
 * @author pantao
 *
 */
public class MedianOfTwoSortedArrays {

	/**
	 * 找到两个排好序的数组的中间值
	 * 
	 * @param nums1
	 * @param nums2
	 * @return
	 */
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int[] nums = mergeSortedArrays(nums1, nums2);
		return (double) (nums[(nums.length - 1) / 2] + nums[nums.length / 2]) / 2;
	}

	/**
	 * 将两个有序数组（同序）合并成一个有序数组
	 * 
	 * @param nums1
	 * @param nums2
	 * @return
	 */
	private int[] mergeSortedArrays(int[] nums1, int[] nums2) {
		int len = nums1.length + nums2.length;
		int[] nums = new int[len];
		int m = 0;
		int n = 0;
		for (int i = 0; i < len; i++) {
			boolean inNums1 = n == nums2.length || (m != nums1.length && (nums1[m] < nums2[n]));
			if (inNums1) {
				nums[i] = nums1[m];
				m++;
			} else {
				nums[i] = nums2[n];
				n++;
			}
		}
		return nums;
	}
}
