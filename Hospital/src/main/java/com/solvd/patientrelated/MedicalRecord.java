package com.solvd.patientrelated;

import java.util.ArrayList;
import java.util.List;

public class MedicalRecord {
    private List diagnosis = new ArrayList<> ();
    private List treatments = new ArrayList<> ();
    private boolean medicalDischarge = false;

    public MedicalRecord() {}

    public List getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(List diagnosis) {
        this.diagnosis = diagnosis;
    }

    public List getTreatments() {
        return treatments;
    }

    public void setTreatments(List treatments) {
        this.treatments = treatments;
    }

    public boolean isMedicalDischarge() {
        return medicalDischarge;
    }

    public void setMedicalDischarge(boolean medicalDischarge) {
        this.medicalDischarge = medicalDischarge;
    }
}
