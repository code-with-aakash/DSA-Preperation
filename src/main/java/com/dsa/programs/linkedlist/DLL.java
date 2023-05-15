package com.dsa.programs.linkedlist;

public class DLL {

	private Node head;
	private int size;

	private class Node {

		private int val;
		private Node next;
		private Node pre;

		public Node(int val) {
			this.val = val;
		}

		public Node(int val, Node next, Node pre) {
			this.val = val;
			this.next = next;
			this.pre = pre;
		}
	}

	public void insertFirst(int val) {

		Node node = new Node(val);
		node.next = head;
		node.pre = null;
		if (head != null) {
			head.pre = node;
		}
		head = node;

		size += 1;

	}

	public void display() {

		Node node = head;
		Node last = null;
		while (node != null) {
			System.out.print(node.val + " -> ");
			last = node;
			node = node.next;

		}
		System.out.print("End");
		System.out.println();

		while (last != null) {
			System.out.print(last.val + " -> ");
			last = last.pre;

		}
		System.out.print("Head");
		System.out.println();

	}

	public void insertLast(int val) {

		Node node = new Node(val);
		Node last = head;
		node.next = null;

		if (head == null) {
			node.pre = null;
			head = node;
			return;
		}

		while (last.next != null) {
			last = last.next;
		}

		last.next = node;
		node.pre = last;
		size++;

	}

	public Node get(int val) {
		Node node = head;
		while (node != null) {
			if (node.val == val) {
				return node;
			}
			node = node.next;
		}
		return node;
	}

	public void insert(int val, int value) {

		Node p = get(val);

		if (p == null) {
			System.out.println("not possible");
			return;
		}

		Node node = new Node(value);
		node.next = p.next;
		p.next = node;
		node.pre = p;
		if (node.next != null) {
			node.next.pre = node;
		}
		size++;

	}

}
