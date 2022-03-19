package com.solvd.staff;

import java.util.Objects;

public class Nurse extends Employee{
    private long licence;

    public Nurse() {
    }

    public Nurse(int id, String firstName, String lastName, long licence) {
        super.setId(id);
        super.setFirstName(firstName);
        super.setLastName(lastName);
        this.licence = licence;
    }

    public long getLicence() {
        return licence;
    }

    public void setLicence(long licence) {
        this.licence = licence;
    }
}
