package com.acts.comparators;

import java.sql.Date;
import java.util.Comparator;

import com.acts.Bank;

public class DateComparator implements Comparator<Bank> {


	@Override
	public int compare(Bank o1, Bank o2) {
		return o1.getTodayDate().compareTo(o2.getTodayDate());
	}

	boolean equals(Bank o1)
	{
		return true;	
	}
}