package com.capgemini.tcc.service;

import com.capgemini.tcc.bean.PatientBean;
import com.capgemini.tcc.dao.PatientDao;
import com.capgemini.tcc.dao.PatientDaoJdbc;

public class PatientService implements  IPatientService{
PatientDao pd=new PatientDao();
PatientDaoJdbc pdj=new PatientDaoJdbc();
PatientBean patient;
	@Override
	public int addPatientDetails(PatientBean patient) {
		//pdj.addPatient(patient);
		pd.addPatientDetails(patient);
		return 0;
	}

	@Override
	public PatientBean getPatientDetails(int patientId) {
	pd.getPatientDetails(patientId);
		return patient;
	}
	public boolean isNameValid(String empname) {
		boolean b=false;
				if(empname.length()>3 &&Character.isUpperCase(empname.charAt(0)))
					b=true;
				
			return b;
		}
}
