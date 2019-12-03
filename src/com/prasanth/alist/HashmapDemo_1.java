package com.prasanth.alist;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashmapDemo_1 {

	public static void main(String[] args) {
		Map m = new HashMap();
		m.put("prasanth", 100);
		m.put("srk", 101);
		m.put("laptop", 102);
		m.put("mobile", 103);
		
		System.out.println(m);
		System.out.println(m.put("prasanth", 105));
		System.out.println(m);
		Set s= m.keySet();
		System.out.println(s);
		Collection c =m.values();
		System.out.println(c);
		int i = m.size();
		System.out.println(i);
		boolean b=m.containsKey("srk");
		System.out.println(b);
		System.out.println(m.containsValue(105));
		
		

	}

}
