package com.prasanth.alist;

import java.util.ArrayList;
import java.util.List;

public class ArraytoArrayList_03 {

	public static void main(String[] args) {
		// Using add() method
		
String ar[]={"prassi","sri","aaa","eee"};
		
		List<String> al = new ArrayList();
		
		for(String e:ar){
			al.add(e);
			System.out.println(e);
		}

	}

}
