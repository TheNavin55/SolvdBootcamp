package com.solvd.staff;

import com.solvd.enums.Disease;
import com.solvd.enums.Specialty;
import com.solvd.interfaces.ICure;
import com.solvd.patientrelated.Patient;

import java.util.Objects;

public class Doctor extends Employee implements ICure {

    private Specialty speciality;

    public Doctor() {
        super();
    }

    public Doctor(int id, String firstName, String lastName, Specialty speciality) {
        super();
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
    public int hashCode() {
        return Objects.hash(getSpeciality());
    }

    @Override
    public void curePatient(Patient patient, Disease disease) {

    }
    @Override
    public String toString() {
        return "Doctor Information: " + "[First Name: " + super.getFirstName() + ", Last Name: " + super.getLastName()
                + ", Speciality: " + speciality+"]";
    }
}
