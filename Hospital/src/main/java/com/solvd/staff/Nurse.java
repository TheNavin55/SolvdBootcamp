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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Nurse nurse = (Nurse) o;
        return Objects.equals(licence, nurse.licence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(licence);
    }

    @Override
    public String toString() {
        return "Nurse Information: " + "[First Name: " + super.getFirstName() + ", Last Name: " + super.getLastName()
                + ", Licence: " + licence+"]";
    }
}
