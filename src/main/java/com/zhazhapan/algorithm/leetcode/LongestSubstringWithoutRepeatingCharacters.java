/**
 * 
 */
package com.zhazhapan.algorithm.leetcode;

/**
 * <a href=
 * "https://leetcode.com/problems/longest-substring-without-repeating-characters/description/">visit
 * LeetCode page</a>
 * 
 * @author pantao
 *
 */
public class LongestSubstringWithoutRepeatingCharacters {

	/**
	 * 遍历字符串
	 * 
	 * @param s
	 * @return
	 */
	public int lengthOfLongestSubstring(String s) {
		if (s == null) {
			return 0;
		}
		if (s.length() == 1) {
			return 1;
		}
		int nowLen = 0, maxLen = 0;
		for (int i = 0; i < s.length(); i++) {
			// 计算当前字符在目前已经算出没有重复的字符串的索引
			int index = s.substring(i - nowLen, i).indexOf(s.charAt(i));
			if (index < 0) {
				// 没有重复
				maxLen = Math.max(maxLen, ++nowLen);
			} else {
				// 重复
				nowLen -= index;
			}
		}
		return maxLen;
	}
}
