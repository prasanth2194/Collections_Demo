package com.prasanth.linkedlist;

import javax.xml.soap.Node;

public class mylinkedlist {
	//Node head;
	static class Node{
		int data;
		Node next;
		public Node(int d){
			data = d;
			next = null;
			
		
		}
		
	}
	public Node insertAtBegining(Node head,int data){  //add node at the front
		Node new_node = new Node(data);
		if(head==null){
		return new_node;
		}
		new_node.next=head;
		head=new_node;
		return head;
	}
	public Node afterNode(Node previous,int data){
		Node new_node1=new Node(data);
		if(previous==null){
			//System.out.println("Node cannot be null");
			return new_node1;
		}
		new_node1.next=previous.next;
		previous.next=new_node1;
		return previous.next;
		
		
	}
	public void display(Node head){
		if(head==null){
			return;
		}
		Node current = head;
		while(current!=null){
			System.out.println(current.data+"");
			current = current.next;
		}
		System.out.println(current);
	}
		
	

	public static void main(String[] args) {
		Node head=new Node(10);
		Node second =new Node(15);
		Node third = new Node(20);
		
		head.next=second;
		second.next=third;
		
		mylinkedlist n = new mylinkedlist();
		n.display(head);
		System.out.println();
		Node newhead = n.insertAtBegining(head,14);
		n.display(newhead);
		Node t =n.afterNode(third, 27);
		n.display(t);
		

	}

}
