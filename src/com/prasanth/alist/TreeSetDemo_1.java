package com.prasanth.alist;

import java.util.TreeSet;

public class TreeSetDemo_1 {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		//ts.add(new StringBuffer("aaa"));
		ts.add("qqq");    //qqq.comapreto(aaa)
		ts.add("www");	//www.compareto(aaa)
		//www.comapreto(qqq)
		
		System.out.println(ts);
		String ss = (String) ts.first();
		System.out.println(ss);
		
		

	}

}
