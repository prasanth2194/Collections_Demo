package com.prasanth.alist;

import javax.xml.soap.Node;

public class LinkedListDemo_2 {
	Node head;
	static class Node{
		int data;
		Node next;
		Node(int d){
			data=d;
			next=null;
		}
		
	}
	
	
	

	public static void main(String[] args) {
		LinkedListDemo_2 list =new LinkedListDemo_2();
		list.head=new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		
		System.out.println("Nodes created dynamically");
		
		list.head.next=second;
		System.out.println("link1 created");
		
		second.next=third;
		System.out.println("link2 created");
		
		

	}

}
