package com.solvd.staff;

import com.solvd.enums.Gender;

import java.time.LocalDate;

public class Pharmacist extends Employee{
    private long licence;

    public Pharmacist(){
        super();
    }

    public Pharmacist(int id, String firstName, String lastName, long licence) {
        super();
        super.setFirstName(firstName);
        super.setLastName(lastName);
        this.licence = licence;
    }

    public Pharmacist(String firstName, String lastName, int id, LocalDate startDate, double salary, long licence) {
        super(firstName, lastName, id, startDate, salary);
        this.licence = licence;
    }

    public Pharmacist(String firstName, String lastName, LocalDate birthDate, Gender gender, int id, LocalDate startDate, double salary, long licence) {
        super(firstName, lastName, birthDate, gender, id, startDate, salary);
        this.licence = licence;
    }

    public long getLicence() {
        return licence;
    }

    public void setLicence(long licence) {
        this.licence = licence;
    }
}
