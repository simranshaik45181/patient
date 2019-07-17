package com.capgemini.tcc.ui;

import java.time.LocalDate;
import java.util.Scanner;

import com.capgemini.tcc.bean.PatientBean;
import com.capgemini.tcc.service.PatientService;

public class Client {


int c;
char ch=0;

public static void main(String args[]) {
	PatientService ps=new PatientService();
	PatientBean patient;
	System.out.println("Menu to the user :/n 1.Add Patient Information. /n 2.Search Patient by Id.  /n3.Exit.");
	Scanner sc =new Scanner(System.in);
    int c;
    do {
    	System.out.println("Enter an option:");
     c=sc.nextInt();

    	switch(c) {
    	case 1:
    		String name;
    		do {
    		System.out.println("Enter Patient name:");
    		 name=sc.next();
    		}while(!ps.isNameValid(name));
    		
    		System.out.println("Enter PAtient's Age:");
    		int age=sc.nextInt();
    		System.out.println("phone_no:");
    		long phone_no=sc.nextLong();
    		System.out.println("Enter Description:");
    		String description=sc.next();
    		int id=(int)(Math.random()*123);
    		System.out.println("Patient's id:"+id);
    		//LocalDate Date=java.time.LocalDate.now();
    		LocalDate Date=LocalDate.now();
    		patient=new PatientBean(name,age,phone_no,description,id,Date);
    	ps.addPatientDetails(patient);
    	break;
    	case 2:
    		System.out.println("ENter ID:");
    		int patientId=sc.nextInt();
    		ps.getPatientDetails(patientId);
    	break;
    	case 3:
    		System.exit(0);	
    	}System.out.println("Do you want to continue...?(yes/no):");
		 char ch=sc.next().charAt(0);
		if(ch=='y'||ch=='Y')
			continue;
		else {
			System.out.println("END");
			System.exit(0);
		}
		
		
	ch=sc.next().charAt(0);
	
	}while(c!=4);
	System.out.println("enter a valid choice:");
}
    	
   
}

