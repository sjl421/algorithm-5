/**
 * 
 */
package com.zhazhapan.algorithm;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.zhazhapan.algorithm.dynamicprogramming.LongestIncreasingSubsequence;

/**
 * @author pantao
 *
 */
public class LongestIncreasingSubsequenceTest {

	@Test
	public void testSubsequence() {
		LongestIncreasingSubsequence subsequence = new LongestIncreasingSubsequence();
		int[][] sequence = { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 }, { 0, 1, 2, 4, 6, 3, 5, 7, 8, 9 },
				{ 7, 1, 2, 4, 6, 3, 5, 0, 8, 9 } };
		assertEquals(10, subsequence.lengthOfLIS(sequence[0]));
		assertEquals(5, subsequence.lengthOfLIS(sequence[1]));
		assertEquals(4, subsequence.lengthOfLIS(sequence[2]));
	}
}
