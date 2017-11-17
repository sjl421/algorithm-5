/**
 * 
 */
package com.zhazhapan.algorithm.greed;

import java.util.LinkedList;

/**
 * @author pantao
 * @since 2017-04-05
 * @function 给定一组物品，每种物品都有自己的重量和价格，在限定的总重量内，我们如何选择，才能使得物品的总价格最高。
 *           问题的名称来源于如何选择最合适的物品放置于给定背包中。
 *
 */
public class KnapsackProblem {

	/**
	 * 问题求解，（此问题还没有解决）
	 * 
	 * @param stacks
	 *            多个重量和价格组成的二维数组
	 * @param enableWeight
	 *            限定的重量
	 * @return
	 */
	public double solve(double[][] stacks, double enableWeight) {
		LinkedList<Double[]> list = new LinkedList<Double[]>();
		Double[] temp;
		for (double[] stack : stacks) {
			temp = new Double[3];
			temp[0] = stack[0];
			temp[1] = stack[1];
			// 比重（重置/价格）越小越好
			temp[2] = temp[0] / temp[1];
			int len = list.size();
			if (len == 0) {
				list.add(temp);
				continue;
			}
			// 按比重排序，小的在前
			for (int i = 0; i < len + 1; i++) {
				if (i == 0) {
					if (temp[2] <= list.get(i)[2]) {
						list.add(i, temp);
						break;
					}
				} else if (i == len) {
					list.add(temp);
				} else {
					if (temp[2] >= list.get(i - 1)[2] && temp[2] <= list.get(i)[2]) {
						list.add(i, temp);
						break;
					}
				}
			}
		}
		return kpSolution(list, enableWeight);
	}

	private double kpSolution(LinkedList<Double[]> list, Double enableWeight) {
		if (list == null || list.size() == 0 || enableWeight == 0) {
			return 0;
		}
		double weight = list.get(0)[0];
		if (weight <= enableWeight) {
			return list.remove(0)[1] + kpSolution(list, enableWeight - weight);
		} else {
			list.remove(0);
			return kpSolution(list, enableWeight);
		}
	}

	@SuppressWarnings("unused")
	private String formatArray(Double[] d) {
		return d[0] + "Kg -> " + d[1] + "$\n";
	}

}
