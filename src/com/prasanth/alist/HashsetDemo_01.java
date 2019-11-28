package com.prasanth.alist;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashsetDemo_01 {

	public static void main(String[] args) {
		
		Set hs=new HashSet();
		
		hs.add("ee");
		hs.add("thi");
		hs.add("prassi");
		hs.add(null);
		
		
		Iterator it=hs.iterator();
		while(it.hasNext()){
			System.out.println(it);
			System.out.println(it.next());
			System.out.println(hs.add("thi"));
			/*public boolean add(E e) {
		        ensureCapacityInternal(size + 1);  // Increments modCount!!
		        elementData[size++] = e;
		        return true;*/

		}

	}

}
