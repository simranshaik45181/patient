package com.capgemini.tcc.dao;

import com.capgemini.tcc.bean.PatientBean;

public interface IPatientDao {
int addPatientDetails(PatientBean Bean);
PatientBean getPatientDetails(int patientId);
}
