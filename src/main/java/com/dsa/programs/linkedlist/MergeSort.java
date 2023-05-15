package com.dsa.programs.linkedlist;

public class MergeSort {

	public ListNode sortList(ListNode head) {

		if (head == null || head.next == null) {
			return head;
		}

		ListNode mid = middleNode(head);
		ListNode left = sortList(head);
		ListNode right = sortList(mid);

		return mergeTwoLists(left, right);

	}

	public ListNode middleNode(ListNode head) {

		ListNode slow = head, fast = head, pre = head;
		while (fast != null && fast.next != null) {
			pre = slow;
			slow = slow.next;
			fast = fast.next.next;
		}
		pre.next = null;
		return slow;
	}

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

		// using recursion
		if (l1 == null)
			return l2;
		if (l2 == null)
			return l1;
		if (l1.val < l2.val) {
			l1.next = mergeTwoLists(l1.next, l2);
			return l1;
		} else {
			l2.next = mergeTwoLists(l1, l2.next);
			return l2;
		}
	}

}
