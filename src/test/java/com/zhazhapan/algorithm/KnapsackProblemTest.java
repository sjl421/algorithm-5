/**
 * 
 */
package com.zhazhapan.algorithm;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.zhazhapan.algorithm.greed.KnapsackProblem;

/**
 * @author pantao
 *
 */
public class KnapsackProblemTest {

	@Test
	public void testProblem() {
		double[][] test1 = { { 12, 13 }, { 9, 16 } };
		double[][] test2 = { { 4, 3 }, { 12, 8 }, { 11, 7 } };

		KnapsackProblem problem = new KnapsackProblem();

		assertTrue(0 == problem.solve(test1, 8));
		assertTrue(16 == problem.solve(test1, 10));
		assertTrue(16 == problem.solve(test1, 13));
		assertTrue(29 == problem.solve(test1, 25));

		assertTrue(0 == problem.solve(test2, 3));
		assertTrue(3 == problem.solve(test2, 5));
		System.out.println(problem.solve(test2, 11));
		System.out.println(problem.solve(test2, 12));
		assertTrue(10 == problem.solve(test2, 15));
		assertTrue(11 == problem.solve(test2, 17));
		assertTrue(18 == problem.solve(test2, 30));
	}
}
