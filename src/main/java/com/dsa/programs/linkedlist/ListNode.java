package com.dsa.programs.linkedlist;

import com.dsa.programs.linkedlist.LL.Node;

public class ListNode {

	int val;
	ListNode next;

	ListNode(int val) {
		this.val = val;
	}

	public ListNode() {
	}

	public int lengthCycle(ListNode head) {

		ListNode fast = head;
		ListNode slow = head;

		while (fast != null && fast.next != null) {

			fast = fast.next.next;
			slow = slow.next;

			if (slow == fast) {
				int length = 0;
				ListNode temp = slow;
				do {
					temp = temp.next;
					length++;
				} while (temp != slow);
				return length;
			}

		}

		return 0;

	}

	public int deleteNode(int index) {

		ListNode temp = next;
		ListNode last = next;
		int count = 0;

		while (last != null) {
			{
				last = last.next;
				count++;
			}

		}
		return count;

	}

	public ListNode middleNode(ListNode head) {

		ListNode s = head;
		ListNode f = head;

		while (f != null && f.next != null) {

			f = f.next.next;
			s = s.next;
		}
		return s;
	}

	public LL merge(ListNode first, ListNode second) {
		ListNode f = first;
		ListNode s = second;

		LL ans = new LL();

		while (f != null && s != null) {

			if (f.val < s.val) {
				ans.insertLast(f.val);
				f = f.next;
			} else {
				ans.insertLast(s.val);
				s = s.next;
			}
		}

		while (f != null) {
			ans.insertLast(f.val);
			f = f.next;
		}

		while (s != null) {
			ans.insertLast(s.val);
			s = s.next;
		}
		return ans;

	}

//	public void insertFirst(int val) {
//
//		Node node = new Node(val);
//		node.next = next;
//		head = node;
//		if (tail == null) {
//			tail = head;
//		}
//		size += 1;
//	}

}
