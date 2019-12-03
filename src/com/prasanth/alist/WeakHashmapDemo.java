package com.prasanth.alist;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashmapDemo {

	public static void main(String[] args) {
		Map m = new WeakHashMap();
		//Map m = new HashMap();
		Temp t = new Temp();
		m.put(t, "prassi");
		System.out.println(m);
		t=null;
		System.gc();
		try {
			Thread.sleep(1000);
			System.out.println(m);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
		
		
		
	}

}
