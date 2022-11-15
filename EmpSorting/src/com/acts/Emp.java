package com.acts;

import java.time.LocalDate;
import java.util.List;

public class Emp implements Comparable<Emp>{
	private Integer EmpId;
	private String EmpName;
	private Engineering engg;
	private LocalDate date;
	private List<Address> addressList;
	
	public static final String EMPTY_STRING = "";
	
	public Emp() {
		this.EmpId=0;
		this.EmpName=EMPTY_STRING;
		this.date = null;
		this.engg = null;
	}

	public Emp(Integer empId, String empName, Engineering engg, LocalDate date) {
		super();
		EmpId = empId;
		EmpName = empName;
		this.engg = engg;
		this.date = date;
		//this.addressList = addressList;
	}

	public Integer getEmpId() {
		return EmpId;
	}

	public void setEmpId(Integer empId) {
		EmpId = empId;
	}

	public String getEmpName() {
		return EmpName;
	}

	public void setEmpName(String empName) {
		EmpName = empName;
	}

	public Engineering getEngg() {
		return engg;
	}

	public void setEngg(Engineering engg) {
		this.engg = engg;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public List<Address> getAddressList() {
		return addressList;
	}

	public void setAddressList(List<Address> addressList) {
		this.addressList = addressList;
	}

	public static String getEmptyString() {
		return EMPTY_STRING;
	}

	@Override
	public String toString() {
		return "Emp [EmpId=" + EmpId + ", EmpName=" + EmpName + ", engg=" + engg + ", date=" + date + ", addressList="
				+ addressList + "]";
	}
	
	@Override
	public int compareTo(Emp o) {
		return this.EmpId.compareTo(o.EmpId);
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("Equals Called");
		if(obj instanceof Emp) {
			Emp other = (Emp) obj;
			return this.getEmpId() ==other.getEmpId();
		}
		return false;
	}
	
	
	
	
}


