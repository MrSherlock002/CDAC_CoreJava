package com.acts.comparators;

import java.util.Comparator;

import com.acts.Bank;

public class AccBalanceComparator implements Comparator<Bank> {
	
	@Override
	public int compare(Bank o1, Bank o2) {
		return o1.getUserBalance().compareTo(o2.getUserBalance());
	}
}
