package com.acts.comparators;

import java.util.Comparator;

import com.acts.Bank;

public class AccNoComparator implements Comparator<Bank> {
	
	@Override
	public int compare(Bank o1, Bank o2) {
		return o1.getUserAccNo().compareTo(o2.getUserAccNo());
	}
}
