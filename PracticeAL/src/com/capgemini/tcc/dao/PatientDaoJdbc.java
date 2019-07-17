package com.capgemini.tcc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

import com.capgemini.tcc.bean.PatientBean;

public class PatientDaoJdbc {
	  public void addPatient(PatientBean Bean) {
	        Scanner sc=new Scanner(System.in);
	        try {
	            
	            Class.forName("oracle.jdbc.driver.OracleDriver");
	            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","India123");
	            PreparedStatement stmt=con.prepareStatement("insert into Patient values(?,?,?,?,?)");
	           stmt.setInt(1,Bean.getId());
	                          stmt.setString(2,Bean.getPatient_name());
	                          stmt.setInt(3,Bean.getPatient_age());
	                          stmt.setLong(4, Bean.getPatient_phone_no());
	                       stmt.setString(5,Bean.getDescription());
	                   //   stmt.setDate(, );
	                             stmt.executeUpdate();
	              System.out.println("inserted");
	                con.close();
	              //  sc.close();
	}
	        catch(Exception e)
	{
	System.out.println(e);
	}
	    
	  }
}