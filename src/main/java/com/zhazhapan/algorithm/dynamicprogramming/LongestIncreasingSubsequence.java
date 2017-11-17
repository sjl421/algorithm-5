/**
 * 
 */
package com.zhazhapan.algorithm.dynamicprogramming;

/**
 * @author pantao
 * @since 2017-04-04
 * @function 一个序列有N个数：A[1],A[2],…,A[N]，求出最长的非降序子序列的长度。
 *
 */
public class LongestIncreasingSubsequence {

	/**
	 * 求解最长的非降序子序列的长度
	 * 
	 * @param seq
	 * @return
	 */
	public int lengthOfLIS(int[] seq) {
		int nowLen = 1;
		int maxLen = 0;
		for (int i = 1; i < seq.length; i++) {
			if (seq[i] < seq[i - 1]) {
				nowLen = 1;
			} else {
				nowLen++;
			}
			maxLen = Math.max(maxLen, nowLen);
		}
		return maxLen;
	}
}
