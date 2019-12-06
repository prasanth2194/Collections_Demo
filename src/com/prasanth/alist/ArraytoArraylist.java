package com.prasanth.alist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraytoArraylist {

	public static void main(String[] args) {
		
		//using arrays.aslist method
		String ar[]={"prassi","sri","aaa","eee"};
		
		List al = Arrays.asList(ar);
		System.out.println(al);
		//System.out.println(al.lastSet());
		
		
		/*List al = new ArrayList(Arrays.asList(ar));
		
		al.add("sai");
		al.add("rrr");
		System.out.println(al);
*/
	}

}
