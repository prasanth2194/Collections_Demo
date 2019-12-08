package com.CustomisedSorting.employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import com.prasanth.employee.Employee;

public class Client1 {

	public static void main(String[] args) {
		
		Employee E1 = new Employee(101, "Prasanth", 10000);
		Employee E2 = new Employee(102, "Srikanth", 20000);
		Employee E3 = new Employee(103, "Dravid", 30000);
		Employee E4= new Employee(104, "Yuraj", 20000);
		Employee E5 = new Employee(105, "Rohit", 70000);
		Employee E6 = new Employee(106, "Sharma", 80000);

		List<Employee> e = new ArrayList<Employee>();
		
		e.add(E1);
		e.add(E2);
		e.add(E3);
		
		List<Employee> p = new ArrayList<Employee>();
		
		p.add(E4);
		p.add(E5);
		p.add(E6);
		
		System.out.println("List one");
		Iterator i = e.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
			
		System.out.println("List two");
		Iterator y=p.iterator();
		while(y.hasNext()){
			System.out.println(y.next());
		}
		
		System.out.println("After Sorting");
		
		boolean w = i.equals(y);
		System.out.println(w);
		
		
		
		
		
		
		
		//List<Employee> q = new ArrayList<Employee>();
		/*Collections.sort(e,new Comparator(){
			public int compare(Object o1, Object o2){
				Employee e1=(Employee) o1;
				Employee e2=(Employee) o2;
				Long i1=e1.getSalary();
				Long i2=e2.getSalary();
				
				
				return i1.compareTo(i2);*/
				
			}
		
				
				
				
				
				
		
		
		}
		
	


