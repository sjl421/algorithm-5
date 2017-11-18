/**
 * 
 */
package com.zhazhapan.algorithm.leetcode;

/**
 * <a href="https://leetcode.com/problems/add-two-numbers/description/">visit
 * LeetCode page</a>
 * 
 * @author pantao
 *
 */
public class AddTwoNumbers {

	public ListNode getResult(ListNode aNode, ListNode bNode) {
		ListNode head = new ListNode(0);
		// 进位
		int add = 0;
		ListNode result = head;
		while (aNode != null || bNode != null || add != 0) {
			// 相加
			int sum = (aNode == null ? 0 : aNode.val) + (bNode == null ? 0 : bNode.val) + add;
			add = sum / 10;
			sum %= 10;
			head.next = new ListNode(sum);
			head = head.next;
			aNode = aNode == null ? null : aNode.next;
			bNode = bNode == null ? null : bNode.next;
		}
		return result.next;
	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}
