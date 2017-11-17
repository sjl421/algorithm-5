/**
 * 
 */
package com.zhazhapan.algorithm.leetcode;

import java.util.Arrays;

/**
 * @author pantao
 * @since 2017-04-08
 * @function 给定几种指定大小的面额和总金额，求总金额的兑换方法
 */
public class CoinChange {

	/**
	 * 从总额向下遍历兑换方案
	 * 
	 * @param amount
	 * @param coins
	 * @return
	 */
	public int waysOfChanging1(int amount, int[] coins) {
		if (amount < 1) {
			return amount < 0 ? 0 : 1;
		}
		int count = 0;
		for (int i = coins.length - 1; i > -1; i--) {
			count += waysOfChanging1(amount - coins[i], Arrays.copyOf(coins, i + 1));
		}
		return count;
	}

	/**
	 * 遍历所有面额，统计金额兑换成指定面额的总数<br/>
	 * 参考自leetcode
	 * 
	 * @param amount
	 * @param coins
	 * @return
	 */
	public int waysOfChanging2(int amount, int[] coins) {
		int[] dp = new int[amount + 1];
		dp[0] = 1;
		for (int coin : coins) {
			for (int i = coin; i <= amount; i++) {
				dp[i] += dp[i - coin];
			}
		}
		return dp[amount];
	}

}
