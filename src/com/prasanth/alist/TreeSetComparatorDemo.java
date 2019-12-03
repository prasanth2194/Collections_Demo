package com.prasanth.alist;

import java.util.TreeSet;

public class TreeSetComparatorDemo {

	public static void main(String[] args) {
		
		TreeSet t = new TreeSet(new Mycomparator());
		
		t.add(10);
		t.add(20);
		t.add(45);
		t.add(0);
		t.add(32);
		
		System.out.println(t);

	}

}
