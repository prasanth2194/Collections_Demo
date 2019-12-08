package com.prasanth.employee;

import java.util.Comparator;

public class Employee  {
	
	private int id;
	private String name;
	private long salary;
	
	
	

	public Employee(int id, String name, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}



	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}



	/*@Override
	public int compareTo(Object o) {
		double salary1 =this.salary;
		Employee e= (Employee) o;
		double salary2=e.salary;
		if (salary1<salary2){
			return 1;
		}
		else if (salary1>salary2){
			return -1;
		}
		else{
			return 0;
		}*/
	



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public long getSalary() {
		return salary;
	}



	public void setSalary(long salary) {
		this.salary = salary;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (int) (salary ^ (salary >>> 32));
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (salary != other.salary)
			return false;
		return true;
	}


/*
	@Override
	public int compare(Object o1, Object o2) {
		
		//Employee e1= (Employee) o1;
		//Employee e2=(Employee) o2;
		Double s1=(Double) o1;
		Double s2=(Double) o2;
		return s2.compareTo(s1);*/
	}


