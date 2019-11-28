package com.prasanth.alist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo_1 {

	public static void main(String[] args) {

		List<String> al = new ArrayList<String>();
		al.add("sam");
		al.add("ram");
		al.add("pom");
		al.add("sam");

		Iterator it = al.iterator(); // iterator is used to print elements on
										// after the other

		while (it.hasNext()) { // hasNext() checks wheather elements present or
								// not
			System.out.println(it.next()); // returns next element in the
											// arraylist
			/* continue; */
		}
		System.out.println("Elements after adding");
		al.add(2, "jam");
		//al.add(3,null);

		Iterator it1 = al.iterator();

		while (it1.hasNext()) {
			System.out.println(it1.next());
		}
		System.out.println("Elements after removing");
		al.remove("pom"); // remove the element
		al.set(2, "ramu"); // update the element
		int pos=al.indexOf("ramu"); // return index  present or not default returns -1
		System.out.println(pos);
		String str=al.get(2);	//	returns the element present at particular index
		System.out.println(str);
		Collections.sort(al);
		

		Iterator it2 = al.iterator();

		while (it2.hasNext()) {
			System.out.println(it2.next());
		}

	}
}
