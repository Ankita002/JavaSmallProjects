package com.capgemini.doctors.service;

import com.capgemini.doctors.bean.DoctorAppointment;

public interface IDoctorAppointmentService {
int addDoctorAppointmentsDetails(DoctorAppointment doctorAppointment);
DoctorAppointment getDoctorAppointmentDetails(int appointmentId);

}
