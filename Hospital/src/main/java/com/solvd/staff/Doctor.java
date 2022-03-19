package com.solvd.staff;

import com.solvd.enums.Specialty;

import java.util.Objects;

public class Doctor extends Employee{

    private Specialty speciality;

    public Doctor() {
    }

    public Doctor(int id, String firstName, String lastName, Specialty speciality) {
        super.setId(id);
        super.setFirstName(firstName);
        super.setLastName(lastName);
        this.speciality = speciality;
    }

    public Specialty getSpeciality() {
        return speciality;
    }

    public void setSpeciality(Specialty speciality) {
        this.speciality = speciality;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Doctor doctor)) return false;
        return getSpeciality() == doctor.getSpeciality();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSpeciality());
    }
}
