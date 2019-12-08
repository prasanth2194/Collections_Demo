package com.prasanth.HE;

import java.util.HashSet;
import java.util.Set;

public class Client {
	
	public static void main(String[] args) {
		
		
		
		Employee E1 = new Employee(101, "Prasanth", 100000, 1994);
		Employee E2 = new Employee(102,"Srikanth",200000, 1991);
		Employee E3 =new Employee(103,"Rahul",300000, 1985);
		Employee E4 =new Employee(104,"Dravid",300000, 1980);
		Employee E5 = new Employee(105,"Prasanth ",100000, 1994);
		Employee E6 = new Employee(106,"Srika",400000, 1996);
		
		Set <Employee> emp=new HashSet<Employee>();
		emp.add(E1);
		emp.add(E2);
		emp.add(E3);
		emp.add(E4);
		emp.add(E5);
		emp.add(E6);
		System.out.println(emp);
		/*Set <Employee> emp1=new HashSet<Employee>();
		emp1.add(E4);
		emp1.add(E5);
		emp1.add(E6);
		for(Employee e:emp){
			if(emp1.contains(e)){
				System.out.println(e);*/
			}
		
		
	}


