package com.acts.comparators;

import java.util.Comparator;

import com.acts.Bank;

public class NameComparator implements Comparator<Bank> {

	@Override
	public int compare(Bank o1, Bank o2) {
		return o1.getUsername().compareTo(o2.getUsername());
	}

//	boolean equals(Bank o1)
//	{
//		return true;	
//	}


}
