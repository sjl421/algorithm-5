/**
 * 
 */
package com.zhazhapan.algorithm.dynamicprogramming;

import java.util.Arrays;

/**
 * @author pantao
 * @since 2017-04-04
 *
 */
public class PathProblem {

	/**
	 * 平面上有N*M个格子，每个格子中放着一定数量的苹果。你从左上角的格子开始， 每一步只能向下走或是向右走，
	 * 每次走到一个格子上就把格子里的苹果收集起来， 这样下去，你最多能收集到多少个苹果。<br/>
	 * <br/>
	 * 思路：求左一格和上一格的最大值
	 * 
	 * @param matrix
	 * @return
	 */
	public int maxApples(int[][] matrix) {
		int rows = matrix.length;
		int cols = matrix[0].length;
		if (rows == 1) {
			int sum = 0;
			for (int i = 0; i < cols; i++) {
				sum += matrix[0][i];
			}
			return sum;
		}
		if (cols == 1) {
			int sum = 0;
			for (int i = 0; i < rows; i++) {
				sum += matrix[i][0];
			}
			return sum;
		}
		int[][] a = new int[rows][cols - 1];
		for (int i = 0; i < rows; i++) {
			a[i] = Arrays.copyOf(matrix[i], cols - 1);
		}
		int[][] b = Arrays.copyOf(matrix, rows - 1);
		return matrix[rows - 1][cols - 1] + Math.max(maxApples(a), maxApples(b));
	}

	/**
	 * 记录每个位置的递增路径的长度
	 */
	public int[][] lens;

	/**
	 * 求解一个整数矩阵中最长递增的路径的长度
	 * 
	 * @param matrix
	 * @return
	 */
	public int longestIncreasingPath(int[][] matrix) {
		if (matrix.length == 0) {
			return 0;
		}
		lens = new int[matrix.length][matrix[0].length];
		int pathLen = 0;
		for (int i = 0; i < lens.length; i++) {
			for (int j = 0; j < lens[i].length; j++) {
				lens[i][j] = -1;
			}
		}
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				pathLen = Math.max(pathLen, requestPathLength(matrix, i, j));
			}
		}
		return pathLen + 1;
	}

	/**
	 * 求到指定位置最长的递增路径长度
	 * 
	 * @param matrix
	 * @param i
	 * @param j
	 * @return
	 */
	private int requestPathLength(int[][] matrix, int i, int j) {
		if (lens[i][j] != -1) {
			return lens[i][j];
		}
		int a = 0;
		if (i - 1 > -1 && matrix[i][j] < matrix[i - 1][j]) {
			a = 1 + requestPathLength(matrix, i - 1, j);
		}
		int b = 0;
		if (i + 1 < matrix.length && matrix[i][j] < matrix[i + 1][j]) {
			b = 1 + requestPathLength(matrix, i + 1, j);
		}
		int c = 0;
		if (j - 1 > -1 && matrix[i][j] < matrix[i][j - 1]) {
			c = 1 + requestPathLength(matrix, i, j - 1);
		}
		int d = 0;
		if (j + 1 < matrix[0].length && matrix[i][j] < matrix[i][j + 1]) {
			d = 1 + requestPathLength(matrix, i, j + 1);
		}
		lens[i][j] = Math.max(Math.max(a, b), Math.max(c, d));
		return lens[i][j];
	}
}
