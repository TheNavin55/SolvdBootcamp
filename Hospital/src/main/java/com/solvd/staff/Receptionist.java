package com.solvd.staff;

import com.solvd.exceptions.HealthInsuranceCompanyException;
import com.solvd.generalpurpose.Hospital;
import com.solvd.interfaces.IAppointment;
import com.solvd.patientrelated.Appointment;
import com.solvd.patientrelated.Patient;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

public class Receptionist extends Employee implements IAppointment {
    private static Logger LOGGER = LogManager.getLogger(Receptionist.class);

    public Receptionist() {
        super();
    }

    public Receptionist(int id, String firstName, String lastName, double salary) {
        super();
        super.setId(id);
        super.setFirstName(firstName);
        super.setLastName(lastName);
        super.setSalary(salary);

    }

    @Override
    public Appointment saveAppointment(Hospital hospital, LocalDate date, LocalTime time, Doctor doctor, Patient patient, BigDecimal cost) {
        if(patient.getHealthInsuranceCompany().isEmpty()){
            throw new HealthInsuranceCompanyException("Patient can't be appointment without a Health Insurance Company");
        }
        Appointment appointment = new Appointment(hospital, date, time, doctor, patient, cost);
        LOGGER.info("Appointment registered successfully");
        return appointment;

    }
}
