package com.tns.placement.client;

import com.tns.placement.entities.Certificate;
import com.tns.placement.service.CertificateServiceImpl;
import com.tns.placement.service.ICertificateService;

public class Client 
{
	public static void main(String []args) 
	{
		Certificate certificate = new Certificate();
		
		ICertificateService  service = new CertificateServiceImpl();
	    
		//CRUD
	    /*
		//Create Operation 
		certificate.setId(101);
		certificate.setYear(2016);
		certificate.setCollege("R.A.COLLEGE");
		service.addCertificate(certificate);
		System.out.println("data is added successfully......");
	    */
		
		
		//Retrieve - retrieve the data from database (search) 
		/*
	    certificate = service.searchCertificate(102);
		System.out.println("ID is :" +certificate.getId());
		System.out.println("Year is :" +certificate.getYear());
		System.out.println("College is :" +certificate.getCollege());
		System.out.println("retrieve data is sucessfully.....");
		*/
		
		
		/*
		// update :- update the data from database 
		certificate = service.searchCertificate(102);
		certificate.setCollege("DY patil mca pune");  
		service.updateCertificate(certificate);
		System.out.println("data is update sucessfully.....");
		*/
		
		
		certificate = service.searchCertificate(101);
		service.deleteCertificate(certificate);
		System.out.println("Delete Data Sucessfully.....");
		
	}
	
	
	
}
