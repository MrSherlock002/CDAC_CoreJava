package com.acts.comparators;

import java.util.Comparator;

import com.acts.Emp;

public class NameComparator implements Comparator<Emp> {

	@Override
	public int compare(Emp o1, Emp o2) {
		return o1.getEmpName().compareTo(o2.getEmpName());
	}
}
