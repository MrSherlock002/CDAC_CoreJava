package com.acts.jobportal;

import java.time.LocalDate;

import com.acts.degree.Degree;

public class JobProfile implements Comparable<JobProfile> {
	public static  Integer REG_ID=0;
	private Integer registrationId;
	private String name;
	private String email;
	private String password;
	private LocalDate dateOfBirth;
	private String aadharId;
	private String phoneNumber;
	private LocalDate graduationDate;
	private Degree gradStream;
	
	public JobProfile() {
		super();
	}

	public JobProfile( String name, String email, String password, LocalDate dateOfBirth,
			String aadharId, String phoneNumber, LocalDate graduationDate,Degree gradStream) {
		super();
		this.registrationId =  REG_ID++;
		this.name = name;
		this.email = email;
		this.password = password;
		this.dateOfBirth = dateOfBirth;
		this.aadharId = aadharId;
		this.phoneNumber = phoneNumber;
		this.graduationDate = graduationDate;
		this.gradStream =gradStream;
	}

//	public Integer getRegistrationId() {
//		return registrationId;
//	}
//
//	public void setRegistrationId(Integer registrationId) {
//		this.registrationId = registrationId;
//	}

	public String getName() {
		return name;
	}

	public Degree getGradStream() {
		return gradStream;
	}

	public void setGradStream(Degree gradStream) {
		this.gradStream = gradStream;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getAadharId() {
		return aadharId;
	}

	public void setAadharId(String aadharId) {
		this.aadharId = aadharId;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public LocalDate getGraduationDate() {
		return graduationDate;
	}

	public void setGraduationDate(LocalDate graduationDate) {
		this.graduationDate = graduationDate;
	}

	@Override
	public String toString() {
		return "\nJobProfile [registrationId=" + registrationId + ", name=" + name + ", email=" + email + ", dateOfBirth=" + dateOfBirth + ", aadharId=" + aadharId + ", phoneNumber=" + phoneNumber
				+ ", graduationDate=" + graduationDate + "]";
	}

	@Override
	public int compareTo(JobProfile o) {
		return this.getEmail().compareTo(o.getEmail());
	}
	
	
	
	
	
}
