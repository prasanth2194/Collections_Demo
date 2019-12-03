package com.CustomisedSorting.employee;

import java.util.TreeSet;

public class Client {

	public static void main(String[] args) {
		Employee i1=new Employee("ravi", 101);
		Employee i2=new Employee("prasanth", 106);
		Employee i3=new Employee("raju", 103);
		Employee i4=new Employee("srikanth", 104);
		Employee i5=new Employee("kiran", 105);
		
		TreeSet t = new TreeSet();
		t.add(i1);
		t.add(i2);
		t.add(i3);
		t.add(i4);
		t.add(i5);
		
		System.out.println(t);
		
		TreeSet t1= new TreeSet(new Mycomparator1());
		
		t1.add(i1);
		t1.add(i2);
		t1.add(i3);
		t1.add(i4);
		t1.add(i5);
		
		System.out.println(t1);
				
	}

}
