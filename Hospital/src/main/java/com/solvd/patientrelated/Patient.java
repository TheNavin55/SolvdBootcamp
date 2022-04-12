package com.solvd.patientrelated;

import com.solvd.enums.BloodType;
import com.solvd.enums.Gender;
import com.solvd.generalpurpose.Person;

import java.time.LocalDate;
import java.util.Random;

public class Patient extends Person {
    private long id;
    private String healthInsuranceCompany;
    private MedicalRecord medicalRecord;
    private boolean isSick;
    private BloodType bloodType;

    public Patient(long id, String healthInsuranceCompany, MedicalRecord medicalRecord, boolean isSick, BloodType bloodType) {
        this.id = id;
        this.healthInsuranceCompany = healthInsuranceCompany;
        this.medicalRecord = medicalRecord;
        this.isSick = isSick;
        this.bloodType = bloodType;
    }

    public Patient(long id, String firstName, String lastName, Gender gender, BloodType bloodType, String healthInsuranceCompany) {
        super();
        this.id = id;
        super.setFirstName(firstName);
        super.setLastName(lastName);
        this.bloodType = bloodType;
        this.healthInsuranceCompany = healthInsuranceCompany;
    }

    public Patient(String firstName, String lastName, LocalDate birthDate, Gender gender, long id, String healthInsuranceCompany, MedicalRecord medicalRecord, boolean isSick, BloodType bloodType) {
        super(firstName, lastName, birthDate, gender);
        this.id = id;
        this.healthInsuranceCompany = healthInsuranceCompany;
        this.medicalRecord = medicalRecord;
        this.isSick = isSick;
        this.bloodType = bloodType;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getHealthInsuranceCompany() {
        return healthInsuranceCompany;
    }

    public void setHealthInsuranceCompany(String healthInsuranceCompany) {
        this.healthInsuranceCompany = healthInsuranceCompany;
    }

    public MedicalRecord getMedicalRecord() {
        return medicalRecord;
    }

    public void setMedicalRecord(MedicalRecord medicalRecord) {
        this.medicalRecord = medicalRecord;
    }

    public boolean isSick() {
        return isSick;
    }

    public void setSick(boolean sick) {
        isSick = sick;
    }

    public BloodType getBloodType() {
        return bloodType;
    }

    public void setBloodType(BloodType bloodType) {
        this.bloodType = bloodType;
    }
}
