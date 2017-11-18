/**
 * 
 */
package com.zhazhapan.algorithm.leetcode;

/**
 * <a href="https://leetcode.com/problems/reverse-integer/description/">visit
 * LeetCode page</a>
 * 
 * @author pantao
 *
 */
public class ReverseInteger {

	/**
	 * 反转整数
	 * 
	 * @param x
	 * @return
	 */
	public int reverse(int x) {
		long re = 0;
		boolean negative = false;
		if (x < 0) {
			x = Math.abs(x);
			negative = true;
		}
		while (x > 0) {
			re *= 10;
			re += x % 10;
			x /= 10;
		}
		if (re > Integer.MAX_VALUE) {
			re = 0;
		}
		return negative ? -(int) re : (int) re;
	}
}
