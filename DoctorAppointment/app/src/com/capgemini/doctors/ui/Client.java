package com.capgemini.doctors.ui;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Scanner;

import com.capgemini.doctors.bean.DoctorAppointment;
import com.capgemini.doctors.service.DoctorAppointmentService; 

public class Client {
static DoctorAppointmentService ds=new DoctorAppointmentService();
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int i=0;
	loop: while(true){
		System.out.println("1.Add Doctor Appointment");
		System.out.println("2.View Doctor Appointment");
		System.out.println("3.Exit");
		System.out.println("Enter your Choice");
		i=sc.nextInt();
	
	switch(i){
	case 1: {
		
		System.out.println("Enter patient's name: ");
		String name=sc.next();
 
		 
			 
		System.out.println("Enter Moblie Number: ");
		String mno=sc.next();
		System.out.println("Enter Email: ");
		
		String mail=sc.next();
		 
		
		System.out.println("Enter Gender: ");
		String gender=sc.next();
		LocalDate date=LocalDate.now();
		System.out.println("Enter Age: ");
		int age=sc.nextInt();
		System.out.println("Enter problem name: ");
		String problemName=sc.next();
		String doctorName;
		String appointmentStatus;
		if(problemName.equalsIgnoreCase("Heart")){
			doctorName="Dr. Brijesh Kumar";
			appointmentStatus="Approved";
			
			int id1=ds.addDoctorAppointmentsDetails(new DoctorAppointment(name,mno,mail,gender,date,age,problemName,doctorName,appointmentStatus));
			System.out.println("Your appointment is booked with appointment id: "+id1);
		}
		else if(problemName.equalsIgnoreCase("Gynecology")){
			doctorName="Dr. Sharda Singh";
		appointmentStatus="Approved";
		//System.out.println("Your appointment is booked with appointment id: "+id1);
		
		int id1=ds.addDoctorAppointmentsDetails(new DoctorAppointment(name,mno,mail,gender,date,age,problemName,doctorName,appointmentStatus));
		System.out.println("Your appointment is booked with appointment id: "+id1);
		}
		else if(problemName.equalsIgnoreCase("Diabetes")){
			doctorName="Dr. Heena Khan";
		appointmentStatus="Approved";
		
		int id1=ds.addDoctorAppointmentsDetails(new DoctorAppointment(name,mno,mail,gender,date,age,problemName,doctorName,appointmentStatus));
		System.out.println("Your appointment is booked with appointment id: "+id1);
		}
		else if(problemName.equalsIgnoreCase("ENT")){
			doctorName="Dr. Paras Mal";
		appointmentStatus="Approved";
		
		int id1=ds.addDoctorAppointmentsDetails(new DoctorAppointment(name,mno,mail,gender,date,age,problemName,doctorName,appointmentStatus));
		System.out.println("Your appointment is booked with appointment id: "+id1);
		}
		else if(problemName.equalsIgnoreCase("Dermatology")){
			doctorName="Dr. Kanika Kapoor";
		appointmentStatus="Approved";
		
		int id1=ds.addDoctorAppointmentsDetails(new DoctorAppointment(name,mno,mail,gender,date,age,problemName,doctorName,appointmentStatus));
		System.out.println("Your appointment is booked with appointment id: "+id1);
		}
		else if(problemName.equalsIgnoreCase("Bone")){
			doctorName="Dr. Renuka Kher";
		appointmentStatus="Approved";
		
		int id1=ds.addDoctorAppointmentsDetails(new DoctorAppointment(name,mno,mail,gender,date,age,problemName,doctorName,appointmentStatus));
		System.out.println("Your appointment is booked with appointment id: "+id1);
		}
	

		break;
	}
	case 2:
	{
		System.out.println("Enter Appointment ID: ");
		int id=sc.nextInt();
		 
		System.out.println(ds.getDoctorAppointmentDetails(id).toString());
		break;
	}
	case 3:
	{
	break loop;
	
	}
	}

	
	}
}
}

