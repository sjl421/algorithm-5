/**
 * 
 */
package com.zhazhapan.algorithm.dynamicprogramming;

/**
 * @author pantao
 * @since 2017-04-04
 * @function 如果我们有面值为1元、3元和5元的硬币若干枚，如何用最少的硬币凑够n元？
 *
 */
public class LeastCoin {

	public int solution2(int n) {
		return n / 5 + n % 5 / 3 + n % 5 % 3;
	}

	public int solution1(int n) {
		switch (n) {
		case 0:
			return 0;
		case 1:
		case 2:
			n--;
			break;
		case 3:
		case 4:
			n -= 3;
			break;
		default:
			n -= 5;
			break;
		}
		return 1 + solution1(n);
	}
}
