package com.prasanth.alist;

import java.util.HashMap;
import java.util.Map;

public class IdentityHashmapDemo {

	public static void main(String[] args) {
		Map m = new HashMap();  //{10=srika}  it uses .equals method.
		//Map m = new IdentityHashMap(); //{10=prassi,10="srika"} it uses == method.
		Integer i1= new Integer(10);
		Integer i2= new Integer(10);
		m.put(i1, "prassi");
		m.put(i2, "srika");
		System.out.println(m);
		
		

	}

}
