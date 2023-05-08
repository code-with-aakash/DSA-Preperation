package com.dsa.programs.linkedlist;

public class LinkList {

	public static void main(String[] args) {

		LL ll = new LL();

		ll.insertFirst(3);
		ll.insertFirst(17);
		ll.insertFirst(117);
		ll.insertFirst(11);
		ll.insertLast(32);
		ll.insertLast(39);
		ll.display();
		ll.insert(100, 3);
		ll.display();
		System.out.println(ll.deleteFirst());;
		ll.display();
		System.out.println(ll.deleteLast());
		ll.display();
		System.out.println(ll.deleteindex(2));
		ll.display();
		System.out.println(ll.find(17));

	}

}
