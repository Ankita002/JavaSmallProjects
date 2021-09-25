package com.capgemini.doctors.service;

import com.capgemini.doctors.bean.DoctorAppointment;
import com.capgemini.doctors.dao.DoctorAppointmentDao;

public class DoctorAppointmentService  implements IDoctorAppointmentService{
DoctorAppointmentDao dao=new DoctorAppointmentDao();
	@Override
	public int addDoctorAppointmentsDetails(DoctorAppointment doctorAppointment) {
		// TODO Auto-generated method stub
		
		return dao.addDoctorAppointmentDetails(doctorAppointment);
	}

	@Override
	public DoctorAppointment getDoctorAppointmentDetails(int appointmentId) {
		// TODO Auto-generated method stub
		return dao.getAppointmentDetails(appointmentId);
	}

}
