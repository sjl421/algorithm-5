/**
 * 
 */
package com.zhazhapan.algorithm.backtracking;

import java.util.HashSet;

import com.zhazhapan.algorithm.modules.constant.Values;

/**
 * @author pantao
 * @since 2017-04-06
 *
 */
public class SudokuSolve {

	/**
	 * 求解数独
	 * 
	 * @param board
	 */
	public void solveSudoku(char[][] board) {
		if (board == null || board.length != Values.NINE_INT || board[0].length != Values.NINE_INT) {
			return;
		}
		solve(board, 0, 0);
	}

	/**
	 * 自己写的一个数独求解方案
	 * 
	 * @param board
	 *            数独
	 * @param i
	 *            行
	 * @param j
	 *            列
	 * @return
	 */
	private boolean solve(char[][] board, int i, int j) {
		if (j == Values.NINE_INT) {
			if (i == Values.EIGHT_INT) {
				// 求解完成
				return true;
			}
			// 换行
			i++;
			j = 0;
		}
		if (board[i][j] != Values.DOT_SIGN_CHAR) {
			return solve(board, i, j + 1);
		}
		// 回溯求解
		for (char k = Values.ONE_CHAR; k <= Values.NINE_CHAR; k++) {
			if (isValid(board, i, j, k)) {
				board[i][j] = k;
				if (solve(board, i, j + 1)) {
					return true;
				} else {
					board[i][j] = '.';
				}
			}
		}
		return false;
	}

	/**
	 * 参考自leetcode的数独求解
	 * 
	 * @param board
	 * @return
	 */
	public boolean solve(char[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (board[i][j] == '.') {
					for (char c = Values.ONE_CHAR; c <= Values.NINE_CHAR; c++) {
						if (isValid(board, i, j, c)) {
							board[i][j] = c;
							if (solve(board)) {
								return true;
							} else {
								board[i][j] = '.';
							}
						}
					}
					return false;
				}
			}
		}
		return true;
	}

	/**
	 * 验证当前的回溯解是否合法
	 * 
	 * @param board
	 * @param i
	 * @param j
	 * @param c
	 * @return
	 */
	private boolean isValid(char[][] board, int i, int j, char c) {
		for (int k = 0; k < Values.NINE_INT; k++) {
			if (board[i][k] != '.' && board[i][k] == c) {
				return false;
			}
			if (board[k][j] != '.' && board[k][j] == c) {
				return false;
			}
			if (board[i / 3 * 3 + k / 3][j / 3 * 3 + k % 3] != '.'
					&& board[i / 3 * 3 + k / 3][j / 3 * 3 + k % 3] == c) {
				return false;
			}
		}
		return true;
	}

	/**
	 * 验证是否是一个合法的数独
	 * 
	 * @param board
	 * @return
	 */
	public boolean isValidSudoku(char[][] board) {
		for (int i = 0; i < board.length; i++) {
			HashSet<Character> rows = new HashSet<Character>();
			HashSet<Character> cols = new HashSet<Character>();
			HashSet<Character> cube = new HashSet<Character>();
			for (int j = 0; j < board[0].length; j++) {
				if (board[i][j] == '.' || !rows.add(board[i][j])) {
					return false;
				}
				if (board[j][i] == '.' || !cols.add(board[j][i])) {
					return false;
				}
				if (board[i / 3 * 3 + j / 3][i % 3 * 3 + j % 3] == '.'
						|| !cube.add(board[i / 3 * 3 + j / 3][i % 3 * 3 + j % 3])) {
					return false;
				}
			}
		}
		return true;
	}
}
