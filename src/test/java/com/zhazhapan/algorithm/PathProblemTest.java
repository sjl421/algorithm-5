/**
 * 
 */
package com.zhazhapan.algorithm;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.zhazhapan.algorithm.dynamicprogramming.PathProblem;

/**
 * @author pantao
 *
 */
public class PathProblemTest {

	@Test
	public void testPathProblem() {
		int[][] test1 = { { 1, 2 }, { 3, 4 } };
		int[][] test2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] test3 = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		int[][] test4 = { { 1, 2, 3 }, { 6, 5, 4 }, { 7, 8, 9 } };
		PathProblem problem = new PathProblem();

		assertEquals(8, problem.maxApples(test1));
		assertEquals(29, problem.maxApples(test2));
		assertEquals(73, problem.maxApples(test3));
		assertEquals(31, problem.maxApples(test4));

		assertEquals(3, problem.longestIncreasingPath(test1));
		assertEquals(5, problem.longestIncreasingPath(test2));
		assertEquals(7, problem.longestIncreasingPath(test3));
		assertEquals(9, problem.longestIncreasingPath(test4));
	}
}
