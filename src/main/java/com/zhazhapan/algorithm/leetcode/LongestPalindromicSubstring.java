/**
 * 
 */
package com.zhazhapan.algorithm.leetcode;

/**
 * <a href=
 * "https://leetcode.com/problems/longest-palindromic-substring/description/">visit
 * LeetCode page</a>
 * 
 * @author pantao
 *
 */
public class LongestPalindromicSubstring {

	public String longestPalindrome(String s) {
		String palindrome = "";
		int len = s.length() - 1;
		for (int i = 0; i < len; i++) {
			String s1 = requestPalindrome(s, i - 1, i + 1, len);
			String s2 = requestPalindrome(s, i, i + 1, len);
			palindrome = maxLengthString(palindrome, s1, s2);
		}
		return palindrome;
	}

	private String maxLengthString(String... strings) {
		String res = "";
		for (String string : strings) {
			if (string.length() > res.length()) {
				res = string;
			}
		}
		return res;
	}

	private String requestPalindrome(String s, int start, int end, int len) {
		while (isEquals(s, start, end, len)) {
			start--;
			end++;
		}
		return s.substring(++start, end);
	}

	private boolean isEquals(String s, int start, int end, int len) {
		if (start < 0 || end > len) {
			return false;
		} else {
			return s.charAt(start) == s.charAt(end);
		}
	}
}
