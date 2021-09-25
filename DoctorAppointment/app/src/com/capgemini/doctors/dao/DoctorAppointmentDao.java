package com.capgemini.doctors.dao;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import com.capgemini.doctors.bean.DoctorAppointment;

public class DoctorAppointmentDao implements IDoctorAppointmentDao {
private static Map<Integer,DoctorAppointment> appointments=new HashMap<>();

	@Override
	public int addDoctorAppointmentDetails(DoctorAppointment doctorAppointment) {
		// TODO Auto-generated method stub
		
		
		 
		doctorAppointment.setAppointmentId( (int)(1000+(Math.random()*999)));
		appointments.put(doctorAppointment.getAppointmentId(),doctorAppointment);
		return doctorAppointment.getAppointmentId();
	}

	@Override
	public DoctorAppointment getAppointmentDetails(int appointmentId) {
	Iterator<Entry<Integer, DoctorAppointment>>
	it=appointments.entrySet().iterator();
	while(it.hasNext()){
	Map.Entry pair=(Map.Entry)it.next();
	if(pair.getKey().equals(appointmentId)){
		return (DoctorAppointment) pair.getValue();
		
	}
	}
	return null;
		// TODO Auto-generated method stub
		
	}

}
