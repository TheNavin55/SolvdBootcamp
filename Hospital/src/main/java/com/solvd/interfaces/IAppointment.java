package com.solvd.interfaces;

import com.solvd.generalpurpose.Hospital;
import com.solvd.patientrelated.Appointment;
import com.solvd.patientrelated.Patient;
import com.solvd.staff.Doctor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

public interface IAppointment {
    Appointment saveAppointment(Hospital hospital, LocalDate date, LocalTime time, Doctor doctor, Patient patient, BigDecimal cost);
}
