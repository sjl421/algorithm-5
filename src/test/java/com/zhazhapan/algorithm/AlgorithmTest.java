/**
 * 
 */
package com.zhazhapan.algorithm;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.zhazhapan.algorithm.leetcode.LongestPalindromicSubstring;
import com.zhazhapan.algorithm.leetcode.MedianOfTwoSortedArrays;
import com.zhazhapan.algorithm.leetcode.ZigZagConversion;

/**
 * @author pantao
 *
 */
public class AlgorithmTest {

	@Test
	public void testZigZagConversion() {
		String s1 = "abcdefghijk";
		ZigZagConversion conversion = new ZigZagConversion();
		assertEquals("abcdefghijk", conversion.convert(s1, 1));
		assertEquals("acegikbdfhj", conversion.convert(s1, 2));
		assertEquals("aeibdfhjcgk", conversion.convert(s1, 3));
		assertEquals("agbfhceikdj", conversion.convert(s1, 4));
		assertEquals("aibhjcgkdfe", conversion.convert(s1, 5));
	}

	@Test
	public void testLongestPalindromicSubstring() {
		String s1 = "cbbd";
		String s2 = "babad";
		String s3 = "bb";
		String s4 = "zxcvbnmnbvcxz";
		String s5 = "ccc";
		String s6 = "aaaa";
		LongestPalindromicSubstring palindromicSubstring = new LongestPalindromicSubstring();
		assertEquals("bb", palindromicSubstring.longestPalindrome(s1));
		assertEquals("bab", palindromicSubstring.longestPalindrome(s2));
		assertEquals("bb", palindromicSubstring.longestPalindrome(s3));
		assertEquals("zxcvbnmnbvcxz", palindromicSubstring.longestPalindrome(s4));
		assertEquals("ccc", palindromicSubstring.longestPalindrome(s5));
		assertEquals("aaaa", palindromicSubstring.longestPalindrome(s6));
	}

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
