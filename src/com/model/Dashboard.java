package com.model;

public class Dashboard {

private int doctorID;
public int getDoctorID() {
	return doctorID;
}
public void setDoctorID(int doctorID) {
	this.doctorID = doctorID;
}
public int getUserID() {
	return userID;
}
public void setUserID(int userID) {
	this.userID = userID;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public String getDoctorName() {
	return doctorName;
}
public void setDoctorName(String doctorName) {
	this.doctorName = doctorName;
}
public String getAvailDate() {
	return availDate;
}
public void setAvailDate(String availDate) {
	this.availDate = availDate;
}
public String getAvailTime() {
	return availTime;
}
public void setAvailTime(String availTime) {
	this.availTime = availTime;
}
public String getHospitalName() {
	return hospitalName;
}
public void setHospitalName(String hospitalName) {
	this.hospitalName = hospitalName;
}
public String getHospitalAddress() {
	return hospitalAddress;
}
public void setHospitalAddress(String hospitalAddress) {
	this.hospitalAddress = hospitalAddress;
}
private int userID;
private String status;
private String doctorName;
private String availDate;
private String availTime;
private String hospitalName;
private String hospitalAddress;
private String specialization;
public String getSpecialization() {
	return specialization;
}
public void setSpecialization(String specialization) {
	this.specialization = specialization;
}
	
}
