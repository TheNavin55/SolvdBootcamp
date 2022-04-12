package com.solvd;

import Collections.LinkedList;
import com.solvd.enums.BloodType;
import com.solvd.enums.Gender;
import com.solvd.enums.Specialty;
import com.solvd.exceptions.HealthInsuranceCompanyException;
import com.solvd.generalpurpose.Hospital;
import com.solvd.patientrelated.Patient;
import com.solvd.staff.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Random;

public class HospitalRunner {
    private static Logger LOGGER = LogManager.getLogger(HospitalRunner.class);

    public static void main (String[] args) {
        LOGGER.info("Starting program");
        Random rd = new Random();

        Hospital hospital = new Hospital("Jhon Hopkins Hospital","123 Fake Street");
        LOGGER.info(hospital.toString());

        Doctor docA = new Doctor(1, "Alexis", "Villamayor", Specialty.CARD);
        Doctor docB = new Doctor(2, "Ivan", "Gonzalez", Specialty.DERM);

        Nurse nurseA = new Nurse(3, "Agustin", "Cabeza", rd.nextInt(99999));

        Receptionist recA = new Receptionist(4, "Brian", "Schulz", rd.nextInt(99999));

        hospital.addDoctor(docA);
        hospital.addDoctor(docB);
        hospital.addNurse(nurseA);
        hospital.addRec(recA);

        Patient patA = new Patient(5,"Juan", "Orellana", Gender.M, BloodType.O_NEG, "Eme");
        Patient patB = new Patient(6,"Facundo", "Costa", Gender.M, BloodType.O_POS, "");
        Patient patC = new Patient(7,"Diego", "Salazar", Gender.M, BloodType.A_NEG, "");

        recA.saveAppointment(hospital, LocalDate.of(2022,03,15), LocalTime.of(9,30),docA,patA, BigDecimal.valueOf(500));

        try{
            recA.saveAppointment(hospital, LocalDate.of(2022,03,26), LocalTime.of(9,30),docB,patB, BigDecimal.valueOf(500));
            recA.saveAppointment(hospital, LocalDate.of(2022,03,30), LocalTime.of(9,30),docB,patC, BigDecimal.valueOf(500));
        }catch (HealthInsuranceCompanyException e){
            LOGGER.error(e);
        }

        docA.curePatient(patA);

        LinkedList<Employee> employeesList = new LinkedList<Employee>();
        employeesList.add(docA);
        employeesList.add(docB);
        employeesList.add(nurseA);

        LOGGER.info(employeesList.iterate());

    }
}
