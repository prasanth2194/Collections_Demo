package com.prasanth.alist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo_02 {

	public static void main(String[] args) {
		List<String> al = new ArrayList();
		al.add("prassi");
		al.add("sri");
		al.add("lll");
		al.add("fff");
		al.add("hhh");
		al.add("prassi");
		al.add("sri");
		al.add("lll");
		al.add("fff");
		al.add("hhh");
		
		
	/*Iterator a =al.iterator();
		while(a.hasNext()){
			System.out.println(a.next());
		}*/
		
		for(String ad:al){
			//System.out.println(ad);
			if(ad.equals("prassi")){
				al.remove(ad);
				System.out.println(ad);
			}
		}

	}

}
