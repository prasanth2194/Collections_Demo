package com.CustomisedSorting.employee;

import java.util.Comparator;

public class Mycomparator1 implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Employee E1=(Employee) o1;
		Employee E2=(Employee) o2;
		String s1=E1.name;
		String s2=E2.name;
		return s1.compareTo(s2);
	}

}
