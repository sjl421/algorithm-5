/**
 * 
 */
package com.zhazhapan.algorithm.leetcode;

import com.zhazhapan.algorithm.modules.constant.Values;

/**
 * <a href="https://leetcode.com/problems/zigzag-conversion/description/">visit
 * LeetCode page</a>
 * 
 * @author pantao
 *
 */
public class ZigZagConversion {

	/**
	 * 遍历字符串，按顺序计算Z形字符串的每个字符在原字符串的索引
	 * 
	 * @param s
	 * @param numRows
	 * @return
	 */
	public String convert(String s, int numRows) {
		int len = s.length();
		if (numRows < Values.TWO_INT || len <= numRows) {
			return s;
		} else {
			String res = s.substring(0, 1);
			int span = numRows * 2 - 2, nowRow = 0, innerSpan = 0, idx = 0;
			for (int i = 1; i < len; i++) {
				innerSpan = innerSpan % span == 0 ? span : span - innerSpan;
				idx += innerSpan;
				if (idx >= len) {
					idx = ++nowRow;
					innerSpan = 2 * nowRow;
				}
				res += s.charAt(idx);
			}
			return res;
		}
	}
}
