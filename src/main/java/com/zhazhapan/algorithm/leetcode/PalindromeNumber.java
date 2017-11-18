/**
 * 
 */
package com.zhazhapan.algorithm.leetcode;

/**
 * <a href="https://leetcode.com/problems/palindrome-number/description/">visit
 * LeetCode page</a>
 * 
 * @author pantao
 *
 */
public class PalindromeNumber {

	/**
	 * 检测是否是回文数字
	 * 
	 * @param x
	 * @return
	 */
	public boolean isPalindrome(int x) {
		int reverse = 0;
		int origin = x;
		try {
			while (x > 0) {
				reverse *= 10;
				reverse += x % 10;
				x /= 10;
			}
		} catch (Exception e) {
			return false;
		}
		return reverse == origin ? true : false;
	}
}
