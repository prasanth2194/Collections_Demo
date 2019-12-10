package com.prasanth.linkedlist;

import javax.xml.soap.Node;

public class DoubleLinkedDemo {

	class Node {
		private int data;
		private Node previous;
		private Node next;

		Node(int d) {
			data = d;

		}

	}

	Node head, tail = null;
	public void atBeggining(int data){
		
		Node newNode = new Node(data);
		newNode.next=head;
		head=newNode;
	}

	public void addNode(int data) {
		Node newNode = new Node(data);

		// If list is empty
		if (head == null) {
								// Both head and tail will point to newNode
			head = tail = newNode;
								// head's previous will point to null
			head.previous = null;
							// tail's next will point to null, as it is the last node of the
							// list
			tail.next = null;
		} else {
							// newNode will be added after tail such that tail's next will point
							// to newNode
			tail.next = newNode;
							// newNode's previous will point to tail
			newNode.previous = tail;
							// newNode will become new tail
			tail = newNode;
							// As it is last node, tail's next will point to null
			tail.next = null;
		}
	}
	public void addinter(int data,int position){
		Node newNode = new Node(data);
		if (head==null){
			head=tail=newNode;
			head.previous=null;
			tail.next=null;
		}
		else{
			if (head!= null && tail!=null && position == 0) {
				newNode.previous = this.head;
				newNode.next=this.tail;
				this.head = newNode;
				this.tail=newNode;
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

			newNode.next = current;
			previous.next = newNode;
		}
	}
	public void printList() {
		Node tnode = head;
		while (tnode != null) {
			System.out.print(tnode.data + " ");
			tnode = tnode.next;
		}
	}
	public void reverseList(){
		
	}
		public static void main(String[] args) {
			DoubleLinkedDemo d= new DoubleLinkedDemo();
			d.addNode(12);
			d.addNode(14);
			d.addNode(47);
			d.addNode(89);
			d.addinter(18, 2);
			d.addinter(32, 4);
			d.atBeggining(63);
			
			d.printList();
			
			
			
			
		}
	
	
	
}
