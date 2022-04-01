package com.solvd.interfaces;

import com.solvd.enums.Disease;
import com.solvd.exceptions.AppointmentNotFoundException;
import com.solvd.patientrelated.Appointment;
import com.solvd.patientrelated.Diagnostic;
import com.solvd.patientrelated.Patient;
import com.solvd.staff.Doctor;

import java.time.LocalDate;

public interface ITreatment {
    void createMedicalRecord(long id, Patient patient, Doctor doctor);

    Diagnostic diagnosis(LocalDate date, Disease disease, Patient patient);

    void treatPatient(Appointment appointment, Patient patient, Doctor doctor) throws AppointmentNotFoundException;

    void curePatient(Patient patient);
}
