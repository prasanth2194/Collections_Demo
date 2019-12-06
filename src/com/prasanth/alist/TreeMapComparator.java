package com.prasanth.alist;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapComparator {

	public static void main(String[] args) {
		Map m = new TreeMap(new Mycomparator());
		m.put(105, "eee");
		m.put(107, "ttt");
		m.put(101, "ooo");
		m.put(100, "yyy");
		
		System.out.println(m);
		int s =m.hashCode();
		System.out.println(s);
		
	}

}
