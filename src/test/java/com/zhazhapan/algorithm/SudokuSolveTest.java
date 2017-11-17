/**
 * 
 */
package com.zhazhapan.algorithm;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.zhazhapan.algorithm.backtracking.SudokuSolve;
import com.zhazhapan.algorithm.modules.constant.Values;

/**
 * @author pantao
 *
 */
public class SudokuSolveTest {

	@Test
	public void testSudoku() {
		String[] string = { "..9748...", "7........", ".2.1.9...", "..7...24.", ".64.1.59.", ".98...3..", "...8.3.2.",
				"........6", "...2759.." };
		char[][] board = new char[9][9];
		for (int i = 0; i < Values.NINE_INT; i++) {
			board[i] = string[i].toCharArray();
		}
		SudokuSolve solve = new SudokuSolve();
		assertFalse(solve.isValidSudoku(board));
		solve.solveSudoku(board);
		assertTrue(solve.isValidSudoku(board));
	}
}
