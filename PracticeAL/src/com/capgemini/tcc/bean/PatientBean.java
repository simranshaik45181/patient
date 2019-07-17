package com.capgemini.tcc.bean;

import java.time.LocalDate;

public class PatientBean {
String patient_name;
int patient_age;
long patient_phone_no;
String description;
int id;
public LocalDate Date;
public LocalDate getDate() {
	return Date;
}
public void setDate(LocalDate date) {
	Date = date;
}
public PatientBean() {
	
}
public PatientBean(String name,int age,long phone_no,String description) {
	this.patient_name=name;
	this.patient_age=age;
	this.patient_phone_no=phone_no;
	this.description=description;
}
public PatientBean(String name, int age, long phone_no, String description, int id,LocalDate Date) {
	this.patient_name=name;
	this.patient_age=age;
	this.patient_phone_no=phone_no;
	this.description=description;
this.Date=Date;
	this.id=id;
}

public String getPatient_name() {
	return patient_name;
}
public void setPatient_name(String patient_name) {
	this.patient_name = patient_name;
}
public int getPatient_age() {
	return patient_age;
}
public void setPatient_age(int patient_age) {
	this.patient_age = patient_age;
}
public long getPatient_phone_no() {
	return patient_phone_no;
}
public void setPatient_phone_no(long patient_phone_no) {
	this.patient_phone_no = patient_phone_no;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
@Override
public String toString() {
	return "PatientBean [patient_name=" + patient_name + ", patient_age=" + patient_age + ", patient_phone_no="
			+ patient_phone_no + ", description=" + description + ", id=" + id + ", Date=" + Date + "]";
}



}
