package com.prasanth.linkedlist;

import javax.xml.soap.Node;

public class MyLinkedListDemo {

	 Node head;

	class Node {
		private int data;
		private Node next;
		// private Node tail;
		Node nextNode;

		Node(int d) {
			data = d;
			next = null;
			
			// tail=null;
		}

	}

	public void addatBegging(int new_data) {
		Node new_node = new Node(new_data);// new node generated and data will
											// be inserted
		new_node.next = head;// makes new node as head node
		head = new_node; // pointer head shift to the new node
	}

	public void printList() {
		Node tnode = head;
		while (tnode != null) {
			System.out.print(tnode.data + " ");
			tnode = tnode.next;
		}
	}

	public void append(int new_data) {
		Node new_node = new Node(new_data); // new node generated
		if (head == null) { /*
							 * if there are no elements in the list inserted
							 * element will be head
							 */
			head = new Node(new_data);
			return;

		}
		new_node.next = null; /* last element in the list will be null */
		Node last = head;
		while (last.next != null)
			/*
			 * if there are elements in the list then inserted element will be
			 * at last
			 */ last = last.next;
		last.next = new_node;
		return;

	}

	public void insertNth(int data, int position) {
		// create new node.
		Node node = new Node(data);
		node.data = data;
		node.next = null;

		if (this.head == null) {
			// if head is null and position is zero then exit.
			if (position != 0) {
				return;
			} else { // node set to the head.
				this.head = node;
			}
		}

		if (head != null && position == 0) {
			node.next = this.head;
			this.head = node;
			return;
		}

		Node current = this.head;
		Node previous = null;

		int i = 0;

		while (i < position) {
			previous = current;
			current = current.next;

			if (current == null) {
				break;
			}

			i++;
		}

		node.next = current;
		previous.next = node;
	}
	
	Node reverse() 
    { 
        Node prev = null; 
        Node current = head; 
        Node next = null; 
        while (current != null) { 
            next = current.next; 
            current.next = prev; 
            prev = current; 
            current = next; 
        } 
        head = prev; 
        return head; 
    } 
	
	/*
	 * public void insertAfter(Node previous, int new_data) { new_data=14; Node
	 * new_node = new Node(new_data); if (previous == null) {
	 * System.out.println("previous node cannot be null"); } new_node.next =
	 * previous.next; previous.next = new_node; }
	 */
	public static void main(String[] args) {
		MyLinkedListDemo l = new MyLinkedListDemo();

		l.append(10); // element will be added at the first

		l.append(47); // element will be added at the last in the list
		l.addatBegging(14);
		// l.addInMid(38);
		l.insertNth(45, 2);
		l.printList();
		l.reverse();
		l.printList();
		
		
		

	}

}
