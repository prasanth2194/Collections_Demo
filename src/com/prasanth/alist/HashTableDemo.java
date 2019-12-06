package com.prasanth.alist;

import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
		Hashtable h = new Hashtable();
		h.put(new Temp1(5), "sss");
		h.put(new Temp1(2), "hhh");
		h.put(new Temp1(6), "ggg");
		h.put(new Temp1(15), "lll");
		h.put(new Temp1(23), "kkk");
		h.put(new Temp1(16), "fff");
		
		System.out.println(h);

	}

}
class Temp1{
	
	int i ;
	Temp1(int i){
		this.i=i;
	}
	public int hashCode(){
		return i;
	}
	@Override
	public String toString() {
		return "Temp [i=" + i + "]";
	}
}