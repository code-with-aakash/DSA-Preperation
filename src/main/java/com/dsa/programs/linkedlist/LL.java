package com.dsa.programs.linkedlist;

public class LL {

	private Node head;
	private Node tail;

	private int size;

	public LL() {
		super();
	}

	public LL(int size) {
		this.size = size;
	}

	private class Node {

		private int val;

		private Node next;

		public Node(int val) {
			this.val = val;
		}

		public Node(int val, Node next) {
			this.val = val;
			this.next = next;
		}

		@Override
		public String toString() {
			return "Node [val=" + val + ", next=" + next + "]";
		}

	}

	public void insertFirst(int val) {

		Node node = new Node(val);
		node.next = head;
		head = node;
		if (tail == null) {
			tail = head;
		}
		size += 1;
	}

	public void display() {

		Node temp = head;
		while (temp != null) {
			System.out.print(temp.val + " -> ");
			temp = temp.next;
		}
		System.out.print("End");
		System.out.println();

	}

	public void insertLast(int val) {

		if (tail == null) {
			insertFirst(val);
			return;
		}
		Node node = new Node(val);
		tail.next = node;
		tail = node;
		size++;

	}

	public void insert(int val, int index) {

		if (index == 0) {
			insertFirst(val);
			return;
		}
		if (index == size) {
			insertLast(val);
		}

		// takes 0the element
		Node temp = head;

		for (int i = 1; i < index; i++) {
			temp = temp.next;
		}

		// here it is joined with next element first
		Node node = new Node(val, temp.next);
		// here it is joined with previous element after it is joined with next element
		// above
		temp.next = node;
		size += 1;

	}

	public int deleteFirst() {

		int val = head.val;

		head = head.next;
		if (head == null) {
			tail = null;
		}

		size--;
		return val;

	}

	public Node get(int index) {
		Node node = head;
		for (int i = 0; i < index; i++) {

			node = node.next;
		}
		return node;
	}

	public int deleteLast() {

		if (size <= 1) {
			return deleteFirst();
		}
		Node secondLast = get(size - 2);
		int val = tail.val;
		tail = secondLast;
		tail.next = null;
		return val;

	}

	public int deleteindex(int index) {

		if (index == 0) {
			return deleteFirst();
		}
		if (index == size - 1) {
			return deleteLast();
		}

		Node node = get(index - 1);
		int val = node.next.val;
		node.next = node.next.next;
		return val;

	}

	public Node find(int value) {
		Node node = head;
		while (node != null) {
			if (node.val == value) {
				return node;

			}
			node = node.next;
		}
		return null;
	}

}
