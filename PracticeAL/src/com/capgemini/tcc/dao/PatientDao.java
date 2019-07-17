package com.capgemini.tcc.dao;

import java.util.HashMap;

import com.capgemini.tcc.bean.PatientBean;

public class PatientDao implements IPatientDao {
	PatientBean Bean;
HashMap<Integer,PatientBean> hm=new HashMap<>();
	@Override
	public int addPatientDetails(PatientBean Bean) {
		hm.put(Bean.getId(), Bean);
		System.out.println("added");
		return 0;
	}

	@Override
	public PatientBean getPatientDetails(int patientId) {
	PatientBean Bean=hm.get(patientId);
	System.out.println(Bean);
		return Bean;
	}

}
