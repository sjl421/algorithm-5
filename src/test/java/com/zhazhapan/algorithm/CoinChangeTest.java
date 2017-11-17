/**
 * 
 */
package com.zhazhapan.algorithm;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.zhazhapan.algorithm.leetcode.CoinChange;
import com.zhazhapan.algorithm.modules.constant.Values;

/**
 * @author pantao
 *
 */
public class CoinChangeTest {

	@Test
	public void testCoinChangeWays() {
		CoinChange cc = new CoinChange();
		for (int i = 0; i < Values.ONE_HUNDRED_INT; i++) {
			assertTrue(cc.waysOfChanging1(i, new int[] { 1, 2, 5 }) == cc.waysOfChanging2(i, new int[] { 1, 2, 5 }));
		}
	}
}
