package com.CustomisedSorting.employee;

public class Employee implements Comparable {

	String name;
	int id;

	public Employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]";
	}

	@Override
	public int compareTo(Object o) {
		int id1 = this.id;
		Employee e = (Employee) o;
		int id2 = e.id;

		if (id1 < id2) {
			return -1;

		}
		if (id1 > id2) {
			return +1;
		} else {
			return 0;
		}

	}

}
