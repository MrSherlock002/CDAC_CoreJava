package com.acts.comparators;

import java.sql.Statement;
import java.util.Comparator;

import com.acts.Bank;

public class DobComparator implements Comparator<Bank> {

	@Override
	public int compare(Bank o1, Bank o2) {
		return o1.getTodayDate().compareTo(o2.getTodayDate());
	}

}
