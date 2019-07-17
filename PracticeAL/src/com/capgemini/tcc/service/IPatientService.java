package com.capgemini.tcc.service;

import com.capgemini.tcc.bean.PatientBean;

public interface IPatientService {
int addPatientDetails (PatientBean patient);
PatientBean getPatientDetails(int patientId);
}
