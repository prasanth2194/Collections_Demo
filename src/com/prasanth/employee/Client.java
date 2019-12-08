package com.prasanth.employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Client {

	public static void main(String[] args) {

		Employee E1 = new Employee(101, "Prasanth", 10000);
		Employee E2 = new Employee(102, "Srikanth", 20000);
		Employee E3 = new Employee(103, "Dravid", 30000);
		Employee E4 = new Employee(104, "Rahul", 40000);
		Employee E5 = new Employee(105, "Yuraj", 50000);
		Employee E6 = new Employee(106, "Singh", 60000);
		Employee E7 = new Employee(107, "Rohit", 70000);
		Employee E8 = new Employee(108, "Sharma", 80000);

		List<Employee> e = new ArrayList<Employee>();

		e.add(E2);
		e.add(E3);
		e.add(E8);
		e.add(E5);
		e.add(E6);
		e.add(E1);
		e.add(E7);
		e.add(E4);

		System.out.println("Before Sorting");
		Iterator i = e.iterator();
		while (i.hasNext()) {

			System.out.println(i.next());

		}
		System.out.println("After Sorting");
		Collections.sort(e, new Comparator() {
			public int compare(Object o1, Object o2) {

				Employee e1 = (Employee) o1;
				Employee e2 = (Employee) o2;
				Long s1 = e1.getSalary();
				Long s2 = e2.getSalary();

				return s2.compareTo(s1);
			}
		});
		// System.out.println(e);
		Iterator i1 = e.iterator();
		while (i1.hasNext()) {
			System.out.println(i1.next());
		}
	}
}

// @Override
/*
 * public int compare(Object o1, Object o2) { Employee e1 = (Employee) o1;
 * Employee e2=(Employee) o2; Long s1=e1.getSalary(); Long s2=e2.getSalary();
 * 
 * return s2.compareTo(s1);
 * 
 * }
 */
