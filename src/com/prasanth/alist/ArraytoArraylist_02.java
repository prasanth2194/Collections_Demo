package com.prasanth.alist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArraytoArraylist_02 {

	public static void main(String[] args) {
		// Using colletions.addall() 
		
		String ar[]={"prassi","sri","aaa","eee"};
		
		List<String> al = new ArrayList();
		
		
		Collections.addAll(al, ar);
		al.add("sss");
		al.add("qqq");
		
		System.out.println(al);

	}

}
