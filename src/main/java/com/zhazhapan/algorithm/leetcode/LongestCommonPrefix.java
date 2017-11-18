/**
 * 
 */
package com.zhazhapan.algorithm.leetcode;

/**
 * <a href=
 * "https://leetcode.com/problems/longest-common-prefix/description/">visit
 * LeetCode page</a>
 * 
 * @author pantao
 *
 */
public class LongestCommonPrefix {

	/**
	 * 查找字符串数组共有的前缀
	 * 
	 * @param strs
	 * @return
	 */
	public String longestCommonPrefix(String[] strs) {
		if (strs == null || strs.length == 0 || strs[0].length() == 0) {
			return "";
		}
		String prefix = strs[0];
		int i = 1;
		while (i < strs.length) {
			while (strs[i].indexOf(prefix) != 0) {
				// 缩短前缀
				prefix = prefix.substring(0, prefix.length() - 1);
			}
			i++;
		}
		return prefix;
	}
}
