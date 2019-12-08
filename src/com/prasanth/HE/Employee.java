package com.prasanth.HE;

public class Employee {
	private int id;
	private String name;
	private long salary;
	private int dob;
	public Employee(int id, String name, long salary, int dob) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dob = dob;
	}
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
	public int getDob() {
		return dob;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + dob;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Employee other = (Employee) obj;
		if (dob != other.dob) {
			return false;
		}
		return true;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", dob=" + dob + "]\n";
	}
	public void setDob(int dob) {
		this.dob = dob;
	}
	
	
}

	