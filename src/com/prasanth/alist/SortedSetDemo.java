package com.prasanth.alist;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {

	public static void main(String[] args) {
		SortedSet ss= new TreeSet();
		
		ss.add("ddd");
		ss.add("yyy");
		ss.add("iiii");
		ss.add("ooo");
		//ss.add(22);  
		
		System.out.println(ss);
		String rr=(String) ss.first();
		System.out.println(rr);
		String tt =(String) ss.last();
		System.out.println(tt);

	}

}
