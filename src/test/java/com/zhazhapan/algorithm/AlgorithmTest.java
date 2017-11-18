/**
 * 
 */
package com.zhazhapan.algorithm;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.zhazhapan.algorithm.leetcode.MedianOfTwoSortedArrays;

/**
 * @author pantao
 *
 */
public class AlgorithmTest {

	@Test
	public void testFindMedianSortedArrays() {
		int[] nums1a = { 1, 3 };
		int[] nums1b = { 2 };
		MedianOfTwoSortedArrays median = new MedianOfTwoSortedArrays();
		assertTrue(2 == median.findMedianSortedArrays(nums1a, nums1b));
		int[] nums2a = { 1, 2 };
		int[] nums2b = { 3, 4 };
		assertTrue(2.5 == median.findMedianSortedArrays(nums2a, nums2b));
	}

	@Test
	public void testBitwiseAndOfNumbersRange() {
		int m = 5;
		int n = 7;
		int res = m;
		for (int i = m + 1; i <= n; i++) {
			res &= i;
		}
		assertEquals(4, res);
	}
}
